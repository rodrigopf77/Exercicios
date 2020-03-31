package exercicios;

import java.util.Scanner;

public class Vetores {
    
    public static void main(String[] args) {
        
        String nomeAluno[] = new String[5];
        String status[] = new String[5];
        
        double nota1, nota2;
        double media[] = new double[5];
        
        String nomes[] = {"Rodrigo", "Carolina", "Valentina",
            "José", "Maria"};
        
        Scanner sc = new Scanner(System.in);
        
//        for (int i = 5; i < 5; i++) {
//            System.out.println("Aluno: ");
//            nomeAluno[i] = sc.next();
//            
//            System.out.println("Nota 1: ");
//            nota1 = sc.nextDouble();
//            
//            System.out.println("Nota 2: ");
//            nota2 = sc.nextDouble();
//            
//            media[i] = (nota1 + nota2) / 2;
//            
//            if (media[i] >= 7) {
//                if (media[i] > 9) {
//                    status[i] = "Parabéns, Aprovado";
//                }else{
//                    status[i] = "Aprovado";
//                }
//            }else if (media[i] < 7 && media[i] >= 3) {
//                status[i] = "Recuperação";
//            }else{
//                status[i] = "Reprovado";
//            }
//            
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println("\n\n");
//            System.out.println(nomeAluno[i] + " " + status[i] + "\nSua média foi: " + media[i]);
//        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i]);
        }
        
    }
    
}