import java.util.*;
/**
 * Clase que modela a un empleado para administrar  la liquidación de sueldos
 * 
 * @author (Gauto Ivan Guillermo) 
 * @version (19.08.24)
 */
public class Empleado
{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;    
    
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio)
    {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }
    
    //Setters (Mutadores)
    
    /**
     * Setter que modifica el estado interno del atributo "cuil"
     * 
     * @param p_cuil cuil del empleado
     */
    private void setCuil(long p_cuil) {    
        this.cuil = p_cuil;    
    }
    
    private void setApellido(String p_apellido) {    
        this.apellido = p_apellido;    
    }
    
    private void setNombre(String p_nombre) {    
        this.nombre = p_nombre;    
    }
    
    private void setSueldoBasico(double p_importe) {
        this.sueldoBasico = p_importe;    
    }
    
    private void setAnioIngreso(int p_anio) {    
        this.anioIngreso = p_anio;    
    }
    
    //Getters (observadores)
    
    /**
     * Getter que devuelve el estado interno del atributo "cuil"
     * 
     * @return cuil del empleado
     */
    public long getCuil() {    
        return this.cuil;    
    }
    
    public String getApellido() {  
        return this.apellido;   
    }
    
    public String getNombre() {     
        return this.nombre; 
    }
    
    public double getSueldoBasico() {    
        return this.sueldoBasico;  
    }
    
    public int getAnioIngreso() {   
        return this.anioIngreso;  
    }
    
    /**
     * Metodo que calcula los anos de antiguedad del empleado en la empresa
     * 
     * @return antiguedad en la empresa
     */
    public int antiguedad()
    {   
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);   
        return anioHoy - this.getAnioIngreso();    
    }
    
    /**
     * descuento en concepto de obra social mas $1500 seguro de vida
     * 
     * @return descuento
     */
    private double descuento()
    {
     return ((this.getSueldoBasico() * 2) / 100) + 1500;   
    }
    
   /**
     * Realiza una asignacion sobre el sueldo basico, en base a la antiguedad,
     * segun una tabla
     * 
     * @return adicional
     */
    private double adicional() {
        
        double asignacion;
        
        if(this.antiguedad() < 2) {
            asignacion = ((this.getSueldoBasico() * 2) / 100);
        } else if(this.antiguedad() >= 2 && this.antiguedad() < 10) {
            asignacion = ((this.getSueldoBasico() * 4) / 100);
        } else {
            asignacion = ((this.getSueldoBasico() * 6) / 100);
        }
        
        return asignacion;
    }

    /**
     * Calcula el sueldo neto del empleado
     * 
     * @return sueldo neto
     */
    public double sueldoNeto() {
        return this.getSueldoBasico() + this.adicional() - this.descuento();
    }    
    
    /**
     *Metodo que retorna el nombre y el apellido del empleado
     */
    public String nomYApe()
    {
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     *Metodo que retorna el apellido y el nombre del empleado
     */
    public String apeYNom()
    {
        return this.getApellido() + " " + this.getNombre();
    }
    
    /**
     * Muestra datos del empleado
     */
    public void mostrar()
    {
        System.out.println("\nNombre y Apellido: " + this.nomYApe());
        System.out.println("CUIL: " + this.getCuil() + " Antiguedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: $ " + this.sueldoNeto() + "\n");
    }
    
    /**
     * Muestra en una sola linea el cuil, apellido y nombre y sueldo neto del empleado
     * 
     * @return getCuil(), apeYNom(), sueldoNeto()
     */
    public String mostrarLinea() 
    {
        return this.getCuil() + " " + this.apeYNom() + "............. $ " + this.sueldoNeto();
    }
}