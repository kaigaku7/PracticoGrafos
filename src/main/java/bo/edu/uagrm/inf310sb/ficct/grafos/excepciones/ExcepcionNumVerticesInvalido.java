 */
package bo.edu.uagrm.ficct.inf310sb.excepciones;

/**
 *
 * @author jose andres
 */
public class ExcepcionNumVerticesInvalido extends Exception {
    public ExcepcionNumVerticesInvalido() {
        super("Cantidad de vertices invalido.");
    }

    public ExcepcionNumVerticesInvalido(String msg) {
        super(msg);
    }
}
