package javaPrograms;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int even = 0;
		int odd = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0)
				even++;
		}
		int[] evennum = new int[even];
		int[] oddnum = new int[arr.length - even];
		int l = 0;
		int m = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evennum[l] = arr[i];
				l++;
			} else {
				oddnum[m] = arr[i];
				m++;
			}
		}
		for (Integer ele : evennum) {
			System.out.print(ele + " ");
		}
		System.out.println();
		for (Integer ele : oddnum) {
			System.out.print(ele + " ");
		}

	}

}
