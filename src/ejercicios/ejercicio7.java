package ejercicios;

public class ejercicio7 {
    public static int mcd (int m, int n) {
        if (n == 0) {
            return m;
        } else if (m == 0) {
            return n;
        }
        return mcd(n, m % n);
    }

}
