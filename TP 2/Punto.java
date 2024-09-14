
/**
 * Clase que modela el conscepto de un "Punto", para ello se 
 * abstraen las características básicas de un punto, y se lo dota de
 * comportamiento.
 * 
 * @author (Gauto Ivan Guillermo) 
 * @version (20.08.24)
 */
public class Punto {
    private double x;
    private double y;
    
    /**
     * Constructor para objetos de clase punto que recibe como parametros las coordenadas
     */
    public Punto(double p_x, double p_y) {
        this.setX(p_x);
        this.setY(p_y);
    }
    
    /**
     * Constructor para objetos de clase punto que establece el punto en 0
     */
    public Punto() {
        this.setX(0);
        this.setY(0);
    }

    /**
     * Setter para modificar estado interno del atributo "X" representando un valor de abscisas
     * 
     * @param p_x punto x de coordenadas
     */
    private void setX(double p_x) {
        this.x = p_x;
    }
    
    private void setY(double p_y) {
        this.y = p_y;
    }
    
    /**
     * Getter para obtener el estado interno del atributo
     * 
     * @return punto x de coordenadas
     */
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    /**
     * Cambia la posicion del punto desde (x, y) a (x+dx, y+dy)
     */
    public void desplazar(double p_dx, double p_dy) {
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    
    /**
     * Muestra informacion de en donde se situa el punto
     */
    public void mostrar() {
        System.out.println("Punto X: " + this.getX() + " " + "Y: " + this.getY());
    }
    
    /**
     * Retorna una cadena con el formato (X, Y)
     */
    public String coordenadas() {
        return "(" + this.getX() + "," + this.getY() + ")";
    }
}


