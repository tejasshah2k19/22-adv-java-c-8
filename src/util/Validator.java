package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	public static boolean validAlpha(String str) {

		return str.matches("[a-zA-Z]+");// 1 or many

	}

//AdmIn@12345
	public static int countStrength(String str) {
		// 0 1 2 3 4
		int cnt = 0;
		Pattern d = Pattern.compile("[0-9]");
		Pattern a = Pattern.compile("[a-z]");
		Pattern A = Pattern.compile("[A-Z]");
		Pattern s = Pattern.compile("[@$#%&*]");

		Matcher md = d.matcher(str);
		Matcher ma = a.matcher(str);
		Matcher mA = A.matcher(str);
		Matcher ms = s.matcher(str);

		if (md.find()) {
			cnt++;
		}
		if (ma.find()) {
			cnt++;
		}
		if (mA.find()) {
			cnt++;
		}
		if (ms.find()) {
			cnt++;
		}

		return cnt;

	}

	public static int countDigit(String str) {
		int cnt = 0;
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(str);

		while (m.find()) {
			cnt++;
		}

		return cnt;
		//9826565656 
		
	}
	// ?
	// x -> y chat -> mb price
	// x -> y online -> count online -> minute ->

	// api -> business -> marketing ->

	public static void main(String[] args) {
		System.out.println(Validator.countDigit("r51ty6ui8oi9k"));
		System.out.println(Validator.countStrength("AdmIn@12345"));// 4
		System.out.println(Validator.countStrength("admin@12345"));// 3
		System.out.println(Validator.countStrength("admin12345"));// 2

	}
	// key -> bcrypt -> hi -> mju754esdfyhn ml0987ytredrtyhb nmlp0o8iy6reser567uj
	// -> hi ->kio987656tghjn mkop09uyt54redfgyujmkop098yt67
	// ro1ya3l9
}
