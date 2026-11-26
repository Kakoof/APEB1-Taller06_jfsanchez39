import java.util.Scanner;

/**
 * Ejercicio 03: "Serie numérica 2: Realizar un programa Java que permita
 * presentar en pantalla la siguiente secuencia:"
 * 	5/10
	10/12
	15/14
	20/16
	25/18
	30/20
 * @author Joaquín Sánchez
 * @version 1.0
 */

public class Ejercicio03_Serie_numerica2 {
    public static void main(String [] args) {
        Scanner tcl = new Scanner(System.in); 
        int val1 = 5, val2 = 10;
        for (int i = 1; i < 6; i++) {
            val1 = val1 + 5;
            val2 = val2 + 2;
            System.out.println(+val1 + "/" +val2);    
        }
    }    
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */