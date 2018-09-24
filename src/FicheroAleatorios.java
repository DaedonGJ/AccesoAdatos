
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.RandomAccess;

public class FicheroAleatorios {

    public static void main(String[] args) {

        String ruta = "D:\\SegundoAnyo\\AccesoADatos\\tema1file\\personas.txt";
        File fi= new File(ruta);
       
        try {
             fi.createNewFile();
            RandomAccessFile f = new RandomAccessFile(fi, "rw");
            String nombres[] = {"MORALES VAZQUEZ", "PI L�PEZ", "GONZ�LEZ-BASTI�N DE GONZAGA", "GARC�A GARC�A",
                "POTAMO PELAYO"};
            double telefonos[] = {65531111, 912355433, 954212270, 744314310, 912345678};
            StringBuffer buffer;

            for (int i = 0; i < nombres.length; i++) {
                f.write(i + 1);
                buffer = new StringBuffer(nombres[i]);
                buffer.setLength(50);
                f.writeChars(buffer.toString());
                f.writeDouble(telefonos[i]);
            }
            int size = 4 + (50 * 2) + 8;
            char aux[] = new char[50];
            f.seek(size * 3);
            System.out.printf("%d", f.readInt());
            for (int contador = 0; contador < 50; contador++) {
                aux[contador] = f.readChar();

            }
            String nombre = new String(aux);
            System.out.printf("%s ", nombre);
            System.out.printf("%d%n", f.readLong());

            f.close();
        } catch (FileNotFoundException e) {
            System.out.println(" Fichero no encontrado");
        } catch (IOException e) {
            System.out.println(" Problema al manipular el fichero");
        }

    }

}
