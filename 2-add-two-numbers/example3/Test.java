
public class Test {

    public static void main(String [] args) {
        // this is a simples examples... You need to create list or linkedlist
        // 6 -> 3 -> 4 -> 2 -> 1
        Node nodeA = new Node(6);
        Node nodeB = new Node(3);
        Node nodeC = new Node(2);
        Node nodeD = new Node(1);
        Node nodeE = new Node(5);

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

    }
}