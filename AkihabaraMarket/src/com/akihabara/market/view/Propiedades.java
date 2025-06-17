// Este archivo pertenece al paquete vista
package com.akihabara.market.view;

//Se importan las clases necesarias para leer archivos y trabajar con propiedades
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	
    // Método estático que realiza la lectura del archivo de propiedades, se crea objeto propiedades, con el que se carga el archivo precisado
	//Se obtiene el valor de la API de OpenRouter, y se imprime el valor de la misma 
    public static void propertiesLectura() {

        Properties props = new Properties();

        try {
            props.load(new FileInputStream("config.properties"));

            String key = props.getProperty("OPENROUTER_API_KEY");

            System.out.println("OPENROUTER_API_KEY" + key);

        } catch (IOException e) {
            System.out.println("No se ha podido leer el archivo de configuración");
        }
    }
}

