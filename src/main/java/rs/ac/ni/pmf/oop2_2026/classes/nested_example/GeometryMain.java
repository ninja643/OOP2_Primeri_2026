package rs.ac.ni.pmf.oop2_2026.classes.nested_example;

import java.util.List;

public class GeometryMain
{
	private static void printArea(final Figure2D figure)
	{
		final double area = figure.area();
		System.out.println(area);
	}

	private static void scaleFigures(
			final double coefficient,
			final Scalable... scalableFigures)
	{
		for (final Scalable scalableFigure : scalableFigures)
		{
			scalableFigure.scale(coefficient);
			scalableFigure.printInfo();
		}
	}

	public static void main(String[] args)
	{
		final Figure2D figure1 = new Figure2D(List.of(
				new Figure2D.Point(0, 0),
				new Figure2D.Point(1, 0),
				new Figure2D.Point(1, 1),
				new Figure2D.Point(0, 1)
		));

		final Figure3D figure2 = new Figure3D();

		figure1.scale(0.5);
		figure1.move(0.5, 0.5);

		figure2.scale(2.0);
		figure2.move(1.0, 4.3, 2.2);


		scaleFigures(2.0, figure1, figure2);
	}

	public static void main1(final String[] args)
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
								new Figure2D.Point(1, 1)))
				{

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
