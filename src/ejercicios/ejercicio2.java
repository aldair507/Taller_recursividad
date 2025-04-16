package ejercicios;

public class ejercicio2 {

    public static int SumaDeN(int n) {

        return n + SumaDeN(n - 1);
    }
}
