package ejercicios;

public class ejercicio4 {

    public static int SumaDeN(int n) {

        return n + SumaDeN(n - 1);
    }
}
