package datastructures.trees;


public class BinarySearchTree extends BinaryTree<Integer>{

  public void add(int value){
    setRoot(addRecursion(getRoot(), value));
  }
  public TreeNode<Integer> addRecursion(TreeNode<Integer> current, int value){
    if(current == null){
      return new TreeNode<>(value);
    }
    if(value < current.getValue()){
      current.setLeft(addRecursion(current.getLeft(),value));
    }
    else if(value > current.getValue()){
      current.setRight(addRecursion(current.getRight(), value));
    }
    else{
      return current;
    }
    return current;
  }

  public boolean contains(int value){
    return searchRecursion(getRoot(), value);
  }

  public boolean searchRecursion(TreeNode<Integer> current, int value){
    if(current == null) return false;
    if(value < current.getValue()){
      return searchRecursion(current.getLeft(),value);
    }
    else if(value > current.getValue()){
      return searchRecursion(current.getRight(),value);
    }
    else {
      return current.getValue() == value;
    }
  }
}
