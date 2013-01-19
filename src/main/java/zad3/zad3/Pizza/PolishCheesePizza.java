package zad3.zad3.Pizza;

import zad3.zad3.StaticConstants;

public class PolishCheesePizza extends Pizza{

	@Override
	public void preparing() {
		System.out.println(StaticConstants.PREPARING_POLISH_CHEESE_PIZZA);
		
	}

	@Override
	public void baking() {
		System.out.println("20 minut pieczenia");
		
	}

}
