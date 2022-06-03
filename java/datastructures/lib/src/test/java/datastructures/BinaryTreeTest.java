package datastructures;

import datastructures.trees.BinaryTree;
import datastructures.trees.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
  @Test
  void preOrderReturnsCorrectOrder() {
    BinaryTree<String> sut = new BinaryTree<>();
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
    assertEquals("[A, B, D, E, C, F]",sut.preOrder(sut.getRoot()).toString());
  }

  @Test
  void inOrderReturnsCorrectOrder() {
    BinaryTree<String> sut = new BinaryTree<>();
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
    assertEquals("[D, B, E, A, F, C]",sut.inOrder(sut.getRoot()).toString());
  }

  @Test
  void postOrderReturnsCorrectOrder() {
    BinaryTree<String> sut = new BinaryTree<>();
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
    assertEquals("[D, E, B, F, C, A]",sut.postOrder(sut.getRoot()).toString());
  }
}
