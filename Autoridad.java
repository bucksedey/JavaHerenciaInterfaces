package marcoflores.herencia;

/**
 *
 * @author Marco Flores
 */
public class Autoridad extends Persona implements Contribuyente
{
    private String cargo;
    private float salario;
    
    //Constructor
    public Autoridad(String nombre, String apellido, int edad, String cargo, float salario)
    {
        super(nombre,apellido,edad);
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public void showData()
    {
        System.out.println("Nombre: " + getNombre() +
                           "\nApellido: "+ getApellido() +
                           "\nEdad: " + getEdad()+
                           "\nSalario: "+ salario +
                           "\nCargo: "+ cargo);
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
