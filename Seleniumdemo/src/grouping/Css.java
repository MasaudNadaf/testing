package grouping;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class Css {

	public static void main(String[] args) {
		String s="aaaabb  bcc";int count;
		int l=s.length();
		char ch[]=s.toCharArray();
		for(int i=0;i<l;i++)
			
		{count=1;
			for(int j=i+1;j<l;j++)
			
		{if(ch[i]==ch[j]&&ch[i]!=' ')
		{count++;
		ch[j]=0;
		
		}
			
		}
			if(count > 1 && ch[i]!='0')
				System.out.println(ch[i]);
		}
}
}