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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevgroup=dummy,temp=head;
        while(temp!=null){
           ListNode kthnode=getkthNode(temp,k);
           if(kthnode==null){
            break;
           }
           ListNode nextstart=kthnode.next;
           kthnode.next=null;
           ListNode reversehead=reverselist(temp);
           prevgroup.next=reversehead;  
           temp.next=nextstart;
           prevgroup=temp;
           temp=nextstart;
        }
        return dummy.next;
    }
private ListNode getkthNode(ListNode temp, int k) {
        while (temp != null && --k > 0) {
            temp = temp.next;
        }
        return temp;
    }
private ListNode reverselist(ListNode head) {
        ListNode prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
