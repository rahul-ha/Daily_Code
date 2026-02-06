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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null ) return null;
        
        ListNode cn = head;
        ListNode prev = new ListNode();

        while(true){
            if(cn == head && cn.val == val){
                cn = cn.next;
                head = head.next;
            }else{
            if(cn.val == val){
                prev.next = cn.next;
                cn = cn.next;
            }else{
                prev = cn;
                cn = cn.next;
            }
            }
            if(cn == null) break;
        }
        return head;
    }
}