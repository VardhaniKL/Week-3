package MultiLevelInheritance;

public class Button extends WebElement
{

		public void Submit()
		{
			System.out.println("SubClass1 -> Submits");	
		}
	public static void main(String[] args) 
	{
		Button b =new Button();
		b.click();
		b.setText("Button -Subclass");;
		b.Submit();
		
	}

}
