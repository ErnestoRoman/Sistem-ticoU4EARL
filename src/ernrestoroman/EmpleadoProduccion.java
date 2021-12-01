    
package ernrestoroman;


public class EmpleadoProduccion extends Empleado{
    private double bono;

    public EmpleadoProduccion(String apellido, double horasExtras, int id, String nombre, double salarioBase,double bono) {
        super(apellido, horasExtras, id ,nombre, salarioBase);
        super.calcularSalarioBruto();
        this.bono = bono;
        double salario = super.getSalarioBase() + bono;
        super.setSalarioBase(salario);
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    
}
