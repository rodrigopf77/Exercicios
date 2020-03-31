package aula;

public class Console {
    
    public static void main(String[] args) {
        
        /*
        Existem algumas formas de se exibir informações na tela
        Exs.: 
            1º System.out.print("Bom dia");
            2º System.out.println("Bom dia");
            3º System.out.printf("MegaSena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
        */
        
        //Primeiro exemplo:
        //Nesse caso ele vai imprimir o conteúdo entre aspas, mas não vai pular uma linha, ou seja, tudo o que vier depois
        //Será impresso ao lado, colado no valor da saída.
        System.out.print("Bom dia");
        

        //Segundo exemplo:
        //Nesse caso ele já quebra uma linha e joga os valores seguintes para a próxima linha. Isso ocorre por utilizar
        //o "ln"(New Line)
        System.out.println("Bom dia");
        
        //Terceiro exemplo:
        //Esse é p print formatado. primeiro você informa os tipos de valores a serem exibidos e após a "," os valores em si
        System.out.printf("Megasena: %d %d %d %d %d %d" , 10, 2, 3, 4, 5, 6); //O %d, indica que você está informando que é
        // um valor inteiro
        
        System.out.printf("Salário: %.1f", 1234.56789);
        
        
        
    }
    
}
