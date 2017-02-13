/*
23. Leer una secuencia de 30 números y mostrar la suma de su factorial.
 */
package sumafactorial;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class SumaFactorial {

    public static void main(String[] args) {
        int num_factorial;
        int num = 0;
        num_factorial = Integer.parseInt(JOptionPane.showInputDialog("Cuantos Numero"));

        for (int i = 0; i < num_factorial; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
            System.out.println("Valor " + factorial(num));

        }
    }

    public static int factorial(int numero) {
        int f = 1;
        for (int i = 2; i <= numero; i++) {
            f = f + i;

        }
        return f;
    }
}
