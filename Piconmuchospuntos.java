package ejercicosbyecesar;

/**
 *
 * @author artur
 */
public class Piconmuchospuntos {

    public static void main(String[] args) {
        double y = Math.PI;
        String x = String.valueOf(y);

        System.out.println(x.substring(0, 3) + "," 
                         + x.substring(0, 4) + "," 
                         + x.substring(0, 5) + ","
                         + x.substring(0, 6) + "," 
                         + x.substring(0, 7));
    }
}
