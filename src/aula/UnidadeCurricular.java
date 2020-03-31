package aula;

import java.util.Scanner;

public class UnidadeCurricular {

    public static void main(String[] args) {
        
        String unidadeCurricular;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a UC: ");
        unidadeCurricular = sc.next().toLowerCase();
        
        switch (unidadeCurricular){
            
            case "informatica":
                System.out.println("UC escolhida: " + unidadeCurricular.toUpperCase());
                break;
                
            case "logica":
                System.out.println("UC escolhida: " + unidadeCurricular.toUpperCase());
                break;
                
            case "testeSistema":
                System.out.println("UC escolhida: " + unidadeCurricular.toUpperCase());
                break;
                
            default:
                System.out.println("UC não encontrada! " + unidadeCurricular.toUpperCase());
            
        }
    }

}