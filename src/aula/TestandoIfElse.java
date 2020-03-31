package aula;

import java.util.Scanner;

public class TestandoIfElse {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a média: ");
        double media = sc.nextDouble();
        
        if (media > 10 || media < 0) {
            System.out.println("Média inválida!");
        }else if(media >= 8){
            System.out.println("Conceito A");
        }else if (media >=6) {
            System.out.println("Conceito b");
        }else if (media >= 4) {
            System.out.println("Conceito c");
        }else if (media >= 2) {
            System.out.println("Conceito d");
        }else{
            System.out.println("Conceito E");
        }
        
    }    
}