package marcoflores.herencia;

/**
 *
 * @author Marco Flores
 */
public class Docente extends Persona implements Contribuyente
{       
    private float salario;
    private String cedulaProfesional;
    
    //Constructor
    public Docente(String nombre, String apellido, int edad, float salario, String cedulaProfesional)
    {
        super(nombre,apellido,edad);
        this.salario = salario;
        this.cedulaProfesional = cedulaProfesional;
    }
    
    public void showData()
    {
        System.out.println("Nombre: " + getNombre() +
                           "\nApellido: "+ getApellido() +
                           "\nEdad: " + getEdad()+
                           "\nSalario: "+ salario +
                           "\nCedula profesional: "+ cedulaProfesional);
    }
    
    public void pagaImpuestos()
    {
        System.out.println(getNombre() + " paga sus impuestos");
    }
    public void deduceImpuestos()
    {
        System.out.println(getNombre() + " deduce sus impuestos");
    }
}
