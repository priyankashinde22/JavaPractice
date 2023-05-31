package javasessions;

public class TestQue {

	public static void main(String[] args) {
		String x ="abc";
		String y ="abc";
		String z =x.concat(y);
		System.out.println(x);//Strings are immutable
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
	}

}
