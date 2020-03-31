package aula;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    
    public static void main(String[] args) {
        
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor!");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo valor!");
        
        System.out.println(valor1 + valor2); //Nesse caso ele está concatenando dois valores em String.
        
        //Aqui ele converte os valores de String para double.        
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        
        Double soma = numero1 + numero2;
        
        //Aqui ele vai exibir os valores convertidos e com as operações aritméticas já realizadas.        
        System.out.println("A soma é: " + soma.toString().length());
        System.out.println("A divisão dos valores é: " + soma/2);
        
        
        
        
    }
    
}
