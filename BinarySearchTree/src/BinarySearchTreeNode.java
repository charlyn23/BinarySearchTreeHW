/**
 * Created by charlynbuchanan on 10/29/15.
 */
public class BinarySearchTreeNode {

    int data;
    BinarySearchTreeNode leftChild;
    BinarySearchTreeNode rightChild;
    BinarySearchTreeNode root;

    public BinarySearchTreeNode(int data){
        this.data = data;
    }

    public void leftChild(int data) {
        this.data = data;
    }

    public BinarySearchTreeNode getLeftChild()
    {
        return leftChild;
    }

    public void setLeftChild(BinarySearchTreeNode leftChild)
    {
        this.leftChild = leftChild;
    }

    public BinarySearchTreeNode getRightChild()
    {
        return rightChild;
    }

    public void setRightChild(BinarySearchTreeNode rightChild)
    {
        this.rightChild = rightChild;
    }

    public BinarySearchTreeNode find(int data) {
        if (data == this.data) {
            return this;
        }
        if (data < this.data && leftChild != null) {
            return leftChild.find(data);
        }
        if (data > this.data && rightChild != null){
            return rightChild.find(data);
        }

        else {
            return null;
        }
    }


    public void insert(int data) {
        if (data >= this.data) {
            if (this.rightChild == null){
                this.rightChild  = new BinarySearchTreeNode(data);
            }
            else
                this.rightChild.insert(data);
        }
        else  {
                if (this.leftChild == null){
                    this.leftChild = new BinarySearchTreeNode(data);
                }
                else
                this.leftChild.insert(data);
        }
    }


    //Why isn't the root printing?
    public void printPostOrder(){
        if (this.leftChild != null) {
            this.leftChild.printPostOrder();
            System.out.print(", ");
        }
        if (this.rightChild != null){
            this.rightChild.printPostOrder();
            System.out.print(", " );
        }
        System.out.print(this.data);
    }

    public void printPreOrder() {
        System.out.print(this.data + ", ");
        if (this.leftChild != null) {
            this.leftChild.printPreOrder();
        }
        if (this.rightChild != null) {
            this.rightChild.printPreOrder();
        }
    }

    public void printInOrder() {
        if (this.leftChild != null) {
            this.leftChild.printInOrder();
//            System.out.print(this.data + ", ");
//            this.rightChild.printInOrder();
        }
        if (this.rightChild != null) {
//            this.rightChild.printInOrder();
            System.out.print(this.rightChild.data + ", ");
        }

    }




}
