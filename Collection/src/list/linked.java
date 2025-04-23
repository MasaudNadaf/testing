package list;

import java.util.LinkedList;

public class linked {
	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(2);
		ll.addFirst(1);
		ll.addLast(3);
		ll.addLast(4);
		ll.add(5);
		
		System.out.println(ll);
		System.out.println(ll.get(1));
		ll.remove(3);
		System.out.println(ll);
		ll.add(3, 4);
		System.out.println(ll);
		
		for(int i=0;i<ll.size();i++)
		
			if(ll.get(i)==3)
			{System.out.println(ll.indexOf(3));}
			
		
			
		
	}

}
