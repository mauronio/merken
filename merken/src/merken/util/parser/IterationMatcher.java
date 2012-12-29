package merken.util.parser;

import java.util.Map;

public class IterationMatcher extends Matcher<Boolean> {

	Matcher iteratingMatcher;
	int minOccurrences;
	
	@Override
	public Boolean eval() throws ParserException {
		Checkpoint cpStart = reader.checkpoint();
		Checkpoint cpLatestGood = reader.checkpoint();
		int occurrences = 1;
		while (iteratingMatcher.eval()!=null) {
			reader.checkpoint(cpLatestGood);
			occurrences++;
		}
		if (occurrences > minOccurrences) {
			reader.jump(cpLatestGood);
			return true;
		} else {
			reader.jump(cpStart);
			return null;
		}
		
	}

	@Override
	public void initialize(Environment env) {
		// TODO Auto-generated method stub
		super.initialize(env);
		iteratingMatcher.initialize(env);
	}

	public IterationMatcher(Matcher iteratingMatcher, int minOccurrences) {
		super();
		this.iteratingMatcher = iteratingMatcher;
		this.minOccurrences = minOccurrences;
	}

	public IterationMatcher(Matcher iteratingMatcher) {
		super();
		this.iteratingMatcher = iteratingMatcher;
		this.minOccurrences = 1;
	}

}
