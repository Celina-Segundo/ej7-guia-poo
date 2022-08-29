/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores..
 */
package ej07_guia07;

import Entidades.Persona;
import Servicios.ServiciosPersona;
import java.util.Scanner;

/**
 *
 * @author Celi
 */
public class Ej07_guia07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosPersona s = new ServiciosPersona();
        /*int mayores = 0;
        int menores = 0;
        int porcentajePos = 0;
        int porcentajeNeg = 0;
        int porcentajeCor = 0;
        
       Persona a1 = s.crearPersona();
       s.calcularIMC(a1);
       int porc1 = s.resultado(a1);
       
        System.out.println("La persona es mayor de edad, esta afirmacion es: " + s.esMayorDeEdad(a1));
        if (s.esMayorDeEdad(a1) == true) {
            mayores += 1;
        } else {
            menores += 1;
        }
        if (porc1 > 0) {
            porcentajePos += 1;
        } else if(porc1 < 0) {
            porcentajeNeg += 1;
        } else {
            porcentajeCor += 1;
        }
       
        Persona a2 = s.crearPersona();
       s.calcularIMC(a2);
       System.out.println("La persona es mayor de edad, esta afirmacion es: " + s.esMayorDeEdad(a2));
       int porc2 = s.resultado(a2);
        if (s.esMayorDeEdad(a2) == true) {
            mayores += 1;
        } else {
            menores += 1;
        }
        if (porc2 > 0) {
            porcentajePos += 1;
        } else if(porc2 < 0) {
            porcentajeNeg += 1;
        } else {
            porcentajeCor += 1;
        }
        
        
        Persona a3 = s.crearPersona();
       s.calcularIMC(a3);
       System.out.println("La persona es mayor de edad, esta afirmacion es: " + s.esMayorDeEdad(a3));
       int porc3 = s.resultado(a3);
        if (s.esMayorDeEdad(a3) == true) {
            mayores += 1;
        } else {
            menores += 1;
        }
        if (porc3 > 0) {
            porcentajePos += 1;
        } else if(porc3 < 0) {
            porcentajeNeg += 1;
        } else {
            porcentajeCor += 1;
        }
        
        
        Persona a4 = s.crearPersona();
       s.calcularIMC(a4);
       System.out.println("La persona es mayor de edad, esta afirmacion es: " + s.esMayorDeEdad(a4));
       int porc4 = s.resultado(a4);
        if (s.esMayorDeEdad(a4) == true) {
            mayores += 1;
        } else {
            menores += 1;
        }
        if (porc4 > 0) {
            porcentajePos += 1;
        } else if(porc4 < 0) {
            porcentajeNeg += 1;
        } else {
            porcentajeCor += 1;
        }
        
        
        s.porcentajeIndices(4, porcentajeNeg, porcentajeCor, porcentajePos);
       
        */
        Persona l = null;
        try {
            s.esMayorDeEdad(l);
        } catch (NullPointerException n) {
            System.out.println("La persona no existe");
        }
    }
   
    
}
