
/**
 * Clase que respresenta un laboratorio que comercializa con una drogueria
 * 
 * @author (gauto Ivan Guillermo) 
 * @version (13.08.24)
 */

public class Laboratorio
{
    //Atributos
    private String nombre;
    private String domicilio;
    private String telefono;
    public int compraMinima;
    public int diaEntrega;

    /**
     *Constructor sobrecargado para los objetos de clase Laboratorio
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono , int p_compraMin , int p_diaEnt)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMin);
        this.setDiaEntrega(p_diaEnt);
    }
    
    /**
     *Constructor sobrecargado para los objetos de clase Laboratorio
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(0);
        this.setDiaEntrega(0);
    }
    
    //Setters (Mutadores)
    
    /**
     * Setter que modifica el estado interno del atributo nombre
     * 
     * @param p_nombre Nombre del laboratorio. 
     */
    private void setNombre(String p_nombre)
    {
        
        this.nombre = p_nombre;
        
    }
       
    private void setDomicilio(String p_domicilio)
    {
        
        this.domicilio = p_domicilio;
        
    }
         
    private void setTelefono(String p_telefono) 
    {
        
        this.telefono = p_telefono;
        
    }
        
    private void setCompraMinima(int p_compraMin) 
    {
        
        this.compraMinima = p_compraMin;
        
    }
          
    private void setDiaEntrega(int p_diaEnt) 
    {
        
        this.diaEntrega = p_diaEnt;
        
    }
    
    //Getters (Observadores)
    
    /**
     * Getter que devuelve el estado del atributo nombre
     * 
     * @return El nombre del laboratorio
     */
    public String getNombre()
    {
        
        return this.nombre;
        
    }
    
    public String getDomicilio()
    {
        
        return this.domicilio;
        
    }

    public String getTelefono() 
    {
        
        return this.telefono;
        
    }
    
    public int getCompraMinima()
    {
        
        return this.compraMinima;
        
    }
    
    public int getDiaEntrega()
    {
        
        return this.diaEntrega;
        
    }
    
     /**
     * Actualiza la nueva compra minima que realiza el Laboratorio
     * 
     */
    public void nuevaCompraMinima(int p_compraMin)
    {
        this.setCompraMinima(p_compraMin);
    }
    
    /**
     * Actualiza el dia de entrega del Laboratorio
     */
    public void nuevoDiaEntrega(int p_diaEnt)
    {
        this.setDiaEntrega(p_diaEnt);
    }
    
    /**
     * Metodo que retorna los datos del laboratorio
     */
    public String mostrar(){
        return("Laboratorio: " + this.getNombre() + "\n" + "Domicilio: "
                + this.getDomicilio() + " - " + "Telefono: " + this.getTelefono());
    }
}
