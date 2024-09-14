
/**
 * Ejecutable de la clase Cliente que realiza una impresion de los datos del cliente
 * 
 * @author (Garavaglia Miguel) 
 * @version (19.08.24)
 */
public class EjecutableCliente
{
    public static void main (String [] args)    
    {
        Cliente cliente1 = new Cliente (Integer.valueOf(args[0]), args[1], args[2] , Double.valueOf(args[3])); 
 
        cliente1.mostrar();
        
        //Mensajes para comprobar funcionalidad
        cliente1.agregaSaldo(100);
        cliente1.mostrar();
        cliente1.nuevoSaldo(325);
        cliente1.mostrar();
        
    }
}
