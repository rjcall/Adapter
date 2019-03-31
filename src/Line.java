public class Line extends Shape
{
	public Line()
	{
		System.out.println("Creating a new Line");
	}

	@Override
	public void fill()
	{
		System.out.println("In Line.fill()");
	}

	@Override
	public void display()
	{
		System.out.println("In Line.display()");
	}

	@Override
	public void undisplay()
	{
		System.out.println("In Line.undisplay()");
	}
}