
package _219;
import java.util.Scanner;

public class _219 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá el precio original del artículo: ");
        double pOriginal = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingresá la categoría del artículo (A, B o C): ");
        String categoria = scanner.nextLine().toUpperCase();//pasa a mayúscula si ingresa una minúscula

        float porcentaje = 0;

        // Indica el % de aumento según la categoría del artículo
        switch (categoria) {
            case "A":
                porcentaje = (float) 0.10;
                break;
            case "B":
                porcentaje = (float) 0.20;
                break;
            case "C":
                porcentaje = (float) 0.30;
                break;
            default:
                System.out.println("No es una categoría válida.");
                return;
        }

        // Calcula el precio actualizado
        //primero al aumento según la categoría
        float aumento = (float) (pOriginal * porcentaje);
        float pActual = (float) (pOriginal + aumento);

        // Resultados
        System.out.println("Porcentaje aplicado: " + (int)(porcentaje * 100) + "%" + "(categoría " + categoria + ")");
        System.out.println("Aumento: " + aumento);
        System.out.println("Precio actualizado: " + pActual);

    }
}