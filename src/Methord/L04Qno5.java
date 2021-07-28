package Methord;

public class L04Qno5{

	public static void main(String[] args) {
		String n;
		n=middlechar("prabin");
		System.out.println(n);
	}
	public static String middlechar(String str) {
		int length=str.length();
		int mid=length/2;
		if(length%2==0) {
			
			return str.charAt(mid-1)+""+str.charAt(mid);
		}
		else {
			return str.charAt(mid+1)+"";
		}
	}

}
