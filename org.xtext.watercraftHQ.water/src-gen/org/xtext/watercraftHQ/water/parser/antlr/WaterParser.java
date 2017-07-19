/*
 * generated by Xtext 2.12.0
 */
package org.xtext.watercraftHQ.water.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.watercraftHQ.water.parser.antlr.internal.InternalWaterParser;
import org.xtext.watercraftHQ.water.services.WaterGrammarAccess;

public class WaterParser extends AbstractAntlrParser {

	@Inject
	private WaterGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalWaterParser createParser(XtextTokenStream stream) {
		return new InternalWaterParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Domainmodel";
	}

	public WaterGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WaterGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}