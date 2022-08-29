/*
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Celis
 */
public class ServiciosPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    boolean e = false;
    //int r = 0;
    int indPositivo = 0;
    int indNegativo = 0;
    int indCorrecto = 0;
   int mayores = 0;
   int menores = 0;
   int cant = 0;
   
   
   
    public Persona crearPersona() {
        System.out.println("Acontinuacion ingrese sus datos");
        System.out.println("Nombre");
        String nombre = leer.nextLine();
        leer.next();
        System.out.println("Edad");
        int edad = leer.nextInt();
        
        System.out.println("Sexo, (F)emenino,(M)asculino u (O)tro");
        
        String sexo = leer.next();
        
        System.out.println("Altura");
        double altura = leer.nextDouble();
        
        System.out.println("Peso");
        double peso = leer.nextDouble();
        Persona p = new Persona(nombre, edad, sexo, altura, peso);
        //esto imprime por pantalla todos los datos ingresados
        //System.out.println(p.toString());
        
        return p;
        
    }
    //kg/(altura^2 en mt2)). 
    public double calcularIMC(Persona p) {
        double peso = p.getPeso();
        double altura = p.getAltura();
        double indice = (peso / (altura*altura));
        p.setIndice(indice);
        System.out.println("El IMC de la persona es: " + indice);
        return indice;
    }
    
    public int resultado(Persona p) {
        double indice = p.getIndice();
        int r = 0;
        
        if (indice < 20) {
            
            System.out.println("La persona está por debajo de su peso ideal.");
            indNegativo += 1;
            r = -1;
        }else if (indice > 20 && indice < 25) {
            System.out.println("La persona está en su peso ideal.");
            indCorrecto += 1;
            r = 0;
        }else if (indice > 25) {
            
            System.out.println("La persona tiene sobrepeso.");
            indPositivo += 1;
            r = 1;
        }
        
        System.out.println(r);
        return r;
    }
    
    public boolean esMayorDeEdad(Persona p) throws NullPointerException{
        int edad = p.getEdad();
        boolean ed = false;
        if (edad >= 18) {
        ed = true;    
        } else if (edad < 18) {
        ed = false;
        }
      
        return ed;
    }
    
    public void porcentajeIndices(int cant, int neg, int cor, int pos) {
        double porNeg = (neg * 100)/ cant;
        double porPos = (pos * 100)/ cant;
        double porCor = (cor * 100)/ cant;
        System.out.println("El porcentaje de personas con IMC negativo es de: " + porNeg + ". El porcentaje de personas con IMC Correcto es de: " + porCor + ". El porcentaje de personas con IMC con Sobrepeso es de: " + porPos);
    }
}
