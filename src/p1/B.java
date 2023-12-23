package p1;

public class B {
	
	public static void main(String[] args) {
		A a1 = (int a, int b)->{
			System.out.println(a);
			System.out.println(b);
		};
		a1.test1(432, 442);
		a1.test2();
	}

}
