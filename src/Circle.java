public class Circle extends Shape
{
	private XXCircle insideCircle;

	public Circle(XXCircle cirice)
	{
		System.out.println("Creating a new Circle");
		insideCircle = cirice;
	}

	public Circle()
	{
		System.out.println("Creating a new Circle");
		insideCircle = new XXCircle();
	}

	@Override
	public void setLocation()
	{
		System.out.println("In Circle.setLocation()");
		insideCircle.SetLocation();
	}

	@Override
	public void GetLocation()
	{
		System.out.println("In Circle.GetLocation()");
		insideCircle.GetLocation();
	}

	@Override
	public void SetColor()
	{
		System.out.println("In Circle.SetColor()");
		insideCircle.SetItsColor();
	}

	@Override
	public void fill()
	{
		System.out.println("In Circle.fill()");
		insideCircle.FillIt();
	}

	@Override
	public void display()
	{
		System.out.println("In Circle.display()");
		insideCircle.DisplayIt();
	}

	@Override
	public void undisplay()
	{
		System.out.println("In Circle.undisplay()");
		insideCircle.UndisplayIt();
	}
}