package codechallenge05;

public class LinkedList {
  public Node head = null;
  public Node tail;

//  public LinkedList(Node head) {
//    this.head = head;
//  }

  public void insert(int key){
    Node newNode = new Node(key);
    newNode.next = this.head;
    this.head = newNode;
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

  @Override
  public String toString() {
    String response = "NULL";
    if(this.head == null) return response;
    Node currentNode = head;
    while(currentNode != null){
      response = "[" + currentNode.value + "]->" + response;
    }
    return response;
  }
}



