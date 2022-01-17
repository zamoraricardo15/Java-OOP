package com.linked;

public class ListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList sll = new SinglyLinkedList ();
	    sll.AddBack(31);
	    sll.AddBack(20);
	    sll.AddBack(49);
	    sll.AddBack(20);
        int val = sll.removeBack();
        System.out.println(val);
	}

}
