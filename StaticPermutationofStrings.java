package day16_17_AlgorithmProgram;

public class StaticPermutationofStrings {

	private static void permutations(String finn, String search) {
		if (search.length() == 0) {
			System.out.println(finn);
		}

		for (int i = 0; i < search.length(); i++) {
			String newCandidate = finn + search.charAt(i);

			String newRemaining = search.substring(0, i) + search.substring(i + 1);

			permutations(newCandidate, newRemaining);
		}
	}

	public static void main(String[] args) {
		String s = "ABC";
		permutations("", s);
	}

}
