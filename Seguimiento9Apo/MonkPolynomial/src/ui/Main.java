package ui;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		int t=reader.nextInt();
		Long[]a=new Long[t];
		Long[]b=new Long[t];
		Long[]c=new Long[t];
		Long[]k=new Long[t];
		
		for (int i=0;i<t;i++) {
			a[i]=reader.nextLong();
			b[i]=reader.nextLong();
			c[i]=reader.nextLong();
			k[i]=reader.nextLong();
		}
		for (int i=0;i<t;i++) {
			Long min=(long) 0;
			Long max=(long) 100000;
			Long answer=(long) -1;
			Long mid=(long) -1;
			while(min<=max) {
				mid=(min+max)/2;
				Long val=(a[i]*mid*mid)+b[i]*mid+c[i];
				Long val1=val;
				if(val1.compareTo(k[i])>=0) {
					answer=mid;
					max=mid-1;
				}
				else {
					min=mid+1;
				}
			}
			System.out.println(answer);
		}
	}
}
