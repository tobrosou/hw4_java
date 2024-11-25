package hw4;

public class p4 {
	public static void main(String[] args) {
		RacingCar rccar1;
		rccar1 = new RacingCar();
		
		rccar1.setCar(1234,20.5);
		rccar1.setCourse(5);
	}
}

class Car{
	private int num;
	private double gas;
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public void setCar(int n,double g) {
		System.out.println("將車號設為" + n + "，汽油量設為" + g);
	}
	public void show() {
		System.out.println("車號是"+ num);
		System.out.println("汽油量是"+ gas);
	}
}

class RacingCar extends Car{
	private int course;
	
	public RacingCar() {
		course = 0;
		System.out.println("生產了車子");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車車號設為"+ course);
	}
}