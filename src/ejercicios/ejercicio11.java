package ejercicios;

public class ejercicio11 {

    public static int sumaDeVectores(int[] arreglo, int i) {
        if (i == arreglo.length) {
            return 0;
        }
        return arreglo[i] + sumaDeVectores(arreglo, i + 1);
    }
}
