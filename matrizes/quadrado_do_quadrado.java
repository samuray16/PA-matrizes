
public class quadrado_do_quadrado {

	public static void main(String[] args) {
		int m[][] = new int [4][4];
		int i, j, valor = 1;
		
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				valor = valor*2;
				m[i][j] = valor * 2;
				
				
			}
		}
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				System.out.print("[ "+m[i][j]+" ]");
			}
			System.out.println();
		}

	}

}
