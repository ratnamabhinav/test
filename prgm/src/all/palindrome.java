package all;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int r,temp,sum=0;
 int n= 121;
 temp = n;
 while(n>0)
 {
	 r= n%10 ;
	 sum= sum*10 +r;
	 n=n/10;
 }
 if(temp==sum)
	 System.out.println("The number is palindrome");
	 else
		 System.out.println("The Number is not a palindrome");
	 
 }

	}


