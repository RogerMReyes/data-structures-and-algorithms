package datastructures;

import datastructures.trees.BinarySearchTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {
  @Test
  void addReturnsListInCorrectOrder() {
    BinarySearchTree sut = new BinarySearchTree();
    sut.add(23);
    sut.add(8);
    sut.add(42);
    sut.add(4);
    sut.add(16);
    assertEquals("[23, 8, 4, 16, 42]",sut.preOrder(sut.getRoot()).toString());
  }

  @Test
  void containsReturnsTrue() {
    BinarySearchTree sut = new BinarySearchTree();
    sut.add(23);
    sut.add(8);
    sut.add(42);
    sut.add(4);
    sut.add(16);
    assertTrue(sut.contains(42));
    assertFalse(sut.contains(64));
    assertTrue(sut.contains(16));
  }
}
