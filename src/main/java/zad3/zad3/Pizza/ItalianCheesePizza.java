package zad3.zad3.Pizza;

public class ItalianCheesePizza extends Pizza{

	@Override
	public void preparing() {
		System.out.println("przygotowano włoskie sery.");
		
	}

	@Override
	public void baking() {
		System.out.println("pieczono przez 30 minut");
		
	}

}
