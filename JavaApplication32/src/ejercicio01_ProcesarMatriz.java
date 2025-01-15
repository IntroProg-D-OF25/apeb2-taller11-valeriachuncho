import java.util.Scanner;
public class ejercicio01_ProcesarMatriz {
    public static void main(String[] args) {
        int limiteF=0,limiteCo=0;
        Scanner tcl = new Scanner(System.in);
        System.out.print("deme limite de filas y limite de columnas:  ");
        limiteF= tcl.nextInt();
        limiteCo=tcl.nextInt();
        int matriz[][]= new int [limiteF][limiteCo];
        generarMatriz(matriz);
        presentarMatriz(matriz);
        System.out.println("presentrar pares");
        presentarParesMatriz(matriz);
        System.out.println("presentar impares");
        presentarimparesMatriz(matriz);
        System.out.println("El promedio es "+presentarpromediMatriz(matriz));
    }
    public static void presentarParesMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               if(matriz[i][j]% 2 == 0)
                    System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }
     public static void presentarimparesMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               if(matriz[i][j]% 2 != 0)
                    System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
     public static double presentarpromediMatriz(int matriz[][]){
        int sumaMatriz =0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaMatriz = sumaMatriz + matriz[i][j];
            }
    
        }
        return (sumaMatriz/(matriz.length * matriz[0].length) );
    }
     
    public static void generarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=(int)(Math.random()*10);
            }
            
        }
    }
     public static void presentarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
            
        }
    }
     
}
