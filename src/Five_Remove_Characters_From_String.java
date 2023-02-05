import java.util.regex.*;
class Five_Remove_Characters_From_String
{
	public static String removingUpperCaseCharacters(String str)
	{
		String regex = "[A-Z]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.replaceAll("");
	}
	public static String removingLowerCaseCharacters(String str)
	{
		String regex = "[a-z]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.replaceAll("");
	}
	public static String removingSpecialCharacters(String str)
	{

		String regex = "[^A-Za-z0-9]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.replaceAll("");
	}
	public static String removingNumericCharacters(String str)
	{
        String regex = "[0-9]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.replaceAll("");
	}
	public static String removingNonNumericCharacters(String str)
	{
		String regex = "[^0-9]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.replaceAll("");
	}
	public static void start() {
		System.out.println("\nInside Fifth Module");
		
		String str = "Ab#45ER%6tg5$";

		System.out.println("After Removing Uppercase Characters => " + removingUpperCaseCharacters(str));
		System.out.println("After Removing Lowercase Characters => " + removingLowerCaseCharacters(str));
		System.out.println("After Removing Special Characters => " + removingSpecialCharacters(str));
		System.out.println("After Removing Numeric Characters => " + removingNumericCharacters(str));
		System.out.println("After Removing Non-Numeric Characters => " + removingNonNumericCharacters(str));
	}
}
