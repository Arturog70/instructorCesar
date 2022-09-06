package ejercicosbyecesar;

import javax.swing.JOptionPane;

public class ejercico3ByCesar {

    public static void main(String args[]) {

        String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
           JOptionPane.showConfirmDialog(null, "Bienvenido"+ " "+ respuesta);

    }

}
