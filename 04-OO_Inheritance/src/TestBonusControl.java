
public class TestBonusControl {

	public static void main(String[] args) {
		
		/*
		 * Testing the bonus of a group of people
		 */
		Manager g1 = new Manager();
		g1.setWage(5000.0);
	
		VideoEditor ev = new VideoEditor();
		ev.setWage(2500.0);
		
		Designer d = new Designer();
		d.setWage(2000.0);
		
		BonusControl control = new BonusControl();
		control.register(g1);
		control.register(ev);
		control.register(d);
		
		/*
		 * if this was a real code on a real company
		 * the code above would probally be in a for loop
		 * so you could get everyone in the list without having to add/remove people one by one
		 * 
		 * something like:
		 * for(int i = 0; i <= listOfPeopleInTheCompany.lenght; i++) {
		 * 		controle.register(listOfPeopleInTheCompany[i]);
		 * }
		 */
		
		System.out.println(control.getSum());
		
//		System.out.println("g1 bonus: " + g1.getBonus());
//		System.out.println("ev bonus: " + ev.getBonus());
//		System.out.println("d bonus: " + d.getBonus());
		
	}

}
