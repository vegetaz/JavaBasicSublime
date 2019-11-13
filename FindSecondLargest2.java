public class FindSecondLargest2 {
	public static void main (String[] args) {
		int a[] = {34, 34};
		findSecondLargest2(a);
	}
	public static void findSecondLargest2(int a[]) {
		int len = a.length;
        int max1 = a[0];
        int max2 =  a[0];
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                max1 = a[0];
            } else if (a[i] > max1) {
                max1 = a[i];
            }
        }
        for (int i = 0; i < len; i++) {
            if (max2 < a[i] && a[i] < max1) {
                max2 = a[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max1);
        System.out.println("Số lớn thứ 2 trong mảng là: " + max2);
	}
}