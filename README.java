package Main;
	import java.util.Scanner;
	public class Main{
		public static void main(String[]args) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter the size of arrays: ");
			int num=scan.nextInt();
			int[] arr=new int[num];
			System.out.println("Enter the number of array: ");
			for(int i=0;i<arr.length;i++) {
				arr[i]=scan.nextInt();
			}	
			System.out.println("Enter the array:");
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			scan.close();
		}
	}
