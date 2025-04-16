package ejercicios;

public class ejercicio1 {

    public static long factorialDeN(long numero) {
        if (numero == 0) {
            return 1;
        }

        long resultado = numero * factorialDeN(numero - 1);

        return resultado;
    }

}
