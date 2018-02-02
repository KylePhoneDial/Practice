public class URLify {
	static public void replaceSpaces(char[] string, int length) {
		int numSpaces = 0, index;

		for (int i = 0; i< length - 1; i++) {
			if(string[i] == ' ')
				numSpaces++;
		}

		index = numSpaces * 2 + length - 1;

		for (int i = length - 1; i >= 0; i--) {
			if (string[i] == ' ') {
				string[index] = '0';
				string[index - 1] = '2';
				string[index - 2] = '%';

				index = index - 3;
			}
			else {
				string[index] = string[i];
				index--;
			}
		}
	}
}