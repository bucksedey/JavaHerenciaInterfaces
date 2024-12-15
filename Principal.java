package marcoflores.herencia;

/**
 *
 * @author Marco Flores
 */
public class Principal {

    public static void main(String[] args) {
        
        Alumno A1 = new Alumno("Marco","Flores",22,4123,8.8f);
        
        A1.showData();
        A1.aprende();
        A1.estudia();
        
        System.out.println("\n");
        
        Docente D1 = new Docente("Pedro","Perez",43,18726.2f,"HXY7UR3");
        D1.showData();
        D1.deduceImpuestos();
        D1.pagaImpuestos();
        
        
        System.out.println("\n");
        
        Autoridad J1 = new Autoridad("Carlos","Hernandez",56,"Jefe",50624.65f);
        J1.showData();
        J1.deduceImpuestos();
        J1.pagaImpuestos();
        
    }
}
