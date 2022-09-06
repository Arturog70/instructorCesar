package ejercicosbyecesar;

//8) Modifica el ejercicio anterior, para que en lugar de pedir un
import javax.swing.JOptionPane;

//número, pida un carácter (char) y muestre su código en la tabla
//ASCII//.
public class ejercicio7ByCesar {

    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog("Input chars");
    
        System.out.println(data);   
		 
        for (int i = 0; i < data.length(); i++){
            int as = data.charAt(i);
            System.out.println(as);  
    }
 }
}