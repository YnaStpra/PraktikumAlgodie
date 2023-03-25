import java.util.*;

class Graph {
    private Map<String, List<String>> graph;
    public Graph() {
        this.graph = new HashMap<>();
    }
    public void addEdge(String nodeA, String nodeB) {
        if (!this.graph.containsKey(nodeA)) {
            this.graph.put(nodeA, new ArrayList<>());
        }

        this.graph.get(nodeA).add(nodeB);
    }

    public List<String> breadthFirstSearch(String startNode) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(startNode);
        visited.add(startNode);
        List<String> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            String currentNode = queue.poll();
            result.add(currentNode);
            List<String> edges = this.graph.get(currentNode);
            if (edges != null) {
                for (String edge : edges) {
                    if (!visited.contains(edge)) {
                        queue.offer(edge);
                        visited.add(edge);
                    }
                }
            }
        }
        return result;
    }
    public void printAdjacencyList() {
        for (Map.Entry<String, List<String>> entry : this.graph.entrySet()) {
            String vertex = entry.getKey();
            List<String> edges = entry.getValue();
            System.out.print(vertex + ": ");
            for (String edge : edges) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge("A", "C");
        graph.addEdge("C", "B");
        graph.addEdge("C", "E");
        graph.addEdge("B", "A");
        graph.addEdge("B", "H");
        graph.addEdge("H", "C");
        graph.addEdge("E", "F");
        graph.addEdge("E", "D");
        graph.addEdge("D", "A");
        graph.addEdge("D", "F");
        graph.addEdge("F", "G");
        graph.addEdge("G", "H");
        graph.printAdjacencyList();
    }
}