
package examen09;

import java.util.Scanner;
public class Examen09 {

 
    public static void main(String[] args) {
    System.out.println("Escribe un numero entre el 10 y el 56");
    Double num=new Scanner(System.in).nextDouble();
    if ((num>=10)&&(num<=56))
        System.out.println("El numero esta bien");
    else
        System.out.println("El numero esta mal");
        
    }
    
}
