public class DlinkedListRev {
    

    class Node{
        int data; // value of the node
        Node next; // next value reference
        Node prev; //prev value reference

        Node(int data){
            this.data=data;
        }
    }

    public Node head;
    public Node tail;//creating head & tail for the node

    public void addNode(int data){
        Node newNode = new Node(data); // creation of newNode

        if(head == null){
            head = newNode;
        }else {
            tail.next = newNode; //if already there is a node then the tail will be assigned the value of the newNode
            newNode.prev = tail;
        }

        tail = newNode;
    }

    public void displayRev(){
        Node temp = tail; // to print from reverse
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.prev; //to start printing from reverse
        }
    }

    public static void main(String[] args) {
        DlinkedListRev list = new DlinkedListRev();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);

        
        list.displayRev();
    }
}
