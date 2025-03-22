package MultiLevelInheritance;

public class CheckBoxButton extends Button
{
	public void clickCheckButton()
	{
		System.out.println("Click CheckButton ->Button's Derived class");
	}
	public static void main(String[] args) 
	{
		CheckBoxButton c= new CheckBoxButton();
		c.click();
		c.setText("Butons Base class String");
		c.Submit();
		c.clickCheckButton();

	}

}
