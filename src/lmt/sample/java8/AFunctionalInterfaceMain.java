package lmt.sample.java8;

public class AFunctionalInterfaceMain {
	public static void main(String[] args) {
		AFunctionalInterface af = () -> System.out.println("hello from lambda expression");
		af.doTest();
	}
}
