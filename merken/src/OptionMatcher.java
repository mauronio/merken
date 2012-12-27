import java.util.Map;

import merken.util.parser.CharReader;
import merken.util.parser.Matcher;
import merken.util.parser.ParserException;


public class OptionMatcher extends Matcher<Boolean> {

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
		
		Boolean result = false;
		
		for (int k=0; k<matcherList.length; k++) {
			if (matcherList[k].eval()!=null) {
				result = true;
				break;
			}
		}

		return result;
	}

	public OptionMatcher(Matcher[] matcherList) {
		super();
		this.matcherList = matcherList;
	}

}
