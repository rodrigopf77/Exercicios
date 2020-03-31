package aula;

import java.util.Scanner;

public class SwitchCaseSemBreak {
    
    public static void main(String[] args) {
        
        String faixa;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual sua faixa?");
        faixa = sc.next();
        
        switch (faixa.toLowerCase()){
            
            case "branca":
                System.out.println(1);
                
            case "azul":
                System.out.println(2);
            
            case "roxa":
                System.out.println(3);
                
            case "marrom":
                System.out.println(4);
                
            case "preta":
                System.out.println(5);
                
            default:
                System.out.println("Escolha uma opção válida!");
        }
        
    }
    
}
