package datastructures;

import datastructures.hashtableAlt.HashMap;
import datastructures.hashtableAlt.HashMapPair;
import datastructures.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapAltTest {

  @Test
  void hashMapAddAndGet() {
    HashMap<Integer, String> newMap = new HashMap<>(50);
    newMap.add(5, "Turtle");
    assertEquals("Turtle", newMap.get(5));
  }

  @Test
  void hashMapContainsReturnsTrue() {
    HashMap<Integer, String> newMap = new HashMap<>(50);
    newMap.add(5, "Turtle");
    assertTrue(newMap.contains(5));
  }

  @Test
  void hashMapCollisionExtendsLinkedList() {
    HashMap<Integer, String> newMap = new HashMap<>(1);
    newMap.add(5, "Turtle");
    newMap.add(3, "JellyFish");
    newMap.add(1, "Tiger");
    LinkedList<HashMapPair<Integer, String>> list = newMap.getBuckets().get(0);
    assertEquals("Tiger", list.head.next.next.value.getValue());
  }
}
