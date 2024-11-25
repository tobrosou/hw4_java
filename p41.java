package hw4;

public class p41
{
	public static void main(String[] args) 
	{
		Car13 car1 = new Car13(1234,20.5);
		car1.vShow();
		car1.mShow();
	}
}

interface iV2{
	void vShow();
}
interface iM{
	void mShow();
}

class Car13 implements iV2,iM{
	private int num;
	private double gas;
	
	public Car13(int n,double g) 
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "，汽油量為" + gas);
	}
	public void vShow() {
		System.out.println("車號為"+ num);
		System.out.println("汽油量是"+ gas);
	}
	public void mShow() {
		System.out.println("車子的材料是鐵");
	}
}