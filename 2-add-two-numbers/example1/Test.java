public class Test {

    public static void main(String[]args) {
        Node node = new Node(2);

        System.out.println(node.data);
        System.out.println(node.next);

        node.next = new Node(4);
        
        System.out.println(node.next.data);

        System.out.println(node.next.next);

        node.next.next = new Node(3);

        System.out.println(node.next.next.data);

        System.out.println(node.toString());

    }
}