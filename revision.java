import java.util.Scanner;

final double pi = 3.142;
final int x = 3;

public abstract class Shape {
	//setter
	abstract public void setLength(int length);

	//getter
	public int getLength() {
		return length;
	}
}

public interface IDisplay {
	void display();
	void displayDetails();
	int displayDetails(int i);
}

//public class Rectangle extends Shape {
//public class Rectangle {
public class Rectangle implements IDisplay {
	public void display() {
		//
	}

	public void displayDetails() {
		//
	}

	public int displayDetails(int i) {
		//
	}

	private int length;
	private int width;
	private int area;

	//default constructor
	public Rectangle() {
		super();
		length = 0;
		width = 0;
	}

	//overloaded constructor
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	//setter
	public void setLength(int length) {
		this.length = length;
	}

	//getter
	public int getLength() {
		return length;
	}

	//overloaded functions
	public int getLength(int a) {
		//
	}

	public int getLength(double a) {
		//
	}

	//main function
	public static void main(String args[]) {
		Scanner myscanner = new Scanner(System.in);
		System.out.print("Enter Length: ");
		length = myscanner.nextInt();

		//creating objects 
		Rectangle r = new Rectangle();  
		Rectangle r1 = new Rectangle(10, 5);

		//Shape s = new Shape();
		Shape s = new Rectangle();

		r.setLength(5);
		int ret = r1.getLength();

		int data[];
		data = new int[3];

		data[0] = 9;
		data[1] = 8;
		data[2] = 6;

		//for loop
		for(int i = 0; i < x; i++)
			System.out.println(data[i]);

		//for each loop
		for(int n : data)
			System.out.println(n);

		IDisplay i = new Rectangle();
	}
}
