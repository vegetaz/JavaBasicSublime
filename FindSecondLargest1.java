public class FindSecondLargest1 {
	public static void main (String[] args) {
		int a[] = {34, 34};
		findSecondLargest1(a);
	}
	public static void findSecondLargest1(int arr[]) {
		int i = 0;
		int max1 = arr[0];
		int max2 = arr[0];
		int len = arr.length;
		if (len < 2) {
			System.out.println("Invalid Input");
			return;
		}
		for (i = 0; i < len; i++) {
			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			} else if (max2 < arr[i] && arr[i] < max1) {
				max2 = arr[i];
			}
		}
		if (max2 == max1) {
			System.out.print("There is no second largest" + " element\n");
		} else {
			System.out.print("The second largest element" + " is "+ max2 + "\n");
		}

	}
}