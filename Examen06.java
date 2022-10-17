
package javaapplication79;
import java.util.Scanner;

public class JavaApplication79 {


    public static void main(String[] args) {
    System.out.println("Introduce tu edad");
    int edad=new Scanner (System.in).nextInt();
    int ma18=edad>17 ? 0:1;
    System.out.println("Si sale 0 eres mayor de edad, si sale 1, no;\n "+ma18);
    }
    
}
