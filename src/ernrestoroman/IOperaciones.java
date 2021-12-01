
package ernrestoroman;

import ernrestoroman.Empleado;
import formularios.mostrarRegistro;
import java.util.ArrayList;

public interface IOperaciones {

    public void agregarRegistro(EmpleadoOficina emp);
    public void agregarRegistro(EmpleadoProduccion emp);
    public void mostrarRegistro(mostrarRegistro reg);
    
}
