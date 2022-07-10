package bo.edu.uagrm.ficct.inf310sb.pesados.recorrido_utils;

/**
 *
 * @author jose andres
 */
import java.util.LinkedList;
import java.util.List;

public class RecorridoUtilsPredecesores {
    private List<Integer> predecesores;
    private static int  POSICION_NO_VALIDA = -1;


    /**
     * 1)
     * @param nroDeVertices
     */
    public RecorridoUtilsPredecesores(int nroDeVertices) {
        this.predecesores = new LinkedList<>();
        for (int i = 0; i < nroDeVertices; i++) {
            this.predecesores.add(RecorridoUtilsPredecesores.POSICION_NO_VALIDA);
        }
    }

    /**
     * 2)
     */
    public void desmarcarTodos() {
        for (int i = 0; i < predecesores.size(); i++) {
            predecesores.set(i, RecorridoUtilsPredecesores.POSICION_NO_VALIDA);
        }
    }

   
    public void setPredecesor(int posDeVertice, int posPredecesor) {
        predecesores.set(posDeVertice, posPredecesor);
    }

    public List<Integer> getPredecesores() {
        return this.predecesores;
    }
}
