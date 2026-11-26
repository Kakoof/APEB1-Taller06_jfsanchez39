import java.util.Scanner;

/**
 * Ejercicio 02: "Serie numérica 1: Realizar un programa Java que permita
 * presentar en pantalla la siguiente secuencia: 	
 *      1/10
	2/11
	3/12
	4/13
	5/14
	6/15"
 * @author Joaquín Sánchez
 * @version 1.0
 */

public class Ejercicio02_Serie_numerica1 {
    public static void main(String [] args) {
        Scanner tcl = new Scanner(System.in);  
        int val1 = 0, val2 = 9,suma;
        do{
            val1++;
            val2++;
            System.out.println(+val1+"/"+val2);
        }while (val1<6 && val2<15);    
    }
    
}

/***
 * EVIDENCIA DEL RUN:
1/10
2/11
3/12
4/13
5/14
6/15
BUILD SUCCESSFUL (total time: 0 seconds)
 */