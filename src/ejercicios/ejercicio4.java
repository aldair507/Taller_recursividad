package ejercicios;

public class ejercicio4 {

    public static int invertirEntrada(int numeroEntrada, int numeroInvertido) {
        if (numeroEntrada == 0) {
            System.out.println("El numero invertido es: " + numeroInvertido);
            return numeroInvertido;
        }
        int digito = numeroEntrada % 10;
        numeroInvertido = numeroInvertido * 10 + digito;
        return invertirEntrada(numeroEntrada / 10, numeroInvertido);

    }
}
