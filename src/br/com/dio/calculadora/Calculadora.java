package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a=0,b=0;
		
		System.out.println("Digite o primeiro valor: ");
		a= scan.nextFloat();
		System.out.println("Digite o segundo valor: ");
		b=scan.nextFloat();
		
		float soma = soma(a,b);
		float subtracao=subtracao(a,b);
		float divisao=divisao(a,b);
		float multiplicacao=multiplicacao(a,b);
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(divisao);
		System.out.println(multiplicacao);
	}
	
	public static float soma(float a, float b) {
		return a+b;
	}
	
	public static float subtracao(float a, float b) {
		return a-b;
	}
	
	public static float divisao(float a, float b) {
		return a/b;
	}
	
	public static float multiplicacao(float a, float b) {
		return a*b;
	}
}
