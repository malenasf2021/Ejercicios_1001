//292_Escribe una función en Java que cuente la cantidad de palabras en una cadena
//split() es una función que divide una cadena (String) en partes basándose 
//en una expresión regular
package _292;


public class _292 {
    public static void main(String[] args) {
        String ejemplo = "Función en Java que cuenta la cantidad de palabras en una cadena";
        
        System.out.println("'" + ejemplo + "' tiene " + cuentaPalabras(ejemplo) + " palabras");
    }
    
    //método que recibe un string y devuelve un entero
    public static int cuentaPalabras(String texto) {
        
        //acá se comprueba si la cadena es vacía 
        
        if (texto == null) { //si la cadena está vacía retorna 0
            return 0;
        }
        
        // Dividir la cadena en un arreglo de string o palabras usando
        //el delimitador \\s que indica los espacios en blanco
        String[] palabras = texto.split("\\s");
        
        //retorna la cantidad de palabras, es decir el número de elementos del
        //arreglo palabras
        return palabras.length;
    }
}
