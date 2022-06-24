package datastructures.TreeIntersection;


import datastructures.hashtableAlt.HashMap;
import datastructures.trees.BinaryTree;
import datastructures.trees.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;

public class TreeIntersection {
  HashSet<Integer> dupes = new HashSet<>();

  public TreeIntersection() {
  }

  public HashSet<Integer> treeIntersection(BinaryTree<Integer> tree1, BinaryTree<Integer> tree2){
    HashMap<Integer, Integer> newMap = new HashMap<>(3);
    ArrayList<Integer> tree1Array = tree1.preOrder(tree1.getRoot(),new ArrayList<>());
    ArrayList<Integer> tree2Array = tree2.preOrder(tree2.getRoot(),new ArrayList<>());
    for(int value : tree1Array){
      newMap.add(value,value);
    }
    for(int value : tree2Array){
      if(newMap.contains(value)){
        dupes.add(value);
      }
    }
    return dupes;
  }
}
