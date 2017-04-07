import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex extends Solution {
	private Pattern patt ; 
	private Matcher match ;
	private static String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	
	public MyRegex(String ip){
		match = patt.matcher(ip);
	}
	
	public boolean isMatch(){
		return match.matches();
		
	}

}

class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String iP = in.next();
			MyRegex mr = new MyRegex("255.255.255.255");
			System.out.println(mr.isMatch());
		}
		in.close();
	}
}