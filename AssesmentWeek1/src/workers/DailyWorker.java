package workers;

public class DailyWorker  extends Worker{
String name;
int salary;
String type;
	
	

	


	public DailyWorker(String name, int salary, String type) {
	super();
	this.name = name;
	this.salary = salary;
	this.type = type;
}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return " \n name= " + name + "| salary=  " + salary + "| type= " + type ;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
