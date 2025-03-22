package MultiLevelInheritance;

public class TextField extends WebElement
{
	public void getText()
	{
		System.out.println("BaseClass2 -> Text");
	}
	public static void main(String[] args)
	{
		TextField t=new TextField();
		t.click();
		t.setText("TextField Class");
		t.getText();
		
		

	}

}
