package Servicios;

import models.Persona;

import java.util.Date;
import java.util.Scanner;


public class PersonaService {

    private Persona persona;
    private Scanner sc;
    private PersonaIOService personaIOService;

    public PersonaService() {
        personaIOService = new PersonaIOService();
        sc = new Scanner(System.in);
    }

    public PersonaService(Persona persona, Scanner sc) {
        this.persona = persona;
        this.sc = sc;
    }

    public void menu(){

        int opcion = 0;
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Crear Empleado");
            System.out.println("2. Visualizar Empleado");
            System.out.println("ingrese un opcion del menu");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    crearPersona();
                    break;
                case 2:
                    vizualizarPersona();
                    break;
                default: opcion = 0;
            }
        }while(opcion != 0);
    }

    public void crearPersona(){
        System.out.println("ingrese el nombre ");
        String nombre = sc.next();
        System.out.println("ingrese el telefono");
        String telenfono  = sc.next();
        System.out.println("ingrese el correo");
        String correo = sc.next();
        String fechaActual = new Date().toString();
        persona = new Persona(nombre, telenfono, correo, fechaActual );
        personaIOService.escribirJson(persona);
        System.out.println("se guaro la persona: " + persona + "en un archivo json");
    }

    public void vizualizarPersona(){
      persona = personaIOService.leerJson();
        System.out.println("Persona leida desde un archivo json");
        System.out.println(persona);
    }

}
