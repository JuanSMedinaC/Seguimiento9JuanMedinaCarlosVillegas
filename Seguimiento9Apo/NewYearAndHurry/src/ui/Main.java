package ui;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		int k=reader.nextInt();
		int minutesLeft=240-k;
		int timeSum=0;
		int counter=0;
		int i=1;
		while (true) {
			if(counter<n) {
				if(timeSum+(5*i)<=minutesLeft) {
					timeSum+=5*i;
					counter++;
				}else {
					break;
				}
				i++;
			}else {
				break;
			}
		}
		System.out.println(counter);
	}

}
