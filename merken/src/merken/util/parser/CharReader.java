package merken.util.parser;

public interface CharReader {
	public char readNext();
	public void checkpoint();
	public void commit();
	public void rollback();
}
