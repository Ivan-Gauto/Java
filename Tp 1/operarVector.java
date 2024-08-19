import java.util.Scanner;
/**
 * Clase que guarda notas de alumnos en un vector de enteros, calcula el promedio y busca la nota mas alta.
 * 
 * @Ivan Gauto 
 * @13/08/24
 */
public class operarVector {
    
    private static int alumno;
    private static double promedio;
    private static int[] notas;
    private static int mayorNota;
    
    public static void main() {
        ingresarNotas();
        promedio = calcularPromedio();
        mayorNota = mayorNota();
        mostrarNotas(promedio, mayorNota);
    }

    public static int[] ingresarNotas() {
        
        Scanner teclado = new Scanner(System.in);
        notas = new int[5];
        
        for(int i=0; i<notas.length; i++) {
            System.out.println("Ingrese nota del alumno " + (i + 1) + ": ");
            notas[i] = teclado.nextInt();
        }
        
        return notas;
        
    }
    
    public static double calcularPromedio() {
        
        int suma = 0;
        
        for(int i=0; i<notas.length; i++) {
            suma += notas[i];         
        }
        
        return (double) suma / notas.length;
        
    }
    
    public static int mayorNota() {
        
        int mayor = Integer.MIN_VALUE;
        
        for(int i=0; i<notas.length; i++) {
            if(notas[i] > mayor) {
                mayor =+ notas[i];
            }
        }
        
        return mayor;
    
    }
    
    public static void mostrarNotas(double p_promedio, int p_mayorNota) {
        
        System.out.println("Notas: ");
        
        for(int i=0; i<notas.length; i++) {
            System.out.print(notas[i] + "\t");
        }
        
        System.out.println("\t");
        System.out.println("Promedio de notas: " + p_promedio);
        System.out.println("Mayor nota: " + p_mayorNota);
        
    }
}