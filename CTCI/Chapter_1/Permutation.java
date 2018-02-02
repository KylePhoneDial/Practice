public class Permutation {

	boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		//Assume ASCII
		char[] chars = new char[128];
		char[] s1_chars = s1.toCharArray();

		for (char c : s1_chars )
			chars[c]++;

		for (int i = 0; i < s2.length(); i++) {
			int c = s2.charAt(i);
			chars[c]--;

			if(chars[c] < 0)
				return false;
		}	

		return true;
	}
}