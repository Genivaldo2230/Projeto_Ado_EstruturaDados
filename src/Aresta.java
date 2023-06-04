package GrafoBig.src;

public class Aresta {
    private int distancia;
    private Vertice origem;
    private Vertice chegada;

    public Aresta(int distancia, Vertice origem, Vertice chegada) {
        this.distancia = distancia;
        this.origem = origem;
        this.chegada = chegada;
    }

    public int getDistancia() {
        return distancia;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public Vertice getChegada() {
        return chegada;
    }

    public Vertice getDestino() {

        return null;
    }
}
