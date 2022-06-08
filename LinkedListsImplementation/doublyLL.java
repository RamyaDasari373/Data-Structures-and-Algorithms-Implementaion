// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
    int data;
    Node next;
    Node prev;
}
class DoublyLinkedLists{
    Node head;
    Node tail;
    int totalNodes;
    public Node createDLL(int data){
        head = new Node();
        Node newnode = new Node();
        newnode.data = data;
        newnode.prev = null;
        newnode.next = null;
        head = newnode;
        tail = newnode;
        totalNodes++;
        return head;
    }
    public void insertAtBegining(int data){
        if(head==null){
            createDLL(data);
        }
        else{
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = head;
        newnode.prev = null;
        head = newnode;
        totalNodes++;
        }
    }
    public void insertAtEnd(int data){
        if(head==null){
            createDLL(data);
        }
        else{
            Node newnode = new Node();
            newnode.data = data;
            newnode.next = null;
            tail.next = newnode;
            tail = newnode;
            totalNodes++;
        }
    }
    public void insertAtLocation(int loc,int data){
        if(loc == 0){
            insertAtBegining(data);
        }
        else if(loc >= totalNodes){
            insertAtEnd(data);
        }
        else{
            Node n = head;
            for(int i=0;i<loc-1;i++){
                n = n.next;
            }
            Node newnode = new Node();
            newnode.data = data;
            newnode.next = n.next;
            newnode.prev = n;
            n.next = newnode;
        }
    }
    public void traverse(){
        Node n = head;
        while(n != null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        
    }
}
class doublyLL {
    public static void main(String[] args) {
        DoublyLinkedLists dl = new DoublyLinkedLists();
        dl.insertAtEnd(10);
        dl.insertAtEnd(20);
        dl.insertAtEnd(30);
        dl.insertAtLocation(1,2000);
        dl.traverse();
    }
    
}