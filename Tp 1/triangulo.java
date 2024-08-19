/**
 * Calcula el area de el semiperimetro de un triangulo.
 * 
 * @Ivan Gauto 
 * @09/08/24
 */
public class triangulo
{
    private static double a;
    private static double b;
    private static double c;
    
    public static void main(String args[]) 
    {
        
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
    
        double resultadoSemiperimetro = semiperimetro(a, b, c);
        double resultadoArea = area(a, b, c, resultadoSemiperimetro);
        
        System.out.println("Semiperimetro: " + resultadoSemiperimetro);
        System.out.println("Area: " + resultadoArea);
    }
    
    public static double semiperimetro(double a_p, double b_p, double c_p) 
    {
        return (a_p+b_p+c_p)/2;
    }
    
    public static double area(double a_p, double b_p, double c_p, double semiPerimetro_p) 
    {
       return Math.sqrt(semiPerimetro_p*(semiPerimetro_p-a_p)*(semiPerimetro_p-b_p)*(semiPerimetro_p-c_p));
    }
}