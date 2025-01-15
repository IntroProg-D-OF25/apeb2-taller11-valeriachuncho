/**
 * Generar las funciones/métodos que devuelvan las suma, resta y multiplicación
 * de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 * 
 */
public class Ejercico05_ {
    public static void main(String[] args) {
        int matriz [][]= new int [4][4];
        generarmatriz(matriz);
        presentarmatriz(matriz);
        System.out.println("");
        System.out.println("suma valores: ");
        System.out.println(SumaMatriz(matriz));
        System.out.println("Resta de valores: ");     
        System.out.println(RestarMatriz(matriz)); 
        System.out.println("Multiplicaion de valores: ");
        System.out.println(MultiplicarMatriz(matriz));
    }
    public static void generarmatriz (int matriz [][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz [i][j] = (int)((Math.random()*10) + 1 );
            }
        }  
    }
    public static void presentarmatriz (int matriz [][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }  
    }    
    public static int SumaMatriz (int matriz [][]){
        int suma = 0; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma+= matriz [i][j];
            }
        }        
        return suma;
   }
    public static int RestarMatriz (int matriz [][]){
        int resta= 0; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                resta-= matriz [i][j];
            }
        }        
        return resta;
   }
    public static int MultiplicarMatriz (int matriz [][]){
        int mult = 1; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                mult *= matriz [i][j];
            }
        }        
        return mult;
   }
}
/***
 * 4 7 1 10 
10 7 6 6 
7 4 4 7 
4 7 6 6 

suma valores: 
96
Resta de valores: 
-96
Multiplicaion de valores: 
-729825280
 */
