package merken.util.parser;

public interface CharReader {
	public char readNext();
	public Checkpoint checkpoint();
	public void checkpoint(Checkpoint checkPoint);
	public void jump(Checkpoint checkPoint);
	public void commit(Checkpoint checkPoint);
	public void commit(Checkpoint checkPoint, int offset);
}
