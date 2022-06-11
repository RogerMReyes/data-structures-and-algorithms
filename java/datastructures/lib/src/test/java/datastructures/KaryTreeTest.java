package datastructures;

import datastructures.kAryTree.KaryNode;
import datastructures.kAryTree.KaryTree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;


public class KaryTreeTest {

  @Test
  void fizzBuzzTest() {
    KaryTree<Integer> sut = new KaryTree<>();
    KaryNode<Integer> sut1 = new KaryNode<>(1);
    KaryNode<Integer> sut2 = new KaryNode<>(2);
    KaryNode<Integer> sut3 = new KaryNode<>(3);
    KaryNode<Integer> sut4 = new KaryNode<>(4);
    KaryNode<Integer> sut5 = new KaryNode<>(5);
    sut.setRoot(sut1);
    sut1.getChild().add(sut2);
    sut1.getChild().add(sut3);
    sut2.getChild().add(sut4);
    sut3.getChild().add(sut5);
    KaryTree<String> newSut = sut.fizzBuzzTree(sut);
    ArrayList<KaryNode<String>> test = newSut.getRoot().getChild();
    assertEquals("Fizz", test.get(1).getValue());
  }
}
