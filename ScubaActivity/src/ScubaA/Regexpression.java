package ScubaA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexpression {
	public static void main(String[] args) {
	    Pattern pattern = Pattern.compile("Somewhat some where", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("you can do what you want");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	  }

}
