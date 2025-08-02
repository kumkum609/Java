public class LinkList {
    Node head;

    //This is a Program for LinkedList 
     
    class Node{
        String data;
        Node next;
    
     Node(String data){
        this.data= data;
        this.next = null;
     }
    }
    
    
    // Add-- First, last

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //Add in last
    public void addLast(String data){
         Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
          }

          Node currNode = head;
          while(currNode.next != null){
            currNode = currNode.next;
          }
          currNode.next = newNode;
        }

         // Print
          public void printList(){
          if(head == null){
          System.out.println(" List is empty");
          return;
          }
           Node currNode = head;
          while(currNode != null){
            System.out.print(currNode.data +"->");
            currNode = currNode.next;
        
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
      System.out.println("Add Last --- > ");
        list.addLast("List");
        list.printList();

        System.out.println("Add First ---->");
        list.addFirst("This");
        list.printList();

        
    }

}
