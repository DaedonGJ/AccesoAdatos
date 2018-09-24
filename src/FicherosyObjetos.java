package modelo;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FicherosyObjetos {

    public static void main(String[] args) {

        costruir();

        buscarfichero();
    }

    public static void costruir() {
        String ruta = "agenda.txt";
        ArrayList p = new ArrayList<>();
        try {
            FileOutputStream fo = new FileOutputStream(ruta);
            ObjectOutputStream ow = new ObjectOutputStream(fo);

            String ini;
            boolean emp = true;

            while (emp != false) {

                ini = JOptionPane.showInputDialog("Desea añadir un usuarios, si o no ");
                if (ini.equalsIgnoreCase("si")) {

                    p.add(new Persona(JOptionPane.showInputDialog("Introduce el nombre"),
                            Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de telefono"))));
                } else if (ini.equalsIgnoreCase("no")) {
                    emp = false;

                } else {
                    JOptionPane.showMessageDialog(null, "Solo se puede introducir si o no ");
                }

            }
            for (Persona a : p) {
                System.out.println("............................");
                a.verPersona();
                ow.writeObject(a);
            }

            ow.close();
            fo.close();

        } catch (IOException e) {
            System.out.println("Error de entrada de salida");
        }

        Persona g;

    }

    public static void buscarfichero() {

        File f = new File("agenda.txt");
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");

        int contador = 0;

        try {
            FileInputStream fi = new FileInputStream(f);
            ObjectInputStream i = new ObjectInputStream(fi);

            ArrayList per = new ArrayList<>();
            while ((fi.available()) > 0) {
                per.add((Persona) i.readObject());

            }
            for (Persona e : per) {

                String n = e.getNombre();
                long nunmTele = e.getTelefono();

// e.verPersona();
                if (n.equalsIgnoreCase(nombre)) {
                    System.out.print("El numero de " + n + " es: " + nunmTele);
                    contador++;

                }

            }
            if (contador == 0) {
                System.out.println(nombre + " no está en la base de datos");
            }

            i.close();
            fi.close();
        } catch (IOException e) {
// TODO Auto-generated catch block
            System.out.println("Error ");
        } catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
