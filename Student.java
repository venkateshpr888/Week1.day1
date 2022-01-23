package week1.day1;

public class Student {
	
String name="Venkatesh";
int rollNum=12345;
public void college(String collegeName)
{
	System.out.println(collegeName);
	}
private String college1()
{
	String name1="SRM";
	return name1;
}public static void main(String[] args) {
	Student call=new Student();
	call.college("Anna University");
	System.out.println(call.name);
	System.out.println(call.rollNum);
	System.out.println(call.college1());
	
}
}


