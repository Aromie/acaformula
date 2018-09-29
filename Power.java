import java.util.Scanner;
// this is cpu formula = cpu power ∝ 1/2 *capacitance*(v*v)*cpu lock frequency

class Power{
	int  c, v, f;
	static long con = 1/2;
	long power;
	

	long calculate(){
		Scanner scanner=new Scanner(System.in);
		int c =scanner.nextInt();
		System.out.print("please input the num data : consistence=?%n");
		int v =scanner.nextInt();
		System.out.print("please input the num data : ampere=?%n");
		int f =scanner.nextInt();
		System.out.print("please input the num data : clock frequency=?%n");
		power = con*c*v*v*f;
		return power;
	}
}
