public abstract class Shape
{
	String location = "0,0";
	String color = "Blue";
	public void setLocation()
	{
		System.out.println("In Shape.setLocation()");
	}

	public void GetLocation()
	{
		System.out.println("In Shape.GetLocation()");
		return;
	}

	public void SetColor()
	{
		System.out.println("In Shape.SetColor()");
	}

	public abstract void fill();
	public abstract void display();
	public abstract void undisplay();
}