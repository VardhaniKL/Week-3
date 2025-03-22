package SimpleInheritance;

public class LoginTestData extends TestData
{
	public void enterUsername()
	{
		System.out.println("Derived Class Username");
	}
	public void enterPassword()
	{
		System.out.println("Derived Class Password ");
	}
	public static void main(String[] args) 
	{
		LoginTestData t=new LoginTestData();
		t.enterCredentials();
		t.enterUsername();
		t.enterPassword();
		t.navigateToHomePage();
		

	}

}
