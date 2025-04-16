import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n=== MEN\u00da DE EJERCICIOS ===");
            System.out.println("1. Leer un numero entero y calcular el factorial");
            System.out.println("2. Leer un n y calcular la sumatoria hasta n");
            System.out.println("3. Leer un n y calcular la serie 1 + 1/2 + ... + 1/n");
            System.out.println("4. Invertir un numero entero");
            System.out.println("5. Sumar los digitos de un numero");
            System.out.println("6. Calcular potencia de base^exponente");
            System.out.println("7. Calcular MCD de dos numeros");
            System.out.println("8. Calcular cociente mediante restas sucesivas");
            System.out.println("9. Multiplicacion mediante sumas sucesivas");
            System.out.println("10. Sumar elementos de un vector");
            System.out.println("11. Sumar elementos de una matriz");
            System.out.println("12. Imprimir serie Fibonacci hasta un limite");
            System.out.println("13. Calcular funcion de Ackermann");
            System.out.println("14. Salir");
            System.out.print("Seleccione una opci\u00f3n: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un numero: ");
                    long numero = scanner.nextLong();
                    long resultado = ejercicios.ejercicio1.factorialDeN(numero);
                    System.out.println("Factorial de " + numero + " es: " + resultado);
                    break;

                case 2:
                    System.out.println("Ingrese un numero: ");
                    int n = scanner.nextInt();
                    int sumaN = ejercicios.ejercicio2.SumaDeN(n);
                    System.out.println("Suma hasta " + n + " es: " + sumaN);
                    break;

                case 3:
                    System.out.println("Ingrese un numero: ");
                    n = scanner.nextInt();
                    double sumaFrac = ejercicios.ejercicio3.sumaFraccionaria(n);
                    System.out.println("Suma fraccionaria hasta " + n + " es: " + sumaFrac);
                    break;

                case 4:
                    System.out.println("Ingrese un numero: ");
                    n = scanner.nextInt();
                    int invertido = ejercicios.ejercicio4.invertirEntrada(n, 0);
                    System.out.println("Numero invertido: " + invertido);
                    break;

                case 5:
                    System.out.println("Ingrese un numero: ");
                    n = scanner.nextInt();
                    resultado = ejercicios.ejercicio5.sumaDeDigitos(n);
                    System.out.println("Suma de digitos: " + resultado);
                    break;

                case 6:
                    System.out.println("Ingrese base: ");
                    int base = scanner.nextInt();
                    System.out.println("Ingrese exponente: ");
                    int exponente = scanner.nextInt();
                    resultado = ejercicios.ejercicio6.potencia(base, exponente);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 7:
                    System.out.println("Ingrese dos numeros: ");
                    int m = scanner.nextInt();
                    n = scanner.nextInt();
                    int mcd = ejercicios.ejercicio7.mcd(m, n);
                    System.out.println("MCD: " + mcd);
                    break;

                case 8:
                    System.out.println("Ingrese dividendo y divisor: ");
                    int dividendo = scanner.nextInt();
                    int divisor = scanner.nextInt();
                    resultado = ejercicios.ejercicio8.calcularCociente(dividendo, divisor);
                    System.out.println("Cociente: " + resultado);
                    break;

                case 9:
                    System.out.println("Ingrese dos numeros: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    resultado = ejercicios.ejercicio9.multiplicacionSucesiva(a, b);
                    System.out.println("Multiplicacion: " + resultado);
                    break;

                case 10:
                    System.out.println("Cantidad de elementos: ");
                    n = scanner.nextInt();
                    int[] arreglo = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Elemento [" + i + "]: ");
                        arreglo[i] = scanner.nextInt();
                    }
                    int sumaVector = ejercicios.ejercicio10.sumaDeVectores(arreglo, 0);
                    System.out.println("Suma del vector: " + sumaVector);
                    break;

                case 11:
                    System.out.print("Filas: ");
                    m = scanner.nextInt();
                    System.out.print("Columnas: ");
                    n = scanner.nextInt();
                    int[][] matriz = new int[m][n];
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print("Elemento [" + i + "][" + j + "]: ");
                            matriz[i][j] = scanner.nextInt();
                        }
                    }
                    resultado = ejercicios.ejercicio11.sumaMatriz(matriz, 0, 0);
                    System.out.println("Suma de la matriz: " + resultado);
                    break;

                case 12:
                    System.out.print("Límite de Fibonacci: ");
                    int limite = scanner.nextInt();
                    System.out.println("Serie de Fibonacci:");
                    for (int i = 0;; i++) {
                        int fib = ejercicios.ejercicio12.fibonacci(i);
                        if (fib > limite)
                            break;
                        System.out.print(fib + " ");
                    }
                    System.out.println();
                    break;

                case 13:
                    System.out.print("Valor de m: ");
                    m = scanner.nextInt();
                    System.out.print("Valor de n: ");
                    n = scanner.nextInt();
                    resultado = ejercicios.ejercicio13.funcionAckerman(m, n);
                    System.out.println("Ackermann(" + m + ", " + n + ") = " + resultado);
                    break;

                case 14:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while (opcion != 14);

        scanner.close();
    }
}
