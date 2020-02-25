package test;

public class Employee {
	String name;
	String surname;
	int id;
	
	public Employee(String name, String surname) {
		this();
		this.name = name;
		this.surname = surname;
		
	}

	 public Employee() {
		 this.id = 0 + (int) (Math.random() * 9);
	    
	 }
	 
	 public String getName() {
	        return name;
	    }
	 public String getSurname() {
	        return surname;
	    }
	 public int getId() {
	        return id;
	    }
	 
	 public void setName(String name) {
	        this.name = name;
	    }
	 public void setSurname(String surname) {
	        this.surname = surname;
	    }
	 public void setId(int id) {
	        this.id = id;
	    }
	 
	public void print() {
		System.out.println("name: "+name);
		System.out.println("surname: "+name);
		System.out.println("id: "+id);
	}
	
}


