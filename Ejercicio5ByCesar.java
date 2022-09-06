package ejercicosbyecesar;

import javax.swing.JOptionPane;

public class Ejercicio5ByCesar {

    public static void main (String[] args) {
        String data = JOptionPane.showInputDialog("introduzca un codio ascii");
        int d = Integer.parseInt(data);
        char c = (char) (d);
        System.out.println(data + "el numero corresponde a   " + c);

    }

}
