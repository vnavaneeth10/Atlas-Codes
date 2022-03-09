public class Queue {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    
}

  public Node front; // front for head or top in stack
  public Node rear; // rear is tail part

  void enqueue(int data) {
      Node newNode = new Node(data);

      if (rear == null) { // pushing elements always done from the rear
        front = rear = newNode;
        return;
      }
      rear.next = newNode; // moving the rear position to newNode
      rear = newNode;
  }


  void dequeue() {
      if (front == null) {
          System.out.println("empty");
        }
       front = front.next;

       if (front == null) {
           rear = null;
       }



  }


  public void display() {
      Node current = front;

      if (front == null) {
          System.out.println("List is empty");
          return;
      }
      while (current != null){
          System.out.println(current.data + "");
          current = current.next;
      }
      System.out.println();
  }

  public static void main(String[] args) {
      Queue queue = new Queue();

      queue.enqueue(10);
      queue.enqueue(20);
      queue.enqueue(30);
      queue.enqueue(50);
      
      queue.dequeue();
      
      queue.display();
  }
}
