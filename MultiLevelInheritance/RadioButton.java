package MultiLevelInheritance;

public class RadioButton extends Button
{
	public void selectRadioButton()
	{
		System.out.println("Select radio Button -> Base3");
	}
	public static void main(String[] args) 
	{
		RadioButton r=new RadioButton();
		r.selectRadioButton();
		r.click();
		r.setText("Base3 Radio Button");
		r.Submit();
		
			

	}

}
