
package examen03;
import java.util.Scanner;
public class Examen03 {


    public static void main(String[] args) {
    System.out.println("Escribe tres numero enteros");
    short horas=new Scanner(System.in).nextShort();
    short minutos=new Scanner(System.in).nextShort();
    short segundos=new Scanner(System.in).nextShort();
    
    double seguntot=(horas*3600)+(minutos*60)+segundos;
    System.out.println(seguntot+", segudnso en total");
    }
    
}
