package aula;

public class TiposPrimitivos {
    
    public static void main(String[] args) {
        //Informações Funcionário
        
        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 523;
        int id = 56789;
        long pontosAcumulados = 3234845223L;
        
        //Tipos numéricos reais
        float salario = 1144.44F;
        double vendasAcumuladas = 2991797103.01;
        
        //Tipo booleano
        boolean estaDeFerias = false; //True
        
        //Tipo caractere armazena apenas 1 caracter
        char status = 'a';
        
        //Dias de empresa
        System.out.println("" + anosDeEmpresa * 365);
        
        //Número de viagens
        System.out.println("" + numeroDeVoos / 2);
        
        //Pontos por real
        System.out.println("" + pontosAcumulados / vendasAcumuladas);
        
        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status" + status);
        
    }
    
}
