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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode cur = head;
        while(cur!=null){
            al.add(cur.val);
            cur = cur.next;
        }
        int arr[] = new int[al.size()]; 
        Stack<Integer> s = new Stack<>();
        for(int i = al.size()-1;i>=0;i--){
            while(!s.isEmpty() && al.get(i)>= al.get(s.peek())){
                s.pop();
            }
            if(!s.isEmpty())
            arr[i] = al.get(s.peek());
            s.push(i);
        }
        return arr;
    }
}