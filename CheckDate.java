import java.util.Scanner;
public class CheckDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Day: ");
		int day = sc.nextInt();
		sc.nextLine();
		checkDate(day);
	}

	public static void checkDate(int d) {
		switch (d) {
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Day in week!");
				break;
			case 7:
			case 8:
				System.out.println("Weekend!");
				break;
			default:
				System.out.println("Day Wrong!");
				break;
		}
	}
}