/*  RegistrationPage.html より

    このページは演算処理の総括をするページであり、サイトページはありません。

    入力画面で入力されたアカウント情報をこのサーブレットで受け取り、JavaBeans(ジャバビーンズ)という仕様の
    クラスに各情報を送って(セッター),演算処理(checkメソッドで誤入力合否演算)してもらう。

    最後に、演算処理で行った各情報の誤入力の合否判定を確認し(ゲッター)、全て問題なければリザルトページへ。
    一つでも問題があればエラー再入力ページへ飛ぶ。


問題なしの場合 → resultPage.jsp のJSPへ        問題ありの場合 → errorResultPage.jsp のJSPへ
*/
package contentConfirmation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConfirmationMain")
public class ConfirmationMain extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String familyName = request.getParameter("familyName");
		String name = request.getParameter("name");
		String day = request.getParameter("day");
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String mailAddress = request.getParameter("mailAddress");
		RegistrationBean rb = new RegistrationBean();
		boolean boo = true;

		rb.setFamilyName(familyName);
		rb.setName(name);
		rb.setDay(day);
		rb.setMonth(month);
		rb.setYear(year);
		rb.setMailAddress(mailAddress);

		rb.checkFamilyName();
		rb.checkName();
		rb.checkDay();
		rb.checkYear();
		rb.checkMailAddress();

		if (!(familyName == rb.getFamilyName())) {
			boo = false;
		}
		if (!(name == rb.getName())) {
			boo = false;
		}
		if (!(day == rb.getDay())) {
			boo = false;
		}
		if (!(month == rb.getMonth())) {
			boo = false;
		}
		if (!(year == rb.getYear())) {
			boo = false;
		}
		if (!(mailAddress == rb.getMailAddress())) {
			boo = false;
		}

		if (boo) {
			request.setAttribute("rb", rb);
			RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/jsp/resultPage.jsp");
			dis.forward(request, response);
		} else {
			request.setAttribute("rb", rb);
			RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/jsp/errorResultPage.jsp");
			dis.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String familyName = request.getParameter("familyName");
		String name = request.getParameter("name");
		String day = request.getParameter("day");
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String mailAddress = request.getParameter("mailAddress");
		RegistrationBean rb = new RegistrationBean();
		boolean boo = true;

		rb.setFamilyName(familyName);
		rb.setName(name);
		rb.setDay(day);
		rb.setMonth(month);
		rb.setYear(year);
		rb.setMailAddress(mailAddress);

		rb.checkFamilyName();
		rb.checkName();
		rb.checkDay();
		rb.checkYear();
		rb.checkMailAddress();

		if (!(familyName == rb.getFamilyName())) {
			boo = false;
		}
		if (!(name == rb.getName())) {
			boo = false;
		}
		if (!(day == rb.getDay())) {
			boo = false;
		}
		if (!(month == rb.getMonth())) {
			boo = false;
		}
		if (!(year == rb.getYear())) {
			boo = false;
		}
		if (!(mailAddress == rb.getMailAddress())) {
			boo = false;
		}

		if (boo) {
			request.setAttribute("rb", rb);
			RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/jsp/resultPage.jsp");
			dis.forward(request, response);
		} else {
			request.setAttribute("rb", rb);
			RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/jsp/errorResultPage.jsp");
			dis.forward(request, response);
		}
	}
}
