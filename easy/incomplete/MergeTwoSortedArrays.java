package incomplete;
public class MergeTwoSortedArrays {
    
    public static ListNode solution(ListNode listOne, ListNode listTwo) {
        
        return new ListNode();

    }

    public static void main(String[] args) {

        ListNode two = new ListNode(2);
        ListNode one = new ListNode(1, two);

        ListNode solution = solution(one, one);

        System.out.println(solution.val);

    }

    static public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        public int getVal() {
            return val;
        }
        public void setVal(int val) {
            this.val = val;
        }
        public ListNode getNext() {
            return next;
        }
        public void setNext(ListNode next) {
            this.next = next;
        }
    }
}


