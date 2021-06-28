package pizzastore;

class Shef {
	
	// method
	public Pizza cookPizza(String pizzaName) {
		return new Pizza( pizzaName );
	}
	
}

public class Staff {
	// field
	private String pizzaName;
	private Pizza pizza;

	// getter / setter
	public String getPizzaName() {
		return pizzaName;
	}

	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	
	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

}

