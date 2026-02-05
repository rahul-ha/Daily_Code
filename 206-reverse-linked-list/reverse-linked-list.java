/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        if(head==null) return null;
        ListNode temp = head;
        while(temp!=null){
            al.add(temp.val);
            temp = temp.next;
        }
        Collections.reverse(al);
        ListNode neww  = new ListNode(al.get(0));
        ListNode nhead = neww;

        for(int i =1;i<al.size();i++){
            nhead.next  = new ListNode(al.get(i));
            nhead = nhead.next;

        }
        return neww;
    }
}