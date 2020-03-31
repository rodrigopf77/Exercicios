package aula;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        
        double media;
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Média: ");
        media = sc.nextDouble();
        
        if (media >= 7) {
            System.out.println("Parabéns Aprovado: " + media);
            if (media > 8) {
                System.out.println("Você arrebentou!");
            }else{
                System.out.println("Você foi bem!");
            }
            
        }else if (media < 7 && media >= 3) {
            System.out.println("Recuperação: " + media);
        }else{
            System.out.println("Reprovado: " + media);
        }
        
    }
    
    
    
}
