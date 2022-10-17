
package examen11;


public class Examen11 {

    public static void main(String[] args) {
    int anio=2005;
    boolean anio100=(anio%100)==0;
    if ((anio%400)==0)
        System.out.println("Es bisiesto");
    else
        if (((anio%4)==0)&&(!anio100))
            System.out.println("Este anio es bisiesto");
        else
            System.out.println("Este anio NO es bisiesto");
    
    }
    
}
