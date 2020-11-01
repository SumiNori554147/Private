
/*
 * このプログラムは名前、生年月日,メールアドレス等の個人情報を登録することを想定しています。
名前→生まれた年→生まれた月→生まれた日→メールアドレスの順に入力することで、
最後に入力した内容が表示されるものです。
 */
public class AccountRegistrationMain {
	public static void main(String[] args) {
		String word;
		String[] registrationName;

		System.out.println(" ①  名前を入力してEnterキーを押してください\n");
		System.out.println(" ＊ 姓と名前の間に空白(スペース)を入力してください ");
		System.out.print("\n\n\n\n名前入力→");
		word = new java.util.Scanner(System.in).nextLine();

		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("アカウントの作成\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

		NameRegistration n = new NameRegistration();
		registrationName = n.NameConfirmation(word);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\nあなたの名前は," + registrationName[0] + " " + registrationName[1] + "です。");
	}
}
