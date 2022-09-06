package ejercicosbyecesar;

import javax.swing.JOptionPane;

/**
 * 16) Escribe una aplicación con un String que contenga una contraseña
 * cualquiera. Después se te pedirá que introduzcas la contraseña, con 3
 * intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un
 * mensaje diciendo “Enhorabuena”. Piensa bien en la condición de salida (3
 * intentos y si acierta sale, aunque le queden intentos).
 */
public class Ejercicio17ByCesar {

    public static void main(String[] args) {

        String contraseña = "1234";
        boolean acierto = false;

        for (int i = 0; i < 3 && !acierto; i++) {
            String password = JOptionPane.showInputDialog("Introduce una contraseña");

            if (password.equals(contraseña)) {
                System.out.println("Enhorabuena, acertaste");
                acierto = true;
            }
        }
    }
}
