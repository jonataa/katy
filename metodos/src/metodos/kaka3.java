package metodos;

import java.util.Scanner;

public class kaka3 {
	
	public static void main (String[] args)
	{
		int n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um numero inteiro: ");
		n = input.nextInt();
		
		if (n%2==0)
		{
			System.out.println("O numero informado é par");
		}
		
		else if (n%2!=0)
		{
			System.out.println("O numero informado é impar");
		}
	}
	
	

}
