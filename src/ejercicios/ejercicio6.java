package ejercicios;

public class ejercicio6 {
    public static int potencia(int base, int potencia) {
        if (potencia == 0) {
            return 1;
        } else if (potencia == 1) {
            return base;
        }
        return base * potencia(base, potencia-1);

    }
}
