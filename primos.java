import java.util.Scanner;
public class is_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
		if(a<=0)
			break;
primo(a);
	}
	public static void primo(int x) {
		try {
		int contCero=0;
		for(int i=1;i<=x;i++) {
			if(x%i==0)
				contCero++;
		}
		if(contCero==2)
			System.out.println("-1");
		else
			System.out.println("1");
		} catch(Exception e) {
			System.out.println("No se puede determinar");
			
		}
		}

}
