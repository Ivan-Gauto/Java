/**
 * Clase que determina si un triangulo se clasifica como triangulo rectangulo.
 * 
 * @Ivan Gauto 
 * @10/08/24
 */
public class trianguloRectangulo {
    private static double cateto1;
    private static double cateto2;
    private static double hipotenusa;
    
    public static void main(String args[]) {
        
        hipotenusa = Double.parseDouble(args[0]);
        cateto1 = Double.parseDouble(args[1]);
        cateto2 = Double.parseDouble(args[2]);
        
        if(Math.pow(hipotenusa, 2) == (Math.pow(cateto1, 2) + Math.pow(cateto2, 2))) {
            System.out.println("Es triangulo rectangulo");
        } else {
            System.out.println("No es triangulo rectangulo");
        }
    }
}
