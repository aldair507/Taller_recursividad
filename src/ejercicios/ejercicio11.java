package ejercicios;

public class ejercicio11 {

    public static int sumaMatriz(int[][] matriz, int fila, int columna) {
        if (fila == matriz.length) {
            return 0;
        }
        if (columna == matriz[fila].length) {
            return sumaMatriz(matriz, fila + 1, 0);
        }
        return matriz[fila][columna] + sumaMatriz(matriz, fila, columna + 1);
    }

}
