package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		
		
		//List<Integer>  list= 
		
				List<String> list = new ArrayList<>();
		
		list.add("Sneha");
		list.add("Apporva");
		list.add("Kalayani");
		for(String s:list)
		
		{
			System.out.println(s);
		}
		
      list = new LinkedList<>();
		
		list.add("Sneha");
		list.add("Apporva");
		list.add("Kalayani");
		for(String s:list)
		
		{
			System.out.println(s);
		}
		
		  list = new Vector<>();
			
			list.add("Sneha");
			list.add("Apporva");
			list.add("Kalayani");
			for(String s:list)
			
			{
				System.out.println(s);
			}
		
		
		
	}

}
