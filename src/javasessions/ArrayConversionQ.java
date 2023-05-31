package javasessions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayConversionQ {

	public static void main(String[] args) {
		String[] arr = { "t", "r", "v" };// trv or t;r;v or t|r|v(join chars
		String join = String.join("|", arr);// (String.join("|",arr))
		System.out.println(join);//1st

		String join1 = Arrays.asList("t", "r", "v", "n", "g").stream().collect(Collectors.joining(";"));
		System.out.println(join1);//2nd

		String join2 = Arrays.asList(1, 2, 3, 4, 5).stream().map(e -> String.valueOf(e))
				.collect(Collectors.joining(";"));
		System.out.println(join2);//3rd

		System.out.println(joinString(";", "a", "b", "c"));//4th
		System.out.println(joinInt("", 1, 2, 3, 4, 5));
	}

	public static String joinString(String seperator, String... values) {
		StringBuilder sb = new StringBuilder();
		int end = 0;
		for (String s : values) {
			if (s != null) {
				sb.append(s);// a;b;c
				end = sb.length();
				sb.append(seperator);
			}
		}
		// return sb.toString();
		return sb.substring(0, end);

	}

	public static String joinInt(String seperator, Integer... values) {
		StringBuilder sb = new StringBuilder();
		int end = 0;
		for (Integer s : values) {
			if (s != null) {
				sb.append(s);// a;b;c
				end = sb.length();
				sb.append(seperator);
			}
		}
		// return sb.toString();
		return sb.substring(0, end);

	}

}
