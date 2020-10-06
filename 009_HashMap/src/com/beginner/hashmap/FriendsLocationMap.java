package com.beginner.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FriendsLocationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> friends = new HashMap<Integer, String>();
		friends.put(1, "OBB");
		friends.put(13, "CAS");
		friends.put(5, "BNP");
		friends.put(17, "OBBO");
		friends.put(9, "MLANN");
		friends.put(1111, "OWIOH");
		
		System.out.println(friends);
		
		System.out.println(friends.get(9));
		
		Set friendsSet = friends.entrySet();
		Iterator friendsIt = friendsSet.iterator();
		while(friendsIt.hasNext()) {
			Entry me = (Entry) friendsIt.next();
			System.out.println(me.getKey() + " and " + me.getValue());
		}
		
		System.out.println("Using TreeMap to sort HashMap:  ");
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>(friends);
		Set treeSet = treemap.entrySet();
		Iterator it = treeSet.iterator();
		while(it.hasNext()) {
			Entry me = (Entry) it.next();
			System.out.println(me.getKey() + " and " + me.getValue());
		}
		
		
	}

}
