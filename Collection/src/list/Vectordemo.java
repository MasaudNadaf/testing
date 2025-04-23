package list;

import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
		
		Vector<Object> v=new Vector<>();
		v.add(5);
		v.add("abc");
		v.add(null);
		v.add("xyz");
		v.add("abc");
		
		System.out.println(v);
		System.out.println("size="+v.size());
		v.set(4,"mas");
		
		v.add(5,90);
		v.remove(null);
		
		System.out.println(v);
		
		for(int i=0;i<v.size();i++)
		if(v.contains("xyz")||v.contains(7))
		{
			System.out.println(v.get(i));
		}
		
	}

}
