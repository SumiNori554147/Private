package contentConfirmation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CompletionPage")
public class CompletionPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		try {
			File file = new File("アカウント情報.txt");
			FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.write(request.getParameter("infomation") + "\n");
			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<head>");
		out.print("<title>登録完了</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h2>アカウントの登録が完了しました。</h2>");
		out.print("<p>上手くいっていれば、Eclipse.exe(エクリプスのアプリケーションファイル)と同じフォルダの中に、今回あなたが入力したアカウント情報が記載してある「アカウント情報.txt」があるかもです。確認してみてください</p>");
		out.print("</body>");
		out.print("</html>");

	}
}
