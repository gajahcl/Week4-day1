package week4.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class missingelement {

	public static void main(String[] args) {
		
		List<Integer>mis= new ArrayList<Integer>();
		   

		
		mis.add(1);
		mis.add(2);
		mis.add(3);
		mis.add(4);  
		mis.add(10);
		mis.add(6);
		mis.add(8);
		Collections.sort(mis);
		System.out.print("Input in ascending or:");
		for(int i=0;i<mis.size();i++)
		{
			System.out.print(mis.get(i)+" ");
		}
		System.out.println();
		System.out.print("Missing number are:");
		for(int j=0;j<mis.size()-1;j++)
		{
			if(mis.get(j+1)!=mis.get(j)+1)
				
				
			{
				System.out.print(mis.get(j)+1+" ");
			}
		}
	}

}