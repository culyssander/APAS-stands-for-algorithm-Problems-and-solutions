/**
    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as linked list.

    You may assunme the two numbers do not contain any leading zero, except the number 0 itself.

    Exemple:

    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output (7 -> 0 -> 8)
    Explanation: 342 + 465 = 807
 */


public class Solution1 {

    public static void main(String[]args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.append(2);
        l1.append(4);
        l1.append(3);

        l2.append(5);
        l2.append(6);
        l2.append(4);

        System.out.println(l1 + " " + l2);

        LinkedList result = addTwoNumbers(l1, l2);

        System.out.println(result);
    }

    public static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
        LinkedList curr = new LinkedList(); 

        int carry = 0;

        while( l1.head != null && l2.head != null) {
            int x = ( l1 != null ) ? l1.head.data : 0;
            int y = ( l2 != null ) ? l2.head.data : 0;

            int sum = carry + x + y;

            carry = sum / 10;
            
            curr.append(sum % 10);

            if(l1.head != null) l1.head = l1.head.next;
            if(l2.head != null) l2.head = l2.head.next;
         }

        return curr;
     }
 }