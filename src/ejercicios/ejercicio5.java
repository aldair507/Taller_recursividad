package ejercicios;

public class ejercicio5 {
    public static int sumaDeDigitos(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumaDeDigitos(n / 10);
    }

}
