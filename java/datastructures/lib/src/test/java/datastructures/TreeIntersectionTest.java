package datastructures;

import datastructures.TreeIntersection.TreeIntersection;
import datastructures.trees.BinaryTree;
import datastructures.trees.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeIntersectionTest {

  TreeNode<Integer> node1 = new TreeNode<>(150);
  TreeNode<Integer> node2 = new TreeNode<>(100);
  TreeNode<Integer> node3 = new TreeNode<>(250);
  TreeNode<Integer> node4 = new TreeNode<>(75);
  TreeNode<Integer> node5 = new TreeNode<>(160);
  TreeNode<Integer> node6 = new TreeNode<>(200);
  TreeNode<Integer> node7 = new TreeNode<>(350);
  TreeNode<Integer> node8 = new TreeNode<>(125);
  TreeNode<Integer> node9 = new TreeNode<>(175);
  TreeNode<Integer> node10 = new TreeNode<>(300);
  TreeNode<Integer> node11 = new TreeNode<>(500);

  TreeNode<Integer> node12 = new TreeNode<>(42);
  TreeNode<Integer> node13 = new TreeNode<>(100);
  TreeNode<Integer> node14 = new TreeNode<>(600);
  TreeNode<Integer> node15 = new TreeNode<>(15);
  TreeNode<Integer> node16 = new TreeNode<>(160);
  TreeNode<Integer> node17 = new TreeNode<>(200);
  TreeNode<Integer> node18 = new TreeNode<>(350);
  TreeNode<Integer> node19 = new TreeNode<>(125);
  TreeNode<Integer> node20 = new TreeNode<>(175);
  TreeNode<Integer> node21 = new TreeNode<>(4);
  TreeNode<Integer> node22 = new TreeNode<>(500);
  BinaryTree<Integer> tree1 = new BinaryTree<>();
  BinaryTree<Integer> tree2 = new BinaryTree<>();
  HashSet<Integer> set = new HashSet<>();

  void setTrees(){
    tree1.setRoot(node1);
    node1.setLeft(node2);
    node2.setLeft(node3);
    node3.setLeft(node4);
    node4.setLeft(node5);
    node5.setLeft(node6);
    node6.setLeft(node7);
    node7.setLeft(node8);
    node8.setLeft(node9);
    node9.setLeft(node10);
    node10.setLeft(node11);
    tree2.setRoot(node12);
    node12.setLeft(node13);
    node13.setLeft(node14);
    node14.setLeft(node15);
    node15.setLeft(node16);
    node16.setLeft(node17);
    node17.setLeft(node18);
    node18.setLeft(node19);
    node19.setLeft(node20);
    node20.setLeft(node21);
    node21.setLeft(node22);
    int[] array = new int[] {100,160,125,175,200,350,500};
    for(int val : array){
      set.add(val);
    }
  }


  @Test
  void treeIntersectionReturnsCorrectSet() {
    TreeIntersection sut = new TreeIntersection();
    setTrees();
    assertEquals(set,sut.treeIntersection(tree1,tree2));
  }

  @Test
  void treeIntersectionReturnsEmpty() {
    TreeIntersection sut = new TreeIntersection();
    tree1.setRoot(node1);
    tree2.setRoot(node12);
    assertEquals(set, sut.treeIntersection(tree1,tree2));
  }

  @Test
  void treeIntersectionReturns100() {
    TreeIntersection sut = new TreeIntersection();
    tree1.setRoot(node2);
    tree2.setRoot(node13);
    set.add(100);
    assertEquals(set, sut.treeIntersection(tree1,tree2));
  }
}
