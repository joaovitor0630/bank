package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Usuario;


public class Program {
	public static void main(String[] args) {
		//configurações
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String accountHolder = "nenhum nome cadastrado no momomento";
		int accountNumber = 0;
		double deposito;
		double saque;
		Usuario transacao = new Usuario();
		
		

		//entrada de dados do usuário
		System.out.print("enter account number: ");
		accountNumber = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter accout holder: ");
		accountHolder = sc.nextLine();
		
		//objeto de cadastro
		Usuario cadastro = new Usuario(accountNumber,accountHolder);
		
		
		//deposito inicial
		System.out.println("Is there na initial deposit	(y/n)? ");
		String checkDeposit = sc.nextLine();
		
		
		//checagem para verificar se foram digitadas as letras corretas
		while(!checkDeposit.equals("n") && !checkDeposit.equals("y")) {
			
			System.out.println("Incorrect digit, please try again.");
			checkDeposit = sc.nextLine();	
		}
		
		
		//condicional do deposito inicial opcional
		if (checkDeposit.equals("y")) {
			System.out.println("Enter initial deposit value: ");
			deposito = sc.nextDouble();
			transacao.deposit(deposito);
		}
		
		
		//mostrando dados
		System.out.println("account data\naccount: " + cadastro.getAccountNumber() + ", holder: " + cadastro.getAccountHolder() + ", balance: " + transacao.getBalance());
		
		
		
		
		//deposito
		System.out.println("Enter a dposit value: ");
		deposito = sc.nextDouble();
		transacao.deposit(deposito);
		
		
		
		//atualizacao
		System.out.println("account data\naccount: " + cadastro.getAccountNumber() + ", holder: " + cadastro.getAccountHolder() + ", balance: " + transacao.getBalance());		
		
		
		
		//saque
		System.out.println("enter a withdraw value: ");
		saque = sc.nextDouble();
		transacao.saque(saque);
		
		//atualizacao
		System.out.println("account data\naccount: " + cadastro.getAccountNumber() + ", holder: " + cadastro.getAccountHolder() + ", balance: " + transacao.getBalance());
		
		
		
		
		sc.close();
		
	}
}
