
package examen04;
import java.util.Scanner;

public class Examen04 {


    public static void main(String[] args) {
        System.out.println("Escribe los años de una persona");
    short edad1=new Scanner(System.in).nextShort();
    System.out.println("Escribe los años de la segunda persona");
    short edad2=new Scanner(System.in).nextShort();
    boolean mayor1=edad1>=18;
    boolean mayor2=edad2>=18;
    boolean mayor=edad1>edad2;
    System.out.println("El primero es mayor de edad???"+mayor1);
    System.out.println("El segundo es mayor de edad???"+mayor2);
    System.out.println("Y el primero es mayor que el segundo?"+mayor);
    
    }
    
}
