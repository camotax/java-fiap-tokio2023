package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*Faça um programa que receba um número n
			▪ Exiba a tabuada deste número do 0 ao 25.
			▪ Utilize laços de repetição.*/
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		
		while(i <= 25) {
			System.out.println(n + " * " + i + " = " + n * i);
			i++;
		}

	}

}
