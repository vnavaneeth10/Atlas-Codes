public class Stack {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    public Node top;

    public void push(int data){
        Node newNode = new Node(data);

        if(top == null){
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public void pop() {

        if(top == null){ // if it is null then it is called stack underflow
        System.out.println("stack underflow"); 
        return;
        }
         top = top.next;
    }

    public void display() {
        Node current = top; // top is same as head in a node

        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

     public static void main(String[] args) {
         Stack stack =new Stack(); //object created

         stack.push(1);
         stack.push(2);
         stack.push(3);
         stack.push(4);
         stack.push(5);


         stack.pop();

         stack.display();
         

        
    }
    
}
