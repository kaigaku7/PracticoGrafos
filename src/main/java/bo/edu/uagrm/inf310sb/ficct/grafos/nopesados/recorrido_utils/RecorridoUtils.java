package bo.edu.uagrm.ficct.inf310sb.nopesados.recorrido_utils;

/**
 *
 * @author jose andres
 */
import java.util.*;
public class RecorridoUtils {
    private List<Boolean> marcados;


    /**
     * 
     * @param nroDeVertices
     */
    public RecorridoUtils(int nroDeVertices) {
        this.marcados = new LinkedList<>();
        for (int i = 0; i < nroDeVertices; i++) {
            this.marcados.add(Boolean.FALSE);
        }
    }


    public void desmarcarTodos() {
        for (int i = 0; i < marcados.size(); i++) {
            marcados.set(i, Boolean.FALSE);
        }
    }

    /**
     * PRE: Se asume que la posición de vertice es una posicion válida.
     * @param posDeVertice
     * @return
     */
    public boolean estaVerticeMarcado(int posDeVertice) {
        return this.marcados.get(posDeVertice);
    }

    /**
     *
     *
     * @return
     */
    public boolean estanTodosMarcados() {
        for (Boolean marcado: this.marcados) {
            if (!marcado) {
                return false;
            }
        }

        return true;
    }

    /**
     * 
     * PRE-Condicion: la posición de vértice, es una posicion válida.
     * @param posDeVertice
     */
    public void marcarVertice(int posDeVertice) {
        marcados.set(posDeVertice, Boolean.TRUE);
    }

    public List<Boolean> getMarcados() {
        return this.marcados;
    }
}
