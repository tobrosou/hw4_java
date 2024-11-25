package hw4;

public class p38
{
	public static void main(String[] args) 
	{
		iV1[] ivc = new iV1[2];
		ivc[0] = new Car12(1234,20.5);
		ivc[1] = new Plane2(232);
		
		for(int i = 0; i <ivc.length; i++) {
			ivc[i].show();
		}
	}
}

interface iV1{
	int weight = 1000;
	void show();
}

class Car12 implements iV1{
	private int num;
	private double gas;
	
	public Car12(int n,double g) 
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "，汽油量為" + gas);
	}
	public void show() {
		System.out.println("賽車為"+ num);
		System.out.println("汽油量是"+ gas);
	}
}

class Plane2 implements iV1{
	private int flight;
	
	public Plane2(int f) 
	{
		flight = f;
		System.out.println("生產了" + flight + "班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次為"+ flight);
	}
}