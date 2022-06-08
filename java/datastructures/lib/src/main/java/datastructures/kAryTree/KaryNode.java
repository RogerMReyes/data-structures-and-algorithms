package datastructures.kAryTree;

import java.util.ArrayList;
import java.util.List;

public class KaryNode<T> {
  private T value;
  private ArrayList<KaryNode<T>> child = new ArrayList<>();

  public KaryNode() {
  }

  public KaryNode(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public ArrayList<KaryNode<T>> getChild() {
    return child;
  }

  public void setChild(ArrayList<KaryNode<T>> child) {
    this.child = child;
  }
}
