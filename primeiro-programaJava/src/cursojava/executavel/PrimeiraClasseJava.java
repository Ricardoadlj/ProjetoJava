package cursojava.executavel;

import java.util.Scanner;

/*Comitando Exemplos*/
public class PrimeiraClasseJava {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double dinheiro,lucro;
		System.out.println("Informe o valor da sua compra: ");
		dinheiro = input.nextDouble();
		lucro = dinheiro * 2.50;
		System.out.println("O valor da sua compra com juros é: " + lucro);
		
	}
}
