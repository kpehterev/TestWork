package org.example;

public class mergeNode21 {

    public static void main(String[] args) {

        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode(1,new ListNode(2,new ListNode(3)));
        System.out.println(mergeTwoLists(l1,l2));

    }

    static ListNode mergeTwoLists(ListNode first, ListNode second)  {
        ListNode result = new ListNode();
        ListNode temp = result;

       if(first.val==0 || second.val ==0) return checkNull(first,second);

       checkZero(first,temp);
       checkZero(second,temp);

        while (true){
            ListNode node = new ListNode();

            if(second.val==0 && first.val==0) break;

            if(first.val> second.val && second.val!=0) {
                temp.val= second.val;
                temp.next=node;
                temp=temp.next;

                if (second.next==null){
                    second.val=0;
                }else second = second.next;

            } else {

                temp.val = first.val;
                temp.next = node;
                temp = temp.next;

                if (first.next==null){
                    first.val=0;
                }else first = first.next;
            }
        }

        return result;
    }

    static void checkZero(ListNode data, ListNode temp)  {

        while (data.val==0){
            ListNode node = new ListNode();
            temp.val= data.val;
            temp.next=node;
            temp = temp.next;
        }
    }

    static ListNode checkNull(ListNode first , ListNode second){


        if(first.val==0 && second.val==0) return new ListNode();
        if (first.val==0) return second;
        if (second.val==0) return first;
        return new ListNode(404);
    }

}
