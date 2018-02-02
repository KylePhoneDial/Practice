public class IsUnique {

	boolean isUnique(String s) {

		//Assuming ASCII
		if(s.length() > 128) 
			return false;

		boolean chars[] = new boolean[128];

		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i);

			if (chars[val])
				return false;

			chars[val] = true;
		}

		return true;
	}
}