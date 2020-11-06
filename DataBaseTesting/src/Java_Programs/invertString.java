package Java_Programs;

public class invertString {

	public String invertWithStringBuffer(String str) {

		StringBuffer buffer = new StringBuffer(str);
		buffer.reverse();
		return buffer.toString();
	}

	public String invertWithoutStringBuffer(String str) {

		int length = str.length();
		String original = str;
		String invert = "";
		for (int i = length - 1; i >= 0; i--) {
			invert = invert + original.charAt(i);
		}
		return invert;
	}

	public static void main(String[] args) {

		invertString invertStr = new invertString();

		System.out.println("Inverted String with StringBuffer class: "
				+ invertStr.invertWithStringBuffer("987654321"));

		System.out.println("");

		System.out.println("Inverted String without StringBuffer class: "
				+ invertStr.invertWithoutStringBuffer("kjihgfedcba"));
	}
}