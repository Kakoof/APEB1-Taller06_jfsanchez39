
import java.util.Scanner;

/**
 Ejercicio 07: "Factura de compras: Una empresa de comercialización de
 computadoras realiza el proceso de venta haciendo un descuento por tipo
 de cliente:

Si es cliente tipo 1 hay un descuento del 10%
Si es cliente tipo 2 hay un descuento del 20%
En caso que sea otro tipo de cliente, no hay descuento.
Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los 
siguiente datos:

Nombre del cliente
Costo de la computadora (solo se vende una computadora por transacción)
Tipo de cliente
Presentar el siguiente reporte:

Cliente tipo 1, compra computadora con precio $100"
* 
 * @author Joaquín Sánchez
 * @version 1.0
 */


public class Ejercicio07_Factura_de_compras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costo, costototal = 0;
        String nombre, tipo = "";
        char tipoCli, tipo2;

        for (int i = 1; i <= 8; i++) {
            System.out.println("Ingrese el nombre del cliente: ");
            nombre = tcl.next();
            System.out.println("Ingrese el costo de la computadora: ");
            costo = tcl.nextDouble();
            System.out.println("Es cliente tipo 1? (S/N)");
            tipoCli = tcl.next().charAt(0);

            if (tipoCli == 'S') {
                costototal = costo * 0.9;
                tipo = "Tipo 1";
            } else {
                System.out.println("Eres tipo 2? (S/N)");
                tipo2 = tcl.next().charAt(0);

                if (tipo2 == 'S') {
                    costototal = costo * 0.8;
                    tipo = "Tipo 2";
                } else {
                    costototal = costo;
                    tipo = "No tiene tipo";
                }
            }

            System.out.printf("Cliente: %s\nCosto: %.2f\nTipo: %s\n",
                    nombre, costototal, tipo);
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el nombre del cliente: 
Juan
Ingrese el costo de la computadora: 
100
Es cliente tipo 1? (S/N)
S
Cliente: Juan
Costo: 90,00
Tipo: Tipo 1
Ingrese el nombre del cliente: 
Pedro
Ingrese el costo de la computadora: 
200
Es cliente tipo 1? (S/N)
N
Eres tipo 2? (S/N)
S
Cliente: Pedro
Costo: 160,00
Tipo: Tipo 2
Ingrese el nombre del cliente: 
Pablo
Ingrese el costo de la computadora: 
300
Es cliente tipo 1? (S/N)
N}
Eres tipo 2? (S/N)
N
Cliente: Pablo
Costo: 300,00
Tipo: No tiene tipo
Ingrese el nombre del cliente: 
Joaquin
Ingrese el costo de la computadora: 
400
Es cliente tipo 1? (S/N)
S
Cliente: Joaquin
Costo: 360,00
Tipo: Tipo 1
Ingrese el nombre del cliente: 
Gabriel
Ingrese el costo de la computadora: 
500
Es cliente tipo 1? (S/N)
N
Eres tipo 2? (S/N)
S
Cliente: Gabriel
Costo: 400,00
Tipo: Tipo 2
Ingrese el nombre del cliente: 
Paula
Ingrese el costo de la computadora: 
500
Es cliente tipo 1? (S/N)
S
Cliente: Paula
Costo: 450,00
Tipo: Tipo 1
Ingrese el nombre del cliente: 
Paul
Ingrese el costo de la computadora: 
800
Es cliente tipo 1? (S/N)
N
Eres tipo 2? (S/N)
S
Cliente: Paul
Costo: 640,00
Tipo: Tipo 2
Ingrese el nombre del cliente: 
Martin
Ingrese el costo de la computadora: 
2000
Es cliente tipo 1? (S/N)
S
Cliente: Martin
Costo: 1800,00
Tipo: Tipo 1
BUILD SUCCESSFUL (total time: 1 minute 55 seconds)
 */