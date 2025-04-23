package list;

import java.util.Iterator;
import java.util.LinkedList;

public class Printingtypes {
public static void main(String[] args) {
		
		LinkedList<Object> lk=new LinkedList<>();
		lk.add("y");
		lk.add(9);
		lk.add("a");
		lk.addFirst(null);
		System.out.println(lk);
		//for loop
		for(int i=0;i<lk.size();i++)
		{
		System.out.println(lk.get(i));
		}
		lk.set(2, 98);
		//for each loop
		for(Object var:lk)
		{
			System.out.println(var);
		}
		//by using iterator
		 Iterator<Object> it=lk.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
		 
		

}}
