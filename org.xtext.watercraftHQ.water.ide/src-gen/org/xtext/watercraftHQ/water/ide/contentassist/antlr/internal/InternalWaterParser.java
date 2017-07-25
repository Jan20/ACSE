package org.xtext.watercraftHQ.water.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.watercraftHQ.water.services.WaterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWaterParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'level'", "'field'", "'rectangle'", "'X'", "'Y'", "'hero'", "'item'", "'attackBonus'", "'defenseBonus'", "'isBoss'"
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

    	public void setGrammarAccess(WaterGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleComputerGame"
    // InternalWater.g:53:1: entryRuleComputerGame : ruleComputerGame EOF ;
    public final void entryRuleComputerGame() throws RecognitionException {
        try {
            // InternalWater.g:54:1: ( ruleComputerGame EOF )
            // InternalWater.g:55:1: ruleComputerGame EOF
            {
             before(grammarAccess.getComputerGameRule()); 
            pushFollow(FOLLOW_1);
            ruleComputerGame();

            state._fsp--;

             after(grammarAccess.getComputerGameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComputerGame"


    // $ANTLR start "ruleComputerGame"
    // InternalWater.g:62:1: ruleComputerGame : ( ( rule__ComputerGame__ElementsAssignment )* ) ;
    public final void ruleComputerGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:66:2: ( ( ( rule__ComputerGame__ElementsAssignment )* ) )
            // InternalWater.g:67:2: ( ( rule__ComputerGame__ElementsAssignment )* )
            {
            // InternalWater.g:67:2: ( ( rule__ComputerGame__ElementsAssignment )* )
            // InternalWater.g:68:3: ( rule__ComputerGame__ElementsAssignment )*
            {
             before(grammarAccess.getComputerGameAccess().getElementsAssignment()); 
            // InternalWater.g:69:3: ( rule__ComputerGame__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=16 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWater.g:69:4: rule__ComputerGame__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ComputerGame__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getComputerGameAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComputerGame"


    // $ANTLR start "entryRuleType"
    // InternalWater.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalWater.g:79:1: ( ruleType EOF )
            // InternalWater.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalWater.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalWater.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalWater.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalWater.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalWater.g:94:3: ( rule__Type__Alternatives )
            // InternalWater.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLevel"
    // InternalWater.g:103:1: entryRuleLevel : ruleLevel EOF ;
    public final void entryRuleLevel() throws RecognitionException {
        try {
            // InternalWater.g:104:1: ( ruleLevel EOF )
            // InternalWater.g:105:1: ruleLevel EOF
            {
             before(grammarAccess.getLevelRule()); 
            pushFollow(FOLLOW_1);
            ruleLevel();

            state._fsp--;

             after(grammarAccess.getLevelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLevel"


    // $ANTLR start "ruleLevel"
    // InternalWater.g:112:1: ruleLevel : ( ( rule__Level__Group__0 ) ) ;
    public final void ruleLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:116:2: ( ( ( rule__Level__Group__0 ) ) )
            // InternalWater.g:117:2: ( ( rule__Level__Group__0 ) )
            {
            // InternalWater.g:117:2: ( ( rule__Level__Group__0 ) )
            // InternalWater.g:118:3: ( rule__Level__Group__0 )
            {
             before(grammarAccess.getLevelAccess().getGroup()); 
            // InternalWater.g:119:3: ( rule__Level__Group__0 )
            // InternalWater.g:119:4: rule__Level__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Level__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLevelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLevel"


    // $ANTLR start "entryRuleField"
    // InternalWater.g:128:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalWater.g:129:1: ( ruleField EOF )
            // InternalWater.g:130:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalWater.g:137:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:141:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalWater.g:142:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalWater.g:142:2: ( ( rule__Field__Group__0 ) )
            // InternalWater.g:143:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalWater.g:144:3: ( rule__Field__Group__0 )
            // InternalWater.g:144:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleRectangle"
    // InternalWater.g:153:1: entryRuleRectangle : ruleRectangle EOF ;
    public final void entryRuleRectangle() throws RecognitionException {
        try {
            // InternalWater.g:154:1: ( ruleRectangle EOF )
            // InternalWater.g:155:1: ruleRectangle EOF
            {
             before(grammarAccess.getRectangleRule()); 
            pushFollow(FOLLOW_1);
            ruleRectangle();

            state._fsp--;

             after(grammarAccess.getRectangleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRectangle"


    // $ANTLR start "ruleRectangle"
    // InternalWater.g:162:1: ruleRectangle : ( ( rule__Rectangle__Group__0 ) ) ;
    public final void ruleRectangle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:166:2: ( ( ( rule__Rectangle__Group__0 ) ) )
            // InternalWater.g:167:2: ( ( rule__Rectangle__Group__0 ) )
            {
            // InternalWater.g:167:2: ( ( rule__Rectangle__Group__0 ) )
            // InternalWater.g:168:3: ( rule__Rectangle__Group__0 )
            {
             before(grammarAccess.getRectangleAccess().getGroup()); 
            // InternalWater.g:169:3: ( rule__Rectangle__Group__0 )
            // InternalWater.g:169:4: rule__Rectangle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRectangle"


    // $ANTLR start "entryRuleHero"
    // InternalWater.g:178:1: entryRuleHero : ruleHero EOF ;
    public final void entryRuleHero() throws RecognitionException {
        try {
            // InternalWater.g:179:1: ( ruleHero EOF )
            // InternalWater.g:180:1: ruleHero EOF
            {
             before(grammarAccess.getHeroRule()); 
            pushFollow(FOLLOW_1);
            ruleHero();

            state._fsp--;

             after(grammarAccess.getHeroRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHero"


    // $ANTLR start "ruleHero"
    // InternalWater.g:187:1: ruleHero : ( ( rule__Hero__Group__0 ) ) ;
    public final void ruleHero() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:191:2: ( ( ( rule__Hero__Group__0 ) ) )
            // InternalWater.g:192:2: ( ( rule__Hero__Group__0 ) )
            {
            // InternalWater.g:192:2: ( ( rule__Hero__Group__0 ) )
            // InternalWater.g:193:3: ( rule__Hero__Group__0 )
            {
             before(grammarAccess.getHeroAccess().getGroup()); 
            // InternalWater.g:194:3: ( rule__Hero__Group__0 )
            // InternalWater.g:194:4: rule__Hero__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hero__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeroAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHero"


    // $ANTLR start "entryRulePosition"
    // InternalWater.g:203:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // InternalWater.g:204:1: ( rulePosition EOF )
            // InternalWater.g:205:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalWater.g:212:1: rulePosition : ( ( rule__Position__Group__0 ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:216:2: ( ( ( rule__Position__Group__0 ) ) )
            // InternalWater.g:217:2: ( ( rule__Position__Group__0 ) )
            {
            // InternalWater.g:217:2: ( ( rule__Position__Group__0 ) )
            // InternalWater.g:218:3: ( rule__Position__Group__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup()); 
            // InternalWater.g:219:3: ( rule__Position__Group__0 )
            // InternalWater.g:219:4: rule__Position__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleItem"
    // InternalWater.g:228:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalWater.g:229:1: ( ruleItem EOF )
            // InternalWater.g:230:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalWater.g:237:1: ruleItem : ( ( rule__Item__Group__0 ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:241:2: ( ( ( rule__Item__Group__0 ) ) )
            // InternalWater.g:242:2: ( ( rule__Item__Group__0 ) )
            {
            // InternalWater.g:242:2: ( ( rule__Item__Group__0 ) )
            // InternalWater.g:243:3: ( rule__Item__Group__0 )
            {
             before(grammarAccess.getItemAccess().getGroup()); 
            // InternalWater.g:244:3: ( rule__Item__Group__0 )
            // InternalWater.g:244:4: rule__Item__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalWater.g:252:1: rule__Type__Alternatives : ( ( ruleLevel ) | ( ruleHero ) | ( ruleItem ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:256:1: ( ( ruleLevel ) | ( ruleHero ) | ( ruleItem ) )
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
            case 17:
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
                    // InternalWater.g:257:2: ( ruleLevel )
                    {
                    // InternalWater.g:257:2: ( ruleLevel )
                    // InternalWater.g:258:3: ruleLevel
                    {
                     before(grammarAccess.getTypeAccess().getLevelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLevel();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getLevelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWater.g:263:2: ( ruleHero )
                    {
                    // InternalWater.g:263:2: ( ruleHero )
                    // InternalWater.g:264:3: ruleHero
                    {
                     before(grammarAccess.getTypeAccess().getHeroParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleHero();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getHeroParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWater.g:269:2: ( ruleItem )
                    {
                    // InternalWater.g:269:2: ( ruleItem )
                    // InternalWater.g:270:3: ruleItem
                    {
                     before(grammarAccess.getTypeAccess().getItemParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleItem();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getItemParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Item__Alternatives_6"
    // InternalWater.g:279:1: rule__Item__Alternatives_6 : ( ( ( rule__Item__LocationAssignment_6_0 ) ) | ( ( rule__Item__HeroAssignment_6_1 ) ) );
    public final void rule__Item__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:283:1: ( ( ( rule__Item__LocationAssignment_6_0 ) ) | ( ( rule__Item__HeroAssignment_6_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalWater.g:284:2: ( ( rule__Item__LocationAssignment_6_0 ) )
                    {
                    // InternalWater.g:284:2: ( ( rule__Item__LocationAssignment_6_0 ) )
                    // InternalWater.g:285:3: ( rule__Item__LocationAssignment_6_0 )
                    {
                     before(grammarAccess.getItemAccess().getLocationAssignment_6_0()); 
                    // InternalWater.g:286:3: ( rule__Item__LocationAssignment_6_0 )
                    // InternalWater.g:286:4: rule__Item__LocationAssignment_6_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Item__LocationAssignment_6_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItemAccess().getLocationAssignment_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWater.g:290:2: ( ( rule__Item__HeroAssignment_6_1 ) )
                    {
                    // InternalWater.g:290:2: ( ( rule__Item__HeroAssignment_6_1 ) )
                    // InternalWater.g:291:3: ( rule__Item__HeroAssignment_6_1 )
                    {
                     before(grammarAccess.getItemAccess().getHeroAssignment_6_1()); 
                    // InternalWater.g:292:3: ( rule__Item__HeroAssignment_6_1 )
                    // InternalWater.g:292:4: rule__Item__HeroAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Item__HeroAssignment_6_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getItemAccess().getHeroAssignment_6_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Alternatives_6"


    // $ANTLR start "rule__Level__Group__0"
    // InternalWater.g:300:1: rule__Level__Group__0 : rule__Level__Group__0__Impl rule__Level__Group__1 ;
    public final void rule__Level__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:304:1: ( rule__Level__Group__0__Impl rule__Level__Group__1 )
            // InternalWater.g:305:2: rule__Level__Group__0__Impl rule__Level__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Level__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Level__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__0"


    // $ANTLR start "rule__Level__Group__0__Impl"
    // InternalWater.g:312:1: rule__Level__Group__0__Impl : ( 'level' ) ;
    public final void rule__Level__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:316:1: ( ( 'level' ) )
            // InternalWater.g:317:1: ( 'level' )
            {
            // InternalWater.g:317:1: ( 'level' )
            // InternalWater.g:318:2: 'level'
            {
             before(grammarAccess.getLevelAccess().getLevelKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getLevelAccess().getLevelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__0__Impl"


    // $ANTLR start "rule__Level__Group__1"
    // InternalWater.g:327:1: rule__Level__Group__1 : rule__Level__Group__1__Impl rule__Level__Group__2 ;
    public final void rule__Level__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:331:1: ( rule__Level__Group__1__Impl rule__Level__Group__2 )
            // InternalWater.g:332:2: rule__Level__Group__1__Impl rule__Level__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Level__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Level__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__1"


    // $ANTLR start "rule__Level__Group__1__Impl"
    // InternalWater.g:339:1: rule__Level__Group__1__Impl : ( ( rule__Level__NameAssignment_1 ) ) ;
    public final void rule__Level__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:343:1: ( ( ( rule__Level__NameAssignment_1 ) ) )
            // InternalWater.g:344:1: ( ( rule__Level__NameAssignment_1 ) )
            {
            // InternalWater.g:344:1: ( ( rule__Level__NameAssignment_1 ) )
            // InternalWater.g:345:2: ( rule__Level__NameAssignment_1 )
            {
             before(grammarAccess.getLevelAccess().getNameAssignment_1()); 
            // InternalWater.g:346:2: ( rule__Level__NameAssignment_1 )
            // InternalWater.g:346:3: rule__Level__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Level__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLevelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__1__Impl"


    // $ANTLR start "rule__Level__Group__2"
    // InternalWater.g:354:1: rule__Level__Group__2 : rule__Level__Group__2__Impl ;
    public final void rule__Level__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:358:1: ( rule__Level__Group__2__Impl )
            // InternalWater.g:359:2: rule__Level__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Level__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__2"


    // $ANTLR start "rule__Level__Group__2__Impl"
    // InternalWater.g:365:1: rule__Level__Group__2__Impl : ( ( rule__Level__FieldAssignment_2 ) ) ;
    public final void rule__Level__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:369:1: ( ( ( rule__Level__FieldAssignment_2 ) ) )
            // InternalWater.g:370:1: ( ( rule__Level__FieldAssignment_2 ) )
            {
            // InternalWater.g:370:1: ( ( rule__Level__FieldAssignment_2 ) )
            // InternalWater.g:371:2: ( rule__Level__FieldAssignment_2 )
            {
             before(grammarAccess.getLevelAccess().getFieldAssignment_2()); 
            // InternalWater.g:372:2: ( rule__Level__FieldAssignment_2 )
            // InternalWater.g:372:3: rule__Level__FieldAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Level__FieldAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLevelAccess().getFieldAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalWater.g:381:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:385:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalWater.g:386:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalWater.g:393:1: rule__Field__Group__0__Impl : ( 'field' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:397:1: ( ( 'field' ) )
            // InternalWater.g:398:1: ( 'field' )
            {
            // InternalWater.g:398:1: ( 'field' )
            // InternalWater.g:399:2: 'field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalWater.g:408:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:412:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalWater.g:413:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalWater.g:420:1: rule__Field__Group__1__Impl : ( ( rule__Field__RectangleAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:424:1: ( ( ( rule__Field__RectangleAssignment_1 ) ) )
            // InternalWater.g:425:1: ( ( rule__Field__RectangleAssignment_1 ) )
            {
            // InternalWater.g:425:1: ( ( rule__Field__RectangleAssignment_1 ) )
            // InternalWater.g:426:2: ( rule__Field__RectangleAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getRectangleAssignment_1()); 
            // InternalWater.g:427:2: ( rule__Field__RectangleAssignment_1 )
            // InternalWater.g:427:3: rule__Field__RectangleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__RectangleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getRectangleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalWater.g:435:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:439:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalWater.g:440:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalWater.g:447:1: rule__Field__Group__2__Impl : ( ( rule__Field__HerosAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:451:1: ( ( ( rule__Field__HerosAssignment_2 ) ) )
            // InternalWater.g:452:1: ( ( rule__Field__HerosAssignment_2 ) )
            {
            // InternalWater.g:452:1: ( ( rule__Field__HerosAssignment_2 ) )
            // InternalWater.g:453:2: ( rule__Field__HerosAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getHerosAssignment_2()); 
            // InternalWater.g:454:2: ( rule__Field__HerosAssignment_2 )
            // InternalWater.g:454:3: rule__Field__HerosAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__HerosAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getHerosAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // InternalWater.g:462:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:466:1: ( rule__Field__Group__3__Impl )
            // InternalWater.g:467:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // InternalWater.g:473:1: rule__Field__Group__3__Impl : ( ( rule__Field__ItemsAssignment_3 )* ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:477:1: ( ( ( rule__Field__ItemsAssignment_3 )* ) )
            // InternalWater.g:478:1: ( ( rule__Field__ItemsAssignment_3 )* )
            {
            // InternalWater.g:478:1: ( ( rule__Field__ItemsAssignment_3 )* )
            // InternalWater.g:479:2: ( rule__Field__ItemsAssignment_3 )*
            {
             before(grammarAccess.getFieldAccess().getItemsAssignment_3()); 
            // InternalWater.g:480:2: ( rule__Field__ItemsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalWater.g:480:3: rule__Field__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Field__ItemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFieldAccess().getItemsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Rectangle__Group__0"
    // InternalWater.g:489:1: rule__Rectangle__Group__0 : rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 ;
    public final void rule__Rectangle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:493:1: ( rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 )
            // InternalWater.g:494:2: rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Rectangle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__0"


    // $ANTLR start "rule__Rectangle__Group__0__Impl"
    // InternalWater.g:501:1: rule__Rectangle__Group__0__Impl : ( 'rectangle' ) ;
    public final void rule__Rectangle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:505:1: ( ( 'rectangle' ) )
            // InternalWater.g:506:1: ( 'rectangle' )
            {
            // InternalWater.g:506:1: ( 'rectangle' )
            // InternalWater.g:507:2: 'rectangle'
            {
             before(grammarAccess.getRectangleAccess().getRectangleKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getRectangleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__0__Impl"


    // $ANTLR start "rule__Rectangle__Group__1"
    // InternalWater.g:516:1: rule__Rectangle__Group__1 : rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 ;
    public final void rule__Rectangle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:520:1: ( rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 )
            // InternalWater.g:521:2: rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Rectangle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__1"


    // $ANTLR start "rule__Rectangle__Group__1__Impl"
    // InternalWater.g:528:1: rule__Rectangle__Group__1__Impl : ( 'X' ) ;
    public final void rule__Rectangle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:532:1: ( ( 'X' ) )
            // InternalWater.g:533:1: ( 'X' )
            {
            // InternalWater.g:533:1: ( 'X' )
            // InternalWater.g:534:2: 'X'
            {
             before(grammarAccess.getRectangleAccess().getXKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getXKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__1__Impl"


    // $ANTLR start "rule__Rectangle__Group__2"
    // InternalWater.g:543:1: rule__Rectangle__Group__2 : rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 ;
    public final void rule__Rectangle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:547:1: ( rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 )
            // InternalWater.g:548:2: rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Rectangle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__2"


    // $ANTLR start "rule__Rectangle__Group__2__Impl"
    // InternalWater.g:555:1: rule__Rectangle__Group__2__Impl : ( ( rule__Rectangle__XAssignment_2 ) ) ;
    public final void rule__Rectangle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:559:1: ( ( ( rule__Rectangle__XAssignment_2 ) ) )
            // InternalWater.g:560:1: ( ( rule__Rectangle__XAssignment_2 ) )
            {
            // InternalWater.g:560:1: ( ( rule__Rectangle__XAssignment_2 ) )
            // InternalWater.g:561:2: ( rule__Rectangle__XAssignment_2 )
            {
             before(grammarAccess.getRectangleAccess().getXAssignment_2()); 
            // InternalWater.g:562:2: ( rule__Rectangle__XAssignment_2 )
            // InternalWater.g:562:3: rule__Rectangle__XAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__XAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getXAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__2__Impl"


    // $ANTLR start "rule__Rectangle__Group__3"
    // InternalWater.g:570:1: rule__Rectangle__Group__3 : rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 ;
    public final void rule__Rectangle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:574:1: ( rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 )
            // InternalWater.g:575:2: rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Rectangle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__3"


    // $ANTLR start "rule__Rectangle__Group__3__Impl"
    // InternalWater.g:582:1: rule__Rectangle__Group__3__Impl : ( 'Y' ) ;
    public final void rule__Rectangle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:586:1: ( ( 'Y' ) )
            // InternalWater.g:587:1: ( 'Y' )
            {
            // InternalWater.g:587:1: ( 'Y' )
            // InternalWater.g:588:2: 'Y'
            {
             before(grammarAccess.getRectangleAccess().getYKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getYKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__3__Impl"


    // $ANTLR start "rule__Rectangle__Group__4"
    // InternalWater.g:597:1: rule__Rectangle__Group__4 : rule__Rectangle__Group__4__Impl ;
    public final void rule__Rectangle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:601:1: ( rule__Rectangle__Group__4__Impl )
            // InternalWater.g:602:2: rule__Rectangle__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__4"


    // $ANTLR start "rule__Rectangle__Group__4__Impl"
    // InternalWater.g:608:1: rule__Rectangle__Group__4__Impl : ( ( rule__Rectangle__YAssignment_4 ) ) ;
    public final void rule__Rectangle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:612:1: ( ( ( rule__Rectangle__YAssignment_4 ) ) )
            // InternalWater.g:613:1: ( ( rule__Rectangle__YAssignment_4 ) )
            {
            // InternalWater.g:613:1: ( ( rule__Rectangle__YAssignment_4 ) )
            // InternalWater.g:614:2: ( rule__Rectangle__YAssignment_4 )
            {
             before(grammarAccess.getRectangleAccess().getYAssignment_4()); 
            // InternalWater.g:615:2: ( rule__Rectangle__YAssignment_4 )
            // InternalWater.g:615:3: rule__Rectangle__YAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__YAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getYAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__4__Impl"


    // $ANTLR start "rule__Hero__Group__0"
    // InternalWater.g:624:1: rule__Hero__Group__0 : rule__Hero__Group__0__Impl rule__Hero__Group__1 ;
    public final void rule__Hero__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:628:1: ( rule__Hero__Group__0__Impl rule__Hero__Group__1 )
            // InternalWater.g:629:2: rule__Hero__Group__0__Impl rule__Hero__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Hero__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hero__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hero__Group__0"


    // $ANTLR start "rule__Hero__Group__0__Impl"
    // InternalWater.g:636:1: rule__Hero__Group__0__Impl : ( 'hero' ) ;
    public final void rule__Hero__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:640:1: ( ( 'hero' ) )
            // InternalWater.g:641:1: ( 'hero' )
            {
            // InternalWater.g:641:1: ( 'hero' )
            // InternalWater.g:642:2: 'hero'
            {
             before(grammarAccess.getHeroAccess().getHeroKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHeroAccess().getHeroKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hero__Group__0__Impl"


    // $ANTLR start "rule__Hero__Group__1"
    // InternalWater.g:651:1: rule__Hero__Group__1 : rule__Hero__Group__1__Impl rule__Hero__Group__2 ;
    public final void rule__Hero__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:655:1: ( rule__Hero__Group__1__Impl rule__Hero__Group__2 )
            // InternalWater.g:656:2: rule__Hero__Group__1__Impl rule__Hero__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Hero__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hero__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hero__Group__1"


    // $ANTLR start "rule__Hero__Group__1__Impl"
    // InternalWater.g:663:1: rule__Hero__Group__1__Impl : ( ( rule__Hero__PositionAssignment_1 ) ) ;
    public final void rule__Hero__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:667:1: ( ( ( rule__Hero__PositionAssignment_1 ) ) )
            // InternalWater.g:668:1: ( ( rule__Hero__PositionAssignment_1 ) )
            {
            // InternalWater.g:668:1: ( ( rule__Hero__PositionAssignment_1 ) )
            // InternalWater.g:669:2: ( rule__Hero__PositionAssignment_1 )
            {
             before(grammarAccess.getHeroAccess().getPositionAssignment_1()); 
            // InternalWater.g:670:2: ( rule__Hero__PositionAssignment_1 )
            // InternalWater.g:670:3: rule__Hero__PositionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Hero__PositionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeroAccess().getPositionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hero__Group__1__Impl"


    // $ANTLR start "rule__Hero__Group__2"
    // InternalWater.g:678:1: rule__Hero__Group__2 : rule__Hero__Group__2__Impl ;
    public final void rule__Hero__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:682:1: ( rule__Hero__Group__2__Impl )
            // InternalWater.g:683:2: rule__Hero__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hero__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hero__Group__2"


    // $ANTLR start "rule__Hero__Group__2__Impl"
    // InternalWater.g:689:1: rule__Hero__Group__2__Impl : ( ( rule__Hero__IsBossAssignment_2 )? ) ;
    public final void rule__Hero__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:693:1: ( ( ( rule__Hero__IsBossAssignment_2 )? ) )
            // InternalWater.g:694:1: ( ( rule__Hero__IsBossAssignment_2 )? )
            {
            // InternalWater.g:694:1: ( ( rule__Hero__IsBossAssignment_2 )? )
            // InternalWater.g:695:2: ( rule__Hero__IsBossAssignment_2 )?
            {
             before(grammarAccess.getHeroAccess().getIsBossAssignment_2()); 
            // InternalWater.g:696:2: ( rule__Hero__IsBossAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalWater.g:696:3: rule__Hero__IsBossAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Hero__IsBossAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHeroAccess().getIsBossAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hero__Group__2__Impl"


    // $ANTLR start "rule__Position__Group__0"
    // InternalWater.g:705:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:709:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // InternalWater.g:710:2: rule__Position__Group__0__Impl rule__Position__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Position__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__0"


    // $ANTLR start "rule__Position__Group__0__Impl"
    // InternalWater.g:717:1: rule__Position__Group__0__Impl : ( 'X' ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:721:1: ( ( 'X' ) )
            // InternalWater.g:722:1: ( 'X' )
            {
            // InternalWater.g:722:1: ( 'X' )
            // InternalWater.g:723:2: 'X'
            {
             before(grammarAccess.getPositionAccess().getXKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getXKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__0__Impl"


    // $ANTLR start "rule__Position__Group__1"
    // InternalWater.g:732:1: rule__Position__Group__1 : rule__Position__Group__1__Impl rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:736:1: ( rule__Position__Group__1__Impl rule__Position__Group__2 )
            // InternalWater.g:737:2: rule__Position__Group__1__Impl rule__Position__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Position__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__1"


    // $ANTLR start "rule__Position__Group__1__Impl"
    // InternalWater.g:744:1: rule__Position__Group__1__Impl : ( ( rule__Position__XAssignment_1 ) ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:748:1: ( ( ( rule__Position__XAssignment_1 ) ) )
            // InternalWater.g:749:1: ( ( rule__Position__XAssignment_1 ) )
            {
            // InternalWater.g:749:1: ( ( rule__Position__XAssignment_1 ) )
            // InternalWater.g:750:2: ( rule__Position__XAssignment_1 )
            {
             before(grammarAccess.getPositionAccess().getXAssignment_1()); 
            // InternalWater.g:751:2: ( rule__Position__XAssignment_1 )
            // InternalWater.g:751:3: rule__Position__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Position__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getXAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__1__Impl"


    // $ANTLR start "rule__Position__Group__2"
    // InternalWater.g:759:1: rule__Position__Group__2 : rule__Position__Group__2__Impl rule__Position__Group__3 ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:763:1: ( rule__Position__Group__2__Impl rule__Position__Group__3 )
            // InternalWater.g:764:2: rule__Position__Group__2__Impl rule__Position__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Position__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__2"


    // $ANTLR start "rule__Position__Group__2__Impl"
    // InternalWater.g:771:1: rule__Position__Group__2__Impl : ( 'Y' ) ;
    public final void rule__Position__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:775:1: ( ( 'Y' ) )
            // InternalWater.g:776:1: ( 'Y' )
            {
            // InternalWater.g:776:1: ( 'Y' )
            // InternalWater.g:777:2: 'Y'
            {
             before(grammarAccess.getPositionAccess().getYKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getYKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__2__Impl"


    // $ANTLR start "rule__Position__Group__3"
    // InternalWater.g:786:1: rule__Position__Group__3 : rule__Position__Group__3__Impl ;
    public final void rule__Position__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:790:1: ( rule__Position__Group__3__Impl )
            // InternalWater.g:791:2: rule__Position__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__3"


    // $ANTLR start "rule__Position__Group__3__Impl"
    // InternalWater.g:797:1: rule__Position__Group__3__Impl : ( ( rule__Position__YAssignment_3 ) ) ;
    public final void rule__Position__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:801:1: ( ( ( rule__Position__YAssignment_3 ) ) )
            // InternalWater.g:802:1: ( ( rule__Position__YAssignment_3 ) )
            {
            // InternalWater.g:802:1: ( ( rule__Position__YAssignment_3 ) )
            // InternalWater.g:803:2: ( rule__Position__YAssignment_3 )
            {
             before(grammarAccess.getPositionAccess().getYAssignment_3()); 
            // InternalWater.g:804:2: ( rule__Position__YAssignment_3 )
            // InternalWater.g:804:3: rule__Position__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Position__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getYAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__3__Impl"


    // $ANTLR start "rule__Item__Group__0"
    // InternalWater.g:813:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:817:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // InternalWater.g:818:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Item__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__0"


    // $ANTLR start "rule__Item__Group__0__Impl"
    // InternalWater.g:825:1: rule__Item__Group__0__Impl : ( 'item' ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:829:1: ( ( 'item' ) )
            // InternalWater.g:830:1: ( 'item' )
            {
            // InternalWater.g:830:1: ( 'item' )
            // InternalWater.g:831:2: 'item'
            {
             before(grammarAccess.getItemAccess().getItemKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__0__Impl"


    // $ANTLR start "rule__Item__Group__1"
    // InternalWater.g:840:1: rule__Item__Group__1 : rule__Item__Group__1__Impl rule__Item__Group__2 ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:844:1: ( rule__Item__Group__1__Impl rule__Item__Group__2 )
            // InternalWater.g:845:2: rule__Item__Group__1__Impl rule__Item__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Item__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__1"


    // $ANTLR start "rule__Item__Group__1__Impl"
    // InternalWater.g:852:1: rule__Item__Group__1__Impl : ( ( rule__Item__NameAssignment_1 ) ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:856:1: ( ( ( rule__Item__NameAssignment_1 ) ) )
            // InternalWater.g:857:1: ( ( rule__Item__NameAssignment_1 ) )
            {
            // InternalWater.g:857:1: ( ( rule__Item__NameAssignment_1 ) )
            // InternalWater.g:858:2: ( rule__Item__NameAssignment_1 )
            {
             before(grammarAccess.getItemAccess().getNameAssignment_1()); 
            // InternalWater.g:859:2: ( rule__Item__NameAssignment_1 )
            // InternalWater.g:859:3: rule__Item__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Item__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__1__Impl"


    // $ANTLR start "rule__Item__Group__2"
    // InternalWater.g:867:1: rule__Item__Group__2 : rule__Item__Group__2__Impl rule__Item__Group__3 ;
    public final void rule__Item__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:871:1: ( rule__Item__Group__2__Impl rule__Item__Group__3 )
            // InternalWater.g:872:2: rule__Item__Group__2__Impl rule__Item__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Item__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__2"


    // $ANTLR start "rule__Item__Group__2__Impl"
    // InternalWater.g:879:1: rule__Item__Group__2__Impl : ( 'attackBonus' ) ;
    public final void rule__Item__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:883:1: ( ( 'attackBonus' ) )
            // InternalWater.g:884:1: ( 'attackBonus' )
            {
            // InternalWater.g:884:1: ( 'attackBonus' )
            // InternalWater.g:885:2: 'attackBonus'
            {
             before(grammarAccess.getItemAccess().getAttackBonusKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getAttackBonusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__2__Impl"


    // $ANTLR start "rule__Item__Group__3"
    // InternalWater.g:894:1: rule__Item__Group__3 : rule__Item__Group__3__Impl rule__Item__Group__4 ;
    public final void rule__Item__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:898:1: ( rule__Item__Group__3__Impl rule__Item__Group__4 )
            // InternalWater.g:899:2: rule__Item__Group__3__Impl rule__Item__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Item__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__3"


    // $ANTLR start "rule__Item__Group__3__Impl"
    // InternalWater.g:906:1: rule__Item__Group__3__Impl : ( ( rule__Item__AttackBonusAssignment_3 ) ) ;
    public final void rule__Item__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:910:1: ( ( ( rule__Item__AttackBonusAssignment_3 ) ) )
            // InternalWater.g:911:1: ( ( rule__Item__AttackBonusAssignment_3 ) )
            {
            // InternalWater.g:911:1: ( ( rule__Item__AttackBonusAssignment_3 ) )
            // InternalWater.g:912:2: ( rule__Item__AttackBonusAssignment_3 )
            {
             before(grammarAccess.getItemAccess().getAttackBonusAssignment_3()); 
            // InternalWater.g:913:2: ( rule__Item__AttackBonusAssignment_3 )
            // InternalWater.g:913:3: rule__Item__AttackBonusAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Item__AttackBonusAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getAttackBonusAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__3__Impl"


    // $ANTLR start "rule__Item__Group__4"
    // InternalWater.g:921:1: rule__Item__Group__4 : rule__Item__Group__4__Impl rule__Item__Group__5 ;
    public final void rule__Item__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:925:1: ( rule__Item__Group__4__Impl rule__Item__Group__5 )
            // InternalWater.g:926:2: rule__Item__Group__4__Impl rule__Item__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Item__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__4"


    // $ANTLR start "rule__Item__Group__4__Impl"
    // InternalWater.g:933:1: rule__Item__Group__4__Impl : ( 'defenseBonus' ) ;
    public final void rule__Item__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:937:1: ( ( 'defenseBonus' ) )
            // InternalWater.g:938:1: ( 'defenseBonus' )
            {
            // InternalWater.g:938:1: ( 'defenseBonus' )
            // InternalWater.g:939:2: 'defenseBonus'
            {
             before(grammarAccess.getItemAccess().getDefenseBonusKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getDefenseBonusKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__4__Impl"


    // $ANTLR start "rule__Item__Group__5"
    // InternalWater.g:948:1: rule__Item__Group__5 : rule__Item__Group__5__Impl rule__Item__Group__6 ;
    public final void rule__Item__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:952:1: ( rule__Item__Group__5__Impl rule__Item__Group__6 )
            // InternalWater.g:953:2: rule__Item__Group__5__Impl rule__Item__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Item__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__5"


    // $ANTLR start "rule__Item__Group__5__Impl"
    // InternalWater.g:960:1: rule__Item__Group__5__Impl : ( ( rule__Item__DefenseBonusAssignment_5 ) ) ;
    public final void rule__Item__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:964:1: ( ( ( rule__Item__DefenseBonusAssignment_5 ) ) )
            // InternalWater.g:965:1: ( ( rule__Item__DefenseBonusAssignment_5 ) )
            {
            // InternalWater.g:965:1: ( ( rule__Item__DefenseBonusAssignment_5 ) )
            // InternalWater.g:966:2: ( rule__Item__DefenseBonusAssignment_5 )
            {
             before(grammarAccess.getItemAccess().getDefenseBonusAssignment_5()); 
            // InternalWater.g:967:2: ( rule__Item__DefenseBonusAssignment_5 )
            // InternalWater.g:967:3: rule__Item__DefenseBonusAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Item__DefenseBonusAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getDefenseBonusAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__5__Impl"


    // $ANTLR start "rule__Item__Group__6"
    // InternalWater.g:975:1: rule__Item__Group__6 : rule__Item__Group__6__Impl ;
    public final void rule__Item__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:979:1: ( rule__Item__Group__6__Impl )
            // InternalWater.g:980:2: rule__Item__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__6"


    // $ANTLR start "rule__Item__Group__6__Impl"
    // InternalWater.g:986:1: rule__Item__Group__6__Impl : ( ( rule__Item__Alternatives_6 ) ) ;
    public final void rule__Item__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:990:1: ( ( ( rule__Item__Alternatives_6 ) ) )
            // InternalWater.g:991:1: ( ( rule__Item__Alternatives_6 ) )
            {
            // InternalWater.g:991:1: ( ( rule__Item__Alternatives_6 ) )
            // InternalWater.g:992:2: ( rule__Item__Alternatives_6 )
            {
             before(grammarAccess.getItemAccess().getAlternatives_6()); 
            // InternalWater.g:993:2: ( rule__Item__Alternatives_6 )
            // InternalWater.g:993:3: rule__Item__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__Item__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__6__Impl"


    // $ANTLR start "rule__ComputerGame__ElementsAssignment"
    // InternalWater.g:1002:1: rule__ComputerGame__ElementsAssignment : ( ruleType ) ;
    public final void rule__ComputerGame__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1006:1: ( ( ruleType ) )
            // InternalWater.g:1007:2: ( ruleType )
            {
            // InternalWater.g:1007:2: ( ruleType )
            // InternalWater.g:1008:3: ruleType
            {
             before(grammarAccess.getComputerGameAccess().getElementsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getComputerGameAccess().getElementsTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputerGame__ElementsAssignment"


    // $ANTLR start "rule__Level__NameAssignment_1"
    // InternalWater.g:1017:1: rule__Level__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Level__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1021:1: ( ( RULE_ID ) )
            // InternalWater.g:1022:2: ( RULE_ID )
            {
            // InternalWater.g:1022:2: ( RULE_ID )
            // InternalWater.g:1023:3: RULE_ID
            {
             before(grammarAccess.getLevelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLevelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__NameAssignment_1"


    // $ANTLR start "rule__Level__FieldAssignment_2"
    // InternalWater.g:1032:1: rule__Level__FieldAssignment_2 : ( ruleField ) ;
    public final void rule__Level__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1036:1: ( ( ruleField ) )
            // InternalWater.g:1037:2: ( ruleField )
            {
            // InternalWater.g:1037:2: ( ruleField )
            // InternalWater.g:1038:3: ruleField
            {
             before(grammarAccess.getLevelAccess().getFieldFieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getLevelAccess().getFieldFieldParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__FieldAssignment_2"


    // $ANTLR start "rule__Field__RectangleAssignment_1"
    // InternalWater.g:1047:1: rule__Field__RectangleAssignment_1 : ( ruleRectangle ) ;
    public final void rule__Field__RectangleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1051:1: ( ( ruleRectangle ) )
            // InternalWater.g:1052:2: ( ruleRectangle )
            {
            // InternalWater.g:1052:2: ( ruleRectangle )
            // InternalWater.g:1053:3: ruleRectangle
            {
             before(grammarAccess.getFieldAccess().getRectangleRectangleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRectangle();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getRectangleRectangleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__RectangleAssignment_1"


    // $ANTLR start "rule__Field__HerosAssignment_2"
    // InternalWater.g:1062:1: rule__Field__HerosAssignment_2 : ( ruleHero ) ;
    public final void rule__Field__HerosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1066:1: ( ( ruleHero ) )
            // InternalWater.g:1067:2: ( ruleHero )
            {
            // InternalWater.g:1067:2: ( ruleHero )
            // InternalWater.g:1068:3: ruleHero
            {
             before(grammarAccess.getFieldAccess().getHerosHeroParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHero();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getHerosHeroParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__HerosAssignment_2"


    // $ANTLR start "rule__Field__ItemsAssignment_3"
    // InternalWater.g:1077:1: rule__Field__ItemsAssignment_3 : ( ruleItem ) ;
    public final void rule__Field__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1081:1: ( ( ruleItem ) )
            // InternalWater.g:1082:2: ( ruleItem )
            {
            // InternalWater.g:1082:2: ( ruleItem )
            // InternalWater.g:1083:3: ruleItem
            {
             before(grammarAccess.getFieldAccess().getItemsItemParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getItemsItemParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__ItemsAssignment_3"


    // $ANTLR start "rule__Rectangle__XAssignment_2"
    // InternalWater.g:1092:1: rule__Rectangle__XAssignment_2 : ( RULE_INT ) ;
    public final void rule__Rectangle__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1096:1: ( ( RULE_INT ) )
            // InternalWater.g:1097:2: ( RULE_INT )
            {
            // InternalWater.g:1097:2: ( RULE_INT )
            // InternalWater.g:1098:3: RULE_INT
            {
             before(grammarAccess.getRectangleAccess().getXINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getXINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__XAssignment_2"


    // $ANTLR start "rule__Rectangle__YAssignment_4"
    // InternalWater.g:1107:1: rule__Rectangle__YAssignment_4 : ( RULE_INT ) ;
    public final void rule__Rectangle__YAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1111:1: ( ( RULE_INT ) )
            // InternalWater.g:1112:2: ( RULE_INT )
            {
            // InternalWater.g:1112:2: ( RULE_INT )
            // InternalWater.g:1113:3: RULE_INT
            {
             before(grammarAccess.getRectangleAccess().getYINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getYINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__YAssignment_4"


    // $ANTLR start "rule__Hero__PositionAssignment_1"
    // InternalWater.g:1122:1: rule__Hero__PositionAssignment_1 : ( rulePosition ) ;
    public final void rule__Hero__PositionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1126:1: ( ( rulePosition ) )
            // InternalWater.g:1127:2: ( rulePosition )
            {
            // InternalWater.g:1127:2: ( rulePosition )
            // InternalWater.g:1128:3: rulePosition
            {
             before(grammarAccess.getHeroAccess().getPositionPositionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getHeroAccess().getPositionPositionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hero__PositionAssignment_1"


    // $ANTLR start "rule__Hero__IsBossAssignment_2"
    // InternalWater.g:1137:1: rule__Hero__IsBossAssignment_2 : ( ( 'isBoss' ) ) ;
    public final void rule__Hero__IsBossAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1141:1: ( ( ( 'isBoss' ) ) )
            // InternalWater.g:1142:2: ( ( 'isBoss' ) )
            {
            // InternalWater.g:1142:2: ( ( 'isBoss' ) )
            // InternalWater.g:1143:3: ( 'isBoss' )
            {
             before(grammarAccess.getHeroAccess().getIsBossIsBossKeyword_2_0()); 
            // InternalWater.g:1144:3: ( 'isBoss' )
            // InternalWater.g:1145:4: 'isBoss'
            {
             before(grammarAccess.getHeroAccess().getIsBossIsBossKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHeroAccess().getIsBossIsBossKeyword_2_0()); 

            }

             after(grammarAccess.getHeroAccess().getIsBossIsBossKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hero__IsBossAssignment_2"


    // $ANTLR start "rule__Position__XAssignment_1"
    // InternalWater.g:1156:1: rule__Position__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Position__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1160:1: ( ( RULE_INT ) )
            // InternalWater.g:1161:2: ( RULE_INT )
            {
            // InternalWater.g:1161:2: ( RULE_INT )
            // InternalWater.g:1162:3: RULE_INT
            {
             before(grammarAccess.getPositionAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getXINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__XAssignment_1"


    // $ANTLR start "rule__Position__YAssignment_3"
    // InternalWater.g:1171:1: rule__Position__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Position__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1175:1: ( ( RULE_INT ) )
            // InternalWater.g:1176:2: ( RULE_INT )
            {
            // InternalWater.g:1176:2: ( RULE_INT )
            // InternalWater.g:1177:3: RULE_INT
            {
             before(grammarAccess.getPositionAccess().getYINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getYINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__YAssignment_3"


    // $ANTLR start "rule__Item__NameAssignment_1"
    // InternalWater.g:1186:1: rule__Item__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Item__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1190:1: ( ( RULE_ID ) )
            // InternalWater.g:1191:2: ( RULE_ID )
            {
            // InternalWater.g:1191:2: ( RULE_ID )
            // InternalWater.g:1192:3: RULE_ID
            {
             before(grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__NameAssignment_1"


    // $ANTLR start "rule__Item__AttackBonusAssignment_3"
    // InternalWater.g:1201:1: rule__Item__AttackBonusAssignment_3 : ( RULE_INT ) ;
    public final void rule__Item__AttackBonusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1205:1: ( ( RULE_INT ) )
            // InternalWater.g:1206:2: ( RULE_INT )
            {
            // InternalWater.g:1206:2: ( RULE_INT )
            // InternalWater.g:1207:3: RULE_INT
            {
             before(grammarAccess.getItemAccess().getAttackBonusINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getAttackBonusINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__AttackBonusAssignment_3"


    // $ANTLR start "rule__Item__DefenseBonusAssignment_5"
    // InternalWater.g:1216:1: rule__Item__DefenseBonusAssignment_5 : ( RULE_INT ) ;
    public final void rule__Item__DefenseBonusAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1220:1: ( ( RULE_INT ) )
            // InternalWater.g:1221:2: ( RULE_INT )
            {
            // InternalWater.g:1221:2: ( RULE_INT )
            // InternalWater.g:1222:3: RULE_INT
            {
             before(grammarAccess.getItemAccess().getDefenseBonusINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getDefenseBonusINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__DefenseBonusAssignment_5"


    // $ANTLR start "rule__Item__LocationAssignment_6_0"
    // InternalWater.g:1231:1: rule__Item__LocationAssignment_6_0 : ( rulePosition ) ;
    public final void rule__Item__LocationAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1235:1: ( ( rulePosition ) )
            // InternalWater.g:1236:2: ( rulePosition )
            {
            // InternalWater.g:1236:2: ( rulePosition )
            // InternalWater.g:1237:3: rulePosition
            {
             before(grammarAccess.getItemAccess().getLocationPositionParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getItemAccess().getLocationPositionParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__LocationAssignment_6_0"


    // $ANTLR start "rule__Item__HeroAssignment_6_1"
    // InternalWater.g:1246:1: rule__Item__HeroAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Item__HeroAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:1250:1: ( ( ( RULE_ID ) ) )
            // InternalWater.g:1251:2: ( ( RULE_ID ) )
            {
            // InternalWater.g:1251:2: ( ( RULE_ID ) )
            // InternalWater.g:1252:3: ( RULE_ID )
            {
             before(grammarAccess.getItemAccess().getHeroHeroCrossReference_6_1_0()); 
            // InternalWater.g:1253:3: ( RULE_ID )
            // InternalWater.g:1254:4: RULE_ID
            {
             before(grammarAccess.getItemAccess().getHeroHeroIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getHeroHeroIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getItemAccess().getHeroHeroCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__HeroAssignment_6_1"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\1\14\uffff";
    static final String dfa_3s = "\1\13\1\uffff\1\4\1\22\1\5\1\23\1\5\1\4\1\5\1\uffff\1\17\1\5\1\uffff";
    static final String dfa_4s = "\1\21\1\uffff\1\4\1\22\1\5\1\23\1\5\1\16\1\5\1\uffff\1\17\1\5\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\7\uffff\1\1\2\uffff\1\1";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\4\uffff\1\1\1\2",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 480:2: ( rule__Field__ItemsAssignment_3 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000030802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004010L});

}