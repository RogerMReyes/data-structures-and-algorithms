package datastructures.graph;



import java.util.ArrayList;

public class Vertex<T> {
  private T value;
  ArrayList<Edge<T>> edges = new ArrayList<>();

  public Vertex(T value) {
    this.value = value;
  }

  public ArrayList<Edge<T>> getEdges() {
    return edges;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public void setEdges(ArrayList<Edge<T>> edges) {
    this.edges = edges;
  }
}
