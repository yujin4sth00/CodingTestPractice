import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a<1024) {
			System.out.println("No thanks");
		}else {
			int needMoney = a-1023;
			int borrowMoney = b;
			if((needMoney&borrowMoney) == needMoney) {
				System.out.println("Thanks");
			}else{
				System.out.println("Impossible");
			}
			
		}
		
	}
	
	
}