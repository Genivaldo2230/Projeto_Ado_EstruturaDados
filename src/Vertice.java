import java.util.ArrayList;
import java.util.List;

public class Vertice {
    private String nome;
    private List<Aresta> arestas;

    public Vertice(String nome) {
        this.nome = nome;
        this.arestas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Aresta> getArestas() {
        return arestas;
    }
}
