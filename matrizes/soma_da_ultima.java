
public class soma_da_ultima {

	public static void main(String[] args) {
		int m[][] = new int [3][4];
		int i,j,r;
		int v1 =3,v2=1,v3=2,v4;
		
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				v4= v1 +v2 +v3 ;
				m[i][j] = v4;
				
						
				
			}
		}
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				System.out.print("[ "+m[i][j]+" ]");
							
			}
			System.out.println();
		}
	}

}
