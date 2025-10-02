//#278 Crea una función en Java que reciba una cadena y devuelva la cadena invertida
package _278;


public class _278 {
     public static void main(String[] args) {
        
        //Crea una variable de tipo String, frase que se le asigna "Hola Mundo".
        String frase = "Ejercicio 278";
        System.out.println("Frase recibida: " + frase);
        System.out.println("Frase invertida: " + inverteCadena(frase));
    }
    
    //función que reciba una cadena y devuelva la cadena invertida
    //método público estático (llama la método sin neceisdad de crear un objeto)
    public static String inverteCadena(String cadena) {
        
        // Convierte la cadena en un array de caracteres, cada elemento del arreglo es un caracter
        char[] caracteres = cadena.toCharArray();
        
        //la variable inicio se usa como índice para el primer alemento del arreglo
        int inicio = 0;
        
        // la variable fin es el índice del último elemento del arreglo, 
        //longitud del arreglo -1, porque empieza en el índice 0
        
        int fin = caracteres.length - 1;
        
        // Bucle que sigue mientras el ínice inicio se menor que fin
        //el bucle recorre el arreglo
        
        while (inicio < fin) {
            //guarda el primer caracter del arreglo (en el índice 0) en una variable aux
            char aux= caracteres[inicio];
            
            //va intercambiando los caracteres desde el último indice hasta llegar
            //al índice de incio y los va intercmabiando a medida que avanza el bucle
            caracteres[inicio] = caracteres[fin];
            
            
            //el caracter situado en el índice 0 se le asina el último lugar del arreglo
            caracteres[fin] = aux;
            
            // Avanza el índice para recorrer el arreglo
            //inicio avanza una posición, es decir, 0+1 en la primer apasada
            inicio++;
            
            //decremento del índice para ir acercándose al índice 0
            fin--;
        }//fin while
        
        // Convierte el arreglo de caracteres de nuevo a String
        return new String(caracteres);
    }
}
