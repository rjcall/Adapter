public class Rectangle extends Shape
{
	public Rectangle()
	{
		System.out.println("Creating a new Rectangle");
	}

	@Override
	public void fill()
	{
		System.out.println("In Rectangle.fill()");
	}

	@Override
	public void display()
	{
		System.out.println("In Rectangle.display()");
	}

	@Override
	public void undisplay()
	{
		System.out.println("In Rectangle.undisplay()");
	}
}