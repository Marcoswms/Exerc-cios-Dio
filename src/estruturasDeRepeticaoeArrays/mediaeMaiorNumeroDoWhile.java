package estruturasDeRepeticaoeArrays;

import java.util.Scanner;

	/*Fa�a um programa que leia 5 n�meros.
	 *Informar o Maior n�mero.
	 *Informar a M�dia destes n�meros.
	 */

public class mediaeMaiorNumeroDoWhile {

	public static void main(String[] args) {
		
		int numero; 
		int contador=0;
		int maior=0;
		int soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um N�mero: ");
			numero=leia.nextInt();
		
			soma = soma + numero;
		
			if (numero > maior) maior = numero;
		
			contador++;
		
		} while(contador < 5);
		
		System.out.println("\nMaior N�mero: " + maior);
		System.out.println("\nA M�dia �: " + (soma/5));
				
	}

}
