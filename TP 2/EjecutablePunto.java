import java.util.*;
/**
 * Ejecutable de la clase Punto que ingresa los valores por teclado
 * 
 * @author (Garavaglia Miguel) 
 * @version (20.08.24)
 */
public class EjecutablePunto {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese X: ");
        double X = teclado.nextDouble();
        
        System.out.print("Ingrese Y: ");
        double Y = teclado.nextDouble();
        
        Punto punto1 = new Punto(X, Y);
        
        punto1.mostrar();
        System.out.println(punto1.coordenadas());
    }
}