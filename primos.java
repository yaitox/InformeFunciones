import java.util.Scanner;
public class is_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
primo(a);
	}
	public static void primo(int x) {
		
		try {
		int contPrimos=0;
			int contCero=0;
		for(int i=1;i<=x;i++) {
			
			if(x%i==0)
				contCero++;
			if(contCero==2)
				contPrimos++;
			
		}
System.out.println("Se calcularon "+contPrimos+" primos");
int contPrimoz=0;
for(int i=1;i<=contPrimos;i++) {
	if(contPrimos%i==0)
		contPrimoz++;
		
}
if(contPrimoz==0)
	System.out.println("es primo: "+contPrimos);
		if(contCero==2)
			System.out.println("-1");
		else
			System.out.println("1");
		} catch(Exception e) {
			System.out.println("No se puede determinar");
			
		}
		
		}

