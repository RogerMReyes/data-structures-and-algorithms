package datastructures;

import datastructures.trees.BinaryTree;
import datastructures.trees.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
  @Test
  void preOrderReturnsCorrectOrder() {
    BinaryTree<String> sut = new BinaryTree<>();
    ArrayList<String> sutArray = new ArrayList<>();
    TreeNode<String> sut1 = new TreeNode<>("A");
    TreeNode<String> sut2 = new TreeNode<>("B");
    TreeNode<String> sut3 = new TreeNode<>("C");
    TreeNode<String> sut4 = new TreeNode<>("D");
    TreeNode<String> sut5 = new TreeNode<>("E");
    TreeNode<String> sut6 = new TreeNode<>("F");
    sut.setRoot(sut1);
    sut1.setLeft(sut2);
    sut1.setRight(sut3);
    sut2.setLeft(sut4);
    sut2.setRight(sut5);
    sut3.setLeft(sut6);
    assertEquals("[A, B, D, E, C, F]",sut.preOrder(sut.getRoot(),sutArray).toString());
  }

  @Test
  void inOrderReturnsCorrectOrder() {
    BinaryTree<String> sut = new BinaryTree<>();
    ArrayList<String> sutArray = new ArrayList<>();
    TreeNode<String> sut1 = new TreeNode<>("A");
    TreeNode<String> sut2 = new TreeNode<>("B");
    TreeNode<String> sut3 = new TreeNode<>("C");
    TreeNode<String> sut4 = new TreeNode<>("D");
    TreeNode<String> sut5 = new TreeNode<>("E");
    TreeNode<String> sut6 = new TreeNode<>("F");
    sut.setRoot(sut1);
    sut1.setLeft(sut2);
    sut1.setRight(sut3);
    sut2.setLeft(sut4);
    sut2.setRight(sut5);
    sut3.setLeft(sut6);
    assertEquals("[D, B, E, A, F, C]",sut.inOrder(sut.getRoot(),sutArray).toString());
  }

  @Test
  void postOrderReturnsCorrectOrder() {
    BinaryTree<String> sut = new BinaryTree<>();
    ArrayList<String> sutArray = new ArrayList<>();
    TreeNode<String> sut1 = new TreeNode<>("A");
    TreeNode<String> sut2 = new TreeNode<>("B");
    TreeNode<String> sut3 = new TreeNode<>("C");
    TreeNode<String> sut4 = new TreeNode<>("D");
    TreeNode<String> sut5 = new TreeNode<>("E");
    TreeNode<String> sut6 = new TreeNode<>("F");
    sut.setRoot(sut1);
    sut1.setLeft(sut2);
    sut1.setRight(sut3);
    sut2.setLeft(sut4);
    sut2.setRight(sut5);
    sut3.setLeft(sut6);
    assertEquals("[D, E, B, F, C, A]",sut.postOrder(sut.getRoot(),sutArray).toString());
  }

  @Test
  void findMaxValReturnsMax() {
    BinaryTree<Integer> sut = new BinaryTree<>();
    TreeNode<Integer> sut1 = new TreeNode<>(1);
    TreeNode<Integer> sut2 = new TreeNode<>(2);
    TreeNode<Integer> sut3 = new TreeNode<>(3);
    TreeNode<Integer> sut4 = new TreeNode<>(4);
    TreeNode<Integer> sut5 = new TreeNode<>(5);
    TreeNode<Integer> sut6 = new TreeNode<>(7);
    sut.setRoot(sut1);
    sut1.setLeft(sut2);
    sut1.setRight(sut3);
    sut2.setLeft(sut4);
    sut2.setRight(sut5);
    sut3.setLeft(sut6);
    assertEquals(7,sut.findMaxVal());
  }

  @Test
  void breadthFirstReturnsCorrectOutput() {
    BinaryTree<Integer> sut = new BinaryTree<>();
    TreeNode<Integer> sut1 = new TreeNode<>(2);
    TreeNode<Integer> sut2 = new TreeNode<>(7);
    TreeNode<Integer> sut3 = new TreeNode<>(5);
    TreeNode<Integer> sut4 = new TreeNode<>(2);
    TreeNode<Integer> sut5 = new TreeNode<>(6);
    TreeNode<Integer> sut6 = new TreeNode<>(9);
    TreeNode<Integer> sut7 = new TreeNode<>(5);
    TreeNode<Integer> sut8 = new TreeNode<>(11);
    TreeNode<Integer> sut9 = new TreeNode<>(4);
    sut.setRoot(sut1);
    sut1.setLeft(sut2);
    sut1.setRight(sut3);
    sut2.setLeft(sut4);
    sut2.setRight(sut5);
    sut5.setLeft(sut7);
    sut5.setRight(sut8);
    sut3.setRight(sut6);
    sut6.setLeft(sut9);
    assertEquals("[2, 7, 5, 2, 6, 9, 5, 11, 4]", sut.breadthFirst(sut.getRoot()).toString());
  }
}
