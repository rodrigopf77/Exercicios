package aula;

import java.util.Scanner;

public class TipoStringEquals {
    
    public static void main(String[] args) {
        
        System.out.println("2" == "2");//Errado, não se compara Strings com "==".
        
        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));
        
        Scanner sc = new Scanner(System.in);
        
        String s2 = sc.next();
        System.out.println(s2);
        System.out.println("2" == s2.trim());//Errado, não se compara Strings com "==".
        System.out.println("2".equals(s2.trim()));
        
        
        sc.close();
    
    
    }
    
}


/*
System.out.println("Olá pessoal".charAt(0));
        
        String a;
        String b;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o seu nome: ");
        a = sc.next();
        
        System.out.println("Informe a sua idade: ");
        b = sc.next();
        
        System.out.println("\n\n\nBem vindo " + a + "\nVocê tem: " + b + " anos");
*/