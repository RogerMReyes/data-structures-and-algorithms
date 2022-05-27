package datastructures.stack;

import datastructures.Node;

import java.util.NoSuchElementException;

public class Stack<T> {
   private Node<T> top;

  public void push(T value){
    Node<T> newNode = new Node<>(value);
    if (top != null) {
      newNode.next = top;
    }
    top = newNode;
  }

  public T pop(){
    if(top == null){
      throw new NoSuchElementException("Stack is Empty");
    }
    Node<T> temp = top;
    top = top.next;
    temp.next = null;
    return temp.value;
  }

  public T peek(){
    if(top == null){
      throw new NoSuchElementException("Stack is Empty");
    }
    return top.value;
  }

  public Boolean isEmpty(){
    if(top == null){
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    Node<T> walker = top;
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
}
