package com.basic.beginners;

import java.util.LinkedList;
import java.util.Queue;

public class FriendsQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> friends = new LinkedList<String>();
		friends.add("OBB");
		friends.add("BNP");
		friends.add("CAS");
		friends.add("OWIOH");
		System.out.println(friends);
		System.out.println(friends.element());
		System.out.println(friends.remove());
		System.out.println(friends);
	}

}
