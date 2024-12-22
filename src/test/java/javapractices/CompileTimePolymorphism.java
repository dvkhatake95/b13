package javapractices;

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child child = new Child();
		child.addition();
		child.addition(10, 20);

	}

	public void addition(int a) {
		System.out.println(a + 2);
	}

	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	public float addition(int a, float b) {
		return a + b;
	}

}

class Child extends CompileTimePolymorphism {

	public void addition() {
		System.out.println("zero argument");
	}

	public float addition(int a, float b, int c) {
		return a + b + c;

	}

}
