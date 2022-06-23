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

  @Test
  void hashMapRepeatedWordReturnsCorrectString1() {
    HashMap<String, Integer> newMap = new HashMap<>(50);
    String temp = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
    assertEquals("summer",newMap.repeatedWord(temp, newMap));
  }

  @Test
  void hashMapRepeatedWordReturnsCorrectString2() {
    HashMap<String, Integer> newMap = new HashMap<>(50);
    String temp = "Once upon a time, there was a brave princess who...";
    assertEquals("a",newMap.repeatedWord(temp, newMap));
  }

  @Test
  void hashMapRepeatedWordReturnsCorrectString3() {
    HashMap<String, Integer> newMap = new HashMap<>(50);
    String temp = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
    assertEquals("it",newMap.repeatedWord(temp, newMap));
  }
}
