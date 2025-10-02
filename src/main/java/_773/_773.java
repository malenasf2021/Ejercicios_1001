
package _773;
import static _773.Ordenador.ordenarDescendente;


public class _773 {
   // Método de prueba
    public static void main(String[] args) {
        int[] numeros = {11, 3, 15, 7, 8, 23, 1, 9};
        ordenarDescendente(numeros);

        // Imprime el arreglo ordenado
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        // Salida: 23 15 10 9 8 7 3 1
    }
}
