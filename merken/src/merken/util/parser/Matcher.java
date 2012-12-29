package merken.util.parser;

import java.util.Map;

public abstract class Matcher<T> {
	
	protected CharReader reader;
	protected Map context;
	
	public void initialize(Environment env) {
		this.reader = env.getReader();
		this.context = env.getContext();
	}

	public T eval() throws ParserException {
		return null;
	};
	
}
