package estruturasDeRepeticaoeArrays;

import java.util.Scanner;

	/*Fa�a um programa que pe�a para o cliente digitar a quantidade de n�meros que deseja inserir.
	 * Mostrar a quantidade de N�meros Pares dentre os Digitados.
	 * Mostrar a quantidade de N�meros �mpares Digitados.
	 */



public class numerosPareseImparesDo {

	public static void main(String[] args) {
		
		int quantidade;//3
		int numeroCliente;
		int contador=0;//3
		int pares=0, impares=0;	
				
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQuantidade de N�meros a inserir: ");
		quantidade=leia.nextInt();
		
		do {
			System.out.println("\nDigite seu N�mero: ");
			numeroCliente=leia.nextInt();
				
			if (numeroCliente % 2 == 0) pares++;//Descobrir se Par ou impar � dividir por 2 e se o RESTO for 0 ele ser� PAR.
			else impares++;
			
			contador++;
			
		} while (contador < quantidade);
		
		System.out.println("\nA quantidade de Pares �: " + pares);
		System.out.println("\nA quantidade de �mpares �: " + impares);
		
	}
}
