package aula;

//template de atalho

import java.util.Scanner;


public class DoWhile {
    
    public static void main(String[] args) {
        
        String valor = "Sair";//Caso informe aqui sair ele executa o código pelo menos uma vez.
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Utilizando o DoWhile");
            System.out.println("Informe sair");
            valor = sc.nextLine();
            
        } while(valor.equals("Sair"));
        
    }
    
}
