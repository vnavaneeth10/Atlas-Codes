public class BinaryTree1 {
    static class Node {//Node class
        int data;
        Node left;
        Node right;
    

    Node (int data){ //constructor
        this.data = data;
        this.left = null; //left null
        this.right = null; //right side  null

    }
}

static class BinaryTree{
    static int idx = -1;
    public static Node buildTree(int nodes[]) {
       idx++;
       if(nodes[idx] == -1) { // if the element is -1 return null no branches then
           return null;// return null
       }

       Node newNode = new Node(nodes[idx]); // create new nodes
       newNode.left = buildTree(nodes);
       newNode.right = buildTree(nodes);

       return newNode;
    }
}

    public static void preorder(Node root) {
        if(root == null) {
            return;

        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree(); //object creation
        Node root = tree.buildTree(nodes); //all the nodes will be saved to the Node
        // System.out.println(root.data);
        preorder(root);

    }
}
