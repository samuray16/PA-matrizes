import java.util.Scanner;

public class bingo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char resposta;

        do {
            int m[][] = new int[4][4];
            int i, j;
            
            // Preenchendo a matriz com números aleatórios para o bingo
            for(i = 0; i < 4; i++) {
                for(j = 0; j < 4; j++) {
                    m[i][j] = (int) (Math.random() * 75);
                }
            }
            
            // Exibindo a cartela em formato 4x4 organizadinho
            System.out.println("--- SUA CARTELA DE BINGO ---");
            for(i = 0; i < 4; i++) {
                for(j = 0; j < 4; j++) {
                    System.out.print("[ " + m[i][j] + " ] ");
                }
                System.out.println(); // Pula linha ao fim de cada linha da matriz
            }
            System.out.println();
            
            // Sorteio avulso que você tinha colocado no final
            System.out.println("Número sorteado extra: " + (int)(Math.random() * 75));
            System.out.println();

            // Perguntando se o usuário quer gerar outra cartela
            System.out.print("Deseja gerar outra cartela? (S para sim / N para não): ");
            resposta = ler.next().charAt(0);
            System.out.println(); // Linha em branco para separar a próxima execução

        // Continua rodando se o usuário digitar 'S' ou 's'
        } while (resposta == 'S' || resposta == 's');

        System.out.println("Programa encerrado. Boa sorte no jogo!");
        ler.close();
    }

}