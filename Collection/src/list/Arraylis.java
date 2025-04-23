package list;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylis {
		public static void main(String[] args) {
			ArrayList<Object> sample=new ArrayList<>();
			sample.add("abc");
			sample.add(50);
			sample.add("xyz");
			//print
			System.out.println(sample);
			////to fetch data from index
			System.out.println(sample.get(2));
			//add data by index
			sample.add(2,"mas");
			
			System.out.println(sample);
			
			System.out.println(sample.get(2));
			
			sample.remove(0);//to delete data from index
			System.out.println(sample);
			
			System.out.println(sample.size());
			System.out.println(sample.isEmpty());
			
			ArrayList<Integer> in=new ArrayList<>();
			in.add(1);
			in.add(7);
			in.add(5);
			System.out.println(in);
			Collections.sort(in);
			System.out.println(in);
		
			
		}


}
