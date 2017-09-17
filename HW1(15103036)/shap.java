interface Shape{
	 public void numberOfSides();
}
class Trapezoid implements Shape {
	public void numberOfSides()
	{
		System.out.println("Trapexoid has 4 sides.");
	}

}
class Triangle implements Shape{
	public void numberOfSides()
	{
		System.out.println("Triangle has 3 sides.");
	}

}

class Hexagon implements Shape{
	public void numberOfSides()
	{
		System.out.println("Hexagon has 6 sides.");
	}
}


public class shap{
	public static void main(String[] args)
	{
		Trapezoid ob1=new Trapezoid();
		Triangle ob2 = new Triangle();
		Hexagon ob3=new Hexagon();
		ob1.numberOfSides();
		ob2.numberOfSides();
		ob3.numberOfSides();
	}
}
