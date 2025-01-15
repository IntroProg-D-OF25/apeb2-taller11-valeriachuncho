
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double parametro1, parametro2, parametro3, parametro4, promedio = 0;
        String resultadopro;
        System.out.println("ingresa la nota 1");
        parametro1 = tcl.nextInt();
        System.out.println("ingresa la nota 2");
        parametro2 = tcl.nextInt();
        System.out.println("ingresa la nota 3");
        parametro3 = tcl.nextInt();
        System.out.println("ingresa la nota 4");
        parametro4 = tcl.nextInt();
        promedio = ObtenerPromedio(parametro1, parametro2, parametro3, parametro4);
        System.out.println("el promedio de tus notas es" + promedio);
        resultadopro = PromedioCualitativo(promedio);
        System.out.println("El promedio cualitativo es " + resultadopro);
    }

    public static double ObtenerPromedio(double parametro1, double parametro2, double parametro3, double parametro4) {

        return (parametro1 + parametro2 + parametro3 + parametro4) / 4;
    }
    public static String PromedioCualitativo(double promedio) {
   
      if (promedio >= 9) {
        return "Sobresaliente";
      } else if (promedio >= 8) {
        return "Muy Bueno";
      } else if (promedio >= 5) {
        return "Bueno";
      } else {
        return "Regular";
      }
    }



}

/**
 * ingresa la nota 1
10
ingresa la nota 2
10
ingresa la nota 3
10
ingresa la nota 4
10
el promedio de tus notas es10.0
El promedio cualitativo es Sobresaliente
 */

    
