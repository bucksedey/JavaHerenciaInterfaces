package marcoflores.herencia;

/**
 *
 * @author Marco Flores
 */
public class Alumno extends Persona implements Aprendiz
{
    private int codigoEstudiante;
    private float calificacion;
    
    //Constructor
    public Alumno(String nombre, String apellido, int edad, int codigoEstudiante, float calificacion)
    {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.calificacion = calificacion;
    }
    
    public void showData()
    {
        System.out.println("Nombre: " + getNombre() +
                           "\nApellido: "+ getApellido() +
                           "\nEdad: " + getEdad()+
                           "\nCodigo de estudiante: "+codigoEstudiante+
                           "\nCalificacion final: "+calificacion);
    }
   
    public void aprende()
    {
        System.out.println("El alumno "+ getNombre()+" aprende");
    }
    public void estudia()
    {
        System.out.println("El alumno "+ getNombre()+ " estudia");
    }
}
