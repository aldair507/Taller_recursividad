package ejercicios;

public class ejercicio9 {

    public static int calcularCociente(int dividendo, int divisor) {
        if (dividendo < divisor) {

            return 0;
        }

        int resultadoTotal = 1 + calcularCociente(dividendo - divisor, divisor);

        return resultadoTotal;
    }
}
