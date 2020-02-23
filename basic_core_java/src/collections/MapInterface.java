package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.Get;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stueg
		
		
		Map<Integer,String>data= new HashMap<>();
		
		data.put(1, "Apoorva");
		data.put(2,"Pooja");
		data.put(3, "Prachi");
		data.put(4, "Abhishek");
		data.put(null,"Varsha");
		
		
		
		System.out.println(data.get(null));

	//System.out.println(data.get(1));	
		
	
	/*Set<Integer> set = data.keySet();
	
	for (int key:set)
	{
		System.out.println( data.get(key));
	}*/

	

	}

}
