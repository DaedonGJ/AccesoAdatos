
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class leerRecursiva {

    public static void main(String[] args) {
        String dir_existente = "F:/SegundoAnyo/SistemasDeGestionEmpresarial/practica1";
        File f = new File(dir_existente);

        try {
            //System.out.println(contenido(f));
            //File a = new File("F:/SegundoAnyo/testo.txt");
           // FileWriter fw = new FileWriter(a, true);
            //while(f.canRead())
            //fw.write(recorrer(f));
           // fw.close();
            System.out.println(recorrer(f));
        } catch (IOException ex) {
            Logger.getLogger(leerRecursiva.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static int contenido(File f) {
        int size = 0;
        File[] archivos = f.listFiles();

        for (int i = 0; i < archivos.length; i++) {
            if (archivos[i].isDirectory()) {
                contenido(archivos[i]);

            } else {
                return size += archivos[i].length();

            }
        }
        return size;

    }

    public static String recorrer(File f) throws IOException {
        String recorrido = f.getAbsolutePath();
        if (f.exists()) {

            File[] archivos = f.listFiles();

            for (int i = 0; i < archivos.length; i++) {

                if (archivos[i].isDirectory()) {

                    recorrer(archivos[i]);
                } else {
                    File a = new File("F:/SegundoAnyo/testo.txt");
                    FileWriter fw = new FileWriter(a);
                    fw.write(archivos[i].getAbsolutePath());
                    

                    System.out.println(archivos[i].getAbsolutePath());
                }

            }
            return recorrido += "\n";
        } else {
            return recorrido;
        }
    }

}
