package rs.ac.ni.pmf.oop2_2026.classes.nested_example;

public interface Scalable
{
	void scale(double coefficient);

	default void printInfo() {
		System.out.println("No info available");
	}
}
