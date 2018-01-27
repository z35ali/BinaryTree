public class Node {
  
  public Node rightNode;
  public Node leftNode;
  public int data;
  
  
  
  
  public Node(int data)
  {
    rightNode = null;
    leftNode = null;
    this.data = data;
  }
  
  public void setLeft(int value)
  {
    
    leftNode=new Node(value);
  }
  
  public void setRight(int value){
    rightNode=new Node (value);
  }
  
  public Node getLeft(){
    return leftNode;
    
  }
  public Node getRight(){
    return rightNode;
  }
  public String printData(){
    return data+" ";
  }
}