package aula;

import java.util.Scanner;

public class UnarioBinarioTernario {
    
    public static void main(String[] args) {
        
        String nomeAluno;
        double nota1, nota2, nota3, media;
        int matricula = 0;
        matricula ++;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome: ");
        nomeAluno = sc.nextLine();
        
        System.out.println("Nota 1: ");
        nota1 = sc.nextDouble();
        
        System.out.println("Nota 2: ");
        nota2 = sc.nextDouble();
        
        System.out.println("Nota 3: ");
        nota3 = sc.nextDouble();
        
        media = nota1 + nota2;
        
        media = (nota1 + nota2 + nota3) / 3;
        
        String statusParcial = media < 3 ? "Reprovado" : "Recuperação";
        String statusFinal = media >= 7 ? "Aprovado" : statusParcial;
        
        System.out.println(statusFinal + ":" + media);
        

        
        
        
    }
    
}
