public class BinaryTree {
  
  public static void main (String [ ] args){
    
    Node node = new Node(5);
    node.setRight(7);
    node.setLeft(4);
    node.getLeft().setLeft(2);
    node.getLeft().getLeft().setLeft(8);
    node.getLeft().getLeft().setRight(9);
    node.getRight().setLeft(6);
    node.getRight().setRight(3);
    node.getRight().getLeft().setRight(1);
    
    System.out.println("In Order:"); 
    inOrder(node);
    System.out.println(" ");
    System.out.println("Pre-Order:");
    preOrder(node);
    System.out.println(" ");
    System.out.println("Post Order:");
    postOrder(node);
    
    
    
  }
  
  public static void inOrder(Node n){
    if (n!=null){
      inOrder(n.getLeft());
      System.out.print( n.printData());
      inOrder(n.getRight());
    }
  }
  
  public static void preOrder(Node n){
    if (n!=null){
      preOrder(n.getLeft());
      preOrder(n.getRight());
      System.out.print( n.printData());
    }
  }
  public static void postOrder(Node n){
    if (n!=null){
      System.out.print(n.printData());
      postOrder(n.getLeft());
      postOrder(n.getRight());
    }
  }
}







