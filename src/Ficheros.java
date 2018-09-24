package control;


import java.io.*;

public class Ficheros {

	public static void main(String[] args) {
		
		File fichero= new File("C:/jose");
		if(fichero.isFile())
			
			System.out.println("fichero");
		else if (fichero.isDirectory()){
			
			System.out.println("Directorio");
			
			String [] lista= fichero.list();
			
	for (int i=0; i<lista.length;i++){
		
		File item= new File(fichero,lista[i]);
		if(item.isFile())
		System.out.printf("%s%n",item.getName());
		
	
	else{
		
		System.out.println("O  no existe o no tengo ninguno");
			
		}
		
	}	
		
		
		
		
		
		}
		
		
	}
	
	
}
		
		
		
		
		
		
		
		
	


