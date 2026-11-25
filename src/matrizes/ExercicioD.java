package matrizes;

import java.util.Random;
import java.util.HashSet;

public class ExercicioD {
    
    private static final int tam = 4;
    private static final int MAX_BINGO = 75;
    private static final int TOTAL_NUMEROS = tam * tam;

    public static void main(String[] args) {
        Random random = new Random();
        
        int[][] cartela = gerarCartela(random);
        exibirCartela(cartela);
        
        simularBingo(cartela, random);
    }

   
    public static int[][] gerarCartela(Random random) {
        int[][] cartela = new int[tam][tam];
        HashSet<Integer> numerosUnicos = new HashSet<>();
        
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                int num;
                do {
                    num = random.nextInt(MAX_BINGO) + 1;
                } while (numerosUnicos.contains(num));
                
                numerosUnicos.add(num);
                cartela[i][j] = num;
            }
        }
        return cartela;
    }

    
    public static void exibirCartela(int[][] cartela) {
        System.out.println("--- Cartela de Bingo Gerada ---");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
               
                System.out.print("[" + (cartela[i][j] < 10 ? " " + cartela[i][j] : cartela[i][j]) + "]\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------\n");
    }

   
    public static void simularBingo(int[][] cartela, Random random) {
        boolean[][] marcados = new boolean[tam][tam];
        int acertos = 0;
        int rodadas = 0;
        HashSet<Integer> numerosSorteados = new HashSet<>();
        
        while (acertos < TOTAL_NUMEROS) {
            rodadas++;
            int numeroSorteado;
            
            do {
                numeroSorteado = random.nextInt(MAX_BINGO) + 1;
            } while (numerosSorteados.contains(numeroSorteado));
            
            numerosSorteados.add(numeroSorteado);
            
            System.out.println("Rodada " + rodadas + " - Número cantado: " + numeroSorteado);
            
            boolean achou = false;
            for (int i = 0; i < tam; i++) {
                for (int j = 0; j < tam; j++) {
                    if (cartela[i][j] == numeroSorteado && !marcados[i][j]) {
                        marcados[i][j] = true;
                        acertos++;
                        achou = true;
                    }
                }
            }
            
            if (achou) {
                System.out.println("   -> A cartela TEM o número! (Total de acertos: " + acertos + "/" + TOTAL_NUMEROS + ")");
            } else {
                System.out.println("   -> A cartela NÃO tem o número.");
            }
        }
        
        System.out.println("\n==================================");
        System.out.println("BINGO!");
        System.out.println("O jogador demorou " + rodadas + " rodadas para acertar todas as " + TOTAL_NUMEROS + " dezenas.");
        System.out.println("==================================");
    }
}