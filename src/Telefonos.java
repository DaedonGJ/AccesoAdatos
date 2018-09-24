

import java.io.*;

public class Telefonos {

    public static void main(String[] args) {

        String ruta = "F:\\SegundoAnyo\\AccesoADatos\\t1";
        String nombreruta = "prueba.txt";
        String nombreruta1 = "prueba1.txt";
        File f = new File(ruta, nombreruta);
        File f1 = new File(ruta, nombreruta1);
        FileReader fr;
        try {
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            FileWriter fw = new FileWriter(f1, true);//esto es para que no me lo aplaste
            BufferedWriter bw = new BufferedWriter(fw);

            while ((linea = br.readLine()) != null) {
                String lineas[] = linea.split(",");

                bw.write(lineas[0] + "," + lineas[1].substring(0, lineas[1].length() - 3) + "xxx");
                bw.newLine();

            }

            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
