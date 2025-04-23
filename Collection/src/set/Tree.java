package set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tree {
	public static void main(String[] args) {
		
		TreeSet<Object> st=new TreeSet<>() ;
		st.add(2);
		st.add(6);
		st.add(8);
		st.add(10);
		st.add(7);
		st.add(1);
		st.add(5);
		
		 
		//st.add(null); null not allowed
		//s.add by index not available
		//s.set not avialble
		//it will show in asc
		System.out.println(st);
		System.out.println("size="+st.size());
		
		Iterator<Object> it=st.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
