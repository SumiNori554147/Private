
public class NameRegistration {

	private String[] nameBox; //[0]姓 と [1]名前の配列

	public void inputName() {
		boolean boo = true;
		System.out.println(" ＊ 姓と名前の間に空白(スペース)を入力してください ");

		while (boo) {

			System.out.print("\n\n\n\n名前入力→");
			String name = new java.util.Scanner(System.in).nextLine();
			name = (name.replace("　", " ")).trim();
			String[] nameBox = name.split(" ");

			if (nameBox.length <= 1) {
				System.out.println("\n\nエラー！\nちゃんと名前が入力されていません。姓と名前の両方を入力してください。");

			} else if (!(name.matches(".+\\s+.+"))) {
				System.out.println("\n\nエラー！\n空白(スペース)が無いため、姓と名前を判別できません。再度入力し直してください");

			} else if (nameBox.length > 2) {
				System.out.println("\n\nエラー！\n空白(スペース)が2回以上入っています。姓と名前の間に1回だけ入れてください。");

			} else {
				boo = false;
				this.nameBox = nameBox;
			}
		}

		System.out.println("名前の入力完了！\n\n\n");
	}

	public String[] getName() {
		return this.nameBox;
	}
}