package projectoarray;

import dominio.Persona;
import java.util.Scanner;

public class ProjectoArray {

    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        
        Persona personas[] = new Persona[3];
        
        personas[0] = new Persona("Santi");
        personas[1] = new Persona("Iker");
        personas[2] = new Persona("Maria");
        
        //Persona personas[] = {new Persona("Santi"), new Persona("Iker"), new Persona("Maria")};
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Introduce un nombre de persona: ");
            personas[i].setNombre(lectura.nextLine());
            System.out.println("");
            System.out.println("Posicion array: " + i + " |" + " Nombre de persona: " + personas[i].getNombre());
        }
    }
    
}
