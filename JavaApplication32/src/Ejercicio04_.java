/**
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro 
 * procedimiento para calcular el valor del predio de un bien inmueble.
 * Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del
 * cliente, cédula del cliente).
En el procedimiento de planilla de luz se debe pedir los siguiente datos valor
* del kilowatio y el número de kilowatios del mes. Y se genera en pantalla el 
* siguiente reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar
* el valor de $10

En el procedimiento del predio se debe pedir el valor de inmueble y el para 
* obtener el valor del predio se saca el 2% del valor del inmueble. Y se genera
* el siguiente reporte:

Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado
* en $30000 y tiene que pagar de predio $ 600.

En el método principal; si el usuario ingresa 1 se llama al procedimiento
* calcularValorLuz; 2 se llama al procedimiento calcularPredio. Los datos que
* se necesita en cada procedimiento se los debe ingresar por teclado.
 *
 */
import java.util.Scanner;
public class Ejercicio04_ {
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        String clientenombre, clienteapellido, cedula;
        int costokw, kw, k =0, opcion;
        double valorinm;
        System.out.println("Ingrese su nombre : ");
        clientenombre = tcl.next();
        System.out.println("Ingrese su apellido ");
        clienteapellido = tcl.next();
        System.out.println("Ingrse su ceula: ");
        cedula = tcl.next();
        System.out.println("SELECCIONE UNA OPCION: ");
        System.out.println("1. calcular varlor de la luz");
        System.out.println("2. calcular precio de inmueble");
        opcion = tcl.nextInt();
        while (k == 0) {            
            if (opcion == 1) {
                System.out.println("Ingrese el valor KW: ");
                costokw = tcl.nextInt();
                System.out.println("Ingrese los kw que consume: ");
                kw = tcl.nextInt();
                System.out.println("Cliente " + clientenombre + clienteapellido + " con cédula " + cedula + " debe cancelar el valor de " + calcularcostoLuz(costokw, kw));
                k = 1;
            }
            else if (opcion == 2){
                System.out.println("INGRESE EL VALOR DEL INMUEBLE: ");
                valorinm = tcl.nextDouble();
                System.out.println("Cliente " + clientenombre + clienteapellido + " con cédula " + cedula + " tiene un bien inmueble valorado en $" + valorinm + " y tiene que pagar de predio $" + calcularprecio(valorinm));
                k = 1;
            }
            else
                System.out.println("SELECCIONE UNA OPCION CORRECTA");
        }
    }
    public static int calcularcostoLuz (int valorkw, int kw){
        return (valorkw*kw);
    }
    public static int calcularprecio (double valorinm){
        return (int) (valorinm * 0.2);
    }
}
/**
 * Ingrese su nombre : 
Yadira
Ingrese su apellido 
Chuncho
Ingrse su ceula: 
77845694
SELECCIONE UNA OPCION: 
1. calcular varlor de la luz
2. calcular precio de inmueble
1
Ingrese el valor KW: 
5
Ingrese los kw que consume: 
30
Cliente YadiraChuncho con c�dula 77845694 debe cancelar el valor de 150
 */