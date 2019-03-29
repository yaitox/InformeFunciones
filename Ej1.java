import java.util.Scanner;

public class Ej1 {


	public static void potencia(int x, int y) {
		int cont = 1;
		for (int i = 1; i <= y; i++)
			cont = cont * x;
		
		System.out.println(cont);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
		for(int i=0;i<=1000000000;i++) {
			System.out.println("Digita la base");
		int a = scanner.nextInt();
		if(a==0)
			break;
		System.out.println("Digite el exponente");
		int b = scanner.nextInt();
		
		potencia(a, b);
		
		}
	} catch(Exception e) {
		System.out.println("Digitaste algo diferente a un número");
	}
	}
	

}

