package bo.edu.uagrm.ficct.inf310sb.excepciones;

/**
 *
 * @author jose andres
 */
public class ExcepcionAristaYaExiste extends Exception{
    public ExcepcionAristaYaExiste() {
        super("Arista ya existe en su grafo.");
    }

    public ExcepcionAristaYaExiste(String msg) {
        super(msg);
    }
}
