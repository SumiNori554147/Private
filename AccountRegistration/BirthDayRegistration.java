import java.util.Calendar;

public class BirthDayRegistration {

	private int birthYear;
	private int birthMonth;
	private int birthDay;

	public void inputBirthYear() {
		Calendar c = Calendar.getInstance();
		boolean boo = true;
		String Year = "0000";
		System.out.println("生まれた年を半角で入力してください\n\n\n");
		while (boo) {
			System.out.print("\n\n\n\n生まれた年を入力→");
			Year = new java.util.Scanner(System.in).nextLine();

			if (!(Year.matches("\\d{4}"))) {
				System.out.println("\n\nエラー。生まれた年を半角数字4桁で入力してください。");

			} else if (!(1900 < Integer.parseInt(Year) && Integer.parseInt(Year) <= c.get(Calendar.YEAR))) {
				System.out.println("\n\nエラー。" + Year + "年？恐らくあなたは生まれていません。正しく入力してください。");

			} else {
				boo = false;
			}

		}
		this.birthYear = Integer.parseInt(Year);
		System.out.println("生まれた年の入力完了！\n\n\n");

	}

	public void inputBirthMonth() {
		boolean boo = true;
		String birthMonth = "00";
		System.out.println("生まれた月を入力してください\n\n\n");
		while (boo) {
			System.out.print("\n\n\n\n\n\n生まれた月を入力→");
			birthMonth = new java.util.Scanner(System.in).nextLine();
			if (!(birthMonth.matches("\\d{1,2}"))) {
				System.out.println("\n\nエラー。生まれた月は1～12の中で入力してください");

			} else if (!(0 < Integer.parseInt(birthMonth) && Integer.parseInt(birthMonth) < 13)) {
				System.out.println("\n\nエラー。生まれた月が不正です。正しく入力してください。");

			} else {
				boo = false;
			}
		}
		this.birthMonth = Integer.parseInt(birthMonth);
		System.out.println("生まれた月の入力完了！\n\n\n");

	}

	public void inputBirthDay() {
		Calendar c = Calendar.getInstance();
		boolean boo = true;
		String birthDay = "00";
		System.out.println("生まれた月を入力してください\n\n\n");
		c.set(this.birthYear, this.birthMonth - 1, 1);
		int dayMax = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		while (boo) {
			System.out.print("\n\n\n\n\n\n生まれた日を入力→");
			birthDay = new java.util.Scanner(System.in).nextLine();
			if (!(birthDay.matches("\\d{1,2}"))) {
				System.out.println("\n\nエラー。生まれた日を入力してください");
			} else if (!(0 < Integer.parseInt(birthDay) && Integer.parseInt(birthDay) <= dayMax)) {
				System.out.println("\n\nエラー。生まれた日が不正です。正しく入力してください");
			} else {
				boo = false;
			}
		}
		this.birthDay = Integer.parseInt(birthDay);
		System.out.println("生まれた日の入力完了！\n\n\n");

	}

	public int getBirthYear() {
		return this.birthYear;
	}

	public int getBirthMonth() {
		return this.birthMonth;
	}

	public int getBirthDay() {
		return this.birthDay;
	}

}