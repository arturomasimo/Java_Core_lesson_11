package lession11_task2;

public class Auto {
	
	private int power;
	private int yearProduction;
	private Helm helm;
	private Engine engine;
	

	public Auto(int power, int yearProduction, Helm helm, Engine engine) {
		super();
		this.power = power;
		this.yearProduction = yearProduction;
		this.helm = helm;
		this.engine = engine;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getYearProduction() {
		return yearProduction;
	}
	public void setYearProduction(int yearProduction) {
		this.yearProduction = yearProduction;
	}
	public Helm getHelm() {
		return helm;
	}
	public void setHelm(Helm helm) {
		this.helm = helm;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Auto [power=" + power + ", yearProduction=" + yearProduction + ", helm=" + helm + ", engine=" + engine
				+ "]";
	}

	
}
