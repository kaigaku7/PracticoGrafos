package bo.edu.uagrm.ficct.inf310sb.excepciones;

/**
 *
 * @author jose andres
 */
public class ExceptionVerticeNoValido extends Exception {
    public ExceptionVerticeNoValido() {
        super("El grado de entrada del vertice no es cero, escoja otro vertice");
    }

    public ExceptionVerticeNoValido(String msg) {
        super(msg);
    }

}
