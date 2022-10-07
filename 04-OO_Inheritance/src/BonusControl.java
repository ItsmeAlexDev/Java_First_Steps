
public class BonusControl {
	
	private double sum;
	
	/*
	 * Setting up a class to control the bonus that all the workers
	 * of this made up company would receive in total 
	 * (every bonus from every worker)
	 */
	public void register(Worker f) {
		double bonus = f.getBonus();
		this.sum = this.sum + bonus;
	}
	
	public double getSum() {
		return sum;
	}

}
