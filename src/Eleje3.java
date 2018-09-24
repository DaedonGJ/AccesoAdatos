
import java.io.*;

import javax.swing.JOptionPane;

public class Eleje3 {

	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		String nombreruta = "telefonosbin.txt";
		String ruta = "F:\\SegundoAnyo\\AccesoADatos\\tema1file";
		boolean encontrado = false;
		File f = new File(ruta, nombreruta);
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea;

			try {
				/*
				 * //METODO 1 DA ERROR EN CARACTERES CORTOS
				 * while((linea=br.readLine())!=null && encontrado==false){
				 * 
				 * if((linea.lastIndexOf(nombre))!=-1){
				 * 
				 * System.out.println("Encontrado"); System.out.printf(
				 * "Telefono %s: %s%n",
				 * nombre,linea.substring(nombre.length())); encontrado=true; }
				 * } fr.close(); if(encontrado==false){ System.out.printf(
				 * "%s no esta en la base de datos%n",nombre); }
				 * 
				 */
				/*
				 * //METODO 2 CON INDEXOF if((linea.indexOf(nombre))!=-1){
				 * 
				 * System.out.println(linea) ;
				 * 
				 * }
				 */
				// M�TODO 3 CON SLIP
				while ((linea = br.readLine()) != null) {
					String lineas[] = linea.split(",");

					for (int i = 0; i < lineas.length; i++) {
						if (lineas[i].contains(nombre)) {
							String numero = lineas[i + 1].toString();
							System.out.println(numero);
						}
					}

				}
				fr.close();
				if (encontrado == false) {
					System.out.printf("%s no esta en la base de datos%n", nombre);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("");
		}

	}

}
