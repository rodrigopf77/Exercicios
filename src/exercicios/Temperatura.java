package exercicios;

import java.util.Scanner;

public class Temperatura {
    
    public static void main(String[] args) {
        //Fórmula (°F - 32) * 5/9 = °C
        
        Scanner ler = new Scanner(System.in);
        
        final double AJUSTE = 32;
        final double FATOR = 5/9.0;
        
        double fahrenheit;
        double celsius;
        
        System.out.println("Informe a temperatura em Farenhein: ");
        fahrenheit = ler.nextDouble();
        
        celsius = (fahrenheit - AJUSTE) * FATOR;
        
        System.out.println("A temperatura em celsius: " + celsius);
        
        
    }
    
}
