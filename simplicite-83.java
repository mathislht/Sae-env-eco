package eraser;

public class Eraser {
	public static String erase(String str) {
		String chaine1 = str.replaceAll("   ","%UwU%");
		String chaine2 = chaine1.replaceAll("  ","%00:06%");
		String chaine3 = chaine2.replaceAll(" ","");
		String chaine4 = chaine3.replaceAll("%UwU%","   ");
		String chaine5 = chaine4.replaceAll("%00:06%","  ");
		System.out.println(chaine5);
		return str;
    }
}
