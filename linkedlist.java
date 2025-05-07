
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// class SLL{
//    Node head;
//    void insert(int data){
//       Node newnode = new Node(data);
//       newnode.next = head;
//       head = newnode;
//    }
//    void display(){
//      Node temp = head;
//      while(temp != null){
//         System.out.println(temp.data + " ");
//         temp = temp.next;
//      }
//    }
// }

// public class linkedlist {
//     public static void main(String[] args) {
//         SLL list = new SLL();
//         list.insert(10);
//         list.insert(20);
//         list.insert(30);
//         list.insert(40);
//         list.insert(50);
//         list.display();
//     }
// }

//User input by loop//


// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// class SLL{
//    Node head;
//    void insert(int data){
//       Node newnode = new Node(data);
//       newnode.next = head;
//       head = newnode;
//    }
//    void display(){
//      Node temp = head;
//      while(temp != null){
//         System.out.println(temp.data + " ");
//         temp = temp.next;
//      }
//    }
// }

// public class linkedlist {
//     public static void main(String[] args) {
//         SLL list = new SLL();
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         for(int i = 1; i <= n; i++){
//             list.insert(i);
//         }
//         list.display();
//     }
// }

//user input element//

// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// class SLL{
//    Node head;
//    void insert(int data){
//       Node newnode = new Node(data);
//       newnode.next = head;
//       head = newnode;
//    }
//    void display(){
//      Node temp = head;
//      while(temp != null){
//         System.out.println(temp.data + " ");
//         temp = temp.next;
//      }
//    }
// }

// public class linkedlist {
//     public static void main(String[] args) {
//         SLL list = new SLL();
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = s.nextInt();
//         }
//         for(int i = 0; i < n; i++){
//             list.insert(arr[i]);
//         }
//         list.display();
//     }
// }

//count the all node //
// class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
    
//     class SLL{
//        Node head;
//        void insert(int data){
//           Node newnode = new Node(data);
//           newnode.next = head;
//           head = newnode;
//        }
//        int count = 0;
//        void count(){
//          Node temp = head;
//          while(temp != null){
//             count++;
//             temp = temp.next;
//          }
//          System.out.println(count);
//        }
//     }
    
//     public class linkedlist {
//             public static void main(String[] args) {
//         SLL list = new SLL();
//         list.insert(10);
//         list.insert(20);
//         list.insert(30);
//         list.insert(40);
//         list.insert(50);
//         list.count();
//     }
     
// }

//sum of element in linked list

// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// class SLL{
//    Node head;
//    void insert(int data){
//       Node newnode = new Node(data);
//       newnode.next = head;
//       head = newnode;
//    }
//    void display(){
//     Node temp = head;
//     while(temp != null){
//         System.out.println(temp.data + " ");
//         temp = temp.next;
//     }
//    }
//    int sum = 0;
//    void sum(){
//      Node temp = head;
//      while(temp != null){
//         sum += temp.data;
//         temp = temp.next;
//      }
//      System.out.println(sum);
//    }
// }

// public class linkedlist {
//         public static void main(String[] args) {
//     SLL list = new SLL();
//     list.insert(10);
//     list.insert(20);
//     list.insert(30);
//     list.insert(40);
//     list.insert(50);
//     list.sum();
//     list.display();
// }
 
// }

//count element above the 10 valu count it

// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// class SLL{
//    Node head;
//    void insert(int data){
//       Node newnode = new Node(data);
//       newnode.next = head;
//       head = newnode;
//    }
//    int abovevcount = 0;
//    void abovevcount(){
//      Node temp = head;
//      while(temp != null){
//         if(temp.data > 10){
//             abovevcount++;
//         }
//         temp = temp.next;
//      }
//      System.out.println(abovevcount);
//    }
// }

// public class linkedlist {
//         public static void main(String[] args) {
//     SLL list = new SLL();
//     list.insert(10);
//     list.insert(20);
//     list.insert(30);
//     list.insert(40);
//     list.insert(50);
//     list.abovevcount();
    
// }
 
// }

//count element above the 10 valu count it by ternay operator

// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// class SLL{
//    Node head;
//    void insert(int data){
//       Node newnode = new Node(data);
//       newnode.next = head;
//       head = newnode;
//    }
//    int abovevcount = 0;
// void abovevcount() {
//     Node temp = head;
//     while (temp != null) {
//         abovevcount += (temp.data > 10) ? 1 : 0;
//         temp = temp.next;
//     }
//     System.out.println(abovevcount);
// }
// }

// public class linkedlist {
//         public static void main(String[] args) {
//     SLL list = new SLL();
//     list.insert(10);
//     list.insert(20);
//     list.insert(30);
//     list.insert(40);
//     list.insert(50);
//     list.abovevcount();   
// }
// }

//MAX and MIN number //

// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// class SLL{
//    Node head;
//    void insert(int data){
//       Node newnode = new Node(data);
//       newnode.next = head;
//       head = newnode;
//    }
// void Maxnumber() {
//     Node temp = head;
//     int Max = temp.data;
//     System.out.print("Maxnumber : ");
//     while (temp != null) {
//         if(Max < temp.data){
//             Max = temp.data;
//         }
//         temp = temp.next;
//     }
//     System.out.println(Max);
// }

// void Minnumber() {
//     Node temp = head;
//     int Min = temp.data;
//     System.out.print("Minnumber : ");
//     while (temp != null) {
//         if(Min > temp.data){
//             Min = temp.data;
//         }
//         temp = temp.next;
//     }
//     System.out.println(Min);
// }
// }

// public class linkedlist {
//         public static void main(String[] args) {
//     SLL list = new SLL();
//     list.insert(10);
//     list.insert(20);
//     list.insert(30);
//     list.insert(40);
//     list.insert(50);
//     list.insert(1);
//     list.insert(500);
//     list.Maxnumber();
//     list.Minnumber();   
// }
// }

//insert with position element//

// class Node {
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// class SLL {
//     Node head;

//     // Insert at head
//     void insert(int data) {
//         Node newnode = new Node(data);
//         newnode.next = head;
//         head = newnode;
//     }

//     // Insert at a given position (0-based index)
//     void position(int data, int pos) {
//         Node newnode = new Node(data);

//         // Insert at the beginning
//         if (pos == 0) {
//             newnode.next = head;
//             head = newnode;
//             return;
//         }

//         Node temp = head;
//         for (int i = 0; i < pos - 1 && temp != null; i++) {
//             temp = temp.next;
//         }

//         // If position is invalid (greater than length)
//         if (temp == null) {
//             System.out.println("Invalid position!");
//             return;
//         }

//         newnode.next = temp.next;
//         temp.next = newnode;
//     }

//     // Display the list
//     void display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
// }


// public class linkedlist {
//     public static void main(String[] args) {
//         SLL list = new SLL();
//         list.insert(10);
//         list.insert(20);
//         list.insert(30);
//         list.insert(40);
//         list.insert(50);
//         list.display();
//         list.position(25, 2);
//         list.display();
//     }
// }


// class Node {
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// class SLL {
//     Node head;

//     // Insert at end
//     void insert(int data) {
//         Node newnode = new Node(data);
//         if (head == null) {
//             head = newnode;
//             return;
//         }
    
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
    
//         temp.next = newnode;
//     }
    

//     // Insert at a given position (0-based index)
//     void position(int data, int pos) {
//         Node newnode = new Node(data);

//         // Insert at the beginning
//         if (pos == 0) {
//             newnode.next = head;
//             head = newnode;
//             return;
//         }

//         Node temp = head;
//         for (int i = 0; i < pos - 1 && temp != null; i++) {
//             temp = temp.next;
//         }

//         // If position is invalid (greater than length)
//         if (temp == null) {
//             System.out.println("Invalid position!");
//             return;
//         }

//         newnode.next = temp.next;
//         temp.next = newnode;
//     }

//     // Display the list
//     void display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
// }


// public class linkedlist {
//     public static void main(String[] args) {
//         SLL list = new SLL();
//         list.insert(10);
//         list.insert(20);
//         list.insert(30);
//         list.insert(40);
//         list.insert(50);
//         list.display();
//         list.position(25, 2);
//         list.display();
//     }
// }

//delete the element in linkedlist//


// class Node{
//     int data;
//     Node next;
//     Node(int data){
//        this.data = data;
//        this.next = null;
//     }
// }

// class SLL{
//    Node head;

//    void insert(int data){
//        Node newnode = new Node(data);
//            newnode.next = head;
//            head = newnode;
//        }

//        void delete(int position) {
//            if (head == null) {
//                System.out.println("List is empty");
//                return;
//            }
   
//            if (position == 0) {
//                head = head.next;
//                return;
//            }
   
//            Node temp = head;
//            for (int i = 0; i < position - 1 && temp != null; i++) {
//                temp = temp.next;
//            }
   
//            if (temp == null || temp.next == null) {
//                System.out.println("Position out of bounds");
//                return;
//            }
   
//            temp.next = temp.next.next;
//        }

//    void display(){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }

// }

// public class linkedlist {
//    public static void main(String[] args) {
//        SLL list = new SLL();
//        list.insert(10);
//        list.insert(20);
//        list.insert(30);
//        list.insert(40);
//        list.insert(50);
//        list.display();

//        list.delete(0);
//        list.delete(1);
//        list.delete(10);
//        list.display();
//    }
// }