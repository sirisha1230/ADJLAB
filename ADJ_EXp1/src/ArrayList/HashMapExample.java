package ArrayList;
import java.util.*;
public class HashMapExample {
	public static void main(String args[]) {
		
		// crreating Hash map
		
		HashMap<Integer,String>i=new HashMap<Integer,String>();
		 //put elements in map
		i.put(1,"Mango");
		i.put(2,"Apple");
		i.put(3,"Banana");
		i.put(1,"Grapes");
		System.out.println("Hashmap elements: "+ i);
		 
		// removal
		i.remove(1);
		System.out.println("After removing elements: "+ i);
	}

}
