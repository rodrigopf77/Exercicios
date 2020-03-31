package novo;

import java.util.Scanner;

public class Aulas {
    
    public static void main(String[] args) {
        
        String nome;
        int idade;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome: ");
        nome = sc.nextLine();
        
        System.out.print("Idade: ");
        idade = sc.nextInt();
        
        System.out.println("Olá " + nome);
        System.out.println("você tem " + idade + " anos");
    
    
        
    }
    
}
