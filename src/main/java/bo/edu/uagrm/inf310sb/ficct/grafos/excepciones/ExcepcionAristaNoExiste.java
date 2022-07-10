package bo.edu.uagrm.ficct.inf310sb.excepciones;

/**
 *
 * @author jose andres
 */
public class ExcepcionAristaNoExiste extends Exception{
    public ExcepcionAristaNoExiste() {
        super("La arista no existe en su grafo.");
    }
    public ExcepcionAristaNoExiste(String msg) {
        super(msg);
    }

}
