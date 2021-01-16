
public class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public String toString() {
        String s = "[";

        s+=data;
        Node p = next;

        while( p != null) {
            s+=", " + p.data;
            if(p != null) p = p.next;
        }

        s +="]";

        return s;        
    }
}