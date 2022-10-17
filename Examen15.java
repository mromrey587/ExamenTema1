
package examen15;


public class Examen15 {


    public static void main(String[] args) {
    boolean x=true;
    boolean z=true;
    boolean y=false;
    
    boolean a1=((x||y)||z)&&(!z&&!y);
    boolean a3=(x || !z)&&(!x||z);
    boolean a2=((!x || !y)||z)&&(x&&!y);
   
    
    System.out.println(a1);
    System.out.println(a3);
    System.out.println(a2);
    }
    
}
