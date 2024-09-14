
/**
 *Clase que representa un alumno, donde se calcula el promedio de calificaciones 
 * de la materia de Programacion Orientada a Objetos y se muestran los datos.
 * 
 * @author (Gauto Ivan Guillermo) 
 * @version (19.08.24)
 */
public class Alumno
{
    private  int lu;
    private String nombre;
    private String apellido;
    private double nota1; 
    private double nota2;

    /**
     * Constructor para objetos de clase Alumno
     */
    public Alumno(int p_lu, String p_nombre, String p_apellido)
    {
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }
    
    //Setters (Mutadores)
    
    /**
     * Setter que modifica el estado interno del atributo "lu" (Libreta universitaria del alumno)
     * 
     * @param p_lu entero que representa nro. de libreta de un alumno
     */
    private void setLu(int p_lu) {
        
        this.lu = p_lu;
        
    }
    
    private void setNombre(String p_nombre) {
        
        this.nombre = p_nombre;
        
    }
    
    private void setApellido(String p_apellido) {
        
        this.apellido = p_apellido;
        
    }
    
    public void setNota1(double p_nota) {
        
        this.nota1 = p_nota;
        
    }
    
    public void setNota2(double p_nota) {
        
        this.nota2 = p_nota;
        
    }
    
    //Getters (observadores)
    
    /**
     * Getter que devuelve el estado interno del atributo "lu" (libreta universitaria)
     * 
     * @return nro. de libreta universitaria de un alumno
     */
    public int getLu() {
        
        return this.lu;
        
    }
    
    public String getNombre() {
        
        return this.nombre;
        
    }
    
    public String getApellido() {
        
        return this.apellido;
        
    }

    public double getNota1() {
        
        return this.nota1;
        
    }
    
    public double getNota2() {
        
        return this.nota2;
        
    }
     
    /**
     * Verifica si el alumno aprobo la materia en base a las dos notas que posee
     */
    private boolean aprueba()
    {
        return (this.promedio() >= 7.0 && this.getNota1() >= 6.0 && this.getNota2() >= 6.0);
    }
    
    /**
     * Si el alumno aprueba la materia retorna la leyenda APROBADO, en caso contrario 
     * retorna desaprobado
     */
    private String leyendaAprueba()
    {
        if(this.aprueba()){
            return "APROBADO";
        } else {
            return "DESAPROBADO";
        }
    }
    
    /**
     * Calcula el promedio de notas del alumno
     */
    public double promedio()
    {
        return ((this.getNota1() + this.getNota2()) / 2);
    }
    
    /**
     * Metodo que retorna el nombre y el apellido del alumno
     */
    public String nomYApe()
    {
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * Metodo que retorna el apellido y el nombre del alumno
     */
    public String apeYNom()
    {
        return this.getApellido() + " " + this.getNombre();
    }
    
    /**
     * Muestra en consola informacion del alumno
     */
    public void mostrar() 
    {
        
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("LU: "    + this.getLu() + " Notas: " + this.getNota1() + " - " + this.getNota2());
        System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());
        
    }
}