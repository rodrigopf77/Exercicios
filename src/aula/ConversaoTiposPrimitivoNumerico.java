package aula;

public class ConversaoTiposPrimitivoNumerico {
    
    public static void main(String[] args) {
        double a = 1;//Ocorre uma correção implicita do próprio java
        System.out.println(a);
        
        float b = (float) 1.0; //Convertendo via Cast, esse é um tipo de conversão explícita.
        System.out.println(b);
        
        int c = (int) a;
        byte d = (byte) c; //Cast
        System.out.println(d);
        
        double e = 1;
        int g = (int) e; //Cast
        float f = (float) e; //Cast
        
        System.out.printf("%.2f ", f);
        
    }
    
}
