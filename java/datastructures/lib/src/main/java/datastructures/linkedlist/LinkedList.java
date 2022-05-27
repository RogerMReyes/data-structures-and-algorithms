package datastructures.linkedlist;

import datastructures.Node;

public class LinkedList<T> {
  public Node<T> head = null;
  public Node<T> tail;
  public int listLength = 0;

  public void insert(T val){
    Node<T> newNode = new Node<>(val);
    if (head != null) {
      newNode.next = head;
    }
    if(head == null){
      tail = newNode;
    }
    head = newNode;
    listLength++;
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
    listLength++;
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
    listLength++;
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
    listLength++;
  }

  public T kthFromEnd(int k){
    if(k >= listLength || k < 0){
      return null;
    }
    int stopPoint = listLength - k;
    Node<T> current = head;
    for(int i = 0; i < stopPoint; i++){
      if(i == stopPoint - 1){
        return current.value;
      }
      current = current.next;
    }
    return null;
  }

  public LinkedList<T> zipLists(LinkedList<T> list2){
    Node<T> current = head;
    Node<T> list1Walker = head;
    Node<T> list2Walker = list2.head;
    if(head == null && list2.head != null) return list2;
    while(current != null && list2.head != null){
      current = current.next;
      list1Walker.next = list2.head;
      list2.head = list2.head.next;
      list2Walker.next = current;
      if (list2.head != null) {
        list1Walker = current;
      }
      if(current != null){
      list2Walker = list2.head;
      }
    }
    if(list2.head != null){
      list2Walker.next = list2.head;
      list2.head = null;
    }
    return this;
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
