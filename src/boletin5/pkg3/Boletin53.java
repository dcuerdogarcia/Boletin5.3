package boletin5.pkg3;

import java.util.Scanner;

public class Boletin53 {

   
    public static void main(String[] args) {
      
        double radio;
        Scanner entrada=new Scanner (System.in);
        Circulo cir=new Circulo();
        System.out.println("Introduzca el radio: ");
        radio=entrada.nextDouble();
        cir.setRadio(radio);
        
        System.out.println("El área es: "+cir.calcularArea()+" Y la longitud es: "+cir.calcularLonxitude());
        
    }
    
}