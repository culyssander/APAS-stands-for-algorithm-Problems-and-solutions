public class Test2 {

    public static void main(String[]args) {
        
        LinkedList list = new LinkedList();

        list.append(2);
        list.append(3);
        list.append(4);

        System.out.println(list);
        System.out.println(list.size);

        list.deleteWithValue(3);
        list.deleteWithValue(2);
 
        System.out.println(list);
        System.out.println(list.size);

        list.prepend(6);
        list.prepend(9);
        list.prepend(7);

        System.out.println(list);
        System.out.println(list.size);

    }
}