import java.util.Scanner;

/**
 * Clase que calcula el perimetro de distintas circunferencias ingresadas en la consola.
 * 
 * @Ivan Gauto 
 * @08/08/24
 */
public class Circunferencia
{
    
    private static double radio;
    private static int respuesta;
    
    public static void main () {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Desea calcular un perimetro? (1: si - 0: no)");
        respuesta = teclado.nextInt();

        
        while(respuesta == 1) {
            
            System.out.println("Ingrese valor de radio: ");
            radio = teclado.nextDouble();
            
            double resultado = 2 * Math.PI * radio;
            System.out.println("Radio:" + resultado);
            
            System.out.println("\nDesea calcular un perimetro? (1: si - 0: no)");
            respuesta = teclado.nextInt();
        }
    }
}
