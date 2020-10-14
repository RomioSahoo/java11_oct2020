package com.moduletwo.basic;

import com.basic.four.ModuleThreeClassFour;
import com.basic.three.ModuleThreeClassThree;
import com.moduleone.basic.ModuleOneClass;

public class ModuleTwoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModuleOneClass moc = new ModuleOneClass();
		System.out.println(moc.whoami());
		
		ModuleThreeClassThree mtct = new ModuleThreeClassThree();
		System.out.println(mtct.welcomeThree());
		
		ModuleThreeClassFour mtcf = new ModuleThreeClassFour();
		System.out.println(mtcf.welcomeFour());
	
		
	}

}
