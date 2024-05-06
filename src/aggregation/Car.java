package aggregation;

public class Car {
	private	String carno;
	private String model;
	private String company;
	private String colour;
	
	public String getCarno() {
		return carno;
	}
	public void setCarno(String carno) {
		this.carno = carno;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Car [carno=" + carno + ", model=" + model + ", company=" + company + ", colour=" + colour + "]";
	}
	
}
