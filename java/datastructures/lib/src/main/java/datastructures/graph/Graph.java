package datastructures.graph;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Graph<T> {
  private HashMap<Vertex<T>, List<Vertex<T>>> adjVertices = new HashMap<>();

  public Graph() {
  }

  public Vertex<T> addNode(T value){
    Vertex<T> newVertex = new Vertex<>(value);
    adjVertices.put(newVertex, new ArrayList<>() {
    });
    return newVertex;
  }

  public void addEdgeUni(Vertex<T> vertex1, Vertex<T> vertex2){
    if(adjVertices.containsKey(vertex1) && adjVertices.containsKey(vertex2)) {
      vertex1.getEdges().add(new Edge<T>(vertex2));
      adjVertices.get(vertex1).add(vertex2);
    }
  }

  public void addEdgeBiDi(Vertex<T> vertex1, Vertex<T> vertex2){
    if(adjVertices.containsKey(vertex1) && adjVertices.containsKey(vertex2)){
      vertex1.getEdges().add(new Edge<T>(vertex2));
      adjVertices.get(vertex1).add(vertex2);
      vertex2.getEdges().add(new Edge<T>(vertex1));
      adjVertices.get(vertex2).add(vertex1);
    }
  }

  public void addEdgeWeightedBiDi(Vertex<T> vertex1, Vertex<T> vertex2, int weight){
    if(adjVertices.containsKey(vertex1) && adjVertices.containsKey(vertex2)){
      vertex1.getEdges().add(new Edge<T>(vertex2, weight));
      adjVertices.get(vertex1).add(vertex2);
      vertex2.getEdges().add(new Edge<T>(vertex1, weight));
      adjVertices.get(vertex2).add(vertex1);
    }
  }

  public Set<Vertex<T>> getNodes(){
    return adjVertices.keySet();
  }

  public ArrayList<Edge<T>> getNeighbors(Vertex<T> vertex){
    return vertex.getEdges();
  }

  public int getSize(){
    return adjVertices.size();
  }

  public HashMap<Vertex<T>, List<Vertex<T>>> getAdjVertices() {
    return adjVertices;
  }

  public void setAdjVertices(HashMap<Vertex<T>, List<Vertex<T>>> adjVertices) {
    this.adjVertices = adjVertices;
  }
}
