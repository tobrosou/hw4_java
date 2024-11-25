package hw4;

public class p6 {
	public static void main(String[] args) {
		RacingCar1 rccar1 = new RacingCar1(1234,20.5,5);
	}
}

class Car1
{
	private int num;
	private double gas;
	
	public Car1() 
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public Car1(int n,double g) 
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
	}
	
	public void setCar(int n,double g) 
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}
	
	public void show() 
	{
		System.out.println("車號是"+ num);
		System.out.println("汽油量是"+ gas);
	}
}

class RacingCar1 extends Car1{
	private int course;
	
	public RacingCar1() {
		course = 0;
		System.out.println("生產了車子");
	}
	public RacingCar1(int n, double g, int c) {
		super(n,g);
		course = c;
		System.out.println("手產力編號為" + course + "的賽車");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車車號設為"+ course);
	}
}