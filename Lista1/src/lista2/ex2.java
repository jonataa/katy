package lista2;

import java.util.Scanner;

public class ex2 {
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		int num1, num2, num3;
		
		System.out.println("Informe 3 numeros inteiros: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		int resposta = somar(num1, num2, num3);
		
		System.out.println(resposta);
		
		float resultado = media(int num1, int num2, int num3);
		
		System.out.println(resultado);
		
		
		
	}
	
	public static int somar(int n1, int n2, int n3)
	{
		int soma = n1 + n2 + n3;
		
		return soma;
	}
	
	public static int media(int n1, int n2, int n3)
	{
		int m = (n1 + n2 + n3)/3;
		
		return m;
	}

	public static void menor(int n1, int n2, int n3)
	{
		
	}
	
	public static void maior(int n1, int n2, int n3)
	{
		
	}
}
