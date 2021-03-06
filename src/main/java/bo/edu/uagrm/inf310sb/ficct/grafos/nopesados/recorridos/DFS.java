package bo.edu.uagrm.ficct.inf310sb.nopesados.recorrido;

/**
 *
 * @author jose andres
 */
import bo.edu.uagrm.ficct.inf310sb.no_pesados.Grafo;
import bo.edu.uagrm.ficct.inf310sb.nopesados.recorrido_utils.RecorridoUtils;

import java.util.LinkedList;
import java.util.List;

public class DFS {
    private RecorridoUtils controlDeMarcados;
    private Grafo grafo;
    private List<Integer> recorrido;

    /**
     * 
     * @param unGrafo
     * @param posDeVerticeDePartida
     */
    public DFS(Grafo unGrafo, int posDeVerticeDePartida) {
        this.grafo = unGrafo;
        grafo.validarVertice(posDeVerticeDePartida);
        recorrido = new LinkedList<>();
        controlDeMarcados = new RecorridoUtils(grafo.cantidadDeVertices());
        procesarDFS(posDeVerticeDePartida);
    }

    /**
     * 
     * @param posDeVerticeEnTurno
     */
    public void procesarDFS(int posDeVerticeEnTurno) {
        controlDeMarcados.marcarVertice(posDeVerticeEnTurno);
        recorrido.add(posDeVerticeEnTurno);
        Iterable<Integer> adyacentesDeVerticeEnTurno = grafo.adyacentesDeVertice(posDeVerticeEnTurno);
        for (Integer posDeVerticeAdy : adyacentesDeVerticeEnTurno) {
            if (!controlDeMarcados.estaVerticeMarcado(posDeVerticeAdy)) {
                procesarDFS(posDeVerticeAdy);
            }
        }
    }

    /**
     * 
     *
     * @return
     */
    public boolean hayCaminosATodos() {
        return controlDeMarcados.estanTodosMarcados();
    }

    /**
     * 
     *
     * @return
     */
    public Iterable<Integer> obtenerRecorrido() {
        return this.recorrido;
    }

    /**
     * 
     *
     * @param posDeVerticeDestino
     * @return
     */
    public boolean hayCaminoAVertice(int posDeVerticeDestino) {
        grafo.validarVertice(posDeVerticeDestino);
        return controlDeMarcados.estaVerticeMarcado(posDeVerticeDestino);
    }

    //--------------------------------

}
