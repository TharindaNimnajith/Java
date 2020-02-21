char arr[] = {'a', 'b', 'c'};
String s = new String(arr);

String s = new String("abc");

String s1 = "abc";
String s2 = "abcdefg";

s.length();
s3 = s1.concat(s2);
s1.toUpperCase();
s1.toLowerCase();
s1.charAt(2);
s1.indexOf('c');
s1.lastIndexOf('c');
s1.replace('a', 'b');
s1.substring(10);
s1.substring(1, 5);


public class MyException extends Exception {
	MyException(String message) {
		super(message);
	}
}

public class Main throws MyException {
	public static void main(String srgs[]) {
		int x = 5, y= 1000;

		try {
			float z = (float) x / (float) y;
			if(z < 0.01) {
				throw new MyException("Number is too small");
			}
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("I am always here");
		}
	}
}


public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> = list1 = new ArrayList<>();
		System.out.println(list1.size());

		List list = new ArrayList();

		list1.add("C");
		list1.add("A");
		list1.add("Z");
		list1.add(1, "A2");

		System.out.println(list1);

		list1.remove("Z");
		list1.remove(2);

		for(String s : list1) {
			System.out.println(s);
		}
	}
}


public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<>();

		hm.put("A", 20.33);
		hm.put("B", new Double(12.35));

	}
}


stack.push("x");
stack.add("x");
stack.pop(); //remove last item

queue.add("x");
queue.peek(); //show first element
queue.poll(); //delete first element

set.add("x");

list.add("x");
list.add(1, "x");
list.set(2, "y");
list.remove(1);
list.remove("x");
list.clear(); //remove all
list.size();
list.ge
t(2);

Object o = list2.get(3);

if(list.contains("John")){
	System.out.println("John is in");
}

map.put("key1", "value1");



