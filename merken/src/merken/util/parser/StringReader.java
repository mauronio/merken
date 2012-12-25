package merken.util.parser;

import java.util.Map;

public class StringReader implements CharReader {

	private char[] text;
	private int index = 0;
	private Map<Checkpoint, Integer> checkPointMap;
	
	public StringReader(String initText, Map<Checkpoint, Integer> checkpointMap) {
		text = initText.toCharArray();
		checkPointMap = checkpointMap;
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
	public Checkpoint checkpoint() {
		Checkpoint newCheckpoint = new Checkpoint();
		checkPointMap.put(newCheckpoint, index);
		return newCheckpoint;
	}

	@Override
	public void checkpoint(Checkpoint checkPoint) {
		checkPointMap.put(checkPoint, index);
	}

	@Override
	public void jump(Checkpoint checkPoint) {
		index = checkPointMap.get(checkPoint);
		checkPointMap.remove(checkPoint);
	}

	@Override
	public void commit(Checkpoint checkPoint) {
		checkPointMap.remove(checkPoint);
	}

	@Override
	public void commit(Checkpoint checkPoint, int offset) {
		checkPointMap.remove(checkPoint);
		index-= offset;
	}

}
