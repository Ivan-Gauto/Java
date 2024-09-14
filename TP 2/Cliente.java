
/**
 * Clase que representa un cliente donde da la posibilidad de agregar saldo a un cliente o reemplazarlo.
 * 
 * @author (Gauto Ivan Guillermo) 
 * @version (19.08.24)
 */
public class Cliente
{
    //Atributos de la clase Cliente
    private int nroDNI;
    private String apellido; 
    private String nombre;
    private double saldo; 
    
    /**
     * Constructor para los objetos de clase cliente
    */
    public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe)
    {
        this.setNroDNI(p_dni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_importe);
    }
    
    //Setters (Mutadores)
    
    /**
     * setter que modifica el estado interno del atributo "nroDNI" del objeto cliente
     * 
     * @param p_dni Representa el numero de dni de la persona. Debe ser positivo
     */
    private void setNroDNI(int p_dni) {
        
        this.nroDNI = p_dni;
    
    }
    
    private void setApellido(String p_apellido) {
    
        this.apellido = p_apellido;
    
    }
    
    private void setNombre(String p_nombre) {
        
        this.nombre = p_nombre;
        
    }
    
    private void setSaldo(double p_importe) {
        
        this.saldo = p_importe;
        
    }
    
    //Getters (Observadores)
    
    /**
     * Getter que devuelve el estado interno del atributo "nroDNI"
     * 
     * @return El numero de DNI de la persona
     */
    public int getNroDNI() {
        
        return this.nroDNI;
    
    }
    
    public String getApellido() {
    
        return this.apellido;
    
    }
    
    public String getNombre() {
        
        return this.nombre;
        
    }
    
    public double getSaldo() {
        
        return this.saldo;
        
    }

    /**
     * Muestra la informacion del cliente
     */
    public void mostrar() {
        
        System.out.println("-Cliente-");
        System.out.println("Nombre y Apellido: " + this.nomYape() +  " (" + this.getNroDNI() + ")");
        System.out.println("Saldo: $"    + this.getSaldo());
        
    }
    
    /**
     * Reemplaza el saldo actual que posee el cliente por medio del parametro
     * 
     */
    public double nuevoSaldo(double p_importe)
    {
        setSaldo(p_importe);
        return this.getSaldo();
    }
    
    /**
     * Agrega nuevo saldo al cliente por medio del parametro
     * 
     */
    public double agregaSaldo(double p_importe)
    {
        setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }
    
    /**
     *Metodo que retorna el nombre y el apellido del cliente
     */
    public String nomYape()
    {
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     *Metodo que retorna el apellido y el nombre del cliente
     */
    public String apeYnom()
    {
        return this.getApellido() + " " + this.getNombre();
    }
    
}