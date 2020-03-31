package aula;

public class Break {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; //O break interrompe e sai da execução daquele trecho de código
            }
            System.out.println(i);
        }
        
        System.out.println("Fim!");
    }
    
}
