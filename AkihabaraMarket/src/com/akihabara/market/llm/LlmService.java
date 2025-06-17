package com.akihabara.market.llm;

// Importación de clases necesarias para manejar solicitudes HTTP, URIs, excepciones y JSON
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class LlmService {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.close();
    }

    // Método para sugerir un nombre de producto otaku usando la API LLM de OpenRouter
    public String sugerirNombreProducto(String tipo, String franquicia) {

    	// La clave de la API
    	String apiKey = "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";  

        // Prompt enviado a la IA, pide un nombre directo para el producto usando los parámetros de la función
        String prompt = "Sugiere sólamente un nombre llamativo y original para un producto otaku del tipo" 
                        + tipo + " basado en la franquicia" + franquicia + "\n"
                        + "No me introduzcas lo que dirás al principio de tu respuesta, empieza con el nombre directamente";

        try {
            // Se crea un cliente HTTP para enviar la petición
            HttpClient client = HttpClient.newHttpClient();

            // Se construye el mensaje JSON que describe el prompt y el rol de usuario que lo envía
            JsonObject message = new JsonObject();
            message.addProperty("role", "user"); // Rol del mensaje (usuario)
            message.addProperty("content", prompt); // Contenido del mensaje

            JsonArray messages = new JsonArray();
            // Creo lista de mensajes para agrupar mejor las funciones del código
            messages.add(message);

            // Se prepara el cuerpo de la petición con el modelo y los mensajes
            JsonObject body = new JsonObject();
            body.addProperty("model", "mistralai/mistral-7b-instruct:free"); 
            body.add("messages", messages); // Se añade al array de mensajes

            // Envío de la solicitud HTTP POST
            try {
                HttpRequest request = HttpRequest.newBuilder()
                		 // URL de la API
                    .uri(new URI("https://openrouter.ai/api/v1/chat/completions"))
                    // Autenticación con Bearer Token para identificar quién accede a la API
                    .header("Authorization", "Bearer " + apiKey)
                 // Tipo de contenido enviado (JSON)
                    .header("Content-Type", "application/json") 
                    // Cuerpo de la petición 
                    .POST(HttpRequest.BodyPublishers.ofString(body.toString()))
                    // Y se construye todo lo previo
                    .build();

                // Se envía la solicitud y se obtiene la respuesta
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                // Se parsea el JSON de la respuesta para extraer el contenido generado
                JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
                String resultado = json
                		// Array de posibles respuestas del que se toma la primera, se accede al mensaje,su contenido, y lo convierte a String
                    .getAsJsonArray("choices") 
                    .get(0)
                    .getAsJsonObject()
                    .getAsJsonObject("message") 
                    .get("content") 
                    .getAsString(); 

                return resultado; // Se devuelve el resultado  con la respuesta del LLM
                // Posibles errores previstos
            } catch (URISyntaxException e) {
                System.out.println("Error" + e.getMessage()); 
            } catch (InterruptedException e) {
                System.out.println("Error" + e.getMessage()); 
            } catch (IOException e) {
                System.out.println("Error" + e.getMessage()); 
            }

        } catch (Error e) {
            System.out.println("Error;" + e); // Captura errores no controlados
        }

        // Si algo falla, se devuelve null
        return null;
    }
}

