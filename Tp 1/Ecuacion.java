public class Ecuacion {
    
    private static double a;
    private static double b;
    private static double c;
    private static double discriminante;
    
    public static void main(String args[]) {
        
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        
        discriminante = Math.pow(b, 2)-(4*a*c);
        
        if(discriminante > 0) {
            double resultado1 = calcularRaiz(true, a, b, discriminante);
            double resultado2 = calcularRaiz(false, a, b, discriminante);
            System.out.println("x1= " + resultado1);
            System.out.println("x2= " + resultado2);
        } else if(discriminante == 0) {
            double resultado3 = raizUnica(a, b);
            System.out.println("x1= x2= " + resultado3);
        } else {
            System.out.println("Raiz compleja");
        }
    }
    
    public static double calcularRaiz(boolean esPositiva, double a_p, double b_p, double discriminante_p) {
        if(esPositiva) {
            return (-b_p+(Math.sqrt(discriminante_p)))/(2*a_p);   
        } else {
            return (-b_p-(Math.sqrt(discriminante_p)))/(2*a_p);
        }
    }
    
    public static double raizUnica(double a_p, double b_p) {
        return -b_p/(2*a_p);
    }
}