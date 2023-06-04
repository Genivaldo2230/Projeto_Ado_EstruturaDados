public class Aresta {
    private int distancia;
    private  Vertice origem;
    private  Vertice chegada;


    public Aresta(int distancia, Vertice origem, Vertice chegada) {
        this.distancia = distancia;
        this.origem = origem;
        this.chegada = chegada;
    }

    public Aresta(int distancia, String origemVertice) {

    }


    public void setDistancia(int distancia) {
        this.distancia = distancia;
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
