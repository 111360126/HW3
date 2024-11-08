package example;

public class Sample3_2 {
	public static void main(String[] args)
	{
		Car0 car1;
		car1 = new Car0();
		car1.num=1234;
		car1.gas=20.55;
		
		System.out.println("車號是"+car1.num);
		System.out.println("汽油量是"+car1.gas);
	}	
	
}

//Car類別
class Car0
{
	int num;
	double gas;
}
