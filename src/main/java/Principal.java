import com.google.gson.Gson;
import models.Persona;

import java.io.*;

public class Principal {

    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("src/main/resources/datos/empleados.json");
            BufferedReader reader = new BufferedReader(file);

            String linea, fichero = "";
            while((linea = reader.readLine()) != null){
                fichero += linea;
            }
            Persona persona = new Gson().fromJson(fichero, Persona.class);
            System.out.println(persona);


        }catch (FileNotFoundException e){
            System.out.println("no existe el archivo");
        }catch (IOException e){
            System.out.println("Error al leer el archivo");
        }

        /*
        File file = new File("src/main/resources/datos/empleados.json");
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has - " + file.length() + "bytes");
        System.out.println("Can it be read? - " + file.canRead());
        System.out.println("Can it be written? - " + file.canWrite());
        System.out.println("Is it a directory - " + file.isDirectory());
        System.out.println("It is a file - " + file.isFile());
        System.out.println("It is a absolute - " + file.isAbsolute());
        System.out.println("It is hidden? - " + file.isHidden());
        System.out.println("Absolute path is  - " + file.getAbsolutePath());
        System.out.println("Last modified on - " + new java.util.Date(file.lastModified()));


        if(file.exists()){
            try{
                PrintWriter output = new PrintWriter(file);
                output.println("Hola Mundo");
                output.close();


            }catch (FileNotFoundException e){
                System.out.println("El archivo no existe");

            }

        }else{
            System.out.println("El archivo no existe ");
        }
        */

    }
}
