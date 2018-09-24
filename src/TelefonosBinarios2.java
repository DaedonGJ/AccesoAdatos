
import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TelefonosBinarios2 {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        String nombreruta = "telefonosbin.txt";
        String ruta = "F:\\SegundoAnyo\\AccesoADatos\\tema1file";
        boolean encontrado = false;
        File f = new File(ruta, nombreruta);

        ArrayList<Integer> numeros = new ArrayList();
        ArrayList<String> nombres = new ArrayList();

        try {

            FileOutputStream fo = new FileOutputStream(f);
            DataOutputStream d = new DataOutputStream(fo);

            FileInputStream fi = new FileInputStream(f);
            DataInputStream di = new DataInputStream(fi);
            int leer = fi.read();

            String linea;

            d.writeUTF("patricia");
            d.writeInt(9183855);

            if ((di.readUTF()) != null) {
                nombres.add(di.readUTF());
            } else if ((di.readInt()) != 0) {
                numeros.add(di.read());
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("");
        }

    }

}
