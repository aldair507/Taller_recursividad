package ejercicios;

public class ejercicio8 {

    public static String copiarCadena(String original, int index) {
        // Caso base: si ya llegamos al final de la cadena
        if (index == original.length()) {
            return "";
        }
        // Concatenamos el carácter actual y seguimos con el resto
        return original.charAt(index) + copiarCadena(original, index + 1);
    }
}
