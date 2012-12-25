package merken.util.parser;

import java.util.Map;

public class StringMatcher extends Matcher<String> {

	char[] textToMatch = null;

	@Override
	public String eval() throws ParserException {
		// TODO Auto-generated method stub
		
		int len = textToMatch.length;
		int index = 0;
		Checkpoint cp = reader.checkpoint();
		while (index<len && textToMatch[index++]==reader.readNext());
		
		if (index==len) {
			reader.commit(cp);
			return textToMatch.toString();
		} else {
			reader.jump(cp);
			return null;
		}
		
	}

	public StringMatcher(String text) {
		super();
		this.textToMatch = text.toCharArray();
	}
	
	
	
}
