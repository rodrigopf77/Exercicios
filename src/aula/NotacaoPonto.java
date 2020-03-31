package aula;

public class NotacaoPonto {
    
    public static void main(String[] args) {
        
        double a = 2.3; //Os tipos primitivos são sempre em minúsculo e são palavras reservadas
        String s = "Boa noite Fulano";
        s = s.replace(" Fulano", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");
        
        
        
        
        
        /*
            A String é com "S" maiúsculo por ser uma classe, todos os tipos não primitivos a sua disposição a notação
            ponto
        */
        
        System.out.println(s);
        
        String x = "Leo".toUpperCase();
        System.out.println(x);
        
        String y = "Bom dia X".replace("X", x).toUpperCase().concat("!!!");
        System.out.println(y);
        
        // IMPORTANTE: Os tipos primitivos não tem a opção da notação ponto
    }
}
