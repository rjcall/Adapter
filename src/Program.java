public class Program {
    public static void main(String[] args) {
        Shape myShape = new Rectangle();
        myShape.setLocation();
        myShape.GetLocation();
        myShape.SetColor();
        myShape.display();
        myShape.fill();
        myShape.undisplay();

        System.out.println("------------------------------");

        myShape = new Circle();
        myShape.setLocation();
        myShape.GetLocation();
        myShape.SetColor();
        myShape.display();
        myShape.fill();
        myShape.undisplay();

        System.out.println("------------------------------");

        myShape = new Line();
        myShape.setLocation();
        myShape.GetLocation();
        myShape.SetColor();
        myShape.display();
        myShape.fill();
        myShape.undisplay();

        System.out.println("------------------------------");

        myShape = new Point();
        myShape.setLocation();
        myShape.GetLocation();
        myShape.SetColor();
        myShape.display();
        myShape.fill();
        myShape.undisplay();

        System.out.println("------------------------------");

        XXCircle temp = new XXCircle();
        myShape = new Circle(temp);
        myShape.setLocation();
        myShape.GetLocation();
        myShape.SetColor();
        myShape.display();
        myShape.fill();
        myShape.undisplay();

        System.out.println("------------------------------");

        Shape line = new Line();
        Shape point = new Point();
        Shape rectangle = new Rectangle();
        XXCircle xxCircle = new XXCircle();
        Shape CirlceAdapter = new Circle(xxCircle);

        line.display();
        point.display();
        rectangle.display();
        //call all of XXCircles adapted methods with the adapter calls.
        CirlceAdapter.display();
        CirlceAdapter.SetColor();
        CirlceAdapter.setLocation();
        CirlceAdapter.undisplay();
        CirlceAdapter.display();
    }
}