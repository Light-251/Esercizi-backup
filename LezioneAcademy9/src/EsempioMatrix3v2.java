import java.util.Random;
import java.util.Scanner;

public class EsempioMatrix3v2 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int row, col;
		do {
			System.out.println("Inserisci righe");
			row = scanner.nextInt();
			System.out.println("Inserisci colonne");
			col = scanner.nextInt();

			if (row <= 0 || col <= 0)
				System.out.println("Inserisci due valori maggiori di 0");
		} while (row <= 0 || col <= 0);
		boolean[][] matrix = new boolean[row][col];

		// RIEMPIMENTO MATRICE
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextBoolean();
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();

		}
		// SCELTA POSTO
		int rowPostoScelto, colPostoScelto;

		// boolean postoLibero;
		do {
			System.out.println("Inserisci coordinate posto (riga-colonna)");
			rowPostoScelto = scanner.nextInt();
			colPostoScelto = scanner.nextInt();

			if (!matrix[rowPostoScelto][colPostoScelto]) {
				System.out.println("Il posto è occupato, riprova");
				matrix[rowPostoScelto][colPostoScelto] = false;
			} else {
				System.out.println("Il posto è libero");
				matrix[rowPostoScelto][colPostoScelto] = false;
				System.out.println("Valore cambiato a occupato");
			}
		} while (rowPostoScelto >= row ||
				colPostoScelto >= col ||
				rowPostoScelto < 0 ||
				colPostoScelto < 0 ||
				!matrix[rowPostoScelto][colPostoScelto]);

		// STAMPA NUOVA MATRICE
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();

		}

		scanner.close();
	}

}
