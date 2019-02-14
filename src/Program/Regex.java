package Program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;


public class Regex {

	public static void main(String[] args) {

		String str = "https://www.amazon.in/Apple-MacBook-Air-13-3-inch-MQD32HN/dp/B073Q5R6VR";
		//Pattern pattern = Pattern.compile("'(.*?)'");
		Pattern pattern = Pattern.compile("in/(.*?)/dp");
		Matcher matcher = pattern.matcher(str);
		if (matcher.find())
		{
		    System.out.println(matcher.group(1));
		}
		
		String str1 = "https:/www.amazon.in/Apple-MacBook-Air-13-3-inch-MQD32HN/dp/B073Q5R6VR";
		String str12 = "<My Name is Avinash Rana<";
		String str122 = "<My Name is Avinash Rana>";
		String str1222 = "<My Name is Avinash Rana> <Avinash Rana>";
		
		String str2 = StringUtils.substringBetween(str1, "/");
		String str123 = StringUtils.substringBetween(str12, "<");
		System.out.println(str2);
		System.out.println(str123);
		
		Pattern pattern1 = Pattern.compile("<(.*?)>");
		Matcher matcher1 = pattern1.matcher(str122);
		if(matcher1.find()) {
			System.out.println(matcher1.group(1));
		}
		
		Pattern pattern12 = Pattern.compile("<(.*?)>");
		Matcher matcher12 = pattern12.matcher(str1222);
		if(matcher12.find()) {
			System.out.println(matcher1.group(1));
		}

	}

}
