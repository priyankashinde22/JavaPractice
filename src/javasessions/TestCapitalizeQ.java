package javasessions;

public class TestCapitalizeQ {

	public static void main(String[] args) {
		String caps = capitalizeword("anaika priyanka shinde");// Anaika Priyanka Shinde

		System.out.println(caps);//
		caps = capitalizeword("anaika");// Anaika

		System.out.println(caps);

		caps = capitalizeword("a");// A

		System.out.println(caps);
		
		caps = capitalizeword("a a a a");// A A A A

		System.out.println(caps);
		caps = capitalizeword("123");// 123

		System.out.println(caps);
		
		caps = capitalizeword("123 test priyanka");// AnaikaPriyankaShinde

		System.out.println(caps);
	}

	public static String capitalizeword(String str) {
		if(str ==null) {
			System.out.println("null value");
			return str;
		}
		
		if(str.length()==1) {
			return str.toUpperCase();
		}

		String words[] = str.split("\\s");
		String result = "";
		for (String w : words) {
			String first = w.substring(0, 1).toUpperCase();// A
			String restString = w.substring(1);// naika
			result = result + first + restString + " ";// Anaika Priyanka Shinde
		}
		// System.out.println(result);
		return result.trim();

	}

}
