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
		friends.add(2, "MLANN");
		friends.set(0, "OBBO");
		friends.add(4, "FOOD");	
		friends.remove(0);
		
		friends.forEach(f -> System.out.println(f));
	
		//method reference ->points to the method in functional interface
		//Classname::staticMethodName
		System.out.println("--------------------");
		friends.forEach(System.out::println);
		

	}

}
