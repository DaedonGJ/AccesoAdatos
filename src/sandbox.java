package control;

import java.io.File;
import java.io.IOException;

public class sandbox {
	public static void main(String[]args){
		
		String nombre ="prueba.txt";
		String ruta="F:/Carlos/AccesoaDatos/t1";
		
		File a =new File(ruta,nombre);
		
		try {
			a.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File  f =new File (ruta);
		if(f.renameTo( new File("H:/Carlos/AccesoaDatos/prueba.txt"))){
			System.out.println("Se ha cambiado de sitio");
			
		}else System.out.println("No se ha podido");
//crear un archivo ,fichero y renombrar, o mover

	}
}