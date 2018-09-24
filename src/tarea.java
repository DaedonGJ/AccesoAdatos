package control;

import java.io.File;
import java.io.IOException;

public class tarea {
	public static void main(String[]args){
		
		String  dir_exitente="F:/Carlos/AccesoaDatos/t1/mi_carpeta";
		String uno ="uno";
		String dos ="dos";
		String tres= "tres";
		String prueba="prueba.txt ";
		
		
		File u= new File (dir_exitente,uno);
		
		if(u.mkdir()) System.out.println("Se ha podido crearlo");
		else System.out.println("fallo");
		
		
		File d= new File(u.getPath(),dos);
		if(d.mkdir()) System.out.println("Se ha podido crearlo");
		else System.out.println("fallo");
		
		
		File t= new File(d.getPath(),tres);
		if(t.mkdir()) System.out.println("Se ha podido crearlo");
		else System.out.println("fallo");
		
		File p =new File(t.getPath(),prueba);
		try {
			p.createNewFile();
			System.out.println("Se ha creado el fichero");
		} catch (IOException e) {
			System.out.println("No se ha podido");
		}
		
		
		
		
		//crear un archivo ,fichero y renombrar, o mover

		
		
	}
}