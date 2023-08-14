package entities;

import java.util.Scanner;

import aplication.ConversorDeMoeda;

//Desenvolvedor: Higor Eugenio
//Github: https://github.com/higoreugenio/Casa-de-cambio

public class CasaDeCambio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		ConversorDeMoeda conversor = new ConversorDeMoeda();
		
		System.out.println("Escolha a moeda que deseja adquirir");
		System.out.println("1 - Dólar");
		System.out.println("2 - Euro");
		System.out.println("3 - Chinese Yuan");
		conversor.opcao = sc.nextInt();
		
		if (conversor.opcao < 1 || conversor.opcao > 3) {
			System.out.println("A opção que você digitou não é válida!");
		}else{
		System.out.print("Informe o valor que deseja comprar: ");
		conversor.valor = sc.nextDouble();
	
		System.out.printf("O valor a ser pago deve ser: R$%.2f", conversor.calcularValor());
		
		}
	
		sc.close();
		
	}

}
