package ejercicosbyecesar;

/*Muestra los números primos entre 1 y 100.
 */
public class ejercicio14ByCesar {
    public static void main(String[] args) {

        int tope = 100;
        int[] primos = new int[0];

        for (int i = 2; i <= tope; i++) {
           
            boolean primo = true;	           
            for (int p : primos) {
                if (i % p == 0) {
                    primo = false;	
                }
            }
            if (primo) {
                int[] nuevosPrimos = new int[primos.length + 1];
                for (int j = 0; j < primos.length; j++) {
                    nuevosPrimos[j] = primos[j];
                }
                nuevosPrimos[nuevosPrimos.length - 1] = i;
                primos = nuevosPrimos;
            }
        }
        for (int p : primos) {
            System.out.println(p);
        }

    }

}
