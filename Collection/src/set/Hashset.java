package set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import list.Arraylis;

public class Hashset {
	
	public static void main(String[] args) {
		
		Set<Object> s=new HashSet<>();
		s.add(50);
		s.add(30);
		s.add(20);
		s.add(20);
		s.add("Abc");
		s.add("xyz");
		s.add("Abc");
		
		System.out.println(s.size());
		s.remove("Abc");
		System.out.println(s.isEmpty());
		//s.get not available
		//s.set not available
	
	    System.out.println(s);	
	  Iterator<Object> i=s.iterator();
	  while(i.hasNext())
	  {
		  System.out.println(i.next());	  
		  
	}	
	}

}
