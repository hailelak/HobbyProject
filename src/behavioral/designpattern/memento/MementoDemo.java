package behavioral.designpattern.memento;

public class MementoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caretaker caretaker = new Caretaker();
		Employee emp = new Employee();
		
		emp.setName("Hailelul");
		emp.setAddress("Center Ave");
		emp.setPhone("111111111111");
		
        System.out.println("Employee before save: "+ emp);
        caretaker.save(emp);
        emp.setPhone("222222222222");
        caretaker.save(emp);
        System.out.println("Employee after new phone save: "+ emp);
        emp.setPhone("333333333333");
        //no save is called here
        caretaker.revert(emp);
        System.out.println("Revert last saved phone: " +emp);
        caretaker.revert(emp);
        System.out.println("Revert again to get the original: " +emp);
        
        
	}

}
