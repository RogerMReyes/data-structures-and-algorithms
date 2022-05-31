package datastructures.queue;

import datastructures.Node;
import datastructures.stack.Stack;

import java.util.NoSuchElementException;

public class PseudoQueue<T> {
  private Stack<T> stack1 = new Stack<>();
  private Stack<T> stack2 = new Stack<>();

  public PseudoQueue() {
  }

  public void enqueque(T value){
    stack1.push(value);
  }

  public T dequeque(){
    if(stack1.getTop() == null){
      throw new NoSuchElementException("Stack is Empty");
    }
    while(!stack1.isEmpty()){
      stack2.push(stack1.pop());
    }
    T val = stack2.pop();
    while(!stack2.isEmpty()){
      stack1.push(stack2.pop());
    }
    return val;
  }

  @Override
  public String toString() {
    Node<T> walker = stack1.getTop();
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
