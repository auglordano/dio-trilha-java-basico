package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo = 1200.00;
		
		System.out.println("Por favor, digite o número da conta: ");
		numero = sc.nextInt();
		
		System.out.println("Por favor, digite o número da Agência: ");
		agencia = sc.next();
		
		System.out.println("Por favor, digite seu nome: ");
		nomeCliente = sc.next();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ 
		agencia + " , conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque!");
		
		sc.close();
	}

}
