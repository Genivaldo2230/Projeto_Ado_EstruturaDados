public class Aresta {
    private int distancia;
    private Vertice origem;
    private Vertice destino;

    public Aresta(int distancia, Vertice origem, Vertice destino) {
        this.distancia = distancia;
        this.origem = origem;
        this.destino = destino;
    }

    public int getDistancia() {
        return distancia;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public Vertice getDestino() {
        return destino;
    }
}