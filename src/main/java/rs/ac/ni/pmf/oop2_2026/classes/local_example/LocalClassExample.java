package rs.ac.ni.pmf.oop2_2026.classes.local_example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LocalClassExample
{
	private static class Point
	{
		private final int x;
		private final int y;

		public Point(final int x, final int y)
		{
			this.x = x;
			this.y = y;
		}

		public int getX()
		{
			return x;
		}

		public int getY()
		{
			return y;
		}

		@Override
		public String toString()
		{
			return "Point{" +
					"x=" + x +
					", y=" + y +
					'}';
		}
	}

	// If the method is not private, Point would be used outside its defined visibility scope.
	private static void sortByDistance(final List<Point> points, final Point center)
	{
		class DistanceComparator implements Comparator<Point>
		{
			private long squaredDistance(final Point point)
			{
				final long dx = point.getX() - center.getX();
				final long dy = point.getY() - center.getY();

				return dx * dx + dy * dy;
			}

			@Override
			public int compare(final Point first, final Point second)
			{
				return Long.compare(squaredDistance(first), squaredDistance(second));
			}
		}

		points.sort(new DistanceComparator());
	}

	public static void main(final String[] args)
	{
		final List<Point> points = new ArrayList<>(List.of(
				new Point(5,5),
				new Point(2,1),
				new Point(1,3)
		));

		sortByDistance(points, new Point(1,1));

		points.forEach(System.out::println);
	}
}
