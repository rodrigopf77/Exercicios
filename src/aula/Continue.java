package aula;

public class Continue {
    
    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                continue; //O continue pula aquela repetição e vai para a próxima
            }
            System.out.println(i);
        }
        
        System.out.println("Fim!");
    }
    
}
