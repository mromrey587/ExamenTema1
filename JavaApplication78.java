
package javaapplication78;


public class JavaApplication78 {


    public static void main(String[] args) {
    long dinero=1273;
    
    long b500=dinero/500;
    long resto1=dinero-(b500*500);
    
    long b100=resto1/100;
    long resto2=resto1-(b100*100);
    
    long b50=resto2/50;
    long resto3=resto2-(b50*50);
    
    long b20=resto3/20;
    long resto4=resto3-(b20*20);
    
    long b10=resto4/10;
    long resto5=resto4-(b10*10);
    
    long b2=resto5/2;
    long resto6=resto5-(b2*2);
    
    long b1=resto6/1;
    long resto7=resto6-(b1*1);
            
    System.out.println("Son;"+b500+" billetes de 500\n"+b100+" billetes de 100\n"+b50+" billetes de 50\n"+b20+" billetes de 20\n"+b10+" billetes de 10\n"+b2+" monedas de 2 euros\n"+b1+" monedas de 1 euro");
    
  
    }
    
}
