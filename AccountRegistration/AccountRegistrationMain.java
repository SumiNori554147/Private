
/*
 このプログラムは名前、生年月日,メールアドレス等の個人情報を登録することを想定しています。
名前→生まれた年→生まれた月→生まれた日→メールアドレスの順に入力することで、
最後に入力した内容が表示されるものです。
 */
public class AccountRegistrationMain {
	public static void main(String[] args) {
		boolean boo1 = true;
		boolean boo2 = true;
		String choose;
		String nameBox[];
		String sb;
		NameRegistration n = new NameRegistration();
		BirthDayRegistration bd = new BirthDayRegistration();
		MailAddressRegistration m = new MailAddressRegistration();
		TimeRegistration tr = new TimeRegistration();

		while (boo1) {
			boo2 = true;

			System.out.println(
					"-----------------------------------------------------------------------------------------");
			System.out.println("アカウントの作成\n");
			System.out.println(" ①  名前を入力してEnterキーを押してください\n");
			n.inputName();

			System.out.println("\n\n\n ②  次は生年月日を入力してください");
			bd.inputBirthYear();
			bd.inputBirthMonth();
			bd.inputBirthDay();

			System.out.println("\n\n\n ③  次はメールアドレスを入力してください");
			m.inputMailAddress();

			System.out.println("あなたが入力した情報は以下でよろしいですか？\n\n");
			nameBox = n.getName();
			sb = String.format("%s年%s月%s日",bd.getBirthYear(),bd.getBirthMonth(),bd.getBirthDay());
			tr.registrationTime();

			System.out.printf (" %-8s %-8s %-22s %-28s \n", nameBox[0], nameBox[1], sb, m.getMailAddress());
			System.out.println("\n\n入力情報が正しければ0を、修正する場合は1を入力してEnterを押してください");
			System.out.print("\n\n→");

			while (boo2) {
				choose = new java.util.Scanner(System.in).nextLine();
				if (choose.equals("0")) {
					boo1 = false;
					boo2 = false;

				} else if (choose.equals("1")) {
					boo2 = false;
				} else {
					System.out.println("\n\n\n\nエラー。0か1を入力してください");
					System.out.print("\n\n→");
				}
			}
		}
System.out.printf("\n\n\n\n\n\n\n\n\nアカウント登録完了(%s)！個人情報くれてありがとう！",tr.getRegistTime());
	}
}