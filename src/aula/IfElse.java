package aula;

import java.util.Scanner;

public class IfElse {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        
        System.out.print("Nome: ");
        nome = sc.nextLine();
                
        System.out.print("Idade: ");
        idade = sc.nextInt();
        
        System.out.print("Salario: ");
        salario = sc.nextDouble();
        
        if (idade >= 18) {
            System.out.println("Parabéns você já é um homenzinho!");
        }else if (idade < 10) {
            System.out.println("Ops, você ainda não tem 10 anos!");
        }
        else{
            System.out.println("Rapaz, um dia você chega lá!");
        }
        
        
        
    }
    
}
