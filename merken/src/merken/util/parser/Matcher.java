package merken.util.parser;

import java.util.Map;

public abstract class Matcher<T> {
	
	protected CharReader reader;
	protected Map context;
	
	public void initialize(CharReader reader, Map context) {
		this.reader = reader;
		this.context = context;
	}

	public T eval() throws ParserException {
		return null;
	};
	
}
