package control;

import java.io.*;

public class sanbox2 {

    public static void main(String[] args) {

        String nombre = "prueba.txt";
        String ruta = "F:\\SegundoAnyo\\AccesoADatos\\t1";

        File f = new File(ruta, nombre);
        try {
            FileReader r = new FileReader(f);

            BufferedReader br = new BufferedReader(r);
            /*
			 
			
			String le=br.readLine();
			int c;
			while((c=r.read())!=-1){
				System.out.println((char)c);
			}
             */

 /*
	 		String le=br.readLine();
			
		 	char buffer[] =new char[8];
		 
			
			int c;
			while((c=r.read(buffer))!=-1){
				System.out.println((char)c);
			}
			
             */
 /*
			  while(le!=null){
			
		  System.out.println(le);
			}
			
			r.close();
			br.close();
             */
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
