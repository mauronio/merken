package merken.util.parser;

import java.util.HashMap;
import java.util.Map;

public class Session {

	Map<Object, Matcher> matchers = null;
	Map<Object, Object> context = null;

	public Session() {
		matchers = new HashMap<Object, Matcher>();
		context = new HashMap<Object, Object>();
	}

	public void register(Matcher matcher, Object key) {
		matchers.put(key, matcher);
	}
	
	public static Session getDefaultInstance(CharReader reader) {
		
		Session session = new Session();
		return session;
	}
}
