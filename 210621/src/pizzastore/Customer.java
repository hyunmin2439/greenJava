package pizzastore;

class Pizza {
	private String pizzaName;
	
	// 생성자
	public Pizza(String pizzaName) {
		super();
		this.pizzaName = pizzaName;
	}

	public String getPizzaName() {
		return pizzaName + "피자";
	}
}

public class Customer {
	// field
	private String wishPizza;
	private Pizza pizza;
	
	// constructor : 생성자
	public Customer(String pizzaName) {
		super();
		this.wishPizza = pizzaName;
	}

	// getter / setter
	public String getWishPizza() {
		return wishPizza;
	}

	public void setWishPizza(String wishPizza) {
		this.wishPizza = wishPizza;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
}
