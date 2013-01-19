package zad3.zad3.Pizza;

public abstract class Pizza {
	
	public abstract void preparing();
	
	public abstract void baking();
	
	public void cutting()
	{
		System.out.println("Pizza jest cięta na kawałki.");
	}
	public void packeging()
	{
		System.out.println("Pizze zapakowano i jest gotowa.");
	}
}
