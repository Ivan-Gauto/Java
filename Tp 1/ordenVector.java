import java.util.Scanner;
/**
 * Clase que determina el menor elemento de un array y los ordena de menor a mayor.
 * 
 * @Author: Ivan Gauto 
 * @Date: 13/08/24
 */
public class ordenVector {
    
    private static double[] vector;
    private static double menor;
    
    public static void main(String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        
        vector = new double[4];
        
        System.out.println("Ingrese datos: ");
        for(int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextDouble(); 
        }
        
        menor = Double.MAX_VALUE;
        
        for(int i=0; i<vector.length; i++) {
            if(vector[i] < menor) {
                menor = vector[i];
            }
        }
        
        System.out.println("Menor elemento en el vector: " + menor);
        
        for (int i = 0; i < vector.length-1; i++) {
            for (int j = 0; j < vector.length-i-1; j++) {
                if (vector[j] > vector[j+1]) {
                    double temp = vector[j];
                    vector[j] =  vector[j+1];
                    vector[j+1] = temp;
                }
            }
        }
        
        System.out.println("Vector ordenado: ");
        
        for(int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + "\t");
        }
        
    }
}
