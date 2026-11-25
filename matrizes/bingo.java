import java.util.Scanner;

public class bingo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char resposta;

        do {
            int m[][] = new int[4][4];
            int i, j;
       
            for(i = 0; i < 4; i++) {
                for(j = 0; j < 4; j++) {
                    m[i][j] = (int) (Math.random() * 75);
                }
            }
            
          
            System.out.println("--- SUA CARTELA DE BINGO ---");
            for(i = 0; i < 4; i++) {
                for(j = 0; j < 4; j++) {
                    System.out.print("[ " + m[i][j] + " ] ");
                }
                System.out.println();
            }
            System.out.println();
            

            System.out.println("Número sorteado extra: " + (int)(Math.random() * 75));
            System.out.println();

          
            System.out.print("Deseja gerar outra cartela? (S para sim / N para não): ");
            resposta = ler.next().charAt(0);
            System.out.println(); 

       
        } while (resposta == 'S' || resposta == 's');

        System.out.println("Programa encerrado. Boa sorte no jogo!");
        ler.close();
    }

}
