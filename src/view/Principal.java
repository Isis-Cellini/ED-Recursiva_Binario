package view;

import java.util.Scanner;

import controller.binarioController;

public class Principal {

	public static void main(String[] args) {
		String resultado = "";
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		if (numero < 0 || numero > 2000) {
			while (numero < 0 || numero > 2000) {
				System.out.println("Insira um numero entre 0 a 2000");
				numero = scan.nextInt();
			}
		}
		binarioController novo = new binarioController();
		resultado = novo.converte(numero);
		System.out.println(resultado);

	}
}