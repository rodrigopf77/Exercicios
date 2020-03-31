package aula;

import java.util.Scanner;

public class SwitchCompetencias {
    
    public static void main(String[] args) {
        int modulo;
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o módulo: ");
        modulo = sc.nextInt();
        
        switch(modulo){
            
            case 3:
                System.out.println("Informática Aplicada");
                
            case 2:
                System.out.println("Comunicação Oral e escrita");
                
            case 1:
                System.out.println("Lógica de programação");
                
            
        }
        
        
    
    
    }
    
}
