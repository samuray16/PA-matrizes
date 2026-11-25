package matrizes;

public class ExercicioA {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int valor = 2;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = valor;
                valor *= 2; 
            }
        }
        
      
        System.out.println("------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}