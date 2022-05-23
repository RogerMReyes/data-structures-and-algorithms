package datastructures.linkedlist;

public class LinkedList {
  public Node head = null;
  public Node tail;

  public void insert(int val){
    Node newNode = new Node(val);
    if (head != null) {
      newNode.next = head;
    }
    if(head == null){
      tail = newNode;
    }
    head = newNode;
  }

  public boolean includes(int key){
    if(this.head == null) return false;
    Node currentNode = head;
    while(currentNode != null){
      if(currentNode.value == key){
        return true;
      }
      currentNode = currentNode.next;
    }
    return false;
  }

  public void append(int val){
    Node newNode = new Node(val);
    tail.next = newNode;
    tail = newNode;
  }

  public void insertBefore(int val, int match){
    Node newNode = new Node(val);
    if(head.value == match){
      newNode.next = head;
      head = newNode;
    }
    Node current = head;
    Node prev = head;
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

  public void insertAfter(int val, int match){
    Node newNode = new Node(val);
    Node current = head;
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
    Node currentNode = head;
    while(currentNode != null){
      response = response + "[" + currentNode.value + "]->";
      currentNode = currentNode.next;
    }
    response += "NULL";
    return response;
  }
}
