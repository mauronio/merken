package merken.util.parser;
import java.util.Map;



public class SequenceMatcher extends Matcher<Boolean> {

	Matcher[] matcherList;

	@Override
	public void initialize(Environment env) {
		// TODO Auto-generated method stub
		super.initialize(env);
		for (int k=0; k<matcherList.length; k++) {
			matcherList[k].initialize(env);
		}
	}

	@Override
	public Boolean eval() throws ParserException {
		Boolean result = true;
		
		for (int k=0; k<matcherList.length; k++) {
			if (matcherList[k].eval()==null) {
				result = false;
				break;
			}
		}

		return result;
	}

	public SequenceMatcher(Matcher[] matcherList) {
		super();
		this.matcherList = matcherList;
	}
	
	
}
