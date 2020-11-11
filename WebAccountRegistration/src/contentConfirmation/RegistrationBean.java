/*
ここで入力された値を管理する。また、誤入力の合否演算処理用のメソッドもここに格納してある。
こののクラスを使用する際は必ずインスタンス化し、セッターゲッターで値の入出力をおこなう。


*/
package contentConfirmation;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Calendar;

public class RegistrationBean implements Serializable {

	private String familyName;
	private String name;
	private String year;
	private String month;
	private String day;
	private String mailAddress;

	public void checkFamilyName() {
		if (familyName.matches(".*\\d.*")) {
			this.familyName = "※姓に数字は対応していません";
		} else if (familyName.trim().matches(" ") || familyName.trim().matches("　")) {
			this.familyName = "※姓の中に空白が入力されています";
		}
	}

	public void checkName() {
		if (name.matches(".*\\d.*")) {
			this.name = "※名前に数字は対応していません";
		} else if (name.trim().matches(" ") || name.trim().matches("　")) {
			this.name = "※名前の中に空白が入力されています";
		}
	}

	public void checkDay() {
		Calendar c = Calendar.getInstance();
		c.set(Integer.parseInt(year), Integer.parseInt(month) - 1, 1);
		int dayMax = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		if (dayMax < Integer.parseInt(day)) {
			this.day = "※その日は存在しません。";
		}
	}

	public void checkYear() {
		LocalDateTime ldt = LocalDateTime.now();
		if (!(1900 <= Integer.parseInt(year) && Integer.parseInt(year) <= ldt.getYear())) {
			this.year = "※あなたは生れていないはずです！";
		}
	}

	public void checkMailAddress() {
		if (!(mailAddress.matches("\\w+@\\w+\\.\\w+"))) {
			this.mailAddress = "※メールアドレスの入力が間違っています。";
		} else if (mailAddress.trim().matches(" ") || mailAddress.trim().matches("　")) {
			this.mailAddress = "※メールアドレスの中に空白が入力されています。";
		}
	}

	public RegistrationBean() {
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String toString() {
		return "姓:" + familyName + "   名:" + name + "   生まれた年:" + year + "   生まれた月:" + day + "   生まれた日:" + month + "   メールアドレス:"
				+ mailAddress;
	}
}
