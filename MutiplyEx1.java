public class MutiplyEx1 {

	public static void main(String[] args) {
		for(int j=0;j<5;++j) {
			if (j==4) 
			{
				int num=j*4;
				for (int i=1;i<=19;i++) {
					System.out.printf("%2d%2s%3d%2s%3d",num+1,"*",i,"=",(num+1)*i );
					System.out.printf("%7d%2s%3d%2s%3d",num+2,"*",i,"=",(num+2)*i );
					System.out.printf("%7d%2s%3d%2s%3d",num+3,"*",i,"=",(num+3)*i );
					System.out.println();
				}
			}
			else
			{
				int num1=j*4;
				for (int i=1;i<=19;i++) {
					System.out.printf("%2d%2s%3d%2s%3d",num1+1,"*",i,"=",(num1+1)*i );
					System.out.printf("%7d%2s%3d%2s%3d",num1+2,"*",i,"=",(num1+2)*i );
					System.out.printf("%7d%2s%3d%2s%3d",num1+3,"*",i,"=",(num1+3)*i );
					System.out.printf("%7d%2s%3d%2s%3d",num1+4,"*",i,"=",(num1+4)*i );
					System.out.println();
				}
				System.out.println();
			}
			
			
		}
		
		
	}

}
