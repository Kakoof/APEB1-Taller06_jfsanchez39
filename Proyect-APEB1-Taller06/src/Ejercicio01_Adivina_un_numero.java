import java.util.Scanner;
import java.util.Random;
/**
 * Ejercicio 01: "Adivina un número: Dada la dinámica de juego computacional, 
 * programar una solución que genere un número entero aleatorio entre 1-N, y
 * solicite al usuario lo adivine; dé pistas si es que el usuario falla,
 * advirtiendo la cantidad de intentos restantes. Si es que no logra adivinar,
 * muestre el mensaje "GAME OVER"."
 * @author Joaquín Sánchez
 * @version 1.0
 */

public class Ejercicio01_Adivina_un_numero {
    public static void main(String [] args) {
        Scanner tcl = new Scanner(System.in);
        Random ale = new Random();
        int numAle = ale.nextInt(21);
        int numadv, intentos =0;
        int inpermitidos = 5;
        while(intentos < 5){
            intentos++;
            System.out.print("Pienso en un numero(0-20), adivina: ");
            numadv = tcl.nextInt();
            if (numadv == numAle)
            {    
                System.out.println("Bien!, adivinaste ");
                System.out.println("Bien! Adivinaste en: "+intentos+" intentos!")
                        ;
                break;
            }
            else
                if(numAle > numadv)
                System.out.println("Mal!, mi número es mayor ");
                else
                    System.out.println("Mal!, mi número es menor ");
                System.out.println("Vas " + intentos +  " intentos!");
        
        if (intentos == inpermitidos){
            System.out.println("Game Over ");
            break;
        }
        }
    }   
}

/***
 * EVIDENCIA DEL RUN:
Pienso en un numero(0-20), adivina: 10
Mal!, mi n�mero es menor 
Vas 1 intentos!
Pienso en un numero(0-20), adivina: 5
Mal!, mi n�mero es mayor 
Vas 2 intentos!
Pienso en un numero(0-20), adivina: 6
Bien!, adivinaste 
BUILD SUCCESSFUL (total time: 7 seconds)

Pienso en un numero(0-20), adivina: 1
Mal!, mi n�mero es mayor 
Vas 1 intentos!
Pienso en un numero(0-20), adivina: 1
Mal!, mi n�mero es mayor 
Vas 2 intentos!
Pienso en un numero(0-20), adivina: 1
Mal!, mi n�mero es mayor 
Vas 3 intentos!
Pienso en un numero(0-20), adivina: 1
Mal!, mi n�mero es mayor 
Vas 4 intentos!
Pienso en un numero(0-20), adivina: 1
Mal!, mi n�mero es mayor 
Vas 5 intentos!
Game Over 
BUILD SUCCESSFUL (total time: 2 seconds)
 */