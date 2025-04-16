package ejercicios;

public class ejercicio13 {

    public static int funcionAckerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return funcionAckerman(m - 1, 1);
        } else {
            return funcionAckerman(m - 1, funcionAckerman(m, n - 1));
        }
    }
}
