
package examen10;

import java.util.Scanner;


public class Examen10 {


    public static void main(String[] args) {
    System.out.println("Escribe tres numero enteros");
    Double num1=new Scanner(System.in).nextDouble();
    Double num2=new Scanner(System.in).nextDouble();
    Double num3=new Scanner(System.in).nextDouble();
    if ((num1>num2)&&(num1>num3))
        System.out.println("El pimero es el mayor");
    else
        if ((num2>num1)&&(num2>num3))
        System.out.println("El segundo es el mayor");
        else
           if ((num3>num1)&&(num3>num2))
        System.out.println("El tercero es el mayor");
        else
               System.out.println("Los mayores son iguales ");
            
            
            
            
            
            
            
            }   
    
}
