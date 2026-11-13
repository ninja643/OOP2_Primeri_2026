package rs.ac.ni.pmf.oop2_2026.classes.inner_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ShoppingCart implements Iterable<String>
{
	private final List<String> products = new ArrayList<>();

	public void add(final String product)
	{
		products.add(product);
	}

	@Override
	public Iterator<String> iterator()
	{
		return new CartIterator();
	}

	private class CartIterator implements Iterator<String>
	{
		private int position;

		@Override
		public boolean hasNext()
		{
			return position < products.size();
		}

		@Override
		public String next()
		{
			if (!hasNext())
			{
				throw new NoSuchElementException();
			}

			return products.get(position++);
		}
	}

	public static void main(final String[] args)
	{
		final ShoppingCart cart = new ShoppingCart();
		cart.add("Apple");
		cart.add("Orange");
		cart.add("Water");
		cart.add("Pineapple");

		for (final String product : cart)
		{
			System.out.println(product);
		}
	}
}
