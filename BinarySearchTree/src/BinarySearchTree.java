/**
 * Created by charlynbuchanan on 10/29/15.
 */
public class BinarySearchTree {

    private BinarySearchTreeNode root;

    public BinarySearchTreeNode find(int data){
        if (root != null) {
            return root.find(data) ;
        }
        return null;


    }

    public void  insert(int data) {
        if (root == null) {
            this.root = new BinarySearchTreeNode(data);
        }
        else {
            root.insert(data);

        }
    }

    public void printPost() {
        if (root == null) {
            System.out.println("No tree present");
        }
        else
            root.printPostOrder();
    }

    public void printPre() {
        if (root == null) {
            System.out.println("No tree present");
        }
        else
            root.printPreOrder();
    }
    public void printIn() {
        if (root == null) {
            System.out.println("No tree present");
        }
        else
            root.printInOrder();
    }


    public static void main(String[] args)
    {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(7);
        bst.insert(5);
        bst.insert(2);
        bst.insert(6);
        bst.insert(9);
        bst.insert(8);
        bst.insert(11);

        System.out.println(bst);


        bst.printPost();
        bst.printIn();
        bst.printPre();



    }





}
