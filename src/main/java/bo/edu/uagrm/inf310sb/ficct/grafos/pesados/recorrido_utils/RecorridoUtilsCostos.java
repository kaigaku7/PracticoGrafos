package bo.edu.uagrm.ficct.inf310sb.pesados.recorrido_utils;

/**
 *
 * @author jose andres
 */
import java.util.LinkedList;
import java.util.List;

public class RecorridoUtilsCostos {
    private final List<Double> costos;
    public static final double INFINITO = 999999999;


    /**
     * 1)
     * @param nroDeVertices
     */
    public RecorridoUtilsCostos(int nroDeVertices) {
        this.costos = new LinkedList<>();
        for (int i = 0; i < nroDeVertices; i++) {
            this.costos.add(RecorridoUtilsCostos.INFINITO);
        }
    }

    /**
     * 2)
     */
    public void desmarcarTodos() {
        for (int i = 0; i < costos.size(); i++) {
            costos.set(i, RecorridoUtilsCostos.INFINITO);
        }
    }

    public void setCosto(int posDeVertice, double costo) {
        costos.set(posDeVertice, costo);
    }

    public List<Double> getCostos() {
        return this.costos;
    }

    public double getCosto(int posicion) {
        return costos.get(posicion);
    }
}
