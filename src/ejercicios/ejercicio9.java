package ejercicios;

public class ejercicio9 {

    public static int multiplicacionSucesiva(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b == 1) {
            return a;
        }

        int total = a + multiplicacionSucesiva(a, b - 1);
        ;

        System.out.println("multiplicacionSucesiva(" + a + ", " + b + ") = " + a + " + "
                + multiplicacionSucesiva(a, b - 1) + " = " + total);
        return total;
    }

}
