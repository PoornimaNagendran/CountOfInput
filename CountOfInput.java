import java.util.Scanner;
public class CountOfInput {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Count number of numericals,characters,special characters");
System.out.println("Enter the string");
String a=s.nextLine();
int num=0;
int ch=0;
int spch=0;
for(int i=0;i<a.length();i++)
{
	if((int)a.charAt(i)>47 && (int)a.charAt(i)<58)
	{
		num++;
	}
	else if(((int)a.charAt(i)>64 && (int)a.charAt(i)<90) || ((int)a.charAt(i)>96 && (int)a.charAt(i)<123))
	{
		ch++;
	}
	else
	{
		spch++;
	}
}
System.out.println("Number of numericals "+num);
System.out.println("Number of characters "+ch);
System.out.println("Number of special characters "+spch);
	}

}
