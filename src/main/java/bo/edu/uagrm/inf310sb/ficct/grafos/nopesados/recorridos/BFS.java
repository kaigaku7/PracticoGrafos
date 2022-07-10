package bo.edu.uagrm.ficct.inf310sb.nopesados.recorrido;

/**
 *
 * @author jose andres
 */
import bo.edu.uagrm.ficct.inf310sb.no_pesados.Grafo;
import bo.edu.uagrm.ficct.inf310sb.nopesados.recorrido_utils.RecorridoUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    private RecorridoUtils controlDeMarcados;
    private Grafo grafo;
    private List<Integer> recorrido;

    /**
     * 
     * @param unGrafo
     * @param posDeVerticeDePartida
     */
    public BFS(Grafo unGrafo, int posDeVerticeDePartida) {
        this.grafo = unGrafo;
        grafo.validarVertice(posDeVerticeDePartida);
        recorrido = new LinkedList<>();
        controlDeMarcados = new RecorridoUtils(grafo.cantidadDeVertices());
        ejecturaBFS(posDeVerticeDePartida);
    }

    /**
     * 
     * @param posDeVerticeDePartida
     */
    private void ejecturaBFS(int posDeVerticeDePartida) {
        Queue<Integer> cola = new LinkedList<>();
        cola.offer(posDeVerticeDePartida);
        controlDeMarcados.marcarVertice(posDeVerticeDePartida);

        do {
            int posVerticeEnTurno = cola.poll();
            recorrido.add(posVerticeEnTurno);
            Iterable<Integer> adyacentesDeVerticeEnTurno = grafo.adyacentesDeVertice(posVerticeEnTurno);
            for (Integer posDeVerticeAdy : adyacentesDeVerticeEnTurno) {
                if (!controlDeMarcados.estaVerticeMarcado(posDeVerticeAdy)) {
                    cola.offer(posDeVerticeAdy);
                    controlDeMarcados.marcarVertice(posDeVerticeAdy);
                }
            }

        } while (!cola.isEmpty());
    }

    /**
     * 
     * @return
     */
    public boolean hayCaminosATodos() {
        return controlDeMarcados.estanTodosMarcados();
    }

    /**
     * 
     * @return
     */
    public Iterable<Integer> obtenerRecorrido() {
        return this.recorrido;
    }

    /**
     * 
     * @param posDeVerticeDestino
     * @return
     */
    public boolean hayCaminoAVertice(int posDeVerticeDestino) {
        grafo.validarVertice(posDeVerticeDestino);
        return controlDeMarcados.estaVerticeMarcado(posDeVerticeDestino);
    }
}
