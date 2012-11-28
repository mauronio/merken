package merken.util.parser;

import java.util.Map;

public abstract class Matcher<T> {
	
	private CharReader reader;
	private Map context;
	
	public final void initialize(CharReader reader, Map context) {
		this.reader = reader;
		this.context = context;
	}

	public T eval() throws ParserException {
		return null;
	};
	
}
