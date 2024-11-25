package hw4;

public class p32
{
	public static void main(String[] args) 
	{
		V1[] vc = new V1[2];
		vc[0] = new Car11(1234,20.5);
		vc[1] = new Plane1(232);
		
		for(int i = 0; i <vc.length; i++) {
			if(vc[i] instanceof Car11)
				System.out.println("第" + (i+1) + "個物件是Car類別");
			else
				System.out.println("第" + (i+1) + "個物件不是Car類別");
		}
	}
}

abstract class V1
{
	protected int speed;
	public void setSpeed(int s) {
		speed = s;
		System.out.println("將速度設為" + speed + "了");
	}
	abstract void show();
}

class Car11 extends V1{
	private int num;
	private double gas;
	
	public Car11(int n,double g) 
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "，汽油量為" + gas);
	}
	public void show() {
		System.out.println("賽車為"+ num);
		System.out.println("汽油量是"+ gas);
		System.out.println("速度為"+ speed);
	}
}

class Plane1 extends V1{
	private int flight;
	
	public Plane1(int f) 
	{
		flight = f;
		System.out.println("生產了" + flight + "班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次為"+ flight);
		System.out.println("速度是"+ speed);
	}
}