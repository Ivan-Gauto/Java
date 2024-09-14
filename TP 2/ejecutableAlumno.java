
/**
 * Ejecutable que instancia un nuevo alumno y agrega sus notas
 * 
 * @author (Garavaglia Miguel) 
 * @version (19.08.24)
 */

public class ejecutableAlumno
{
    public static void main(String args[]) {
        //Instancia de la clase alumno
        Alumno alumno1 = new Alumno(Integer.valueOf(args[0]), args[1], args[2]); 
        
        //Mensajes al objeto para comprobar funcionalidad
        alumno1.setNota1(5.99);
        alumno1.setNota2(10);
        alumno1.mostrar();
    }
}
