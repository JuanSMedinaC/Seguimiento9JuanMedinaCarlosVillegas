package ui;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		int q=reader.nextInt();
		int[] query=new int[q];
		long[] second=new long[q];
		int[] time=new int[q];
		long[] sum=new long[q+1];
		sum[0]=0;
		int usedidx=0;
		for (int i=0; i<q;i++) {
			query[i]=reader.nextInt();
			if(query[i]==1) {
				long val=reader.nextLong();
				second[i]=val;
				sum[i+1]=sum[i]+val;
			}
			else {
				second[i]=reader.nextInt();
				sum[i+1]=sum[i];
			}
			
			time[i]=reader.nextInt();
			
		}
		for (int i=0; i<q;i++) {
			if(query[i]==2) {
				usedidx=i;
				int k=(int) (time[usedidx]-second[usedidx]);
				int inicio=0;
				int fin=usedidx;
				int medio=-1;
				int startidx=-1;
				boolean leave=false;
				while (inicio < fin&&leave==false){
		            medio = (inicio + fin + 1)/2;
		            if (time[medio] < k){
		                inicio = medio;
		            }else if (time[medio] >= k){
		                fin = medio - 1;
		            }
		        }
		        if (fin < inicio) {
		        	startidx= -1;
		        } else {
		        	startidx= inicio+2;
		        	leave=true;
		        }
				
		        System.out.println(sum[usedidx+1]-sum[startidx-1]);
				
			}
		}
		
		
		
		
	}
}
