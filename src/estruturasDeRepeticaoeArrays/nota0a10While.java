package estruturasDeRepeticaoeArrays;

import java.util.Scanner;

	/*Fa�a um programa que pe�a uma nota, entre zero e dez.
	 *Mostre uma mensagem caso o valor seja inv�lido e continue pedindo a nota.
	 *O programa s� para quando o valor inserido for o valor correto.
	 */

public class nota0a10While {

	public static void main(String[] args) {
	
		int nota;
		
		Scanner leia = new Scanner(System.in);
		 
		System.out.println("Por favor, digite uma nota entre 0 � 10:");	
		nota=leia.nextInt();
		
		while (true) {
			
			if (nota>=0 && nota<=10) break;//Aqui ele para o While e continua fora do la�o
			
			System.out.println("\nValor inv�lido !"); 
			System.out.println("\nPor favor, digite uma nota entre 0 � 10: ");
			nota=leia.nextInt();
					
			}
		
		System.out.println("\nNota Salva com Sucesso!");
		
		}
		 
	}


