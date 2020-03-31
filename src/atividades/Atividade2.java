package atividades;

import java.util.Scanner;

public class Atividade2 {
    
    public static void main(String[] args) {
        
        String nomeAluno[] = new String[2];
        String status[] = new String[2];
        double media[] = new double[2];
        double nota1, nota2;
       
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            
            System.out.println("Aluno: ");
            nomeAluno[i] = sc.next();
            
            System.out.println("Nota1: ");
            nota1 = sc.nextDouble();
            
            System.out.println("Nota2: ");
            nota2 = sc.nextDouble();
            
            media[i] = (nota1 + nota2) / 2;
            
            if (media[i] >= 7) {
                if (media[i] > 9) {
                    status[i] = "Parabéns, Aprovado!";
                    
                }else{
                    status[i] = "Aprovado";
                }
            }else if (media[i] < 7 && media[i] >= 3) {
                status[i] = "Recuperação";
                
            }else{
                status[i] = "Reprovado";
            }
            
        }
        for (int i = 0; i < nomeAluno.length; i++) {
            System.out.println("\nAluno: " + nomeAluno[i] + "\nStatus: " + status[i] + "\nMédia: " + media[i]);
        }
    }
    
    
    
}
