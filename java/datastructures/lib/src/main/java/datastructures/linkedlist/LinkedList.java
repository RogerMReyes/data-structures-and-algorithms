package datastructures.linkedlist;

public class LinkedList<T> {
  public Node<T> head = null;
  public Node<T> tail;

  public void insert(T val){
    Node<T> newNode = new Node<>(val);
    if (head != null) {
      newNode.next = head;
    }
    if(head == null){
      tail = newNode;
    }
    head = newNode;
  }

  public boolean includes(T key){
    if(this.head == null) return false;
    Node<T> currentNode = head;
    while(currentNode != null){
      if(currentNode.value == key){
        return true;
      }
      currentNode = currentNode.next;
    }
    return false;
  }

  public void append(T val){
    Node<T> newNode = new Node<>(val);
    tail.next = newNode;
    tail = newNode;
  }

  public void insertBefore(T val, T match){
    Node<T> newNode = new Node<>(val);
    if(head.value == match){
      newNode.next = head;
      head = newNode;
    }
    Node<T> current = head;
    Node<T> prev = head;
    while(current != null){
      current = current.next;
      if(current.value == match){
        newNode.next = current;
        prev.next = newNode;
        break;
      }
      prev = current;
    }
  }

  public void insertAfter(T val, T match){
    Node<T> newNode = new Node<>(val);
    Node<T> current = head;
    while(current != null){
      if(current.value == match){
        newNode.next = current.next;
        current.next = newNode;
        if(newNode.next == null){
          tail = newNode;
        }
      }
      current = current.next;
    }
  }


  @Override
  public String toString(){
    String response = "";
    if(head == null) {
      return "NULL";
    }
    Node<T> currentNode = head;
    while(currentNode != null){
      response = response + "[" + currentNode.value + "]->";
      currentNode = currentNode.next;
    }
    response += "NULL";
    return response;
  }
}
