package com.junittest;

import java.lang.reflect.Field;

class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

}

class Manager extends Employee {

	private double bonus;

	public Manager(String name, double salary) {
		super(name, salary);
		bonus = 0;
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bonus);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		if (Double.doubleToLongBits(bonus) != Double.doubleToLongBits(other.bonus))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  super.toString() +  "[bonus=" + bonus + "]";
	}

}

public class InstanceOfTest {
	
	public static void main(String[] args){
		Employee alice1 = new Employee("ALICE", 7000);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("ALICE", 7000);
		Employee bob = new Employee("bob", 5000);
		
		System.out.println(alice1 == alice2); //true 引用相同的对象
	
		System.out.println(alice1 == alice3);//false 引用不同的对象  ==比较了对象的地址
		
		System.out.println(alice1.equals(alice3));//true  首先比较 是否引用同一个地址块、判断对象是否为 null 判断对象类型是否相同 比较值是否相同
		
		System.out.println(alice1.equals(bob));//false	
		
		
		Manager carl = new Manager("CARL", 7000);
		Manager boss = new Manager("BOSS", 7000);
		boss.setBonus(5000);
		
		System.out.println(carl.equals(boss)); //flase
		System.out.println("======================================================");
		
		try {
			Class clazz = bob.getClass();
			Field f = clazz.getDeclaredField("name");
			f.setAccessible(true);
			try {
				System.out.println(f.get(bob));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
