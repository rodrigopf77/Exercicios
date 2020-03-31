package aula;

import java.util.Scanner;

public class WhileIndeterminado {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String valor = ""; //Se aqui eu informar Sair ele nem executa a estrutura While
        
        /*É mais interessante utilizar o While para quando não há um valor pré-determinado de repetições, pois basta
        realizar um teste lógico para realizar determinada ação.
        */
        while(!valor.equalsIgnoreCase("sair")){
            System.out.println("Informe Sair");
            valor = sc.nextLine();
            
            
        }
        
    }
    
}
