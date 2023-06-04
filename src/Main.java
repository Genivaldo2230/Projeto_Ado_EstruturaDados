import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o vértice de origem: ");
        String origem = scanner.next();
        System.out.print("Informe o vértice de destino: ");
        String destino = scanner.next();

        grafo.adicionaVertice("A");
        grafo.adicionaVertice("B");
        grafo.adicionaVertice("C");
        grafo.adicionaVertice("D");
        grafo.adicionaVertice("E");
        grafo.adicionaVertice("F");
        grafo.adicionaVertice("G");
        grafo.adicionaVertice("H");
        grafo.adicionaVertice("I");
        grafo.adicionaVertice("J");
        grafo.adicionaVertice("K");
        grafo.adicionaVertice("L");
        grafo.adicionaVertice("M");
        grafo.adicionaVertice("N");
        grafo.adicionaVertice("O");
        grafo.adicionaVertice("P");
        grafo.adicionaVertice("Q");
        grafo.adicionaVertice("R");
        grafo.adicionaVertice("S");
        grafo.adicionaVertice("T");
        grafo.adicionaVertice("U");
        grafo.adicionaVertice("V");
        grafo.adicionaVertice("X");

        grafo.adicionaAresta(300, "A", "B");
        grafo.adicionaAresta(300, "B", "A");

        grafo.adicionaAresta(47, "B", "C");
        grafo.adicionaAresta(47, "C", "B");

        grafo.adicionaAresta(62, "C", "D");
        grafo.adicionaAresta(62, "D", "C");

        grafo.adicionaAresta(8, "D", "E");
        grafo.adicionaAresta(8, "E", "D");

        grafo.adicionaAresta(230, "E", "G");
        grafo.adicionaAresta(230, "G", "E");

        grafo.adicionaAresta(13, "E", "F");
        grafo.adicionaAresta(13, "F", "E");

        grafo.adicionaAresta(141, "C", "H");
        grafo.adicionaAresta(141, "H", "C");

        grafo.adicionaAresta(138, "H", "I");
        grafo.adicionaAresta(138, "I", "H");

        grafo.adicionaAresta(153, "I", "J");
        grafo.adicionaAresta(153, "J", "I");

        grafo.adicionaAresta(512, "J", "K");
        grafo.adicionaAresta(512, "K", "J");

        grafo.adicionaAresta(135, "K", "L");
        grafo.adicionaAresta(135, "L", "K");

        grafo.adicionaAresta(35, "L", "M");
        grafo.adicionaAresta(35, "M", "L");

        grafo.adicionaAresta(187, "L", "N");
        grafo.adicionaAresta(187, "N", "L");

        grafo.adicionaAresta(108, "N", "O");
        grafo.adicionaAresta(108, "O", "N");

        grafo.adicionaAresta(82, "O", "P");
        grafo.adicionaAresta(82, "P", "O");

        grafo.adicionaAresta(215, "P", "Q");
        grafo.adicionaAresta(215, "Q", "P");

        grafo.adicionaAresta(97, "Q", "R");
        grafo.adicionaAresta(97, "R", "Q");

        grafo.adicionaAresta(33, "R", "S");
        grafo.adicionaAresta(33, "S", "R");

        grafo.adicionaAresta(243, "R", "T");
        grafo.adicionaAresta(243, "T", "R");

        grafo.adicionaAresta(38, "S", "V");
        grafo.adicionaAresta(38, "V", "S");

        grafo.adicionaAresta(207, "S", "T");
        grafo.adicionaAresta(207, "T", "S");

        grafo.adicionaAresta(22, "T", "U");
        grafo.adicionaAresta(22, "U", "T");

        grafo.adicionaAresta(210, "V", "U");
        grafo.adicionaAresta(210, "U", "V");

        grafo.adicionaAresta(370, "V", "A");
        grafo.adicionaAresta(370, "A", "V");

        grafo.adicionaAresta(107, "X", "A");
        grafo.adicionaAresta(107, "A", "X");


          grafo.traçarRota("a", "x");


        scanner.close();
    }
}


