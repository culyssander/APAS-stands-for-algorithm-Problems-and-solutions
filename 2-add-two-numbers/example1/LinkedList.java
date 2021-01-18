
public class LinkedList {
    Node head; 
    int size;


    public LinkedList(int data) {
        head = new Node(data);
        this.size = 0;
    }


    public LinkedList() {
        this.size = 0;
    }

     public void append (int data) { // Insert

         if( head == null) {
            head = new Node(data);
            size++;
            return;
         }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);
        size++;
    }

    public void prepend (int data) { // Insert before the head

        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
        size++;
    }

    
    public void deleteWithValue (int data) {
        if( head == null) {
            System.out.println("Head is empty");
            return;
        }

        if(head.data == data) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;

        while(current.next != null) {
            if(current.next.data == data) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }

    }

    @Override
    public String toString() {
        String s = "[";

        Node p = head;
        s+= "" + p.data;

        while( p.next != null) {
            s+=", " + p.next.data;
            if(p != null) p = p.next;
        }

        s +="]";

        return s;
    }

}