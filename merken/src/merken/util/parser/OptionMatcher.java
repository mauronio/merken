package merken.util.parser;
import java.util.Map;



public class OptionMatcher extends Matcher<Boolean> {

	Matcher[] matcherList;
	boolean mandatory;
	
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
		
		Boolean result = false;
		
		for (int k=0; k<matcherList.length; k++) {
			if (matcherList[k].eval()!=null) {
				result = true;
				break;
			}
		}

		if (mandatory) {
			return result;
		} else {
			return true;
		}
	}

	public OptionMatcher(Matcher[] matcherList) {
		super();
		this.matcherList = matcherList;
		this.mandatory = true;
	}

	public OptionMatcher(Matcher[] matcherList, boolean mandatory) {
		super();
		this.matcherList = matcherList;
		this.mandatory = mandatory;
	}

}
