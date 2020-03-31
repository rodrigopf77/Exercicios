package aula;

public class WhileDeterminado {
    
    public static void main(String[] args) {
        
        int contador = 1;
        
        /*Esse é um while determinado, pois eu sei quantas vezes ele vai ser executado, ou seja, eu determino
         o número de repetições!
        */
        while (contador <= 10) {            
            
            System.out.println("Bom dia");
            System.out.println("Contador: " + contador);
            
            contador++;
            
        }
        
        
    }
    
}
