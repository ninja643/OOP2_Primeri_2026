package rs.ac.ni.pmf.oop2_2026.classes.nested_example;

import java.util.List;

public class GeometryMain
{
	private static void printArea(final Figure2D figure)
	{
		final double area = figure.area();
		System.out.println(area);
	}

	public static void main(final String[] args)
	{
		final Figure2D square = new Figure2D(List.of(
				new Figure2D.Point(0, 0),
				new Figure2D.Point(1, 0),
				new Figure2D.Point(1, 1),
				new Figure2D.Point(0, 1)
		));

		printArea(square);

		// Anonymous class example
		printArea(
				new Figure2D(
						List.of(new Figure2D.Point(0, 1),
								new Figure2D.Point(1, 1))) {

					@Override
					public double area()
					{
						System.out.println("Computing length of the line");
						return 0.0;
					}
				}
		);
	}
}
