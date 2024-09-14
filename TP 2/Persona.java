import java.util.*;
/**
 * Clase que representa una persona, calcula su edad y muestra sus datos
 * 
 * @Author (Gauto Ivan Guillermo)
 * @version (12.08.2024) 
 */


public class Persona
{
    //atributos
    private int nroDni;
    private String nombre;
    private String apellido; 
    private int anioNacimiento;

    /**
     * Constructor para los objetos de clase persona
    */
    public Persona (int p_nroDni, String p_nombre, String p_apellido, int p_anio) {
        
        this.setDNI(p_nroDni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
        
    }
     
    //Setters (Mutadores)
    
    /**
     * Setter que modifica el estado del atributo "nroDni"
     * 
     * @param p_nroDni Entero que representa el numero de dni de la persona. Debe ser positivo
     */
    private void setDNI(int p_nroDni) {

        this.nroDni = p_nroDni;
        
    }
    
    /**
     * Setter que modifica el estado del atributo "nombre"
     * 
     * @param p_nombre Nombre de la persona. Debe ser un String
     */
    private void setNombre(String p_nombre) {
        
        this.nombre = p_nombre;
        
    }
    
    private void setApellido(String p_apellido) {
        
        this.apellido = p_apellido;
        
    }
    
    private void setAnioNacimiento(int p_anio) {
        
        this.anioNacimiento = p_anio;
        
    }
    
    //Getters
    
    /**
     * Getter que devuelve el estado del atributo "nroDni"
     * 
     * @return nroDni
     */
    public int getDNI() {
        
        return this.nroDni;
        
    } 

    public String getNombre() {
        
        return this.nombre;
        
    } 
    
    public String getApellido() {
        
        return this.apellido;
        
    } 
        
    public int getAnioNacimiento() {
        
        return this.anioNacimiento;
        
    }
    
    /**
     *Metodo que calcula cuanta edad tiene la persona
     * 
     * @return La edad actual de la persona
     */
    int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        return (anioHoy - anioNacimiento);
    }
    
    /**
     *Metodo que retorna el nombre y el apellido de la persona
     */
    public String nomYApe()
    {
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     *Metodo que retorna el apellido y el nombre de la persona
     */
    public String apeYNom()
    {
        return this.getApellido() + " " + this.getNombre();
    }
    
    //Impresion
    /**
     * Muestra datos de la persona
     */
    void mostrar() {
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("DNI: " + this.getDNI() + " " + "Edad: " + this.edad());
        
    }
    
    
    
    
    
    

    
    
    
}


