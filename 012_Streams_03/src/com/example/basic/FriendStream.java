package com.example.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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
		
		//using collectors
		Stream<String> friendsStreamWithLength = friends.stream().filter(friend -> friend.length()>3);
		List<String> friendsListWithLength =  friendsStreamWithLength.collect(Collectors.toList());
		System.out.println(friendsListWithLength);
		
		//using collectors in chained way
		List<String> friendsListWithLengthChained = friends.stream().filter(friend -> friend.length()>3).collect(Collectors.toList()); 
		System.out.println(friendsListWithLengthChained);
		
		//using collectors in chained way - multiple conditions in filter
		List<String> multipleChained = friends.stream().filter(friend -> friend.length()>3  && friend.length()<6).collect(Collectors.toList()); 
		System.out.println(multipleChained);
	}

}
