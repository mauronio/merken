package merken.util.parser;

import java.util.Map;

public interface Environment {
	
	public void initialize();
	public CharReader getReader();
	public Map getContext();
	
	
}
