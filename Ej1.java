public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int contPar=0;
		int contImpar=0;
		int contPotencias=0;
		try {
		for(int i=1;i<=1000000000;i++) {
			System.out.println("Digita la base");
		int a = scanner.nextInt();
		if(a==0)
			break;
		System.out.println("Digite el exponente");
		int b = scanner.nextInt();
		
		int par = potencia(a, b);
		
		
		if(par%2==0) {
			contPar++;
		}
		if(par%2!=0) {
			contImpar++;
		}
	contPotencias=i;
		}
System.out.println("Hay "+contPar+" resultados pares");
System.out.println("Hay "+contImpar+" resultados impares");
System.out.println("Se calcularon "+contPotencias+" potencias");
		} catch(Exception e) {
		System.out.println("Digitaste algo diferente a un número");
	}
	}
	

}
