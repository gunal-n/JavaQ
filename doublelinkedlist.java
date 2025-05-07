
//double linkedlist only inseart//
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
       this.data = data;
       this.next = null;
       this.prev = null;
    }
}

class DLL{
   Node head;
   Node tail;
   void insert(int data){
       Node newnode = new Node(data);               
       if(head == null){
           head = tail = newnode;
           return;
       }
           newnode.next = head;
           head.prev = newnode;
           head = newnode;
       }
   void display(){
       Node temp = head;
       while(temp != null){
           System.out.print(temp.data + " ");
           temp = temp.next;
       }
       System.out.println("null");

       temp = tail;
       while(temp != null){
        System.out.print(temp.data + " ");
        temp = temp.prev;
       }
       System.out.println("null");
   }

}
public class doublelinkedlist {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();
    }
}
