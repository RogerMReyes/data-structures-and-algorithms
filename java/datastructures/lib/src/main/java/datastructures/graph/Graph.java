package datastructures.graph;


import datastructures.queue.Queue;

import java.util.*;

public class Graph<T> {
  private HashMap<Vertex<T>, List<Edge<T>>> adjVertices = new HashMap<>();

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
      adjVertices.get(vertex1).add(new Edge<>(vertex2));
    }
  }

  public void addEdgeBiDi(Vertex<T> vertex1, Vertex<T> vertex2){
    if(adjVertices.containsKey(vertex1) && adjVertices.containsKey(vertex2)){
      adjVertices.get(vertex1).add(new Edge<>(vertex2));
      adjVertices.get(vertex2).add(new Edge<>(vertex1));
    }
  }

  public void addEdgeWeightedBiDi(Vertex<T> vertex1, Vertex<T> vertex2, int weight){
    if(adjVertices.containsKey(vertex1) && adjVertices.containsKey(vertex2)){
      adjVertices.get(vertex1).add(new Edge<>(vertex2, weight));
      adjVertices.get(vertex2).add(new Edge<>(vertex1, weight));
    }
  }

  public ArrayList<Vertex<T>> breadthFirst(Vertex<T> vertex){
    Queue<Vertex<T>> newQueue = new Queue<>();
    HashSet<Vertex<T>> visited = new HashSet<>();
    ArrayList<Vertex<T>> nodes = new ArrayList<>();
    newQueue.enqueue(vertex);
    visited.add(vertex);
    nodes.add(vertex);
    while(!newQueue.isEmpty()){
      Vertex<T> walker = newQueue.dequeue();
      List<Edge<T>> neighbors = adjVertices.get(walker);
      for(Edge<T> edge : neighbors){
        if(!visited.contains(edge.getVertex())){
          newQueue.enqueue(edge.getVertex());
          visited.add(edge.getVertex());
          nodes.add(edge.getVertex());
        }
      }
    }
    return nodes;
  }

  public Set<Vertex<T>> getNodes(){
    return adjVertices.keySet();
  }

  public List<Edge<T>> getNeighbors(Vertex<T> vertex){
    return adjVertices.get(vertex);
  }

  public int getSize(){
    return adjVertices.size();
  }

  public HashMap<Vertex<T>, List<Edge<T>>> getAdjVertices() {
    return adjVertices;
  }

  public void setAdjVertices(HashMap<Vertex<T>, List<Edge<T>>> adjVertices) {
    this.adjVertices = adjVertices;
  }
}
