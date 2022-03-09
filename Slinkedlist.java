//program to add nodes in a linked list

public class Slinkedlist {

    class Node{ //Node is not predefined and hence any name preferred
        int data;  //data is node type
        Node next;  //next is Node type

        Node(int data){   //constructor created, data passed as an argument
            this.data = data; // this argument is placed at the node

        }
    }


    public Node head = null; //head declared as null
    public Node tail = null; //tail declared as null

    public void addNode(int data){ // creating newNode
        Node newNode =new Node(data); //data which passed as an argument is placed as data in to the Node

        if (head == null){  //if no element or node then creating node will be assigned as head
            head = newNode; //newNOde assigned as head
        } else {
            tail.next =newNode;  //if already there is a node then the next created addNode will become tail node
        }
        tail = newNode; //if null node new addNode will become both head and tail
        System.out.println("node added"); //notifying node is added
    }
    
    public void display(){ //to display the list
        if (head == null){    //checking whether there is any node
            System.out.println("empty");
            return;  //if no nodes then returned with empty statement
        }
        Node temp = head; // assigning head to temp
        while (head !=null){      //as long as the condition satisfies
            System.out.println(temp.data); //printing the data of the nodes
            temp = temp.next; // moving to the next nodes within the while condition 
        }
    }

    public static void main(String[] args) {
        Slinkedlist list = new Slinkedlist(); //creating a variable 'list'
        list.display(); //displaying the list


        list.addNode(10); //passing the arguments into 'data'
        list.addNode(20); //passing the arguments into 'data'
        list.addNode(50);  //passing the arguments into 'data'
        list.display(); //displaying the data 
    }
}
