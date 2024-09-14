public class EjecutablePersona
{
    public static void main(String [] args)
    {
        Persona persona1= new Persona(44646637, "Miguel", "Garavaglia", 2003);
        Persona persona2= new Persona(43786501, "Ivan", "Gauto", 2001);
        int edad1 = persona1.edad();
        int edad2 = persona2.edad();
        
        persona1.mostrar();
        persona2.mostrar();
    }
}
