package estruturasDeRepeticaoeArrays;

import java.util.Scanner;

//O operador tern�rio � um recurso para tomada de decis�es com objetivo similar ao do if/else, mas que � codificado em apenas uma linha.

public class operadorTernario {

	public static void main(String[] args) {

		int numeroDias; // valor entre 1 e 30

		Scanner leia = new Scanner(System.in);

		System.out.println("\nInforme uma data entre o dia 01 ao 30: ");
		numeroDias = leia.nextInt();

		System.out.println((numeroDias < 15) ? "Primeira quinzena" : "Segunda quinzena"); //Ao avaliar a express�o booleana, caso ela seja verdadeira, o c�digo 1, declarado ap�s o ponto de interroga��o (?) ser� executado; do contr�rio, o programa ir� executar o c�digo 2, declarado ap�s os dois pontos (:).

	}

}
