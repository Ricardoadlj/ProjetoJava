package cursojava.executavel;

import java.util.Scanner;

/*Comitando Exemplos*/
public class PrimeiraClasseJava {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Scanner input2=new Scanner(System.in);
		double dinheiro,lucro,pagamento;
		boolean forma;
		System.out.println("Informe o valor da sua compra: ");
		dinheiro = input.nextDouble();
		lucro = dinheiro * 2.50;
		pagamento = dinheiro *0.98 +(-20);
		System.out.println("O valor da sua compra com juros é: " + lucro);
		System.out.println("O valor da sua compra caso pague em dia: " + pagamento);
		System.out.println("Forma de pagamento: D ou C");
		forma = input.hasNextBoolean();
		if(forma = true) {
			System.out.println("Debito. Insira sua senha: ");
		}
		else{
			System.out.println("Credito. Insira sua senha:");
		}
		
	}
}
