package merken.util.parser;

public class StringReader implements CharReader {

	private char[] text;
	private int index = 0;
	private int indexMark = 0;
	
	public StringReader(String initText) {
		text = initText.toCharArray();
	}

	@Override
	public char readNext() {
		if (index<text.length) {
			return text[index++];
		} else {
			return '\0';
		}
	}

	@Override
	public void checkpoint() {
		indexMark = index;
	}

	@Override
	public void commit() {
		if (index>indexMark) {
			indexMark = index - 1;
		}
	}

	@Override
	public void rollback() {
		index = indexMark;
	}

}
