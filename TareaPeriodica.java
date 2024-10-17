import java.util.*;

public abstract class TareaPeriodica implements Runnable { 

    protected int periodo;
    protected Date ultimaEjecucion;
    protected boolean activa;

    public TareaPeriodica(int periodo) {
        this.periodo = periodo;
        actualizar();
        activa = true;
    }

    public TareaPeriodica() { 
        this(1); 
    }

    public void actualizar() {
        ultimaEjecucion = new Date(); // Hora actual
    }

    public void activar() { 
        activa = true; 
    }
    
    public void desactivar() { 
        activa = false; 
    }

    // Cambia el tipo de retorno de void a boolean
    public abstract boolean necesitaEjecucion();

    // Cambia el tipo de retorno de void a int
    public abstract int ejecutarTarea();

    // Metodo run para la implementacion de Runnable
    
    public void run() {
        if (this.necesitaEjecucion()) {
            this.ejecutarTarea();
        }
    }
}
