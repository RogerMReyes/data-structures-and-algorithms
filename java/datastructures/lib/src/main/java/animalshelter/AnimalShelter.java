package animalshelter;

import datastructures.Node;
import datastructures.queue.Queue;

import java.util.NoSuchElementException;

public class AnimalShelter {
  private Queue<Animal> shelterQueue = new Queue<>();

  public AnimalShelter() {
  }

  public void enqueque(Animal animal){
    if(animal.getType() == "dog" || animal.getType() == "cat")
    shelterQueue.enqueue(animal);
  }

  public Animal dequeue(String pref){
    if(shelterQueue.isEmpty()){
      throw new NoSuchElementException("Queue is Empty");
    }
    if(shelterQueue.getFront().value.getType() == pref){
      return shelterQueue.dequeue();
    }
    Node<Animal> walker = shelterQueue.getFront();
    Node<Animal> checker = walker.next;
    while(checker.value.getType() != pref && checker != null){
      checker = checker.next;
      walker = walker.next;
    }
    if(checker == null) {
      return null;
    }
    else {
      walker.next = checker.next;
      checker.next = null;
      return checker.value;
    }
  }

  public Queue<Animal> getShelterQueue() {
    return shelterQueue;
  }
}
