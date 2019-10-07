package metodos;

import java.util.Scanner;

public class kaka {

	public static void main(String[] args) {
		
		int n1, n2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um numero inteiro: ");
		n1 = input.nextInt();
		
		System.out.println("Informe outro numero inteiro: ");
		n2 = input.nextInt();
		
		if (n1>n2)
		{
			System.out.println(""+n1+" is larger");
		}
		
		else if (n2>n1)
		{
			System.out.println(""+n2+" is larger");
		}
		
		else 
		{
			System.out.println("This numbers are equal");
		}
	

	}

}
