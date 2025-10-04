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
		Collections.sort(num);
		System.out.print("Input is:");
		for(int i=0;i<num.size();i++)
		{
			System.out.print(num.get(i)+" ");
		}
		System.out.println();
		System.out.print("Output is:");
		for(int j=0;j<num.size()-1;j++)
		{
			if(num.get(j+1)!=num.get(j)+1)
			{
				System.out.print(num.get(j)+1+" ");
			}
		}
	}

}