package week4.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class secondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> number= new ArrayList<Integer>();
     number.add(3);
     number.add(2);
     number.add(11);
     number.add(4);
     number.add(6);
     number.add(7);
    Collections.sort(number);
    
    for (int i : number) ;
    	int size=number.size();
    	
    
    for (int i = 0; i < number.size(); i++) {
    	System.out.println(number.get(i));
		
	}
    
    int secoundLargestIndex=size-3;
    System.out.println("The data is"+number.get(secoundLargestIndex));
    
	}

}
