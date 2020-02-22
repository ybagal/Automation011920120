package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;



public class SetInterface {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<>();
		
		
		set.add("Sneha");
		set.add("Apporva");
		set.add("Kaylani");
		set.add("Sneha");
		set.add("Apoorva");
		
		Iterator<String> it =set.iterator();
		
		while(it.hasNext())
		
		{
			System.out.println(it.next());
			
		}
		
		
		System.out.println("*****************************");
		
		
set = new LinkedHashSet<>();
		
		
		set.add("Sneha");
		set.add("Apporva");
		set.add("Kaylani");
		set.add("Sneha");
		set.add("Apoorva");
		
		 it =set.iterator();
		
		while(it.hasNext())
		
		{
			System.out.println(it.next());
			
		}
		
		
		System.out.println("*****************************");
		
		
set = new TreeSet<>();
		
		
		set.add("Sneha");
		set.add("Apporva");
		set.add("Kaylani");
		set.add("Sneha");
		set.add("Apoorva");
		
		 it =set.iterator();
		
		while(it.hasNext())
		
		{
			System.out.println(it.next());
			
		}
		
		
		System.out.println("*****************************");

		
		
		
		
		
		
		 /* for(String s: set) { System.out.println(s); }
		 */
	}

}
