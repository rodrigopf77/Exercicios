package aula;

import java.util.Scanner;

public class ConversaoNumeroString {
    
    public static void main(String[] args) {
        
        //Essa primeira opção utilizamos o Wrappers
//        
        Scanner sc = new Scanner(System.in);
        Integer num1;
        
//        System.out.println("Informe o valor: ");
//        num1 = sc.nextInt();
//        
//        System.out.println(num1.toString());
//        System.out.println(num1.toString());
        
        // Aqui utilizamos um tipo primitivo
        double num2 = 10000;
        System.out.println(Double.toString(num2)); //Nesse caso estamos convertendo um tipo primitivo para
        //String para isso utilizamos o "Integer.toString" e passamos como parametro a variável primitiva em questão
        
        
        //Nesse caso estamos "Convertendo" o valor nessa exibição e por isso conseguimos usar a notação ponto para 
        //Utilizar métodos da Classe String.
//        System.out.println((" " + num1).length());
        
        
        
    }
    
}
