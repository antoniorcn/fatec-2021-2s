import java.util.Scanner;
public class Numeros { 
	public static void main(String[ ] args) { 
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double n1 = scan.nextDouble();
		System.out.println("Digite outro numero: ");
		double n2 = scan.nextDouble();
		System.out.println("A soma dos numeros eh ==> " + (n1 + n2));
		scan.close();
	}
}