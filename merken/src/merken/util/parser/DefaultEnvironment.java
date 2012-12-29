package merken.util.parser;

import java.util.HashMap;
import java.util.Map;

public class DefaultEnvironment implements Environment {

	private CharReader reader;
	private Map context;
	
	@Override
	public void initialize() {
	}

	public void initialize(String initText) {

		Map<Checkpoint, Integer> checkpointMap = new HashMap<Checkpoint, Integer>();

		reader = new StringReader(initText, checkpointMap);
		Map context = new HashMap();
	}

	@Override
	public CharReader getReader() {
		return reader;
	}

	@Override
	public Map getContext() {
		return context;
	}

	public static DefaultEnvironment getInstance() {
		return new DefaultEnvironment();
	}
}
