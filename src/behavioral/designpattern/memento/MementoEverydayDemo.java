package behavioral.designpattern.memento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MementoEverydayDemo {
	
	private static Employee2 deserialize(){
		
		Employee2 emp = null;
		try{
			
			FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			emp = (Employee2) in.readObject();
			in.close();
			fileIn.close();			
		}catch(ClassNotFoundException | IOException e){
			e.printStackTrace();
		}
		
		return emp;
	}

	
	
	private static void serialize(Employee2 emp){
		try{
			
			FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.close();
			fileOut.close();			
		}catch(IOException i){
			i.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 employee = new Employee2();
		employee.setName("Hailelul Teshome");
		employee.setAddress("Methyl Street");
		employee.setPhone("That is my phone");
		
		serialize(employee);
		
		Employee2 newEmployee = deserialize();
		
		System.out.println("The new name is "+newEmployee.getName());

	}

}
