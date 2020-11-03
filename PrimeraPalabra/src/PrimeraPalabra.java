/**
 * Recibe varias cadenas como par�metros e imprime la primera alfab�ticamente.
 * Run --> Run Configurations --> Arguments --> Run
 * 
 */

import java.util.Scanner;		//IMPORTAR SCANNER
public class PrimeraPalabra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		if (args.length > 0) {		//SI LA LONGITUD ES MAYOR QUE 0 (COMPROBACI�N)
			int primera=0;		//INICIALIZAR I
			for (int i=1;i<args.length;i++) {		//PARA TANTAS VECES COMO HAYA EN ARGS
				if (args[primera].compareTo(args[i])>0) {		//COMPARAR PRIMERA CON SIGUIENTE
					primera = i;		//LA PRIMERA PALABRA EN EL ALFABETO DE LAS INTRODUCIDAS ES LA DE POSICI�N I
				}
			}
			System.out.print(args[primera]);		//OUTPUT
		}

	}

}
