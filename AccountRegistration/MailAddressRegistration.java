
public class MailAddressRegistration {

	private String MailAddress;

	public void inputMailAddress() {
		boolean boo = true;
		String mailAddress = "0000";
		while (boo) {
			System.out.print("\n\n\n\n\n\n\nメールアドレス入力→");
			mailAddress = new java.util.Scanner(System.in).nextLine();
			if (!(mailAddress.matches("\\w+@\\w+\\.\\w.+"))) {
				System.out.println("エラー。正しくメールアドレスが入力できていません。");
			} else {
				boo = false;
			}
		}
		this.MailAddress = mailAddress;
		System.out.println("メールアドレスの入力完了！\n\n\n");

	}

	public String getMailAddress() {
		return MailAddress;
	}
}