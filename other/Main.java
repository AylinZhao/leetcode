import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		String[] s = t.split(" ");
		int[] nums = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			nums[i] = Integer.parseInt(s[i]); 
			// System.out.println(nums[i]);
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}
}


		// while(scan.hasNext()) {
		// 	String s = sc.next();
		// 	int nums[] = transform(s);
		// }
		// public int[] transform(String s) {
		// 	return s.split(" ")
		// }
// Sample Input    
// 2  
// asdfasdf123123asdfasdf  
// asdf111111111asdfasdfasdf  
   
// import java.util.Scanner;  
// public class Main {  
// public static void main(String[] args) {  
// Scanner sc = new Scanner(System.in);  
// int n = sc.nextInt();  
// for(int i=0;i<n;i++){  
// String str = sc.next();  
// ......  
// }  
// }  
// }  
// import java.util.Scanner;  
// public class Main {  
// public static void main(String[] args) {  
// Scanner sc = new Scanner(System.in);  
// int n = Integer.parseInt(sc.nextLine());  
// for(int i=0;i<n;i++){  
// String str = sc.nextLine();  
// ......  
// }  
// }  
// }  