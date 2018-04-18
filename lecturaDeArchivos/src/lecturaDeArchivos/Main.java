package lecturaDeArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creo un archivo de texto con el objeto File
		File file = new File("D:\\texto.txt");

		// Defino la referencia de un Scanner
		Scanner sc;

		try {
			// Creo el Scanner para leer el archivo identificado en file
			sc = new Scanner(file);

			// hasNextLine() devuelve un valor booleano, indicando si existe o
			// no una siguiente línea a leer
			while (sc.hasNextLine())
				System.out.println(sc.nextLine());

			// close() cierra la lectura del archivo
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Otra alternativa, es utilizar un BufferedReader
		BufferedReader br = null;

		try {
			// Creo el objeto en base al file, pero previamente lo tengo que
			// leer a través de un FileReader
			br = new BufferedReader(new FileReader(file));

			// readLine() lee la siguiente línea, en caso que no haya nada para
			// leer devuelve null
			String st;
			while ((st = br.readLine()) != null)
				System.out.println(st);

			// cierro el archivo
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
