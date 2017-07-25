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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'level'", "'field'", "'rectangle'", "'X'", "'Y'", "'hero'", "'isBoss'", "'item'", "'attackBonus'", "'defenseBonus'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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
        	return "ComputerGame";
       	}

       	@Override
       	protected WaterGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComputerGame"
    // InternalWater.g:64:1: entryRuleComputerGame returns [EObject current=null] : iv_ruleComputerGame= ruleComputerGame EOF ;
    public final EObject entryRuleComputerGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputerGame = null;


        try {
            // InternalWater.g:64:53: (iv_ruleComputerGame= ruleComputerGame EOF )
            // InternalWater.g:65:2: iv_ruleComputerGame= ruleComputerGame EOF
            {
             newCompositeNode(grammarAccess.getComputerGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComputerGame=ruleComputerGame();

            state._fsp--;

             current =iv_ruleComputerGame; 
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
    // $ANTLR end "entryRuleComputerGame"


    // $ANTLR start "ruleComputerGame"
    // InternalWater.g:71:1: ruleComputerGame returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleComputerGame() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalWater.g:77:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalWater.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalWater.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==16||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWater.g:79:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalWater.g:79:3: (lv_elements_0_0= ruleType )
            	    // InternalWater.g:80:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getComputerGameAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getComputerGameRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.watercraftHQ.water.Water.Type");
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
    // $ANTLR end "ruleComputerGame"


    // $ANTLR start "entryRuleType"
    // InternalWater.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalWater.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalWater.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalWater.g:107:1: ruleType returns [EObject current=null] : (this_Level_0= ruleLevel | this_Hero_1= ruleHero | this_Item_2= ruleItem ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Level_0 = null;

        EObject this_Hero_1 = null;

        EObject this_Item_2 = null;



        	enterRule();

        try {
            // InternalWater.g:113:2: ( (this_Level_0= ruleLevel | this_Hero_1= ruleHero | this_Item_2= ruleItem ) )
            // InternalWater.g:114:2: (this_Level_0= ruleLevel | this_Hero_1= ruleHero | this_Item_2= ruleItem )
            {
            // InternalWater.g:114:2: (this_Level_0= ruleLevel | this_Hero_1= ruleHero | this_Item_2= ruleItem )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalWater.g:115:3: this_Level_0= ruleLevel
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getLevelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Level_0=ruleLevel();

                    state._fsp--;


                    			current = this_Level_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWater.g:124:3: this_Hero_1= ruleHero
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getHeroParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Hero_1=ruleHero();

                    state._fsp--;


                    			current = this_Hero_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalWater.g:133:3: this_Item_2= ruleItem
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getItemParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Item_2=ruleItem();

                    state._fsp--;


                    			current = this_Item_2;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLevel"
    // InternalWater.g:145:1: entryRuleLevel returns [EObject current=null] : iv_ruleLevel= ruleLevel EOF ;
    public final EObject entryRuleLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevel = null;


        try {
            // InternalWater.g:145:46: (iv_ruleLevel= ruleLevel EOF )
            // InternalWater.g:146:2: iv_ruleLevel= ruleLevel EOF
            {
             newCompositeNode(grammarAccess.getLevelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLevel=ruleLevel();

            state._fsp--;

             current =iv_ruleLevel; 
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
    // $ANTLR end "entryRuleLevel"


    // $ANTLR start "ruleLevel"
    // InternalWater.g:152:1: ruleLevel returns [EObject current=null] : (otherlv_0= 'level' ( (lv_name_1_0= RULE_ID ) ) ( (lv_field_2_0= ruleField ) ) ) ;
    public final EObject ruleLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_field_2_0 = null;



        	enterRule();

        try {
            // InternalWater.g:158:2: ( (otherlv_0= 'level' ( (lv_name_1_0= RULE_ID ) ) ( (lv_field_2_0= ruleField ) ) ) )
            // InternalWater.g:159:2: (otherlv_0= 'level' ( (lv_name_1_0= RULE_ID ) ) ( (lv_field_2_0= ruleField ) ) )
            {
            // InternalWater.g:159:2: (otherlv_0= 'level' ( (lv_name_1_0= RULE_ID ) ) ( (lv_field_2_0= ruleField ) ) )
            // InternalWater.g:160:3: otherlv_0= 'level' ( (lv_name_1_0= RULE_ID ) ) ( (lv_field_2_0= ruleField ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLevelAccess().getLevelKeyword_0());
            		
            // InternalWater.g:164:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWater.g:165:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWater.g:165:4: (lv_name_1_0= RULE_ID )
            // InternalWater.g:166:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLevelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLevelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalWater.g:182:3: ( (lv_field_2_0= ruleField ) )
            // InternalWater.g:183:4: (lv_field_2_0= ruleField )
            {
            // InternalWater.g:183:4: (lv_field_2_0= ruleField )
            // InternalWater.g:184:5: lv_field_2_0= ruleField
            {

            					newCompositeNode(grammarAccess.getLevelAccess().getFieldFieldParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_field_2_0=ruleField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLevelRule());
            					}
            					set(
            						current,
            						"field",
            						lv_field_2_0,
            						"org.xtext.watercraftHQ.water.Water.Field");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleLevel"


    // $ANTLR start "entryRuleField"
    // InternalWater.g:205:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalWater.g:205:46: (iv_ruleField= ruleField EOF )
            // InternalWater.g:206:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalWater.g:212:1: ruleField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_rectangle_1_0= ruleRectangle ) ) ( (lv_heros_2_0= ruleHero ) ) ( (lv_items_3_0= ruleItem ) )* ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_rectangle_1_0 = null;

        EObject lv_heros_2_0 = null;

        EObject lv_items_3_0 = null;



        	enterRule();

        try {
            // InternalWater.g:218:2: ( (otherlv_0= 'field' ( (lv_rectangle_1_0= ruleRectangle ) ) ( (lv_heros_2_0= ruleHero ) ) ( (lv_items_3_0= ruleItem ) )* ) )
            // InternalWater.g:219:2: (otherlv_0= 'field' ( (lv_rectangle_1_0= ruleRectangle ) ) ( (lv_heros_2_0= ruleHero ) ) ( (lv_items_3_0= ruleItem ) )* )
            {
            // InternalWater.g:219:2: (otherlv_0= 'field' ( (lv_rectangle_1_0= ruleRectangle ) ) ( (lv_heros_2_0= ruleHero ) ) ( (lv_items_3_0= ruleItem ) )* )
            // InternalWater.g:220:3: otherlv_0= 'field' ( (lv_rectangle_1_0= ruleRectangle ) ) ( (lv_heros_2_0= ruleHero ) ) ( (lv_items_3_0= ruleItem ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
            		
            // InternalWater.g:224:3: ( (lv_rectangle_1_0= ruleRectangle ) )
            // InternalWater.g:225:4: (lv_rectangle_1_0= ruleRectangle )
            {
            // InternalWater.g:225:4: (lv_rectangle_1_0= ruleRectangle )
            // InternalWater.g:226:5: lv_rectangle_1_0= ruleRectangle
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getRectangleRectangleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_rectangle_1_0=ruleRectangle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"rectangle",
            						lv_rectangle_1_0,
            						"org.xtext.watercraftHQ.water.Water.Rectangle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWater.g:243:3: ( (lv_heros_2_0= ruleHero ) )
            // InternalWater.g:244:4: (lv_heros_2_0= ruleHero )
            {
            // InternalWater.g:244:4: (lv_heros_2_0= ruleHero )
            // InternalWater.g:245:5: lv_heros_2_0= ruleHero
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getHerosHeroParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_heros_2_0=ruleHero();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					add(
            						current,
            						"heros",
            						lv_heros_2_0,
            						"org.xtext.watercraftHQ.water.Water.Hero");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWater.g:262:3: ( (lv_items_3_0= ruleItem ) )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalWater.g:263:4: (lv_items_3_0= ruleItem )
            	    {
            	    // InternalWater.g:263:4: (lv_items_3_0= ruleItem )
            	    // InternalWater.g:264:5: lv_items_3_0= ruleItem
            	    {

            	    					newCompositeNode(grammarAccess.getFieldAccess().getItemsItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_items_3_0=ruleItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFieldRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_3_0,
            	    						"org.xtext.watercraftHQ.water.Water.Item");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleRectangle"
    // InternalWater.g:285:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // InternalWater.g:285:50: (iv_ruleRectangle= ruleRectangle EOF )
            // InternalWater.g:286:2: iv_ruleRectangle= ruleRectangle EOF
            {
             newCompositeNode(grammarAccess.getRectangleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRectangle=ruleRectangle();

            state._fsp--;

             current =iv_ruleRectangle; 
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
    // $ANTLR end "entryRuleRectangle"


    // $ANTLR start "ruleRectangle"
    // InternalWater.g:292:1: ruleRectangle returns [EObject current=null] : (otherlv_0= 'rectangle' otherlv_1= 'X' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= 'Y' ( (lv_Y_4_0= RULE_INT ) ) ) ;
    public final EObject ruleRectangle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_X_2_0=null;
        Token otherlv_3=null;
        Token lv_Y_4_0=null;


        	enterRule();

        try {
            // InternalWater.g:298:2: ( (otherlv_0= 'rectangle' otherlv_1= 'X' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= 'Y' ( (lv_Y_4_0= RULE_INT ) ) ) )
            // InternalWater.g:299:2: (otherlv_0= 'rectangle' otherlv_1= 'X' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= 'Y' ( (lv_Y_4_0= RULE_INT ) ) )
            {
            // InternalWater.g:299:2: (otherlv_0= 'rectangle' otherlv_1= 'X' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= 'Y' ( (lv_Y_4_0= RULE_INT ) ) )
            // InternalWater.g:300:3: otherlv_0= 'rectangle' otherlv_1= 'X' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= 'Y' ( (lv_Y_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRectangleAccess().getRectangleKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRectangleAccess().getXKeyword_1());
            		
            // InternalWater.g:308:3: ( (lv_X_2_0= RULE_INT ) )
            // InternalWater.g:309:4: (lv_X_2_0= RULE_INT )
            {
            // InternalWater.g:309:4: (lv_X_2_0= RULE_INT )
            // InternalWater.g:310:5: lv_X_2_0= RULE_INT
            {
            lv_X_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_X_2_0, grammarAccess.getRectangleAccess().getXINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectangleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"X",
            						lv_X_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRectangleAccess().getYKeyword_3());
            		
            // InternalWater.g:330:3: ( (lv_Y_4_0= RULE_INT ) )
            // InternalWater.g:331:4: (lv_Y_4_0= RULE_INT )
            {
            // InternalWater.g:331:4: (lv_Y_4_0= RULE_INT )
            // InternalWater.g:332:5: lv_Y_4_0= RULE_INT
            {
            lv_Y_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_Y_4_0, grammarAccess.getRectangleAccess().getYINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectangleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Y",
            						lv_Y_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleRectangle"


    // $ANTLR start "entryRuleHero"
    // InternalWater.g:352:1: entryRuleHero returns [EObject current=null] : iv_ruleHero= ruleHero EOF ;
    public final EObject entryRuleHero() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHero = null;


        try {
            // InternalWater.g:352:45: (iv_ruleHero= ruleHero EOF )
            // InternalWater.g:353:2: iv_ruleHero= ruleHero EOF
            {
             newCompositeNode(grammarAccess.getHeroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHero=ruleHero();

            state._fsp--;

             current =iv_ruleHero; 
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
    // $ANTLR end "entryRuleHero"


    // $ANTLR start "ruleHero"
    // InternalWater.g:359:1: ruleHero returns [EObject current=null] : (otherlv_0= 'hero' ( (lv_position_1_0= rulePosition ) ) ( (lv_isBoss_2_0= 'isBoss' ) )? ) ;
    public final EObject ruleHero() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isBoss_2_0=null;
        EObject lv_position_1_0 = null;



        	enterRule();

        try {
            // InternalWater.g:365:2: ( (otherlv_0= 'hero' ( (lv_position_1_0= rulePosition ) ) ( (lv_isBoss_2_0= 'isBoss' ) )? ) )
            // InternalWater.g:366:2: (otherlv_0= 'hero' ( (lv_position_1_0= rulePosition ) ) ( (lv_isBoss_2_0= 'isBoss' ) )? )
            {
            // InternalWater.g:366:2: (otherlv_0= 'hero' ( (lv_position_1_0= rulePosition ) ) ( (lv_isBoss_2_0= 'isBoss' ) )? )
            // InternalWater.g:367:3: otherlv_0= 'hero' ( (lv_position_1_0= rulePosition ) ) ( (lv_isBoss_2_0= 'isBoss' ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getHeroAccess().getHeroKeyword_0());
            		
            // InternalWater.g:371:3: ( (lv_position_1_0= rulePosition ) )
            // InternalWater.g:372:4: (lv_position_1_0= rulePosition )
            {
            // InternalWater.g:372:4: (lv_position_1_0= rulePosition )
            // InternalWater.g:373:5: lv_position_1_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getHeroAccess().getPositionPositionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_position_1_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeroRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_1_0,
            						"org.xtext.watercraftHQ.water.Water.Position");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWater.g:390:3: ( (lv_isBoss_2_0= 'isBoss' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalWater.g:391:4: (lv_isBoss_2_0= 'isBoss' )
                    {
                    // InternalWater.g:391:4: (lv_isBoss_2_0= 'isBoss' )
                    // InternalWater.g:392:5: lv_isBoss_2_0= 'isBoss'
                    {
                    lv_isBoss_2_0=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_isBoss_2_0, grammarAccess.getHeroAccess().getIsBossIsBossKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHeroRule());
                    					}
                    					setWithLastConsumed(current, "isBoss", true, "isBoss");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleHero"


    // $ANTLR start "entryRulePosition"
    // InternalWater.g:408:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalWater.g:408:49: (iv_rulePosition= rulePosition EOF )
            // InternalWater.g:409:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
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
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalWater.g:415:1: rulePosition returns [EObject current=null] : (otherlv_0= 'X' ( (lv_X_1_0= RULE_INT ) ) otherlv_2= 'Y' ( (lv_Y_3_0= RULE_INT ) ) ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_X_1_0=null;
        Token otherlv_2=null;
        Token lv_Y_3_0=null;


        	enterRule();

        try {
            // InternalWater.g:421:2: ( (otherlv_0= 'X' ( (lv_X_1_0= RULE_INT ) ) otherlv_2= 'Y' ( (lv_Y_3_0= RULE_INT ) ) ) )
            // InternalWater.g:422:2: (otherlv_0= 'X' ( (lv_X_1_0= RULE_INT ) ) otherlv_2= 'Y' ( (lv_Y_3_0= RULE_INT ) ) )
            {
            // InternalWater.g:422:2: (otherlv_0= 'X' ( (lv_X_1_0= RULE_INT ) ) otherlv_2= 'Y' ( (lv_Y_3_0= RULE_INT ) ) )
            // InternalWater.g:423:3: otherlv_0= 'X' ( (lv_X_1_0= RULE_INT ) ) otherlv_2= 'Y' ( (lv_Y_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getXKeyword_0());
            		
            // InternalWater.g:427:3: ( (lv_X_1_0= RULE_INT ) )
            // InternalWater.g:428:4: (lv_X_1_0= RULE_INT )
            {
            // InternalWater.g:428:4: (lv_X_1_0= RULE_INT )
            // InternalWater.g:429:5: lv_X_1_0= RULE_INT
            {
            lv_X_1_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_X_1_0, grammarAccess.getPositionAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"X",
            						lv_X_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPositionAccess().getYKeyword_2());
            		
            // InternalWater.g:449:3: ( (lv_Y_3_0= RULE_INT ) )
            // InternalWater.g:450:4: (lv_Y_3_0= RULE_INT )
            {
            // InternalWater.g:450:4: (lv_Y_3_0= RULE_INT )
            // InternalWater.g:451:5: lv_Y_3_0= RULE_INT
            {
            lv_Y_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_Y_3_0, grammarAccess.getPositionAccess().getYINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Y",
            						lv_Y_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleItem"
    // InternalWater.g:471:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalWater.g:471:45: (iv_ruleItem= ruleItem EOF )
            // InternalWater.g:472:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalWater.g:478:1: ruleItem returns [EObject current=null] : (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'attackBonus' ( (lv_attackBonus_3_0= RULE_INT ) ) otherlv_4= 'defenseBonus' ( (lv_defenseBonus_5_0= RULE_INT ) ) ( ( (lv_location_6_0= rulePosition ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_attackBonus_3_0=null;
        Token otherlv_4=null;
        Token lv_defenseBonus_5_0=null;
        Token otherlv_7=null;
        EObject lv_location_6_0 = null;



        	enterRule();

        try {
            // InternalWater.g:484:2: ( (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'attackBonus' ( (lv_attackBonus_3_0= RULE_INT ) ) otherlv_4= 'defenseBonus' ( (lv_defenseBonus_5_0= RULE_INT ) ) ( ( (lv_location_6_0= rulePosition ) ) | ( (otherlv_7= RULE_ID ) ) ) ) )
            // InternalWater.g:485:2: (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'attackBonus' ( (lv_attackBonus_3_0= RULE_INT ) ) otherlv_4= 'defenseBonus' ( (lv_defenseBonus_5_0= RULE_INT ) ) ( ( (lv_location_6_0= rulePosition ) ) | ( (otherlv_7= RULE_ID ) ) ) )
            {
            // InternalWater.g:485:2: (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'attackBonus' ( (lv_attackBonus_3_0= RULE_INT ) ) otherlv_4= 'defenseBonus' ( (lv_defenseBonus_5_0= RULE_INT ) ) ( ( (lv_location_6_0= rulePosition ) ) | ( (otherlv_7= RULE_ID ) ) ) )
            // InternalWater.g:486:3: otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'attackBonus' ( (lv_attackBonus_3_0= RULE_INT ) ) otherlv_4= 'defenseBonus' ( (lv_defenseBonus_5_0= RULE_INT ) ) ( ( (lv_location_6_0= rulePosition ) ) | ( (otherlv_7= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getItemAccess().getItemKeyword_0());
            		
            // InternalWater.g:490:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWater.g:491:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWater.g:491:4: (lv_name_1_0= RULE_ID )
            // InternalWater.g:492:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getItemAccess().getAttackBonusKeyword_2());
            		
            // InternalWater.g:512:3: ( (lv_attackBonus_3_0= RULE_INT ) )
            // InternalWater.g:513:4: (lv_attackBonus_3_0= RULE_INT )
            {
            // InternalWater.g:513:4: (lv_attackBonus_3_0= RULE_INT )
            // InternalWater.g:514:5: lv_attackBonus_3_0= RULE_INT
            {
            lv_attackBonus_3_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_attackBonus_3_0, grammarAccess.getItemAccess().getAttackBonusINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attackBonus",
            						lv_attackBonus_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getItemAccess().getDefenseBonusKeyword_4());
            		
            // InternalWater.g:534:3: ( (lv_defenseBonus_5_0= RULE_INT ) )
            // InternalWater.g:535:4: (lv_defenseBonus_5_0= RULE_INT )
            {
            // InternalWater.g:535:4: (lv_defenseBonus_5_0= RULE_INT )
            // InternalWater.g:536:5: lv_defenseBonus_5_0= RULE_INT
            {
            lv_defenseBonus_5_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_defenseBonus_5_0, grammarAccess.getItemAccess().getDefenseBonusINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"defenseBonus",
            						lv_defenseBonus_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalWater.g:552:3: ( ( (lv_location_6_0= rulePosition ) ) | ( (otherlv_7= RULE_ID ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalWater.g:553:4: ( (lv_location_6_0= rulePosition ) )
                    {
                    // InternalWater.g:553:4: ( (lv_location_6_0= rulePosition ) )
                    // InternalWater.g:554:5: (lv_location_6_0= rulePosition )
                    {
                    // InternalWater.g:554:5: (lv_location_6_0= rulePosition )
                    // InternalWater.g:555:6: lv_location_6_0= rulePosition
                    {

                    						newCompositeNode(grammarAccess.getItemAccess().getLocationPositionParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_location_6_0=rulePosition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getItemRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_6_0,
                    							"org.xtext.watercraftHQ.water.Water.Position");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWater.g:573:4: ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalWater.g:573:4: ( (otherlv_7= RULE_ID ) )
                    // InternalWater.g:574:5: (otherlv_7= RULE_ID )
                    {
                    // InternalWater.g:574:5: (otherlv_7= RULE_ID )
                    // InternalWater.g:575:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getItemRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getItemAccess().getHeroHeroCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleItem"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\1\14\uffff";
    static final String dfa_3s = "\1\13\1\uffff\1\4\1\23\1\5\1\24\1\5\1\4\1\5\1\uffff\1\17\1\5\1\uffff";
    static final String dfa_4s = "\1\22\1\uffff\1\4\1\23\1\5\1\24\1\5\1\16\1\5\1\uffff\1\17\1\5\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\7\uffff\1\1\2\uffff\1\1";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\4\uffff\1\1\1\uffff\1\2",
            "",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\11\11\uffff\1\10",
            "\1\12",
            "",
            "\1\13",
            "\1\14",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 262:3: ( (lv_items_3_0= ruleItem ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000050802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000050800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004010L});

}