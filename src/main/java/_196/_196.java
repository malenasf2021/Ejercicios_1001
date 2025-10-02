
package _196;


public class _196 {
    public static void main(String[] args) {
        int[] arreglo = {1, 3, 5, 7, 9};
        int suma = 0;

        for (int num : arreglo) {
            suma = suma + num;
        }

        float promedio = (float) suma / arreglo.length;

        System.out.println("El promedio es: " + promedio);
    }

}
