package javaComposicao.model.entities;

public class Product {
	private String name;
	private Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		setName(name);
		setPrice(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Data product: ");
		builder.append("--------------------------------- ");

		builder.append("Name: ");
		builder.append(this.getName());

		builder.append("Price: ");
		builder.append(this.getPrice());
		return builder.toString();
	}
}