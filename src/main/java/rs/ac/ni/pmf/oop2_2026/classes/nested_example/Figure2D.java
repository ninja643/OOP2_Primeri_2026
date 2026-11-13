package rs.ac.ni.pmf.oop2_2026.classes.nested_example;

import java.util.List;

public class Figure2D implements Scalable, Movable2D
{
	public static class Point
	{
		double x;
		double y;

		public Point(final double x, final double y)
		{
			this.x = x;
			this.y = y;
		}

		public double getX()
		{
			return x;
		}

		public double getY()
		{
			return y;
		}
	}

	private final List<Point> points;

	public Figure2D(final List<Point> points)
	{
		this.points = points;
	}

	public double area()
	{
		System.out.println("Computing area of the figure...");

		return 0.0;
	}

	@Override
	public void scale(final double coefficient)
	{
		// Scale the points...
		System.out.println("Transforming 2D figure by coefficient: " + coefficient);
	}

	@Override
	public void move(final double x, final double y)
	{
		// ...
	}

	@Override
	public void printInfo()
	{
		System.out.println("Some info on figure2D");
	}
}
