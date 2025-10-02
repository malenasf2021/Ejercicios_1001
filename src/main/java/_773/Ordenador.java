
package _773;


public class Ordenador {

    public static void ordenarDescendente(int[] arr) {
        /* Si el arreglo es null o tiene menos de 2 elementos, no hace nada (ya está ordenado).
        Si no, llama al método mergeSort para ordenarlo desde la posición 0 hasta la última.*/
        
        if (arr == null || arr.length < 2) return;
        mergeSort(arr, 0, arr.length - 1);
    }

    /* Divide el arreglo en mitades recursivamente.
Base de la recursión: cuando inicio >= fin, es decir, cuando ya no se puede dividir más.
Divide el arreglo en dos partes:
mergeSort(arr, inicio, medio); → primera mitad.
mergeSort(arr, medio + 1, fin); → segunda mitad.
Luego, fusiona ambas mitades ordenadas con el método merge.*/

    private static void mergeSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2;
            mergeSort(arr, inicio, medio);
            mergeSort(arr, medio + 1, fin);
            merge(arr, inicio, medio, fin);
        }
    }

    /* Crea un arreglo auxiliar aux dónde irá guardando los elementos ordenados.
    i recorre la primera mitad.
    j recorre la segunda mitad.
    k recorre el arreglo auxiliar. */
    
    private static void merge(int[] arr, int inicio, int medio, int fin) {
        int[] aux = new int[fin - inicio + 1];
        int i = inicio, j = medio + 1, k = 0;

        /* Compara elementos de ambas mitades.
        Elige el mayor (por eso >=) para que el orden sea descendente.
        Inserta el mayor en el arreglo auxiliar. */

        //Si sobran elementos en alguna mitad, los copia directamente (ya están ordenados)
        while (i <= medio && j <= fin) {
            if (arr[i] >= arr[j]) {
                aux[k++] = arr[i++];
            } else {
                aux[k++] = arr[j++];
            }
        }

        while (i <= medio) {
            aux[k++] = arr[i++];
        }

        while (j <= fin) {
            aux[k++] = arr[j++];
        }

        // Finalmente, copia los elementos ya ordenados 
        //del arreglo auxiliar aux de vuelta al arreglo original arr
        for (int m = 0; m < aux.length; m++) {
            arr[inicio + m] = aux[m];
        }
}

}
