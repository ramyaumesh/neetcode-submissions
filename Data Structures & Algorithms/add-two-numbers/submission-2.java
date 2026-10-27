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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode rp = null;
        ListNode prev =null;
        int cur=0;
        int carry =0;
        while(p1!=null &&p2!=null){
        cur = p1.val+p2.val+carry;
        
            carry=cur/10;
           
                rp=new ListNode();
            
            rp.val=cur%10;
            if(prev==null){
                prev=new ListNode();
                prev=rp;
                res=rp;
            } else {
            prev.next=rp;
            prev=prev.next;
            }
        p1=p1.next;
        p2=p2.next;
        }
       while(p1!=null){
        cur = p1.val+carry;
        carry=cur/10;
         rp=new ListNode();
         rp.val=cur%10;
          prev.next=rp;
            prev=prev.next;
            p1=p1.next;
       }
         while(p2!=null){
        cur = p2.val+carry;
        carry=cur/10;
         rp=new ListNode();
         rp.val=cur%10;
          prev.next=rp;
            prev=prev.next;
            p2=p2.next;
       }
       if(cur/10!=0){
        prev.next=new ListNode(cur/10);
       }
        return res;
    }
}
