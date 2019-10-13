import java.util.Scanner;

public class SumOfArrayelements {
	public static void main(String[] args) {
		int count;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements you want in array:");
		count=scanner.nextInt();
		int arr[] = new int[count];
		for (int i = 0; i <= arr.length - 1; i++) {
			int order = i + 1;

			System.out.println("Enter number #:" + order);
			boolean isAnInt = scanner.hasNext();
			if (isAnInt) {
				int number = scanner.nextInt();
				arr[i] = number;
			} else {
				System.out.println("number is invalid");
			}
		
		}scanner.close();
		int sum =sumOfArray(arr);
		System.out.println("sum of array elements:"+sum);
	}

	public static int sumOfArray(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;

	}
}
