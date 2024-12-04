//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class Main {
    
    
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode next = null;
        ListNode current = head;

        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current =next;
        }

        return previous;
    }


}