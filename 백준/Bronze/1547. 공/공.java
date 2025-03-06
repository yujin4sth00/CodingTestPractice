import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[3];
		for(int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			swap(a, b, c);
		}
		System.out.println(a[0]);
		sc.close();
	}
	
	public static void swap(int[] a, int b, int c) {
		int startIndex, endIndex;
		
		int i;
		for(i = 0; i < a.length; i++) {
			if(a[i] == b) {
				break;
			}
		}
		startIndex = i;
		
		for(i = 0; i < a.length; i++) {
			if(a[i] == c) {
				break;
			}
		}
		endIndex = i;
		
		int temp = a[startIndex];
		a[startIndex] = a[endIndex];
		a[endIndex] = temp;
	}
}
