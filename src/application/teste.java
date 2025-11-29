package application;

import java.util.Scanner;

import entities.Usuario;


public class teste {
	public static void main(String[] args) {
		Usuario teste = new Usuario();
		Scanner sc = new Scanner(System.in);
		
		
		
		double deposito;
		
		deposito = sc.nextDouble();
		
		teste.deposit(deposito);
		
		double resul = teste.getBalance();
		
		System.out.println(teste.getBalance()+ "\n"  + "opa");

	}

}
