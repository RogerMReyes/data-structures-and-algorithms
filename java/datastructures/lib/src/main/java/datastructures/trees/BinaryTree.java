package datastructures.trees;


import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T>{
  private TreeNode<T> root;
  private List<T> list = new ArrayList<>();

  public BinaryTree() {
  }

  public List<T> preOrder(TreeNode<T> root){
    list.add(root.getValue());
    if(root.getLeft() != null){
      preOrder(root.getLeft());
    }
    if(root.getRight() != null){
      preOrder(root.getRight());
    }
    return list;
  }

  public List<T> inOrder(TreeNode<T> root){
    if(root.getLeft() != null){
      inOrder(root.getLeft());
    }
    list.add(root.getValue());
    if(root.getRight() != null){
      inOrder(root.getRight());
    }
    return list;
  }

  public List<T> postOrder(TreeNode<T> root){
    if(root != null){
      if(root.getLeft() != null){
        postOrder(root.getLeft());
      }
      if(root.getRight() != null){
        postOrder(root.getRight());
      }
      list.add(root.getValue());
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
