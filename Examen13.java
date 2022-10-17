
package examen13;

import java.util.Scanner;


public class Examen13 {


    public static void main(String[] args) {
    final double pi=3.14;
    System.out.println("Introduce el radio");
    Double r=new Scanner(System.in).nextDouble();
    double r2=Math.pow(r, 2);
    System.out.println("Su area es "+(pi*r2));
    }
    
}
