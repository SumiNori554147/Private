import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeRegistration {

	private String registrationTime;

	public void registrationTime() {
		SimpleDateFormat f = new SimpleDateFormat(yyyyMMdd HHmmss);
		Date now = new Date();
		this.registrationTime = f.format(now);
	}

	public String getRegistTime() {
		return registrationTime;
	}

}
