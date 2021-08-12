import java.util.Scanner;

class SomaNumeros { 
	public static void main(String[ ] args) { 
		Scanner scan = new Scanner(System.in);
		double n1, n2;
		System.out.println("Digite um numero");
		n1 = scan.nextDouble();
		System.out.println("Digite outro numero");
		n2 = scan.nextDouble();
		System.out.println("A soma dos números é => " + (n1 + n2));
		scan.close();
	}
}