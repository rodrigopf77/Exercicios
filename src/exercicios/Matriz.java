package exercicios;

public class Matriz {
    
    //Para indentar o código Alt+Shit+F

    public static void main(String[] args) {

        int matriz[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = i + 2;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(matriz[i][j]);
            }
        }

    }

}
