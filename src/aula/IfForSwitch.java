package aula;

import java.util.Scanner;

public class IfForSwitch {
    
    public static void main(String[] args) {
        
        
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a media: ");
        double media = sc.nextDouble();
        
        for (int i = 0; i < 10; i++) {
            if (media > 10 || media < 0) {
                System.out.println("Média inválida!");
                break;
                                
            }else if (media >= 7) {
                System.out.println("Aprovado");
                break;
                
            }else if (media < 3) {
                System.out.println("Reprovado");
                break;
                
            }else{
                System.out.println("Recuperação");
            }
            
        }
            
            switch( (int) media){
                    case 10:
                        System.out.println("Conceito A");
                        break;
                        
                    case 9:
                        System.out.println("Conceito A");
                        break;
                        
                    case 8:
                        System.out.println("Conceito A");
                        break;
                        
                    default:
                        System.out.println("Opção inválida");
            }
        
        
        
    }
    
}

/*
double media = 2.9;
        
        String resultadoParcial = media < 3 ? "Reprovado" : "Recuperação";
        String resultado = media >= 7 ? "Aprovado" : resultadoParcial;
        System.out.println(resultado);
*/