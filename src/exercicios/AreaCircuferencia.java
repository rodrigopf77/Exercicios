package exercicios;

public class AreaCircuferencia {
    
    public static void main(String[] args) {
        double raio = 3.4;
        
        //Seguindo as convenções uma constante recebe o nome todo em maiúsculo
        final double PI = 3.14159; //Ao utilizar o final eu indico que essa variável é uma constante, ou seja ele não pode ter o seu valor alterado
        
        double area = PI * raio * raio;
        
        System.out.println("Área = " + area + "Mts2");
    }
    
}
