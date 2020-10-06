package com.example.beginner;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class FriendsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> friends = new LinkedList<String>();
		friends.add("OBB");
		friends.add("BNP");
		friends.add("CAS");
		friends.add("OWIOH");
		
		friends.addFirst("ABA");
		friends.addLast("ZXC");
		
		System.out.println(friends);
		
		friends.add(1, "OBBO");
		
		System.out.println(friends);
		
		friends.removeLast();
		
		System.out.println(friends);
		
		for(String friend: friends) {
			System.out.println(friend);
		}
		System.out.println("Loop with iterator: ");
		Iterator iterator = friends.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("Loop with listiterator in forward: ");
		ListIterator<String> li = friends.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
			
		}
		System.out.println("Loop with listiterator in reverse: ");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
			
		}
		
		
	}

}
