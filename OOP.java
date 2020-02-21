
/**

	Author       : Tharinda Nimnajith Rajapakshe
	Date Started : 18.04.2019
	Last Updated : 20.04.2019

	--- JAVA Programming ---

 	--- OOP Revision Videos ---
 	--- OOP Lectures ---
 	--- Java Tutorial in SoloLearn ---
 	--- AIE Java Course ---

	Contents:-
		 0.Introduction to Java (JVM, JDK, Java Platform Editions, Java vs. C++, Java Program Patterns, Applets vs. Applications, 
		   Byte Code, Platform Independence, Language Translation, Java Architecture, IDEs, Java Development Environment etc.)
		 1.Comments	
		 2.Basic Programming Concepts in Java (Selection Controlling [if else, switch], Repetition Controlling [do while, while, for
		   for each], calculations etc.) 
		 3.Simple Classes in Java
		 4.Inheritance
		 5.Inheritance - How Constructor Calls Work
		 6.Static Classes and Methods
		 7.Abstract Classes
		 8.Interfaces
		 9.Exception Handling
		10.Exception Handling - Specific Exceptions
		11.Exception Handling - Multiple Exceptions
		12.Exception Handling - User Defined Exceptions
		13.Collections - Introduction and ArrayLists
		14.Collections - ArrayLists using the List and Collection Interfaces
		15.Strings
		16.Arrays
		17.Generics
		18.Threads
		19.Design Patterns
		20.I/O Operations (Printing & Different inputting methods)
		21.OOP Concepts (Abstraction, Inheritance, Encapsulation, Information Hiding, Polymorphism etc.)
		22.Argument passing to the main method
		23.Casting
		24.Wrapper Classes
		25.Variables Types
		26.Primitive Data Types
		27.Access Modifiers
		28.Non-Access Modifiers
		29.Object Creation & Method calling
		30.Object Class
		31.this keyword
		32.super keyword
		33.Packages
		34.Garbage Collection
		35.Objects and Memory
		36.final keyword
		37.Passing Object as a Parameter
		38.Object Parameter to a Constructor
		39.Returning an Object
		40.Passing Objects as References
		41.Overloading
		42.Overriding
		43.Constructors
		44.Java Access Control
		45.Default Packages
		46.Standard Packages
		47.Creating your own packages
		48.Compile time errors
		49.Run time errors
		50.Hierarchy of Java Exception Classes
		51.Error Class
		52.Exception Class
		53.finally
		54.throws
		55.StringBuffer
		56.StringBuilder
		57.String manipulation
		58.String Literals
		59.String Objects
		60.equals() vs. ==
		61.String operations
		62.StringBuffer & StringBuilder operations
		63.List
		64.Queue
		65.Set
		66.HashSet
		67.Map Classes
		68.HashMap
		69.Implementing threads by extending Thread class
		70.Implementing threads by implementing Runnable interface
		71.Thread Synchronization
		72.Thread Synchronization block
		73.Thread Synchronization block with lock change
		74.Thread Join Method
		75.Thread Yield Method
		76.Thread Wait and Notify
		77.Thread notifyAll() Method
		78.Thread Priority
		79.Daemon Threads
		80.Commonly used methods for Thread Class
		81.Generic Classes - Declaration & Instantiation
		82.Generic Methods - Implementation & Invocation
		83.Bounded Type Parameters
		84.Wildcards
		85.Limitation in Generics
		86.Bubble Sort Algorithm
		87.And many more thing related to Java!

*/

/*

																  Introduction

Java is a high level programming language, designed in the early 1990s and released in 1995 by the Sun Microsystems, currently owned by 
Oracle.
First Java was called "Oak" and later the name changed into "Java" which means coffee.
Java is very popular that more than 3 billion devices run Java.
Java has loads of frameworks, libraries, IDEs (Integrated Development Environments: IntelliJ, Netbeans, Eclipse etc.) and development 
tools.
As a full OOP language, Java can be considered as C++ (not a full OOP language) without dynamic memory allocation & pointers.

Java and JavaScript (JS) are two completely different programming languages. Here are some of the differences / similarities of the 2 
languages:-
   1. Java creates a program that runs in a virtual machine or a browser. JS creates a program that runs only on a browser or a server 
      (But now JS supports desktop applications as well).
   2. Java code needs to be compiled. JS code is all in text.
   3. Java is a OOP language. JS is a OOP scripting language.
   4. Java supports both client and server side development. JS used to only support client side development but now JS also support 
      both ends.

Features of Java:-
   1. "Write Once, Run Anywhere" - platform / OS (Operating System) independent (MacOS, Windows, Android, Linux, Unix etc.) - Unlike 
      many other programming languages, including C & C++, when Java is compiled, it is not compiled into platform specific machine, 
      rather into platform independent byte code. This byte code can be distributed over the web and interpreted by JVM (Java Virtual 
      Machine) on whichever platform it is being run on.
   2. Fully OOP (Object Oriented Programming) language (Everything is an object and can easily be extended since it is based on the 
      object model)
   3. Robust, strong & powerful (Eliminate error prone situations by emphasizing mainly on compile time error checking and runtime 
      checking)
   4. Architecture-neutral (Java compiler generates an architecture-neutral object file format, which makes the compiled code executable 
      on many processors, with the presence of Java runtime system)
   5. Portable (Being architecture-neutral and having no implementation dependent aspects of the specification makes Java portable. 
      Java compiler is written in ANCI C with a clean portability boundary, which is a POSIX subset.)
   6. Multithreading (Ability to write programs that can perform many tasks simultaniously, which allows developers to construct 
      interactive applications that run smoothly)
   7. Simple (Easy to learn if you understand the OOP concepts)
   8. Secure (Java enables to develop virus-free & tamper-free systems. Authentication techniques are based on public key encryption.)
   9. Dynamic (Java is considered to be more dynamic than C or C++ since it is designed to adapt to an evolving environment. 
      Java programs can carry extensive amount of run-time information that can be used to verify and resolve accesses to objects 
      on run-time.)
  10. Distributed (Java is designed for the distributed environment of the internet)
  11. High Performance (Java enables high performance with the use of Just-In-Time compilers)
  12. Interpreted (Java byte code is translated on the fly to native machine instructions and is not stored anywhere. The development 
      process is more rapid and analytical since the linking is an incremental and light-weight process.)
  13. Flexible (Ability to fit the needs of any type of application)

Uses of Java:-
   1. Java supports IoT (Internet of Things)
   2. Java simplifies development of real-time software
   3. Java is used to create web applications
   4. Google (Creator of Android OS) specifically recommends Java for Android app development (The core of Android operating system, 
      i.e. the linux based kernel and the system libraries are built in C and C++. Android framework and the user interface (UI)
      of Android is built using Java.)
   5. Java is used for networking, particularly for data centers that store and transfer web-based data
   6. Java is widely used for building applications (media players, antivirus applications, enterprise applications like banking 
      applications etc.) and platforms for a number of devices including desktops computers, smartphones, tablets, laptops, car 
      navigation systems, gaming consoles, blu-ray players, lottery terminals, medical monitering devices and parking meters etc.
   7. Java SE (Java Standard Edition) - For desktop / standalone applications
   8. Java ME (Java Mobile / Micro Edition) - For Android / mobile applications
   9. Java EE (Java Enterprise Edition) - For web / server-side applications

JDK (Java Development Kit) = JRE (Java Runtime Environment) + Java Compiler + etc. --> Made for developers 
JRE = Runtime libraries + JVM + etc. --> Made for normal users

*/

//Importing Java Packages (Libraries)

import java.util.Scanner;
//import java.util.*;

//java.lang.* is automatically loaded (no need to import it manually)
//import java.lang.*;

//Object class is the super class of all java classes
//import java.lang.Object;

import java.util.InputMismatchException;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

//Simple Classes in Java
class Person {
	//Attributes (Data members, Variables, Prooperties, States)

	//Instance variables

	//private String name;
	//private String phoneNo;
	protected String name;
	protected String phoneNo;

	private String ditno;
	//private String batchId;
   	private static String batchId;
   	//public static String batchId;
   	//static String batchId;

   	//static variables
   	//like a global variable but in java they are not called global variables
    //class variable or static variable is how they are called
    //batchId is common to all the persons, so make it static

   	//default constructor
	public Person() {
		System.out.println("Person default constructor");

		name = "";
		phoneNo = "071xxxxxxx";
	}

	//overloaded constructor
	public Person(String name, String phoneNo) {
		System.out.println("Person overloaded constructor");

		this.name = name;
		this.phoneNo = phoneNo;
	}

	//Can have multiple overloaded constructors
	//But only one default constructor
	public Person(String mditno, String mname, String mbatchId) {
    	ditno = mditno;
    	name = mname;
    	batchId = mbatchId;
    }

    //Methods (Functions, Operations, Behaviour)

    //setters (mutators)
    public void setBatchId(String mbatchId) {
    	batchId = mbatchId;
    }

    //getters (accessors)
    public String getBatchId() {
    	return batchId;
    }

    public void setDitNo(String mditno) {
    	ditno = mditno;
    }

    public String getDitNo() {
    	return ditno;
    }

    public void displayDetails() {
    	System.out.println(ditno + " " + name + "  " + batchId);
    }

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void display() {
		System.out.println("Name: " + name + "\nPhone No: " + phoneNo);
	}

	public void displayClass() {
		//
	}

	//Overloaded functions

	public void cal() {
		//
	}

	public void cal(int x) {
		//
	}

	public void cal(double x) {
		//
	}

	public void cal(int x, int y, double z) {
		//
	}

	//static method
    public static void setBatch(String mbatchId) {
    	batchId = mbatchId;

    	//name = "SLIIT";
    	//doesn't word as name is a non-static attribute
    	//static methods only work with static properties
   	}

   	//static block
   	static {
      System.out.println("Just running some static code block with in the Person class \n");
    }
}

//Inheritance
class Student extends Person {
	//If Student class doen't get inherited you can declare variables as private here
	//private int studentId;
	//private float gpa;

	//If Student class also going to get inherited (Have child classes of its own) declare variables as protected here
	protected int studentId;
	protected float gpa;

	public Student() {
		//The parent class constructor is called first when an object of the child class is created
		//After that the child class constructor is created
		//The default constructor of the parent class is automatically called
		//No need to manually call it with super();

		//super();

		System.out.println("Student default constructor"); 
		
		studentId = 0;
		gpa = 2.0f;
	}

	public Student(String name, String phoneNo, int studentId, float gpa) {
		//When not calling the super class overloaded constructor
		//super(name, phoneNo);
		//The super class default constructor is being called automatically
		//The super class overloaded constructor is NOT being called automatically
		//The default constructor of the parent class is called first (before calling the child class overloaded constructor)
		//The values passed for variable declared in the parent class are not assigned
		//The default constructor values of the parent class are assigned

		//When calling the super class overloaded constructor
		//The call to super must be the first statement in the constructor
		//The super class overloaded constructor is being called before the child class overloaded constructor
		//The super class default constructor is NOT being called
		//The values passed for variable declared in the parent class are assigned

		super(name, phoneNo);

		System.out.println("Student overloaded constructor");

		this.studentId = studentId;
		this.gpa = gpa; 
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public float getGpa() {
		return gpa;
	}

	public int getStudentId() {
		return studentId;
	}

	public void display() {
		super.display(); //calling the display() method in the super class

		//System.out.println("Name: " + name + "\nPhone No: " + phoneNo);
		System.out.println("ID: " + studentId + "\nGPA: " + gpa);
	}

	public void displayClass() {
		if(gpa < 3) 
			System.out.println("Pass");
		else
			System.out.println("You have graduated with a class");
	}
}

//Multilevel Inheritance
//Inheritance and how constructor calls work
class PostGraduate extends Student {
	public PostGraduate() {
		System.out.println("PostGraduate default constructor");
	}

	public PostGraduate(String a, String b, int c, float d, double e) {
		super(a, b, c, d);
		System.out.println("PostGraduate overloaded constructor");
	}
}

//Static Classes and Methods
class Utility {
	public static int add(int no1, int no2) {
    	return no1 + no2;
    }
}

//Static Blocks
class Demo {
	private int no;

	//constructor
	public Demo() {
    	System.out.println("DEMO CONSTRUCTOR CALLED");
	}

	//static block
    static {
    	System.out.println("Demo class static block");
    }
}

//Abstract Classes and Abstract Methods
abstract class Shape {
	//Generally, in an inheritance class hierarchy the base class is the class that can be abstract

	/*

	public Shape() {
		//
	}

	*/

	//Method 1

	/*
	
	public int calcArea() {
		return 0;
	}
	
	*/

	//Method 2 - Abstract Methods
	abstract public int calcArea();
	//No need to implement the abstract methods
	//Just the method declaration is enough
	//Sub classes must implement/override the abstract methods in the parent class
	//If a child class doesn't override all the abstract methods of the parent, then the child class also becomes abstract
	//So by having abstract methods you can force the sub classes to implement some specific methods

	//If there is an abstract method in a class, the class must be abstract
	//An abstract class may or may not have abstract methods
	//An abstract class can have both abstract methods & non-abstract methods
}

class Rectangle extends Shape {
	private int length;
	private int width;

	public Rectangle() {
		//
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int calcArea() {
		return length * width;
	}
}

/*

class Square extends Rectangle {
	public Square() {
		//
	}
}

*/

class Square extends Shape {
	public Square() {
		//
	}

	public int calcArea() {
		return 0;
	}
}

class Circle extends Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int calcArea() {
		return (int) (Math.PI * radius * radius);
	}
}

//Interfaces
interface Inter1 {
	//Interfaces are similar to abstract classes but there are clear differences
	//All the methods are defined without a body in interfaces (All are abstract methods)

	int COUNT = 10;
	//Typically there are no properties in interfaces
	//When there are properties, they are usually final properties (like constants) 
	//Interfaces can't contain class/static variables
	//Interfaces can store constants, that essentially are static final variables

	//Methods are public & abstract by default in interfaces even if the access modifier public is not mentioned
	//The classes that implement this interface must implement all the methods of this interface
	void test1();
	void test2();
}

class Test implements Inter1 {
	//Access methods must be public
	public void test1() {}
	public void test2() {}
}

//A class can implement any number of interfaces unlike in inheritance
//class Test implements Inter1, Inter2, Inter3 {}

//Java do not allow multiple inheritance
//class PartTimeStudent extends Employee, Student;

//Java supports multiple interfaces for a simple class
//Classes can extend exactly one class and implement any number of interfaces
//Class PartTimeStudent implements Employee, Student {}

//An interface can extend another interface
//interface Inter1 extends Inter2 {}

//Abstract Classes vs. Interfaces

//Use an abstract class if,
// 1.You want to share the code
// 2.Expect to have common methods or properties
// 3.You want to have access modifiers other than public
// 4.You want to have properties which are not static nor final 

//Use an interface if,
// 1.A set of unrelated classes that have some common methods
// 2.Take advantage of implementing multiple interfaces & multiple inheritance

interface IDisplay {
	void display();
	void displayDetails();
}

class Child implements IDisplay {
	private String name;
	private String mobileNo;

	public Child(String name, String mobileNo) {
		this.name = name;
		this.mobileNo = mobileNo;
	}

	public void display() {
		System.out.println(name + " " + mobileNo + "\n");
	}

	public void displayDetails() {
		System.out.println("Name = " + name);
		System.out.println("Mobile No = " + mobileNo + "\n");
	}

	public void calc() {
		System.out.println("calc function has been executed");
	}
}

class Book implements IDisplay {
	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void display() {
		System.out.println(title + " " + author + "\n");
	}

	public void displayDetails() {
		System.out.println("Title = " + title);
		System.out.println("Author = " + author + "\n");
	}
}

/*

//Modifying the Object class
class Object {
	public void display() {
		//
	}

	public void displayDetails() {
		//
	}
}

*/

class SmallValueException extends Exception {
	public SmallValueException(String err) {
		super(err);
	}
}

class Calc {
	public static float calc(float x, float y) throws SmallValueException {
		float z;

		z = x / y;

		if(z < 0.1) {
			throw new SmallValueException("x and y should be of similar size");
			//generating/throwing the runtime error 
		}

		return z;
	}
}

class Lecturer {
   private String name;

   public Lecturer(String name) {
     this.name = name;
   }

   //Overriding toString() method of the Object class
   public String toString() {
      return this.name;
   }
}

//Main Method
public class OOP {
	//constants
	//cannot be changed later
	final static double pi = 3.142;
	final static int counter = 3;

	//static keyword means the method or attribute doesn't specific to the objects created
	//it is unique to the whole class
	//non-static methods or attributes are unique for each object
	//Hence, non-static methods or attributes are accessed via objects
	//static methods or attributes can be accessed via the class itself (they are also accessible via objects of the class as well)

	public static void main(String[] args) {
		System.out.println("\nHello World! \n");

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++)
				System.out.print("* ");
			for(int j = 1; j < 4; j++)
				System.out.print(" ");
			for(int j = 4; j >= i; j--)
				System.out.print(" ");
			for(int j = -1; j < i; j++)
				System.out.print("* ");
			System.out.println();
		}

		System.out.println();

		String name = "Tharinda Nimnajith";

		String firstName;
		firstName = new String("Tharinda");

		String lastName = new String("Nimnajith");

		System.out.println("Name: " + firstName + " " + lastName + "\n");

		Scanner myVar = new Scanner(System.in);

		System.out.print("Enter a word: ");  //prompt
		String input = myVar.next();  //input
		System.out.println(input);  //printing the input

		System.out.println();

		System.out.print("Enter a word: ");
		System.out.println(myVar.next());      //Read a word and prints the word
		
		System.out.println();
		
		String str = "Hello World! \n 3 + 3.0 = 6.0 true ";

		//create a new scanner with the specified String Object
        Scanner scanner = new Scanner(str);

		//nextLine() -> Read a complete line and prints the complete line		
		//print the next line
      	System.out.println("" + scanner.nextLine());

      	//print the next line again
      	System.out.println("" + scanner.nextLine());

      	//close the scanner
      	scanner.close();
		
		//For other data types:

		//nextInt
		//nextDouble
		//nextFloat 
		//nextByte
		//nextBoolean
		//nextLong
		//nextShort

		//This is a single line comment

		/*

		This is 
			a multiline
				comment in 
						Java

		*/
		
		/** This is a documentation comment
			Used by javadoc tool of the JDK to produce html documentation 
			
			<p>You can use HTML tags inside this as the documentation is auto generated in HTML format</p>

			*You can
			*also use
			*asterisks
			*at the beginning
			*of every line as well
			*of which the javadoc tool will
			*ignore thinking it is meant to be a 
			*square of asterisks covering the comment block
			***********************************************************************     */

		/*

			//	
			//Nested comments
			//Single line comments inside multiline comment is allowed
			//But multiline comment nesting is not allowed
			//

		*/

		//Conditional Statements 
		//Selection control statements (if - else if - else)
	
		//condition ? value1 : value2
		//value1 -> when condition is true, value2 -> when condition is false
		
		System.out.println();

		int y = 9;
		int x1 = y > 3 ? 1 : 0;
		int x2 = (y > 3 ? 1 : 0); //also correct
		System.out.println(x1); //prints 1
		System.out.println(x2); //prints 1

		System.out.println();

		int z = 68;
		System.out.println(z > 0 ? "Positive" : "Negative"); //prints Positive
		
		System.out.println();

		int q1 = true ? 45 : 70; 
		System.out.println(q1); //prints 45

		System.out.println();

		//Nested Statements - ternary operator 
		int a = 48;
		String b = a == 0 ? "Zero" : a > 0 ? "Positive" : "Negative";
		System.out.println(b); //prints Positive

		System.out.println();

		//General format:
		//ClassName objectName = new ClassName();
		//ClassName objectName = new ClassName(parameters);
		Person p1 = new Person("Tharinda", "0712089046");
		p1.display();

		System.out.println();

		Person p2;  //Creating an object variable (Doesn't create an object)
		p2 = new Person();  //Creating the Person class object by calling the constructor of the Person class
		p2.setName("Kamal");
		p2.setPhoneNo("0783920096");
		p2.display();

		System.out.println();

		String Name = p2.getName();
		System.out.println(Name);
		System.out.println(p2.getPhoneNo());

		System.out.println();

		//Creating an array in Java
        int data[];
		data = new int[3];

		data[0] = 9;
		data[1] = 8;
		data[2] = 6;

		//for loop
		for(int i = 0; i < counter; i++)
			System.out.println(data[i]);

		System.out.println();

		//for each loop
		//no index is used here unlike the traditional for loop
		//assigning elements in the data array one after another to n
		for(int n : data)
			System.out.println(n);

		System.out.println();

		//Overloaded functions parameter passing

		Person person1 = new Person();

		person1.cal();
		person1.cal(5);
		person1.cal(6.2);
		person1.cal(5, 10, 2.3);

		//Superclass x = new Superclass();
		//Superclass y = new Subclass();

		Student s1 = new Student();
		s1.display();

		System.out.println();

		Person s2 = new Student();
		s2.display();

		System.out.println();

		Student s3 = new Student("Tharinda", "0712082082", 18149654, 4.1f);
		s3.display();
		s3.displayClass();

		System.out.println();

		Person s4 = new Student("Nuvindu", "0712082082", 18149654, 4.1f);
		s4.display();		
		//As variable s4 is of type Person and method displayClass() is only declared in sub class, it gives an error
		//There are 2 ways to overcome this
		//First one is to override the displayClass() method in the super class with a body (body content doesn't matter)
		//Second one is to cast the Person type object into a Student type object 
		s4.displayClass();

		System.out.println();

		//Second method - casting objects into other types of objects
		Person p;
		p = new Student("Ravishanka", "0774848488", 20202020, 3.5f);
		//This is also correct
		//Person p = new Student("Ravishanka", "0774848488", 20202020, 3.5f);
		p.display();
		//General formatof casting objects
		//Subclass z = (Subclass) super_class_variable
		Student s;
		s = (Student) p;
		//This is also correct
		//Student s = (Student) p; 
		s.displayClass();

		System.out.println();

		PostGraduate g = new PostGraduate();
		//Calls Person, Student, PostGraduate default constructors in that precise order

		System.out.println();

		PostGraduate g1 = new PostGraduate("a", "b", 1, 1.3f, 2.560);
		//Calls Person, Student, PostGraduate overloaded/parameterized constructors in that precise order

		System.out.println();

		Person st1 = new Person("IT17011110", "Amali", "Malabe Batch 4");
	    Person st2 = new Person("IT17031220", "Dinesh", "Malabe Batch 4");
	    Person st3 = new Person("IT17068830", "Lal", "Malabe Batch 4");
	    Person st4 = new Person("IT17082320", "Brinsly", "Malabe Batch 4");
	     
	    //st1.setBatchId("Malabe Weekday Batch 4");
	    //Because batchId is a static variable, changing it for one object, changes it for all the objects

	    //Person.setBatchId("Malabe Weekday Batch 6");
	    //This is not possible
	    //As setBatchId() is not a static method, you have to access it via an object, not via a class
	    //Only static methods, static variables can be accessed via the class name
	    //To access static variables / methods, you don't have to create objects from that class (you can simply use the class name)

	    //st1.batchId = "Malabe Weekday Group 5";
	    //Person.batchId = "MLB Weekday Batch 4";
	    //You can assign like this for the static variable using the class name or one object also, if batchId wasn't private

	    //batchId = "Malabe Weekday Group 5";
	    //also not possible
	    //have to access even static variables via methods or class name	    

	    //Class.static_method();
	    Person.setBatch("Malabe Weekday Group 4");
	    
	    st1.displayDetails();
	    st2.displayDetails();
	    st3.displayDetails();
	    st4.displayDetails();

	    System.out.println();

	    int ans = Utility.add(34, 60);
        System.out.println(ans);

        System.out.println();

        Person person = new Person();

        System.out.println();

        Demo d = new Demo();
        //The code inside the static block is executed before any object is created
        //Hence, the static block is executed before the constructor

        System.out.println();

        //Shape sh = new Shape();
        //Can't create objects from abstract classes
        //But you can create Shape type variables
        //eg: Shape sh; is allowed
        //sh = new Shape(); is not allowed
        //Can create objects of other classes (child classes) using the Shape type variable

        Rectangle r = new Rectangle(10, 5);
        Circle c = new Circle(10);

        //General format:
        //SuperClass variableName = new SubClass();
        Shape sh = new Circle(20);

        System.out.println(sh.calcArea());
        System.out.println(r.calcArea());
        System.out.println(c.calcArea());

        System.out.println();

        Book bk1 = new Book("Famous Five", "Enid Blyton");
        Child ch1 = new Child("John Cena", "0114242424");

        bk1.display();
        bk1.displayDetails();

        ch1.display();
        ch1.displayDetails();
        ch1.calc();

        System.out.println();

        //Possible methods to create objects using interfaces
        //ClassName objectName = new ClassName();
        //InterfaceName objectName = new ClassName();
        //Left hand side can have a class name or an interface name
        //Right hand side must be a constructor call (Class name)

        IDisplay id1;
        id1 = new Book("The Sign of Four", "Arthor Conan Doyle");

        IDisplay id2 = new Child("Daniel Bryan", "0412525254");

        id1.display();
        id1.displayDetails();

        id2.display();
        id2.displayDetails();
        //id2.calc();
        //id2 is a IDisplay type variable
        //Although it is assigned a Child class object, it can't call calc() methods
        //id2 can only call methods that are defined in the IDisplay interface
        //To overcome the issue, you have to create a Child class object and assign id2 to that object using casting
        //The Child class object (In this case cd), can call any object implemented in the Child class including calc()

        Child cd;
        cd = (Child)id2;
       
        cd.display();
        cd.displayDetails();
        cd.calc();

        System.out.println();

        //Creating an array of objects from the IDisplay interface
        IDisplay objs[];
        objs = new IDisplay[7];

        objs[0] = bk1;
        objs[1] = ch1;
        objs[2] = id1;
        objs[3] = id2;
        objs[4] = cd;
        objs[5] = new Book("Harry Potter & the Order of the Phoenix", "JK Rowling");
        objs[6] = new Child("Bill Gates", "0755912972");

        for(int q = 0; q < 7; q++) {
        	objs[q].display();
        	objs[q].displayDetails();
        }

        //Creating objects from the inbuilt Object class of Java (Super class of all the classes)
        for(Object obj : objs) {
        	//obj.display();
        	//obj.displayDetails();

        	//error: incompatible types: IDisplay cannot be converted to Object

        	System.out.println("Hello");
        }

        System.out.println();

        //Using length of array instead of hard-coding the length
        for(int q = 0; q < objs.length; q++) {
        	objs[q].display();
        	objs[q].displayDetails();
        }

        //Using Wrapper Classes
        for(Integer q = 0; q < 7; q++) {
        	objs[q].display();
        	objs[q].displayDetails();
        }

        Child ch[];
        ch = new Child[2];

        ch[0] = ch1;
        ch[1] = cd;

        for(Object obj1 : ch) {
        	//obj1.display();
        	//obj1.displayDetails();

        	//error: incompatible types: Child[] cannot be converted to Object
	        //error: cannot find symbol (method display())
	        //error: cannot fine symbol(method displayDetails())
	        //location: variable obj1 of type Object

        	System.out.println("Hello World!");
        }

        System.out.println();

        //Exception Handling

        int n1, n2, n3, n4;
        
        n1 = 20;
        n2 = 10;
        n3 = 10;

        //n4 = n1 / (n2 - n3);

        //System.out.println(n4);

        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //Run time error
        //No compilation errors
        //Program crashes and doesn't execute the rest of the program
        //To prevent this exception handling is used (try - catch blocks)

        //Syntax:

        /*

        try {
			statement; //generates an exception
			//this is to guard against and handle a run-time error
			//enclose the code you want to monitor inside the try block
			//if there are any run time errors, they are handled in the catch block and the program doesn't crash
        }

        catch {
			statement; //processes the exception
			//specify the exception type you want to catch
			//must immediately follow the try block
        }

        */

        try {
        	n4 = n1 / (n2 - n3);
        } 

        catch (Exception e) {
        	//Exception class in Java catch all the run time errors
        	//Most general way of catching runtime errors

        	System.out.println("There was an error");
        	System.out.println("ERROR: " + e);
        }

        System.out.println("End of the program");

        System.out.println();

        //Most common run-time errors:
        //  1.Dividing by zero
        //  2.Converting invalid string to a number
        //  3.Attempting to use a negative size for an array
        //  4.Accessing an element that is out of the bounds of an array
        //  5.Trying to illegally change the state of a thread
        //  6.Accessing a character that is out of bounds of a string
        //  7.Trying to cast an instance of a class to one of its subclasses
        //  8.Trying to store a value into an array of an incompatible class or type
        //  9.Passing a parameter that is not in a valid range or value for a method
        // 10.Using a null object reference as a legitimate object reference to access a method or a variable

        //Exception Handling - Specific Exceptions

        //Inheritance Hierarchy Example:-
        //ArithmeticException -> RuntimeException -> Exception -> Throwable -> Object
		
        try {
        	n4 = n1 / (n3 - n2);
        }

        catch(ArithmeticException e) {
        	System.out.println("The values of n2 and n3 should be different");
        	System.out.println(e);
        }

        System.out.println("End of the program");

        System.out.println();

        try {
        	int dataArray[];
        	dataArray = new int[10];

        	int element = 30;

        	dataArray[element] = 300;
        }

        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("There are only 10 elements");
        	System.out.println(e);
        }

        System.out.println("End of the program");

        System.out.println();

        //Exception Handling - Multiple Exceptions

        //Write specific exception catch blocks first
        //Only after all the specific exception catch blocks are written write the Exception catch block if needed
        //Then if needed add the finally block
        //The code in the finally block will execute whether there are any exceptions/errors or not
        //finally block usually contains cleaning up operations which should be done whether there were errors or not
        //eg: closing of opened files etc.

        String studentName;
        int value, index;

        Scanner myScanner = new Scanner(System.in);

        try {
        	System.out.print("Enter name: ");
        	studentName = myScanner.next();

        	System.out.println();

        	System.out.print("Enter index: ");
        	index = myScanner.nextInt();

        	System.out.println();

        	System.out.print("Enter value: ");
        	String temp = myScanner.next();

        	System.out.println();

        	//Converting String ino Integer type
        	value = Integer.parseInt(temp);

        	int arr[];
        	arr = new int[5];
        	//arr is a 1D array with 5 elements (size is 5)

        	arr[index] = value;

        	System.out.println(arr[index]);

        	System.out.println();
        }

        catch(InputMismatchException e) {
        	System.out.println("Enter an integer for the index \n" + e + "\n");
        }

        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("Enter a value less than 5 for the index \n" + e + "\n");
        }

        catch(NumberFormatException e) {
        	System.out.println("Enter an integer for the value \n" + e + "\n");
        }

        catch(Exception e) {
        	System.out.println("Some unknown error has occured \n" + e + "\n");
        }

        finally {
        	System.out.println("Finally Block executed \n");

        	//closing the scanner 
            myVar.close(); 
  
            System.out.println("Scanner Closed - Still in the finally block\n"); 
  		}

  		//Code below the finally block also gets executed irrespective of the existance of run time errors
        System.out.println("End of the program");

        System.out.println();

        System.out.println("Trying to use scanner after closing \n"); 
  
  		try {
  			System.out.println("Enter a string : ");
  			//System.out.println(myVar.nextLine());
  			System.out.println(myVar.next());
  		}
  
        catch (Exception e) { 
            System.out.println("Exception thrown \n" + e + "\n"); 
        }

        finally {
        	//finally block is optional
        	System.out.println("Second Finally Block executed \n");
        }

        System.out.println("End of the program");

        System.out.println();

        //Exception Handling - User Defined Exceptions

        //throw and throws (Throwing an exception)

        float j, k, l;

        j = 1;
        k = 10000;

        try {
        	l = Calc.calc(j, k);
        	System.out.println(l);
        }

        /*

        //This also works

        catch(Exception e) {
        	System.out.println("B is too large");
            System.out.println(e);
        }

        */
        
        catch(SmallValueException e) {
        	System.out.println("B is too large");
            System.out.println(e);
        }

        System.out.println();
		
        //Collections - Introduction and ArrayLists

        //The Collections Framework is a sophisticated hierarchy of interfaces and classes
        //java.util package contain all the classes and interfaces for Collection framework

        //Hierarchy of Collections Framework

        //Iterable -> Collection -> List, Queue -> Deque, Set -> SortedSet
        //All above are interfaces

        //Classes that implement above interfaces

        //List -> ArrayList, LinkedList, Vector, Stack
        //Queue -> PriorityQueue
        //Deque -> ArrayDeque, LinkedList
        //Set -> HashSet, LinkedHashSet
        //SortedSet -> TreeSet

        //These are different data structures where you can store data

        //Maps

        //Maps are not part of the Collection Framework
        //A map is an object that stores association between keys and values, or key/value pairs
        //Both keys and values are objects
        //Given a key, you can find its value
        //Keys must be unique, but the values may be duplicated
        //Some maps can accept a null key and null values, others cannot
        //Map is useful if you have to search, update or delete elements on the basis of key
        //Map classes implements map interfaces

        //AbstractMap
        //EnumMap
        //HashMap
        //TreeMap
        //WeakHashMap
        //LinkedHashMap
        //IdentityHashMap

        //Collection Classes
		//ArrayList
		//Wrapper Classes

        //Arrays can only store data of one data type
        //ArrayList can store any value of any data type

        //Both List & Collection interfaces have add() method

        Lecturer lec = new Lecturer("Dilshan");
		ArrayList myList = new ArrayList();

		myList.add(10);
     	myList.add(20);
	    myList.add("SLIIT");
	    myList.add(45.67); 
	    myList.add(lec);

	    for(Object values : myList) {
		    System.out.println(values);
	    }

		/*

		//Warnings:-

		Note: OOP.java uses unchecked or unsafe operations.
		Note: Recompile with -Xlint:unchecked for details.

		*/

	    System.out.println();

	    ArrayList mylist = new ArrayList();
	    
	    mylist.add(10);
	    mylist.add(20);
	    mylist.add(40);
	    mylist.add(50);

	    /*

	    //These two ways don't work:-

	    for(int val : mylist) {
	    	System.out.println(val);
	    }

	    for(Integer val : mylist) {
	    	System.out.println(val);
	    }

	    */

	    //The correct way:-
	    for(Object val : mylist) {
	    	System.out.println(val);
	    }

	    System.out.println();

	    //Write a program to add all numbers stored in an ArrayList
		//lets assume all are integers

	    ArrayList<Integer> list1 = new ArrayList<Integer>();

	    list1.add(10);
	    list1.add(20);
	    list1.add(40);

	    //list1.add("SLIIT");
	    //<Integer> gives compile time errors instead of run-time errors in case of an invalid type data is entered
	    
	    list1.add(50);

	    int total = 0;
	    int val;
	    
	    for(Object no : list1) {
	        //SubClass objName = (SubClass) SuperClass_object
	    	Integer num = (Integer) no;

	        val = num.intValue();
	        //intValue() -> returns the value of a Integer as an int
	        
	        //It is not needed though
	        //Automatically Integer -> int conversion happens
	        //Technically called boxing & unboxing

	    	total = total + val;
	    }

	    System.out.println(total);

	    System.out.println();

	    total = 0;

	    for(Object no : list1) {
	    	Integer num = (Integer) no;
	    	total = total + num;
	    }

	    System.out.println(total);

	    System.out.println();

	    total = 0;

	    for(Integer no : list1) {
	    	//val = no.intValue();
	        //intValue() -> returns the value of a Integer as an int
	        
	        //It is not needed though
	        //Automatically Integer -> int conversion happens
	        //Technically called boxing & unboxing

	    	//total += val;
	        total = total + no;
	    }

	    System.out.println(total);

	    System.out.println();

		//Collections - ArrayLists using the List and Collection Interfaces
        
        //Creating an ArrayList using the Collection and List interfaces
        
        //Syntax:-
        //Iterface var = new Class();

	    //Using Collection interface:-

        Collection<Integer> myList1 = new ArrayList<Integer>();

        myList1.add(10);
     	myList1.add(20);
     	myList1.add(30);
     	myList1.add(50);

     	//System.out.println("Element at index 1 = " + myList1.get(1));
     	//Collection interface doesn't provide get() method

     	for(Integer var : myList1)
        	System.out.println(var);

        System.out.println();

        //Using List interface:-
        
        List<Integer> myList2 = new ArrayList<Integer>();    

	    myList2.add(10);
	    myList2.add(20);
	    myList2.add(30);
	    myList2.add(50);

	    System.out.println("Element at index 1 = " + myList2.get(1));
	    //List interface provides get() method

	    System.out.println();

	    for(Integer var : myList2)
        	System.out.println(var);

        System.out.println();

		//9 different valid variations of creating Array Lists (for Integer type) (creating ArrayList type objects)
		//RHS has to be constructor call
		//LHS can be interface / class
		//Coding to an interface (creating object using an interface) is a popular way of coding
		//If you want to change to a different data structure you justhave to change the name of the class (eg: ArrayList)

    	ArrayList l1 = new ArrayList();
    	ArrayList<Integer> l2 = new ArrayList<Integer>();
    	ArrayList<Integer> l3 = new ArrayList();   
    	// l2 & l3 are equivalant
    	
    	Collection l4 = new ArrayList();
    	Collection<Integer> l5 = new ArrayList<Integer>();
    	Collection<Integer> l6 = new ArrayList();
    	
    	List l7 = new ArrayList();
    	List<Integer> l8 = new ArrayList<Integer>();
    	List<Integer> l9 = new ArrayList();
	}
}
