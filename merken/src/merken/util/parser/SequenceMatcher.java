package merken.util.parser;
import java.util.Map;



public class SequenceMatcher extends Matcher<Boolean> {

	Matcher[] matcherList;

	@Override
	public void initialize(CharReader reader, Map context) {
		// TODO Auto-generated method stub
		super.initialize(reader, context);
		for (int k=0; k<matcherList.length; k++) {
			matcherList[k].initialize(reader, context);
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
