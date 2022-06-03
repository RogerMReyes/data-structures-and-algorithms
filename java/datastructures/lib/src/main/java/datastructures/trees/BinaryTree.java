package datastructures.trees;


import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T>{
  private TreeNode<T> root;
  private final List<T> list = new ArrayList<>();

  public BinaryTree() {
  }

  public List<T> preOrder(TreeNode<T> node){
    list.add(node.getValue());
    if(node.getLeft() != null){
      preOrder(node.getLeft());
    }
    if(node.getRight() != null){
      preOrder(node.getRight());
    }
    return list;
  }

  public List<T> inOrder(TreeNode<T> node){

    if(node.getLeft() != null){
      inOrder(node.getLeft());
    }
    list.add(node.getValue());
    if(node.getRight() != null){
      inOrder(node.getRight());
    }
    return list;
  }

  public List<T> postOrder(TreeNode<T> node){
    if(node != null){
      if(node.getLeft() != null){
        postOrder(node.getLeft());
      }
      if(node.getRight() != null){
        postOrder(node.getRight());
      }
      list.add(node.getValue());
    }
    return list;
  }

  public TreeNode<T> getRoot() {
    return root;
  }

  public void setRoot(TreeNode<T> root) {
    this.root = root;
  }
}
