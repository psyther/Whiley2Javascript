package ast;

import wyil.lang.Codes;

/**
 * Simulates WyIL's goto function
 * @author Carl
 *
 */
public class GoToNode extends AbstractNode {
	String target; //goto label to go to

	public GoToNode(AbstractNode parent, String target){
		super(parent);

		this.target = target;
	}

	public GoToNode(AbstractNode parent, Codes.Goto code) {
		super(parent);

		target = code.target;
	}

	@Override
	public String translate() {
		String val = String.format("%s = '%s';\nbreak;\n", LABEL_VAR, target);
		return val;
	}

}
