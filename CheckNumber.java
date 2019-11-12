public class CheckNumber {
	public void checkNumber(int n) {
		if (n < 0) {
			return;
		}
		if (n % 2 == 0) {
			System.out.println(n + " là số chẵn!");
		}
		System.out.println(n + " là số lẻ!");
	}
}