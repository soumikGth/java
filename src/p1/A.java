package p1;
@FunctionalInterface
public interface A {
	public void test1(int x, int y);
	default void test2() {
		System.out.println(234);
	}

}
