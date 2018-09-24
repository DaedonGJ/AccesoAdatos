package control;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {

	public static void main(String[] args) {

		String ruta="F:\\SegundoAnyo\\AccesoADatos\\t1";
		String nombreruta ="prueba.txt";
		String texto ="En un lugar de la mancoa de cuyo nombre nome quiero";
		
		File f=new File(ruta,nombreruta);
		
		try {
			FileWriter w= new FileWriter(f);
			BufferedWriter bw= new BufferedWriter(w);
			//char [] linea= texto.toCharArray();
			//for(char i:linea){
				w.write(texto);
				w.write("\r\n");
				//bw.newLine();
				w.write("hoal");
			//}
				for(int i=1;i<=100;i++)bw.write("numero "+i+";\r\n");
			
				
				bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
