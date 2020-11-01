
public class NameRegistration {

	private String[] nameBox; //[0]姓 と [1]名前の配列

	public String[] NameConfirmation(String inputName) {
		String name = inputName;
		boolean boo = true;
		while (boo) {
			name = (name.replace("　", " ")).trim();
			this.nameBox = name.split(" ");
			if (nameBox.length <= 1) {
				System.out.println("エラー！\nちゃんと名前が入力されていません。姓と名前の両方を入力してください。");
				boo = true;
				System.out.print("\n\n\n\n\n\n名前入力→");
				name = new java.util.Scanner(System.in).nextLine();
			} else if (!(name.matches(".+\\s+.+"))) {
				System.out.println("エラー！\n空白(スペース)が無いため、姓と名前を判別できません。再度入力し直してください");
				boo = true;
				System.out.print("\n\n\n\n\n\n名前入力→");
				name = new java.util.Scanner(System.in).nextLine();

			} else if (!(name.length() > 2)) {
				System.out.println("エラー！\n入力文字が少なすぎます。姓と名前の両方を入力してください。");
				boo = true;
				System.out.print("\n\n\n\n\n\n名前入力→");
				name = new java.util.Scanner(System.in).nextLine();

			} else if (nameBox.length > 2) {
				System.out.println("エラー！\n空白(スペース)が2回以上入っています。姓と名前の間に1回だけ入れてください。");
				boo = true;
				System.out.print("\n\n\n\n\n\n名前入力→");
				name = new java.util.Scanner(System.in).nextLine();

			} else {
				boo = false;

			}
		}
		return this.nameBox;
	}
}