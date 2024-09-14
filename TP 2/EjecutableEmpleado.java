import java.util.*;
/**
 * Ejecutable de la clase Empleado
 * 
 * @author (Garavaglia Miguel) 
 * @version (19.08.24)
 */
public class EjecutableEmpleado
{
       public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        //Ingreso de datos del empleado
        
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = teclado.next(); 
        System.out.print("Ingrese el apellido del empleado: ");
        String apellido = teclado.next();
        System.out.print("Ingrese el CUIL del empleado: ");
        long cuil = teclado.nextLong();
        System.out.print("Ingrese el sueldo básico del empleado: ");
        double sueldoBasico = teclado.nextDouble();
        System.out.print("Ingrese el año de ingreso del empleado: ");
        int anioIngreso = teclado.nextInt();
        
        Empleado empleado1 = new Empleado(cuil, apellido, nombre, sueldoBasico, anioIngreso);
        
        //Impresion de datos del empleado para verificar funcionalidad
        
        empleado1.mostrar();
        System.out.println(empleado1.mostrarLinea());
    }
}
