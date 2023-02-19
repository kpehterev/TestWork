package org.example;

import java.util.Arrays;

public class NodeTask {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9,new ListNode(9,new ListNode(9)));
        ListNode l2 = new ListNode(9,new ListNode(9,new ListNode(9)));

        System.out.println(addTwoNumbers(l1,l2));





    }

    static ListNode sumOfReverseNode(ListNode l1, ListNode l2) {
        StringBuilder stringBuilderL1 = new StringBuilder();
        StringBuilder stringBuilderL2 = new StringBuilder();
        ListNode l3 = new ListNode();

        while (l1 != null) {
            stringBuilderL1.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stringBuilderL2.append(l2.val);
            l2 = l2.next;
        }

        stringBuilderL1.reverse();
        Integer one = Integer.parseInt(stringBuilderL1.toString());
        stringBuilderL2.reverse();
        Integer two = Integer.parseInt(stringBuilderL2.toString());

        Integer three = one + two;
        StringBuilder stringBuilderL3 = new StringBuilder(String.valueOf(three));

        stringBuilderL3.reverse();
        String[] strings = stringBuilderL3.toString().split("");

        int count =-1;
        return recursive(count,strings);
    }

    static ListNode recursive(int count, String[] strings){
        count++;
        if(count==strings.length) return null;
        return new ListNode(Integer.parseInt(strings[count]),recursive(count,strings));

    }


    static   ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry==1){
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            sum+=carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }
}

