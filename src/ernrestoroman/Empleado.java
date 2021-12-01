
package ernrestoroman;


public class Empleado {
    private String apellido;
    private double horasExtras;
    private int id;
    private String nombre;
    private double salarioBase;

    public Empleado() {
    }
    
    public Empleado(String apellido, double horasExtras, int id, String nombre, double salarioBase) {
        this.apellido = apellido;
        this.horasExtras = horasExtras;
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase; 
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalarioBruto(){
        salarioBase = calcularSalarioNeto() * 0.93;
        return salarioBase;
    }
    
    public float calcularSalarioNeto(){
        float salarioNeto = 10.2f;
        return salarioNeto;
    }
    
    public double calcularSeguro(){
        double seguro = 10;
        return seguro;
    }
    
}
