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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWaterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'waterClass'", "'{'", "'}'", "'waterVariable'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalWaterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWaterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWaterParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWater.g"; }



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




    // $ANTLR start "entryRuleDomainmodel"
    // InternalWater.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalWater.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalWater.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalWater.g:71:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleComponent ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalWater.g:77:2: ( ( (lv_elements_0_0= ruleComponent ) )* )
            // InternalWater.g:78:2: ( (lv_elements_0_0= ruleComponent ) )*
            {
            // InternalWater.g:78:2: ( (lv_elements_0_0= ruleComponent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWater.g:79:3: (lv_elements_0_0= ruleComponent )
            	    {
            	    // InternalWater.g:79:3: (lv_elements_0_0= ruleComponent )
            	    // InternalWater.g:80:4: lv_elements_0_0= ruleComponent
            	    {

            	    				newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsComponentParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleComponent();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.watercraftHQ.water.Water.Component");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleComponent"
    // InternalWater.g:100:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalWater.g:100:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalWater.g:101:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalWater.g:107:1: ruleComponent returns [EObject current=null] : (this_WaterClass_0= ruleWaterClass | this_WaterVariable_1= ruleWaterVariable ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_WaterClass_0 = null;

        EObject this_WaterVariable_1 = null;



        	enterRule();

        try {
            // InternalWater.g:113:2: ( (this_WaterClass_0= ruleWaterClass | this_WaterVariable_1= ruleWaterVariable ) )
            // InternalWater.g:114:2: (this_WaterClass_0= ruleWaterClass | this_WaterVariable_1= ruleWaterVariable )
            {
            // InternalWater.g:114:2: (this_WaterClass_0= ruleWaterClass | this_WaterVariable_1= ruleWaterVariable )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWater.g:115:3: this_WaterClass_0= ruleWaterClass
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getWaterClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WaterClass_0=ruleWaterClass();

                    state._fsp--;


                    			current = this_WaterClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWater.g:124:3: this_WaterVariable_1= ruleWaterVariable
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getWaterVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WaterVariable_1=ruleWaterVariable();

                    state._fsp--;


                    			current = this_WaterVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleWaterClass"
    // InternalWater.g:136:1: entryRuleWaterClass returns [EObject current=null] : iv_ruleWaterClass= ruleWaterClass EOF ;
    public final EObject entryRuleWaterClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaterClass = null;


        try {
            // InternalWater.g:136:51: (iv_ruleWaterClass= ruleWaterClass EOF )
            // InternalWater.g:137:2: iv_ruleWaterClass= ruleWaterClass EOF
            {
             newCompositeNode(grammarAccess.getWaterClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWaterClass=ruleWaterClass();

            state._fsp--;

             current =iv_ruleWaterClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWaterClass"


    // $ANTLR start "ruleWaterClass"
    // InternalWater.g:143:1: ruleWaterClass returns [EObject current=null] : (otherlv_0= 'waterClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleWaterVariable ) )* otherlv_4= '}' ) ;
    public final EObject ruleWaterClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalWater.g:149:2: ( (otherlv_0= 'waterClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleWaterVariable ) )* otherlv_4= '}' ) )
            // InternalWater.g:150:2: (otherlv_0= 'waterClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleWaterVariable ) )* otherlv_4= '}' )
            {
            // InternalWater.g:150:2: (otherlv_0= 'waterClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleWaterVariable ) )* otherlv_4= '}' )
            // InternalWater.g:151:3: otherlv_0= 'waterClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleWaterVariable ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWaterClassAccess().getWaterClassKeyword_0());
            		
            // InternalWater.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWater.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWater.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalWater.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWaterClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWaterClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getWaterClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWater.g:177:3: ( (lv_variables_3_0= ruleWaterVariable ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWater.g:178:4: (lv_variables_3_0= ruleWaterVariable )
            	    {
            	    // InternalWater.g:178:4: (lv_variables_3_0= ruleWaterVariable )
            	    // InternalWater.g:179:5: lv_variables_3_0= ruleWaterVariable
            	    {

            	    					newCompositeNode(grammarAccess.getWaterClassAccess().getVariablesWaterVariableParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_variables_3_0=ruleWaterVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWaterClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_3_0,
            	    						"org.xtext.watercraftHQ.water.Water.WaterVariable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWaterClassAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWaterClass"


    // $ANTLR start "entryRuleWaterVariable"
    // InternalWater.g:204:1: entryRuleWaterVariable returns [EObject current=null] : iv_ruleWaterVariable= ruleWaterVariable EOF ;
    public final EObject entryRuleWaterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaterVariable = null;


        try {
            // InternalWater.g:204:54: (iv_ruleWaterVariable= ruleWaterVariable EOF )
            // InternalWater.g:205:2: iv_ruleWaterVariable= ruleWaterVariable EOF
            {
             newCompositeNode(grammarAccess.getWaterVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWaterVariable=ruleWaterVariable();

            state._fsp--;

             current =iv_ruleWaterVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWaterVariable"


    // $ANTLR start "ruleWaterVariable"
    // InternalWater.g:211:1: ruleWaterVariable returns [EObject current=null] : (otherlv_0= 'waterVariable' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleWaterVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalWater.g:217:2: ( (otherlv_0= 'waterVariable' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalWater.g:218:2: (otherlv_0= 'waterVariable' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalWater.g:218:2: (otherlv_0= 'waterVariable' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalWater.g:219:3: otherlv_0= 'waterVariable' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWaterVariableAccess().getWaterVariableKeyword_0());
            		
            // InternalWater.g:223:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWater.g:224:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWater.g:224:4: (lv_name_1_0= RULE_ID )
            // InternalWater.g:225:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWaterVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWaterVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWaterVariable"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006800L});

}