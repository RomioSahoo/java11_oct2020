package com.example.friends;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class FriendsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> friends = new ArrayList<String>();
		friends.add("OBB");
		friends.add("BNP");
		friends.add("CAS");
		friends.add("OWIOH");
		
		System.out.println(friends);
		
		friends.add(2, "MLANN");
		
		System.out.println(friends);
		
		friends.set(0, "OBBO");
		
		System.out.println(friends);
		
		friends.add(4, "FOOD");	
		
		System.out.println(friends);
		
		friends.remove(0);
		
		System.out.println(friends);
		
		for (String friend: friends) {
			System.out.println("Friend name: " + friend + " + ");
		}
		
		System.out.println(friends.contains("OBB"));
		System.out.println(friends.contains("CAS"));
		
		System.out.println(friends);
		System.out.println("Sorted Ascending: ");
		Collections.sort(friends);
		System.out.println(friends);
		System.out.println("Sorted Descending: ");
		Collections.reverse(friends);
		System.out.println(friends);
		
		System.out.println("Vectors: ");
		Vector<String> vector = new Vector<String>(4);
		System.out.println(vector.capacity());
		vector.add("OBB1");
		vector.add("OBB2");
		vector.add("OBB3");
		vector.add("OBB4");
		vector.add("OBB5");
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		

	}

}
