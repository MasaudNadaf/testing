package demo;

public class IMp {
public static void main(String[] args) {


String s="Masaud";
int l=s.length();
for(int i=l-1;i>=0;i--)
{
System.out.print(s.charAt(i));
}

System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
int num=100;
while(num>0)
{int rev=num%10;//0

num=num/10;//10
System.out.print(rev);
}
System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//swap
int a=20,b=30,temp;
//with third variable
temp=a;
a=b;
b=temp;
System.out.println(a+"  "+b);

//without third variable
a=a+b;//30+20=50
b=a-b;    //50-20=30
a=a-b;     //50-30=
System.out.println(a+"  "+b);

System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

//array ascending max min
int []no={4,7,6,8,6,3,5,2};
int le=no.length;
for(int i=0;i<le;i++)
{for(int j=i+1;j<le;j++)
{if(no[i]>no[j])//n,n,n,n,n,(4>3)y
 {int tem=no[i];//temp=4
 no[i]=no[j];//no[i]=3
no[j]=tem;//no[j]=4
}
}
}
for(int i=0;i<le;i++)
{
	System.out.print(no[i]);
	
}
System.out.println();
System.out.println(no[0]);
System.out.println(no[no.length-1]);

System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

//fibonacci

int x=0,y=1;
System.out.print(x+"  "+y);
for(int i=1;i<=8;i++)
{int z=x+y;//1
System.out.print("  "+z);
x=y;
y=z;
}





//prime no.
int p=10,flag=0;

for(int i=2;i<p;i++)
{if(p%i==0)
	{System.out.println("no.is not prime");
	flag =1;
	break;
	}
}
if(flag==0)
{
System.out.println("no.is prime");
}






}}
