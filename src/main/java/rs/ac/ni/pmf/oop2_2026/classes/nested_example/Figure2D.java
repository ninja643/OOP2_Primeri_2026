package rs.ac.ni.pmf.oop2_2026.classes.nested_example;

import java.util.List;

public class Figure2D
{
	public static class Point {
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
}
