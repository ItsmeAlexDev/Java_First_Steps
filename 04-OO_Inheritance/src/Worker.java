
//You can NOT instanciate this classe, it's only meant to be used in Inheritance
public abstract class Worker {
	
	private String name;
	private String ssn;
	private double wage;
	
	//abstract method: this is going to be different 
	//in each of the classes that extend "Worker"
	public abstract double getBonus();
	
	//Getters and Setters of the class
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	
}
