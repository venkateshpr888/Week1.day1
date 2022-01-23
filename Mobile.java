package week1.day1;

public class Mobile {
	String sendMsg(String message)
	{
return message;
		}
	private void makeCall()
	{
		String answer ="Call answered";
		System.out.println(answer);
		}
	 void saveContact()
	{
		 boolean contactSaved=true;
		System.out.println(contactSaved);
		}
public static void main(String[] args) {
	Mobile call1 = new Mobile();
//	Student call=new Student();
//	System.out.println(call.college1());
//	call.college("Anna University");
//	System.out.println(call.name);
//	System.out.println(call.rollNum);
	call1.makeCall();
	System.out.println(call1.sendMsg("Hi"));
	call1.saveContact();
	
	
}
}
