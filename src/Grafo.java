import java.util.*;

public class Grafo {
    private List<Vertice> vertices;

    public Grafo() {
        vertices = new ArrayList<>();
    }

    public Vertice adicionaVertice(String nome) {
        Vertice vertice = encontraVertice(nome);
        if (vertice == null) {
            vertice = new Vertice(nome);
            vertices.add(vertice);
        }
        return vertice;
    }

    public void adicionaAresta(int distancia, String nomeOrigem, String nomeDestino) {
        Vertice origem = adicionaVertice(nomeOrigem);
        Vertice destino = adicionaVertice(nomeDestino);
        Aresta aresta = new Aresta(distancia, origem, destino);
        origem.getArestas().add(aresta);
    }

    public Vertice removeVertice(String nome) {
        Vertice vertice = encontraVertice(nome);
        if (vertice != null) {
            vertices.remove(vertice);
            for (Vertice v : vertices) {
                v.getArestas().removeIf(a -> a.getOrigem() == vertice || a.getDestino() == vertice);
            }
        }
        return vertice;
    }

    public void removeAresta(String nomeOrigem, String nomeDestino) {
        Vertice origem = encontraVertice(nomeOrigem);
        Vertice destino = encontraVertice(nomeDestino);
        if (origem != null && destino != null) {
            origem.getArestas().removeIf(a -> a.getDestino() == destino);
        }
    }

    public void traçarRota(String origem, String destino) {
        Vertice origemVertice = adicionaVertice(origem);
        Vertice destinoVertice = adicionaVertice(destino);

        if (origemVertice == destinoVertice || destinoVertice == origemVertice) {
            System.out.println("Origem ou destino inválido.");
            return;
        }

        PriorityQueue<Aresta> filaPrioridade = new PriorityQueue<>(Comparator.comparingInt(Aresta::getDistancia));
        Map<Vertice, Integer> distanciaMinima = new HashMap<>();
        Map<Vertice, Vertice> predecessores = new HashMap<>();

        for (Vertice v : vertices) {
            distanciaMinima.put(v, v == origemVertice ? 0 : Integer.MAX_VALUE);
            predecessores.put(v, null);
        }

        filaPrioridade.add(new Aresta(0, origemVertice, origemVertice));

        while (!filaPrioridade.isEmpty()) {
            Aresta arestaAtual = filaPrioridade.poll();
            Vertice verticeAtual = arestaAtual.getDestino();
            int distanciaAtual = arestaAtual.getDistancia();

            if (distanciaMinima.get(verticeAtual) < distanciaAtual) {
                continue;
            }

            for (Aresta a : verticeAtual.getArestas()) {
                Vertice proximoVertice = a.getDestino();
                int distanciaAresta = a.getDistancia();
                int distanciaTotal = distanciaMinima.get(verticeAtual) + distanciaAresta;

                if (distanciaTotal < distanciaMinima.get(proximoVertice)) {
                    distanciaMinima.put(proximoVertice, distanciaTotal);
                    predecessores.put(proximoVertice, verticeAtual);
                    filaPrioridade.add(new Aresta(distanciaTotal, verticeAtual, proximoVertice));
                }
            }
        }

        List<Vertice> caminho = new ArrayList<>();
        Vertice verticeAtual = destinoVertice;

        while (verticeAtual != null) {
            caminho.add(0, verticeAtual);
            verticeAtual = predecessores.get(verticeAtual);
        }

        if (caminho.size() == 1) {
            System.out.println("Não foi encontrada uma rota entre " + origem + " e " + destino);
            return;
        }

        System.out.println("Rota encontrada: ");
        for (int i = 0; i < caminho.size() - 1; i++) {
            Vertice atual = caminho.get(i);
            Vertice proximo = caminho.get(i + 1);

            if (atual == null || atual.getArestas() == null) {
                System.out.println("Não foi encontrada uma aresta entre " + atual.getNome() + " e " + proximo.getNome());
                break;
            }

            boolean encontrada = false;

            for (Aresta a : atual.getArestas()) {
                if (a.getDestino() != null && a.getDestino().equals(proximo)) {
                    System.out.print(atual.getNome() + " -> ");
                    encontrada = true;
                    if (proximo.getNome().contains(destino)) {
                        System.out.print(proximo.getNome());
                    }
                    break;
                }
            }

            if (!encontrada) {
                System.out.println("Não foi encontrada uma aresta entre " + atual.getNome() + " e " + proximo.getNome());
            }
        }

        System.out.println("Distância total percorrida: " + distanciaMinima.get(destinoVertice) + "m");
    }

    private Vertice encontraVertice(String nome) {
        for (Vertice v : vertices) {
            if (v.getNome().equals(nome)) {
                return v;
            }
        }
        return null;
    }
}