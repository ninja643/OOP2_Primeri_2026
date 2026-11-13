package rs.ac.ni.pmf.oop2_2026.classes.nested_example;

public class Figure3D implements Scalable, Movable3D
{
	public static class Point
	{
		double x;
		double y;
		double z;
	}

	@Override
	public void scale(final double coefficient)
	{
		// Scale the points...
		System.out.println("Transforming 3D figure by coefficient: " + coefficient);
	}

	@Override
	public void move(final double x, final double y, final double z)
	{
		//...
	}
}
