package week4.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class interSaction {

	public static void main(String[] args) {
		
		
		
		
		List<Integer> size1=new ArrayList<Integer>();
		size1.add(3);
		size1.add(2);
		size1.add(11);
		size1.add(4);
		size1.add(6);
		size1.add(7);
		List<Integer> size2=new ArrayList<Integer>();
		size2.add(1);
		size2.add(2);
		size2.add(8);
		size2.add(4);
		size2.add(9);
		size2.add(7);
		
		Collections.sort(size1);
		Collections.sort(size2);
		//if we print all number to gether means we should print like this
		//System.out.println("size"+ size1);
	//	System.out.println("size"+size2);
		//if u want to print only common number this could be fine 
		System.out.println("common number are :");
		
		for (int i = 0; i < size1.size(); i++) {
			
			
			for (int j = 0; j < size2.size(); j++) {
			
			
				if(size1.get(i).equals(size2.get(j))){
					System.out.println(size1.get(i));
				}	
				
			}	
		}
		}
}
		
		// TODO Auto-generated method stub

	


