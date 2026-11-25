package matrizes;

import java.util.Scanner;

public class ExercicioC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        
     
        for (int i = 0; i < 3; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
            
            matriz[i][3] = soma;
        }
        
        System.out.println("\n--- Matriz C (Com a soma na última coluna) ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}