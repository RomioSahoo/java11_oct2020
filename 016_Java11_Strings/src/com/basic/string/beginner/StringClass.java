package com.basic.string.beginner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class StringClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String hello = new String("OBB ");
		String helloAll = hello.repeat(8);
		System.out.println(helloAll);
		
		String multiLine = "Check one \n check two \n check three";
		List<String> multiLineList =   multiLine.lines().collect(Collectors.toList());
		System.out.println(multiLineList);
		
		//write string to file!
		Path myfile = Path.of("hello.txt");
		Files.writeString(myfile, multiLine);
		
		String readFile = Files.readString(myfile);
		System.out.println(readFile);
		

	}

}
