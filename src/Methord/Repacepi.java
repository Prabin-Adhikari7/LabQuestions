package Methord;

public class Repacepi {

	public static void main (String[]args) {
	String s=("this is pirate ship khown as pi");
	System.out.println(s);
}
public static String replace(String str) {
	if(str.length()<2) {
		return str;
	}
	if(str.substring(0,2).equals("pi")) {
		return "3.14"+replace(str.substring(2));
	}
	else {
		return str.charAt(0)+replace(str.substring(1));
	}
	
}
}
