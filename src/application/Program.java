package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcoes;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe as medidas dos 2 lados de um retangulo (em metros).");
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		Funcoes funcoes = new Funcoes(a, b);

		if (a == b) {
			System.out.println("O sólido informado é um quadrado.");
		} else {
			System.out.println("O sólido informado é um retângulo.");
		}
		System.out.println(funcoes);
		sc.close();
	}

}
