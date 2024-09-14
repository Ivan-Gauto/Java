
/**
 * Clase ejecutable para la clase laboratorio 
 * @author (Miguel Garavaglia) 
 * @version (13.08.24)
 */
public class EjecutableLaboratorio
{
   public static void main(String [] args){
        
    Laboratorio lab1= new Laboratorio("Colgate S.A.",  "Junín 5204", " 54-11 -4239-8447");
    Laboratorio lab2= new Laboratorio("Kolino S.A.",  "San Martin 1566", " 54-3774 -432603", 20, 10);
    
    System.out.println(lab1.mostrar());
    System.out.println(lab2.mostrar());
    System.out.println("lab2 CompraMin:" + lab2.compraMinima + "  FechaEntrega:" + lab2.diaEntrega);
    System.out.println("\n");
    
    lab2.nuevaCompraMinima(35);
    lab2.nuevoDiaEntrega(15);
    System.out.println(lab2.mostrar());
    System.out.println("lab2 CompraMin:" + lab2.compraMinima + "  FechaEntrega:" + lab2.diaEntrega);
    
    
    }  
}