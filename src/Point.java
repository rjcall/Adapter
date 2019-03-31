public class Point extends Shape
{
	public Point()
	{
		System.out.println("Creating a new Point");
	}

	@Override
	public void fill()
	{
		System.out.println("In Point.fill()");
	}

	@Override
	public void display()
	{
		System.out.println("In Point.display()");
	}

	@Override
	public void undisplay()
	{
		System.out.println("In Point.undisplay()");
	}
}