package datastructures.trees;


import datastructures.Node;
import datastructures.queue.Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class BinaryTree<T>{
  private TreeNode<T> root;


  public BinaryTree() {
  }

  public ArrayList<T> preOrder(TreeNode<T> node, ArrayList<T> array){
    array.add(node.getValue());
    if(node.getLeft() != null){
      preOrder(node.getLeft(), array);
    }
    if(node.getRight() != null){
      preOrder(node.getRight(), array);
    }
    return array;
  }

  public ArrayList<T> inOrder(TreeNode<T> node, ArrayList<T> array){
    if(node.getLeft() != null){
      inOrder(node.getLeft(), array);
    }
    array.add(node.getValue());
    if(node.getRight() != null){
      inOrder(node.getRight(), array);
    }
    return array;
  }

  public ArrayList<T> postOrder(TreeNode<T> node, ArrayList<T> array){
    if(node != null){
      if(node.getLeft() != null){
        postOrder(node.getLeft(), array);
      }
      if(node.getRight() != null){
        postOrder(node.getRight(), array);
      }
      array.add(node.getValue());
    }
    return array;
  }

  public int findMaxVal() {
    ArrayList<Integer> newList = new ArrayList<>();
    newList = (ArrayList<Integer>) this.preOrder(getRoot(), (ArrayList<T>) newList);
    int max = 0;
    for(int value : newList){
      if( value > max){
        max = value;
      }
    }
    return max;
  }

  public ArrayList<T> breadthFirst(TreeNode<T> root){
    Queue<TreeNode<T>> newQueue = new Queue<>();
    ArrayList<T> arrayList = new ArrayList<>();
    newQueue.enqueue(root);
    while(!newQueue.isEmpty()){
      TreeNode<T> current = newQueue.dequeue();
      arrayList.add(current.getValue());
      if(current.getLeft() != null){
      newQueue.enqueue(current.getLeft());
      }
      if(current.getRight() != null){
      newQueue.enqueue(current.getRight());
      }
    }
    return arrayList;
  }

  public TreeNode<T> getRoot() {
    return root;
  }

  public void setRoot(TreeNode<T> root) {
    this.root = root;
  }
}
