class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int l1=0,l2=0;
        ListNode head = pHead1;
        while(head){
            l1+=1;
            head = head.next;
        }
        head = pHead2;
        while(head){
            l2+=1;
            head = head.next;
        }
        if(l1>l2){ //强制将head2变为长的，head1变为短的，方便后面处理
            int t = l1;
            l1 = l2;
            l2 = t;
            head = pHead1;
            pHead1 = pHead2;
            pHead2 = head;
        }
        while(pHead2!=pHead1){
            
        }
 
 
    }
}