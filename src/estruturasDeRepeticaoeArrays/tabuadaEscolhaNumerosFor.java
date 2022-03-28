package estruturasDeRepeticaoeArrays;

import java.util.Scanner;

/*Desenvolva um programa que fa�a a tabuada de um n�mero qualquer inteiro que ser� digitado pelo usu�rio.
 *A tabuada n�o deve necessariamente iniciar em 1 e terminar em 10.
 *O valor inicial e final devem ser informados tamb�m pelo usu�rio.
 * 
 * EX: Montar a tabuada de: 5
	Come�ar por: 4
	Terminar em: 7

	Vou montar a tabuada de 5 come�ando em 4 e terminando em 7:
	5 X 4 = 20
	5 X 5 = 25
	5 X 6 = 30
	5 X 7 = 35
 *Obs: Voc� deve verificar se o usu�rio n�o digitou o final menor que o inicial.
 */

public class tabuadaEscolhaNumerosFor {

	public static void main(String[] args) {

		int tabuada, comeca, termina;

		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("\nGostaria de montar qual taboada? ");
			tabuada = leia.nextInt();

			System.out.println("\nCome�a por: ");
			comeca = leia.nextInt();

			System.out.println("\nTermina em: ");
			termina = leia.nextInt();

			if (comeca > termina)
				System.out.println("\nVoc� deve come�ar com um n�mero menor !");

		} while (comeca > termina);

		System.out.println("\nMontando a Tabuada de " + tabuada + ", come�ando em " + comeca + " e terminando em "
				+ termina + ":");

		for (comeca = comeca; comeca <= termina; comeca++) {

			System.out.println(+tabuada + " X " + comeca + " = " + (tabuada * comeca));
		}
		System.out.println("\nFim !");
	}
}
