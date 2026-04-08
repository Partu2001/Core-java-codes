package inheritance;
public class MainEmployee {
	public static void main(String[] args) {
	    
		Manager m=new Manager();
		m.acceptPerson();
		m.acceptEmployee();
		m.acceptManager();
		m.displayPerson();
		m.displayEmployee();
		m.displayManager();
		
		Developer d=new Developer();
		d.acceptPerson();
		d.acceptEmployee();
		d.acceptDeveloper();
		d.displayPerson();
		d.displayEmployee();
		d.displayDeveloper();
		// TODO Auto-generated method stub
	}
}
