package datastructures;

import datastructures.hashtable.HashTable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapTest {

  @Test
  void hashTableSetAndGet() {
    HashTable<Integer, String> newTable = new HashTable<>(99);
    newTable.set(5, "Turtle");
    assertEquals("Turtle",newTable.get(5));
  }

  @Test
  void hashTableContainsReturnsFalse() {
    HashTable<Integer, String> newTable = new HashTable<>(99);
    newTable.set(5, "Turtle");
    assertFalse(newTable.contains(60));
  }
}
