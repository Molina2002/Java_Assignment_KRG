package assignment3;

public class Test {
public static void main(String args[]) throws InterruptedException {
	dostuff();
}
public static void dostuff() throws InterruptedException  {
	demostuff();
}
public static void demostuff() throws InterruptedException {
	Thread.sleep(1000);
}
}
