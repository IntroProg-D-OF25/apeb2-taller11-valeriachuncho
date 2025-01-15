/**
 * Problema 02
Generar una solución que implemente 3 procedimientos. Que permitan 
* calcular el área de un cuadrado, área de un triángulo y área de un
* rectángulo. Cada procedimiento/función debe recibir los datos necesarios 
* y generar el valor correspondiente. Se debe invocar a los procedimientos 
* desde un método principal; Si el usuario ingresa 1 se llama al procedimiento 
* obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo; 3 se 
* llama al procedimiento obtenerAreaCuadrado.
El área del cuadrado es igual a lado x lado x lado x lado
El área del triángulo es igual a (base x altura)/2
El área del rectángulo es igual a base x altura
 */
import java.util.Scanner;


public class Ejercicio02_ {

    public static void main(String[] args) {
        int opcion;
        double lado, base, altura, respuesta=0;
        Scanner tcl = new Scanner(System.in);

        System.out.println("ingresa un numero: ");
        System.out.println("    1) Area Cuadrado");
        System.out.println("    2) Area Triangulo ");
        System.out.println("    3) Area Rectangulo ");
        opcion = tcl.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingres un lado del cuadrado ");
                lado = tcl.nextInt();
                respuesta = areaCuadrado(lado,respuesta);
                System.out.println("El area del cuadrado es " + respuesta) ;
                break;
            case 2:
                System.out.println("Ingresa  la base del triangulo");
                base = tcl.nextInt();
                System.out.println("ingresa la altura del triangulo ");
                altura = tcl.nextInt();
                respuesta=areaTriangulo(base,altura,respuesta);
                System.out.println("El area del  triangulo es "+respuesta);
                break;
            case 3:
                System.out.println("Ingresa la base del rectangulo");
                base = tcl.nextInt();
                System.out.println("Ingresa la altura del rectangulo");
                altura = tcl.nextInt();
                respuesta=areaRectangulo(base,altura,respuesta);
                System.out.println("El area del rectangulo es   "+respuesta);
                break;
            default:
                System.out.println("Error de número");
                break;

        }
    }
    public static double areaCuadrado(double lado,double respuesta){
        respuesta= lado*lado;
        return respuesta;
    }
    public static double areaTriangulo (double base,double altura,double respuesta){
        respuesta= (base*altura)/2;
        return respuesta; 
    }
    public static double areaRectangulo(double base,double altura,double respuesta) {
        respuesta= base*altura;
    return respuesta;   
    }   

    
    

}
/**
 * ingresa un numero: 
    1) Area Cuadrado
    2) Area Triangulo 
    3) Area Rectangulo 
2
Ingresa  la base del triangulo
5
ingresa la altura del triangulo 
10
El area del  triangulo es 25.0
 */
