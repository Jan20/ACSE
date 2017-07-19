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



    // $ANTLR start "entryRuleDomainmodel"
    // InternalWater.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalWater.g:54:1: ( ruleDomainmodel EOF )
            // InternalWater.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalWater.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:66:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // InternalWater.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // InternalWater.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            // InternalWater.g:68:3: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // InternalWater.g:69:3: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWater.g:69:4: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleComponent"
    // InternalWater.g:78:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalWater.g:79:1: ( ruleComponent EOF )
            // InternalWater.g:80:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalWater.g:87:1: ruleComponent : ( ( rule__Component__Alternatives ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:91:2: ( ( ( rule__Component__Alternatives ) ) )
            // InternalWater.g:92:2: ( ( rule__Component__Alternatives ) )
            {
            // InternalWater.g:92:2: ( ( rule__Component__Alternatives ) )
            // InternalWater.g:93:3: ( rule__Component__Alternatives )
            {
             before(grammarAccess.getComponentAccess().getAlternatives()); 
            // InternalWater.g:94:3: ( rule__Component__Alternatives )
            // InternalWater.g:94:4: rule__Component__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Component__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleWaterClass"
    // InternalWater.g:103:1: entryRuleWaterClass : ruleWaterClass EOF ;
    public final void entryRuleWaterClass() throws RecognitionException {
        try {
            // InternalWater.g:104:1: ( ruleWaterClass EOF )
            // InternalWater.g:105:1: ruleWaterClass EOF
            {
             before(grammarAccess.getWaterClassRule()); 
            pushFollow(FOLLOW_1);
            ruleWaterClass();

            state._fsp--;

             after(grammarAccess.getWaterClassRule()); 
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
    // $ANTLR end "entryRuleWaterClass"


    // $ANTLR start "ruleWaterClass"
    // InternalWater.g:112:1: ruleWaterClass : ( ( rule__WaterClass__Group__0 ) ) ;
    public final void ruleWaterClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:116:2: ( ( ( rule__WaterClass__Group__0 ) ) )
            // InternalWater.g:117:2: ( ( rule__WaterClass__Group__0 ) )
            {
            // InternalWater.g:117:2: ( ( rule__WaterClass__Group__0 ) )
            // InternalWater.g:118:3: ( rule__WaterClass__Group__0 )
            {
             before(grammarAccess.getWaterClassAccess().getGroup()); 
            // InternalWater.g:119:3: ( rule__WaterClass__Group__0 )
            // InternalWater.g:119:4: rule__WaterClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WaterClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaterClassAccess().getGroup()); 

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
    // $ANTLR end "ruleWaterClass"


    // $ANTLR start "entryRuleWaterVariable"
    // InternalWater.g:128:1: entryRuleWaterVariable : ruleWaterVariable EOF ;
    public final void entryRuleWaterVariable() throws RecognitionException {
        try {
            // InternalWater.g:129:1: ( ruleWaterVariable EOF )
            // InternalWater.g:130:1: ruleWaterVariable EOF
            {
             before(grammarAccess.getWaterVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleWaterVariable();

            state._fsp--;

             after(grammarAccess.getWaterVariableRule()); 
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
    // $ANTLR end "entryRuleWaterVariable"


    // $ANTLR start "ruleWaterVariable"
    // InternalWater.g:137:1: ruleWaterVariable : ( ( rule__WaterVariable__Group__0 ) ) ;
    public final void ruleWaterVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:141:2: ( ( ( rule__WaterVariable__Group__0 ) ) )
            // InternalWater.g:142:2: ( ( rule__WaterVariable__Group__0 ) )
            {
            // InternalWater.g:142:2: ( ( rule__WaterVariable__Group__0 ) )
            // InternalWater.g:143:3: ( rule__WaterVariable__Group__0 )
            {
             before(grammarAccess.getWaterVariableAccess().getGroup()); 
            // InternalWater.g:144:3: ( rule__WaterVariable__Group__0 )
            // InternalWater.g:144:4: rule__WaterVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WaterVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaterVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleWaterVariable"


    // $ANTLR start "rule__Component__Alternatives"
    // InternalWater.g:152:1: rule__Component__Alternatives : ( ( ruleWaterClass ) | ( ruleWaterVariable ) );
    public final void rule__Component__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:156:1: ( ( ruleWaterClass ) | ( ruleWaterVariable ) )
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
                    // InternalWater.g:157:2: ( ruleWaterClass )
                    {
                    // InternalWater.g:157:2: ( ruleWaterClass )
                    // InternalWater.g:158:3: ruleWaterClass
                    {
                     before(grammarAccess.getComponentAccess().getWaterClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWaterClass();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getWaterClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWater.g:163:2: ( ruleWaterVariable )
                    {
                    // InternalWater.g:163:2: ( ruleWaterVariable )
                    // InternalWater.g:164:3: ruleWaterVariable
                    {
                     before(grammarAccess.getComponentAccess().getWaterVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWaterVariable();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getWaterVariableParserRuleCall_1()); 

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
    // $ANTLR end "rule__Component__Alternatives"


    // $ANTLR start "rule__WaterClass__Group__0"
    // InternalWater.g:173:1: rule__WaterClass__Group__0 : rule__WaterClass__Group__0__Impl rule__WaterClass__Group__1 ;
    public final void rule__WaterClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:177:1: ( rule__WaterClass__Group__0__Impl rule__WaterClass__Group__1 )
            // InternalWater.g:178:2: rule__WaterClass__Group__0__Impl rule__WaterClass__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__WaterClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaterClass__Group__1();

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
    // $ANTLR end "rule__WaterClass__Group__0"


    // $ANTLR start "rule__WaterClass__Group__0__Impl"
    // InternalWater.g:185:1: rule__WaterClass__Group__0__Impl : ( 'waterClass' ) ;
    public final void rule__WaterClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:189:1: ( ( 'waterClass' ) )
            // InternalWater.g:190:1: ( 'waterClass' )
            {
            // InternalWater.g:190:1: ( 'waterClass' )
            // InternalWater.g:191:2: 'waterClass'
            {
             before(grammarAccess.getWaterClassAccess().getWaterClassKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getWaterClassAccess().getWaterClassKeyword_0()); 

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
    // $ANTLR end "rule__WaterClass__Group__0__Impl"


    // $ANTLR start "rule__WaterClass__Group__1"
    // InternalWater.g:200:1: rule__WaterClass__Group__1 : rule__WaterClass__Group__1__Impl rule__WaterClass__Group__2 ;
    public final void rule__WaterClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:204:1: ( rule__WaterClass__Group__1__Impl rule__WaterClass__Group__2 )
            // InternalWater.g:205:2: rule__WaterClass__Group__1__Impl rule__WaterClass__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__WaterClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaterClass__Group__2();

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
    // $ANTLR end "rule__WaterClass__Group__1"


    // $ANTLR start "rule__WaterClass__Group__1__Impl"
    // InternalWater.g:212:1: rule__WaterClass__Group__1__Impl : ( ( rule__WaterClass__NameAssignment_1 ) ) ;
    public final void rule__WaterClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:216:1: ( ( ( rule__WaterClass__NameAssignment_1 ) ) )
            // InternalWater.g:217:1: ( ( rule__WaterClass__NameAssignment_1 ) )
            {
            // InternalWater.g:217:1: ( ( rule__WaterClass__NameAssignment_1 ) )
            // InternalWater.g:218:2: ( rule__WaterClass__NameAssignment_1 )
            {
             before(grammarAccess.getWaterClassAccess().getNameAssignment_1()); 
            // InternalWater.g:219:2: ( rule__WaterClass__NameAssignment_1 )
            // InternalWater.g:219:3: rule__WaterClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WaterClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWaterClassAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__WaterClass__Group__1__Impl"


    // $ANTLR start "rule__WaterClass__Group__2"
    // InternalWater.g:227:1: rule__WaterClass__Group__2 : rule__WaterClass__Group__2__Impl rule__WaterClass__Group__3 ;
    public final void rule__WaterClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:231:1: ( rule__WaterClass__Group__2__Impl rule__WaterClass__Group__3 )
            // InternalWater.g:232:2: rule__WaterClass__Group__2__Impl rule__WaterClass__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__WaterClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaterClass__Group__3();

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
    // $ANTLR end "rule__WaterClass__Group__2"


    // $ANTLR start "rule__WaterClass__Group__2__Impl"
    // InternalWater.g:239:1: rule__WaterClass__Group__2__Impl : ( '{' ) ;
    public final void rule__WaterClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:243:1: ( ( '{' ) )
            // InternalWater.g:244:1: ( '{' )
            {
            // InternalWater.g:244:1: ( '{' )
            // InternalWater.g:245:2: '{'
            {
             before(grammarAccess.getWaterClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWaterClassAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__WaterClass__Group__2__Impl"


    // $ANTLR start "rule__WaterClass__Group__3"
    // InternalWater.g:254:1: rule__WaterClass__Group__3 : rule__WaterClass__Group__3__Impl rule__WaterClass__Group__4 ;
    public final void rule__WaterClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:258:1: ( rule__WaterClass__Group__3__Impl rule__WaterClass__Group__4 )
            // InternalWater.g:259:2: rule__WaterClass__Group__3__Impl rule__WaterClass__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__WaterClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaterClass__Group__4();

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
    // $ANTLR end "rule__WaterClass__Group__3"


    // $ANTLR start "rule__WaterClass__Group__3__Impl"
    // InternalWater.g:266:1: rule__WaterClass__Group__3__Impl : ( ( rule__WaterClass__VariablesAssignment_3 )* ) ;
    public final void rule__WaterClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:270:1: ( ( ( rule__WaterClass__VariablesAssignment_3 )* ) )
            // InternalWater.g:271:1: ( ( rule__WaterClass__VariablesAssignment_3 )* )
            {
            // InternalWater.g:271:1: ( ( rule__WaterClass__VariablesAssignment_3 )* )
            // InternalWater.g:272:2: ( rule__WaterClass__VariablesAssignment_3 )*
            {
             before(grammarAccess.getWaterClassAccess().getVariablesAssignment_3()); 
            // InternalWater.g:273:2: ( rule__WaterClass__VariablesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWater.g:273:3: rule__WaterClass__VariablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__WaterClass__VariablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getWaterClassAccess().getVariablesAssignment_3()); 

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
    // $ANTLR end "rule__WaterClass__Group__3__Impl"


    // $ANTLR start "rule__WaterClass__Group__4"
    // InternalWater.g:281:1: rule__WaterClass__Group__4 : rule__WaterClass__Group__4__Impl ;
    public final void rule__WaterClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:285:1: ( rule__WaterClass__Group__4__Impl )
            // InternalWater.g:286:2: rule__WaterClass__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WaterClass__Group__4__Impl();

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
    // $ANTLR end "rule__WaterClass__Group__4"


    // $ANTLR start "rule__WaterClass__Group__4__Impl"
    // InternalWater.g:292:1: rule__WaterClass__Group__4__Impl : ( '}' ) ;
    public final void rule__WaterClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:296:1: ( ( '}' ) )
            // InternalWater.g:297:1: ( '}' )
            {
            // InternalWater.g:297:1: ( '}' )
            // InternalWater.g:298:2: '}'
            {
             before(grammarAccess.getWaterClassAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWaterClassAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__WaterClass__Group__4__Impl"


    // $ANTLR start "rule__WaterVariable__Group__0"
    // InternalWater.g:308:1: rule__WaterVariable__Group__0 : rule__WaterVariable__Group__0__Impl rule__WaterVariable__Group__1 ;
    public final void rule__WaterVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:312:1: ( rule__WaterVariable__Group__0__Impl rule__WaterVariable__Group__1 )
            // InternalWater.g:313:2: rule__WaterVariable__Group__0__Impl rule__WaterVariable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__WaterVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaterVariable__Group__1();

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
    // $ANTLR end "rule__WaterVariable__Group__0"


    // $ANTLR start "rule__WaterVariable__Group__0__Impl"
    // InternalWater.g:320:1: rule__WaterVariable__Group__0__Impl : ( 'waterVariable' ) ;
    public final void rule__WaterVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:324:1: ( ( 'waterVariable' ) )
            // InternalWater.g:325:1: ( 'waterVariable' )
            {
            // InternalWater.g:325:1: ( 'waterVariable' )
            // InternalWater.g:326:2: 'waterVariable'
            {
             before(grammarAccess.getWaterVariableAccess().getWaterVariableKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWaterVariableAccess().getWaterVariableKeyword_0()); 

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
    // $ANTLR end "rule__WaterVariable__Group__0__Impl"


    // $ANTLR start "rule__WaterVariable__Group__1"
    // InternalWater.g:335:1: rule__WaterVariable__Group__1 : rule__WaterVariable__Group__1__Impl ;
    public final void rule__WaterVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:339:1: ( rule__WaterVariable__Group__1__Impl )
            // InternalWater.g:340:2: rule__WaterVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WaterVariable__Group__1__Impl();

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
    // $ANTLR end "rule__WaterVariable__Group__1"


    // $ANTLR start "rule__WaterVariable__Group__1__Impl"
    // InternalWater.g:346:1: rule__WaterVariable__Group__1__Impl : ( ( rule__WaterVariable__NameAssignment_1 ) ) ;
    public final void rule__WaterVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:350:1: ( ( ( rule__WaterVariable__NameAssignment_1 ) ) )
            // InternalWater.g:351:1: ( ( rule__WaterVariable__NameAssignment_1 ) )
            {
            // InternalWater.g:351:1: ( ( rule__WaterVariable__NameAssignment_1 ) )
            // InternalWater.g:352:2: ( rule__WaterVariable__NameAssignment_1 )
            {
             before(grammarAccess.getWaterVariableAccess().getNameAssignment_1()); 
            // InternalWater.g:353:2: ( rule__WaterVariable__NameAssignment_1 )
            // InternalWater.g:353:3: rule__WaterVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WaterVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWaterVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__WaterVariable__Group__1__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // InternalWater.g:362:1: rule__Domainmodel__ElementsAssignment : ( ruleComponent ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:366:1: ( ( ruleComponent ) )
            // InternalWater.g:367:2: ( ruleComponent )
            {
            // InternalWater.g:367:2: ( ruleComponent )
            // InternalWater.g:368:3: ruleComponent
            {
             before(grammarAccess.getDomainmodelAccess().getElementsComponentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsComponentParserRuleCall_0()); 

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
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__WaterClass__NameAssignment_1"
    // InternalWater.g:377:1: rule__WaterClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WaterClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:381:1: ( ( RULE_ID ) )
            // InternalWater.g:382:2: ( RULE_ID )
            {
            // InternalWater.g:382:2: ( RULE_ID )
            // InternalWater.g:383:3: RULE_ID
            {
             before(grammarAccess.getWaterClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWaterClassAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__WaterClass__NameAssignment_1"


    // $ANTLR start "rule__WaterClass__VariablesAssignment_3"
    // InternalWater.g:392:1: rule__WaterClass__VariablesAssignment_3 : ( ruleWaterVariable ) ;
    public final void rule__WaterClass__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:396:1: ( ( ruleWaterVariable ) )
            // InternalWater.g:397:2: ( ruleWaterVariable )
            {
            // InternalWater.g:397:2: ( ruleWaterVariable )
            // InternalWater.g:398:3: ruleWaterVariable
            {
             before(grammarAccess.getWaterClassAccess().getVariablesWaterVariableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWaterVariable();

            state._fsp--;

             after(grammarAccess.getWaterClassAccess().getVariablesWaterVariableParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__WaterClass__VariablesAssignment_3"


    // $ANTLR start "rule__WaterVariable__NameAssignment_1"
    // InternalWater.g:407:1: rule__WaterVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WaterVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWater.g:411:1: ( ( RULE_ID ) )
            // InternalWater.g:412:2: ( RULE_ID )
            {
            // InternalWater.g:412:2: ( RULE_ID )
            // InternalWater.g:413:3: RULE_ID
            {
             before(grammarAccess.getWaterVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWaterVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__WaterVariable__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006800L});

}