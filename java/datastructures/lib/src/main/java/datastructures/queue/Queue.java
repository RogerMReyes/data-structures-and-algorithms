package datastructures.queue;

import datastructures.Node;

import java.util.NoSuchElementException;

public class Queue<T> {
  private Node<T> front;
  private Node<T> rear;

  public void enqueue(T value){
    Node<T> newNode = new Node<>(value);
    if(front == null){
      front = newNode;
      rear = newNode;
    }
    else{
    rear.next = newNode;
    rear = rear.next;
    }
  }

  public T dequeue(){
    if(front == null){
      throw new NoSuchElementException("Stack is Empty");
    }
    Node<T> temp = front;
    front = front.next;
    temp.next = null;
    return temp.value;
  }

  public T peek(){
    if(front == null){
      throw new NoSuchElementException("Queue is Empty");
    }
    return front.value;
  }

  public Boolean isEmpty(){
    if(front == null){
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    Node<T> walker = front;
    StringBuilder string = new StringBuilder();
    while(walker != null){
      string.append("[");
      string.append(walker.value);
      string.append("]->");
      walker = walker.next;
    }
    string.append("NULL");
    return string.toString();
  }

  public Node<T> getFront() {
    return front;
  }

  public Node<T> getRear() {
    return rear;
  }
}
