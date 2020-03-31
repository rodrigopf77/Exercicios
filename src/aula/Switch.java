package aula;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        
        String faixa;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a faixa: ");
        faixa = sc.next().toLowerCase();
        
        switch (faixa){
            
            case "branca":
                System.out.println("Essa é a primeira faixa: "
                + faixa);
//                break;
                
            case "azul":
                System.out.println("Essa é a segunda faixa: "
                + faixa);
                break;
                
            case "Laranja":
                System.out.println("Essa é a terceira faixa: "
                + faixa);
                break;
                
            case "Marrom":
                System.out.println("Essa é a quarta faixa: "
                + faixa);
                break;
                
            case "preta":
                System.out.println("Essa é a quinta faixa: "
                + faixa);
                break;
                
            default :
                System.out.println("Opção inválida" + faixa);
            
        }
        
    }
    
}
