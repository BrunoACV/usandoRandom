package application;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char iniciador;
		System.out.println("Seja bem vindo ao gerador de números da sórte!\nDigite 's' para gerar o seu! ");
		do {
			iniciador = sc.next().charAt(0);
			System.out.println("Digite 's' para prosseguir.");
		} while (iniciador != 's');

		System.out.print("O seu número da sórte é ");
		Random random = new Random();
		int numero = random.nextInt(100);

		System.out.println(numero);
		sc.close();
	}

}
