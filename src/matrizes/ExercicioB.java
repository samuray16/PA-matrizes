package matrizes;

import java.util.Random;

public class ExercicioB {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random random = new Random();
        
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int linhaMaior = 0, colunaMaior = 0;
        int linhaMenor = 0, colunaMenor = 0;
        
        System.out.println("--- Matriz B (Aleatória) ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(100); 
                System.out.print(matriz[i][j] + "\t");
                
            
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
              
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
            }
            System.out.println();
        }
        
        System.out.println("\nMaior valor: " + maior + " (Linha: " + linhaMaior + ", Coluna: " + colunaMaior + ")");
        System.out.println("Menor valor: " + menor + " (Linha: " + linhaMenor + ", Coluna: " + colunaMenor + ")");
    }
}