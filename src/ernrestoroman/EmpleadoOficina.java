
package ernrestoroman;


public class EmpleadoOficina extends Empleado{

    public EmpleadoOficina(String apellido, double horasExtras, int id, String nombre, double salarioBase) {
        super(apellido, horasExtras, id ,nombre, salarioBase);
        super.setSalarioBase(super.calcularSalarioBruto());
    }
    
    
    
}
