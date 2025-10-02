
package _272;


/*
import java.util.List;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);
        int resultado = App.sumarPares(lista);
        System.out.println("La suma de pares es: " + resultado);
    }
}
*/

/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();// crea una lista vacía de enteros
        
        System.out.println("¿Cuántos números vas a ingresar?:");
        int cantidad = scanner.nextInt();

        for (int i=0; i<cantidad; i++ ){
            System.out.println("Ingresá el número "+ (i+1) + ":");
            int numero = scanner.nextInt();
            numeros.add(numero); //agrega un elemento numero al final de la lista numeros
        }
        
        int suma_Pares= sumaPares(numeros);
        System.out.println("La suma de núemros pares es: " + suma_Pares);
        
        
    }
    public static int sumaPares(List<Integer> numeros){
        int suma =0; 
        for(int num : numeros){ //num es una variable temporal, recorre la lista numeros
            if(num % 2 ==0){
                suma= suma+num;
            }
        }
        return suma;
    }
}
*/
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class _272{

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

       
            String inputCantidad = JOptionPane.showInputDialog("¿Cuántos números desea ingresar?");
            int cantidad = Integer.parseInt(inputCantidad); //Convierte esa respuesta (que viene como String) a un número entero.

            for (int i = 0; i < cantidad; i++) {
                String inputNumero = JOptionPane.showInputDialog("Ingrese el número #" + (i + 1) + ":");
                int numero = Integer.parseInt(inputNumero);
                numeros.add(numero);//agrega el numero al final de la lista de números
            }

            int suma = sumarNumerosPares(numeros);

            JOptionPane.showMessageDialog(null, "La suma de los números pares es: " + suma);

    }

    public static int sumarNumerosPares(List<Integer> numeros) {
        int suma = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                suma = suma + num;
            }
        }
        return suma;
    }
}