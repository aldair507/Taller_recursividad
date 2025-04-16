package ejercicios;

public class ejercicio3 {

    public static double sumaFraccionaria(int n) {

        if (n == 1) {

            return 1.0;
        }
        return 1.0 / n + sumaFraccionaria(n - 1);

    }

}
