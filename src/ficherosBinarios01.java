package control;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ficherosBinarios01 {

	public static void main(String[] args) {
		String ruta = "F:\\SegundoAnyo\\AccesoADatos\\tema1file\\datos.txt";
		int c;
		try {

			FileOutputStream fo = new FileOutputStream(ruta);

			DataOutputStream o = new DataOutputStream(fo);

			FileInputStream fi = new FileInputStream(ruta);
			DataInputStream i = new DataInputStream(fi);

			o.writeUTF("En un lugar de la manacha de cuyo nombre no quiero acordarme,");
			o.writeFloat(3.148589f);
			o.writeDouble(3.1838938834d);
			
			System.out.println(i.readUTF());
			System.out.printf("%1.12f%n", i.readFloat());
			System.out.printf("%1.12f%n", i.readDouble());
			
			o.close();
			fi.close();
			fo.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se encuentra");
		}
	}

}
