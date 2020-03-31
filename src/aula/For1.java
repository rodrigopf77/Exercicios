package aula;

public class For1 {
    
    public static void main(String[] args) {
        
        /*
        O for é a melhor estrutura de repetição a ser utilizada quando eu já tenho certo a quantidade de vezes que
        um determinado trecho de código deverá ser executada;
        */
        for (int i = 0; i <= 10; i++) {            
            
            System.out.println("Bom dia");
            System.out.println("I: " + i);
            
            for (int j = 0; j < 3; j++) {
                
                if (i >= 3 && i < 7) {
                    System.out.println("O valor de i é: " + i);
                }
                
            }
            
            
        }
        
        
    }
    
}
