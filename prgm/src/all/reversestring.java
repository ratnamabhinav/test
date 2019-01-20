package all;

public class reversestring{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String string = "My Name is Abhinav Ratnam";
String reverse = new StringBuffer(string).reverse().toString();
System.out.println("The string before reverse" + string);
System.out.println("The string after reverse" + reverse);
	}

}
