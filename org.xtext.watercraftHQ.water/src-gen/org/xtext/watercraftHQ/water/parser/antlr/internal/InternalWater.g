/*
 * generated by Xtext 2.12.0
 */
grammar InternalWater;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.watercraftHQ.water.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.watercraftHQ.water.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.watercraftHQ.water.services.WaterGrammarAccess;

}

@parser::members {

 	private WaterGrammarAccess grammarAccess;

    public InternalWaterParser(TokenStream input, WaterGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Domainmodel";
   	}

   	@Override
   	protected WaterGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDomainmodel
entryRuleDomainmodel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDomainmodelRule()); }
	iv_ruleDomainmodel=ruleDomainmodel
	{ $current=$iv_ruleDomainmodel.current; }
	EOF;

// Rule Domainmodel
ruleDomainmodel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsComponentParserRuleCall_0());
			}
			lv_elements_0_0=ruleComponent
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getDomainmodelRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.xtext.watercraftHQ.water.Water.Component");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentRule()); }
	iv_ruleComponent=ruleComponent
	{ $current=$iv_ruleComponent.current; }
	EOF;

// Rule Component
ruleComponent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComponentAccess().getWaterClassParserRuleCall_0());
		}
		this_WaterClass_0=ruleWaterClass
		{
			$current = $this_WaterClass_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentAccess().getWaterVariableParserRuleCall_1());
		}
		this_WaterVariable_1=ruleWaterVariable
		{
			$current = $this_WaterVariable_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleWaterClass
entryRuleWaterClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWaterClassRule()); }
	iv_ruleWaterClass=ruleWaterClass
	{ $current=$iv_ruleWaterClass.current; }
	EOF;

// Rule WaterClass
ruleWaterClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='waterClass'
		{
			newLeafNode(otherlv_0, grammarAccess.getWaterClassAccess().getWaterClassKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getWaterClassAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWaterClassRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getWaterClassAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWaterClassAccess().getVariablesWaterVariableParserRuleCall_3_0());
				}
				lv_variables_3_0=ruleWaterVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWaterClassRule());
					}
					add(
						$current,
						"variables",
						lv_variables_3_0,
						"org.xtext.watercraftHQ.water.Water.WaterVariable");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getWaterClassAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleWaterVariable
entryRuleWaterVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWaterVariableRule()); }
	iv_ruleWaterVariable=ruleWaterVariable
	{ $current=$iv_ruleWaterVariable.current; }
	EOF;

// Rule WaterVariable
ruleWaterVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='waterVariable'
		{
			newLeafNode(otherlv_0, grammarAccess.getWaterVariableAccess().getWaterVariableKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getWaterVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWaterVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
