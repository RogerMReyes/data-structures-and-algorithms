package animalshelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalShelterTest {
  @Test
  void enquequeAddsAnimalToShelterQueue() {
    AnimalShelter sut = new AnimalShelter();
    Animal bosco = new Animal("dog","Bosco");
    sut.enqueque(bosco);
    assertEquals("Bosco",sut.getShelterQueue().peek().getName());
  }

  @Test
  void dequequeReturnsDogName() {
    AnimalShelter sut = new AnimalShelter();
    Animal whiskers = new Animal("cat","Whiskers");
    Animal bosco = new Animal("dog","Bosco");
    sut.enqueque(whiskers);
    sut.enqueque(bosco);
    assertEquals("Bosco", sut.dequeue("dog").getName());
  }
}
