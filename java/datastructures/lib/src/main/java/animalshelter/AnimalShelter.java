package animalshelter;

import datastructures.Node;
import datastructures.queue.Queue;

import java.util.NoSuchElementException;
import java.util.Objects;

public class AnimalShelter {
  private Queue<Animal> shelterQueue = new Queue<>();

  public AnimalShelter() {
  }

  public void enqueque(Animal animal){
    if(Objects.equals(animal.getType(), "dog") || Objects.equals(animal.getType(), "cat"))
      shelterQueue.enqueue(animal);
  }

  public Animal dequeue(String pref){
    if(shelterQueue.isEmpty()) throw new NoSuchElementException("Queue is Empty");
    if(!Objects.equals(pref, "dog") && !Objects.equals(pref, "cat")) return null;
    Node<Animal> walker = shelterQueue.getFront();
    int queueSize = 0;
    Animal temp = null;
    while(walker != null){
      queueSize++;
      walker = walker.next;
    }
    while(queueSize != 0){
      if(shelterQueue.getFront().value.getType() != pref){
        shelterQueue.enqueue(shelterQueue.dequeue());
      }
      else{
        temp = shelterQueue.dequeue();
      }
      queueSize--;
    }
    return temp;
  }

  // Custom Datastructure not FIFO
//  public Animal dequeue(String pref){
//    if(shelterQueue.isEmpty()) throw new NoSuchElementException("Queue is Empty");
//    if(pref != "dog" && pref != "cat") return null;
//    if(shelterQueue.getFront().value.getType() == pref) return shelterQueue.dequeue();
//    Node<Animal> walker = shelterQueue.getFront();
//    Node<Animal> checker = walker.next;
//    while(checker.value.getType() != pref && checker != null){
//      checker = checker.next;
//      walker = walker.next;
//    }
//    if(checker == null) {
//      return null;
//    }
//    else {
//      walker.next = checker.next;
//      checker.next = null;
//      return checker.value;
//    }
//  }

  public Queue<Animal> getShelterQueue() {
    return shelterQueue;
  }
}
