package exercicios;

import java.util.Scanner;

public class Atividade1 {
    
    public static void main(String[] args) {
        
        String nomeAluno;
        double nota1, nota2, media;
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno: ");
            nomeAluno = sc.next();
            
            System.out.println("Nota 1: ");
            nota1 = sc.nextDouble();
            
            System.out.println("Nota 2: ");
            nota2 = sc.nextDouble();
            
            media = (nota1 + nota2) / 2;
            
            if (media >= 7) {
                if (media > 9) {
                    System.out.println(nomeAluno + ": " + "Parabéns!!");
                    System.out.println("Média: " + media + " Aprovado!");
                }else{
                    System.out.println(nomeAluno + "\nMédia: " + media + " Aprovado!");
                }
            }else if (media < 7 && media >= 3) {
                System.out.println(nomeAluno + "\nMédia: " + media + " Você está em recuperação!");
            }else{
                System.out.println(nomeAluno + "\nMédia: " + media + " Reprovado!");
            }
            
        }
        
    }
    
}
