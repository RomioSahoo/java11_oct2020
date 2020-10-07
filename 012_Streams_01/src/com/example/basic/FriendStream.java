package com.example.basic;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FriendStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> friends = new ArrayList<String>();
		friends.add("OBB");
		friends.add("BNP");
		friends.add("CAS");
		friends.add("OWIOH");
		friends.add("MLANN");
		friends.add("DUMROO");
		friends.add("CLUSTER");
		friends.add("OKD");
		
		//non-stream way!
		int count = 0;
		for(String s: friends) {
			if(s.length() >3) {
				count++;
			}
		}
		System.out.println("Non-Stream Count of names with length more than three: " + count);
		
		//stream way - long
		Stream<String> friendsStream = friends.stream();
		
		Stream<String> filteredFriendsStream = friendsStream.filter(friend -> friend.length() > 3);

		System.out.println("Stream Count of names with length more than three: " + filteredFriendsStream.count());
		
		//stream way - chain!
		long countFriends = friends.stream().filter(friend -> friend.length()>3).count();
		System.out.println(countFriends);
		
	}

}
