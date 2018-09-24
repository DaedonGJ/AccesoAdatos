
import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TelefonosBinarios {

    public static void main(String[] args) {

        contruirfichero();
        buscarfichero();

    }

    public static void contruirfichero() {
        String nombres[] = {"Javier Garcia", "paco", "jose"};
        long telefonos[] = {83829291, 389393, 19378549};

        String nombreruta = "telefonosbin.txt";
        String ruta = "F:\\SegundoAnyo\\AccesoADatos\\tema1file";

        int c;
        try {

            FileOutputStream fo = new FileOutputStream(new File(ruta, nombreruta));
            DataOutputStream o = new DataOutputStream(fo);

            for (int i = 0; i < telefonos.length; i++) {
                o.writeUTF(nombres[i]);
                o.writeLong(telefonos[i]);
            }
            System.out.println("correcto");
            o.close();
            fo.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("No se encuentra");
        }

    }

    public static void buscarfichero() {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        String nombreruta = "telefonosbin.txt";
        String ruta = "F:\\SegundoAnyo\\AccesoADatos\\tema1file";
        int contador = 0;
        File f = new File(ruta, nombreruta);

        try {
            FileInputStream fi = new FileInputStream(f);
            DataInputStream i = new DataInputStream(fi);
            String linea;
            String n;
            Long t;

            while (i.available() > 0) {
                n = i.readUTF();
                t = i.readLong();
                // System.out.printf("%s%d%n", n, t);
                if (n.lastIndexOf(nombre) != -1) {

                    System.out.printf("Telefono de %s: %s%n", n, t);
                    contador++;
                }

            }
            i.close();
            if (contador == 0) {
                System.out.printf("%s no est� en la base de datos%n", nombre);
            } else if (contador > 1) {
                System.out.printf("%s posibilidades%n");
            }

            fi.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Error ");
        }
    }
}
