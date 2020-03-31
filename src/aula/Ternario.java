package aula;

public class Ternario {
    
    public static void main(String[] args) {
        
        /* 
        * Classificamos um operador como ternário quando eu tenho 3 operandos (a expressão (teste lógico), o valor verdadeiro
        * e o valor falso. Ele é divido em dois símbolos "?" e o ":"
        * Essa é uma atribuição ternária separada pelos símbolos "?" e ":";
        * nela utilizamos um operador ternário que é composto do símbolo de "?" e o ":"
        * A interrogação separa a minha expressão (teste lógico) dos valores 
        * E os dois pontos separa as opções verdadeiras e falsas
        */
        
        
        double media = 4.9;
        
        //Com trabalhar com operadores ternários
        
        //1ªOpção
        String resultadoParcial = media < 5 ? "reprovado." : "em recuperação.";
        String resultadoFinal = media >= 7 ? "aprovado." : resultadoParcial;
        
        //2ªOpção
        String resultado = media >=7.0 ? "Aprovado." : media < 5 ? "reprovado" : "em recuperação"; 
        
        //Exibir resultados
        System.out.println("Resultado 1ª Opção\n" + "O aluno está " + resultadoFinal + "\n\n");
        System.out.println("Resultado 2ª Opção\n" + "O Aluno está " + resultado);
        
    }
    
}
