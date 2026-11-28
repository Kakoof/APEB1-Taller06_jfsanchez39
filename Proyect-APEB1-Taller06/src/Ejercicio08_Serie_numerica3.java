import java.util.Scanner;

/**
Ejercicio 08: "Serie numérica 3: Generar e imprimir la siguiente serie y su
sumatoria:

sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)"
 * @author Joaquín Sánchez
 * @version 1.0
 */

public class Ejercicio08_Serie_numerica3 {
    public static void main(String[] args) {
        double sumatoria = 0;
        String serie = "";
        int i = 1;

        while (i <= 10) {
            if (i % 2 == 0) {
                serie += "+(1/" + i + ")";
                sumatoria += 1 / i;
            } else {
                serie += "-(1/" + i + ")";
                sumatoria -= 1 / i;
            }
            i++;
        }

        System.out.println("sumatoria = " + serie);
        System.out.println("Resultado = " + sumatoria);
    }
}

/***
 * EVIDENCIA DEL RUN:
run:
sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
Resultado = -0.6456349206349207
BUILD SUCCESSFUL (total time: 0 seconds)

 */