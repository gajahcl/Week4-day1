package week4.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sstringelements {

	public static void main(String[] args) {
		
		
		//String text= ("HCL, Wipro, Aspire Systems, CTS");
		
		List<String> names=new ArrayList<String>();
		
		names.add("HCL");
		names.add("Wipro");
		names.add("AspipreSytem");
		names.add("CTS");
		Collections.sort(names);
		//printing des order 
		for (int i=names.size()-1;i>=0; i--) 
		{
			
			System.out.print("  "+ names.get(i));
			
		
		
		// TODO Auto-generated method stub

	}
	}
}
