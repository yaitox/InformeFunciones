import java.util.Scanner;
public class primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
primo(a);
	}
	public static void primo(int x) {
		int contCero=0;
		for(int i=1;i<=x;i++) {
			if(x%i==0)
				contCero++;
		}
		if(contCero==2)
			System.out.println("Es primo");
		else
			System.out.println("No es primo");
	}

}
