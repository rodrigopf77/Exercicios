package aula;

import java.util.Scanner;

public class SwitchCaseComBreak {
    
    public static void main(String[] args) {
        
        String faixa;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual sua faixa?");
        faixa = sc.next();
        
        /*
        O switch case é uma variação do "if", a diferença entre eles é que o switch ao contrário do if, não faz um
        teste lógico, ele recebe um determinado valor para encontrá-lo em sua estrutura de cases.
        */
        
        /*
        O break para a execução dos cases para evitar que ele execute blocos de códigos desnecessários.
        */
        
        switch (faixa.toLowerCase()){
            
            case "branca":
                System.out.println(1);
                break;
                
            case "azul":
                System.out.println(2);
                break;
            
            case "roxa":
                System.out.println(3);
                break;
                
            case "marrom":
                System.out.println(4);
                break;
                
            case "preta":
                System.out.println(5);
                break;
                
            default:
                System.out.println("Escolha uma opção válida!");
        }
        
    }
    
}