//problem is to remove set of duplicates in array {10,20,20,20,50}
//S O(1), T O()

public class LinkedListprob {

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

    public void delete(int data){
        Node temp = head, prev = null;
        if(temp !=null && temp.data == data){
            head = temp.next;
            return;
        }

        while (temp != null && temp.data !=data){
            prev = temp;
            temp = temp.next;
        }

        if (temp == null){
            return;
        }

        if(temp == tail){
            tail = prev;
            tail.next = null;
            return;
        }

        prev.next = temp.next;

    }

    public void insertAfter(int nextTo, int data){
        Node newNode = new Node(data);
        Node temp = head;

        while(temp != null && temp.data != nextTo){
            temp = temp.next;

        }

        if(temp == null){
            return;
        }

        if(temp ==  tail){
            tail.next =newNode;
            tail = newNode;
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeDuplicates(){
        Node current = head;

        while(current != null) {
            Node next =current.next;
            while (next !=null && next.data == current.data) {
               next = next.next; 
            }

            current.next = next;

            if(next == tail && current.data == next.data){
                tail = current;
                tail.next =null;
            }

            current = next;
        }
    }

    public static void main(String[] args) {
        LinkedListprob list = new LinkedListprob(); //creating a variable 'list'
        list.display(); //displaying the list


        list.addNode(10);
        list.addNode(20);
        list.addNode(20); //passing the arguments into 'data'
        list.addNode(20); //passing the arguments into 'data'
        list.addNode(50);  //passing the arguments into 'data'


        // list.delete(10);
        // list.insertAfter(50, 30);

        list.removeDuplicates();


        list.display(); //displaying the data 
    }
    
}
