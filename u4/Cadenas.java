
/**
 * Write a description of class Cadenas here.
 * Mostrara distintos metodos de la clase String
 * una cadena es un arreglo de caracteres, donde el primero elemento
 * tiene indice 0 y el ultimo tiene indice length-1,para length como longitud de la cadena
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cadenas
{
    public static void main(String[]args){
        String cadena1 = "Hola a todos";
        
        System.out.println(cadena1);
        System.out.println("Longitud de la cadena: "+cadena1.length());
        System.out.println("En mayusculas: "+ cadena1.toUpperCase());
        System.out.println("Primer caracter: "+ cadena1.charAt(0));
        System.out.println("Ultimo caracter: "+ cadena1.charAt(cadena1.length()-1));
        String cadenaInvertida = "";
        for(int x = cadena1.length()-1;x>=0;x--){
            
            cadenaInvertida= cadenaInvertida + cadena1.charAt(x);
            
        }
        System.out.println("Cadena invertida: "+ cadenaInvertida);
    }
    
}
