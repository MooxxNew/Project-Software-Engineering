package org.xtext.SQL.mydsl1.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.SQL.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'<'", "'>'", "'<='", "'>='", "'SELECT'", "'FROM'", "','", "'WHERE'", "';'", "'AND'", "'('", "')'", "'OR'"
    };
    public static final int RULE_ID=4;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleModel EOF )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleModel : ( ( ( rule__Model__SelectsAssignment ) ) ( ( rule__Model__SelectsAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( ( rule__Model__SelectsAssignment ) ) ( ( rule__Model__SelectsAssignment )* ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( ( rule__Model__SelectsAssignment ) ) ( ( rule__Model__SelectsAssignment )* ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( ( rule__Model__SelectsAssignment ) ) ( ( rule__Model__SelectsAssignment )* ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( ( rule__Model__SelectsAssignment ) ) ( ( rule__Model__SelectsAssignment )* )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( ( rule__Model__SelectsAssignment ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Model__SelectsAssignment )
            {
             before(grammarAccess.getModelAccess().getSelectsAssignment()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:77:1: ( rule__Model__SelectsAssignment )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:77:2: rule__Model__SelectsAssignment
            {
            pushFollow(FOLLOW_rule__Model__SelectsAssignment_in_ruleModel96);
            rule__Model__SelectsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSelectsAssignment()); 

            }

            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:80:1: ( ( rule__Model__SelectsAssignment )* )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:81:1: ( rule__Model__SelectsAssignment )*
            {
             before(grammarAccess.getModelAccess().getSelectsAssignment()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:82:1: ( rule__Model__SelectsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:82:2: rule__Model__SelectsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__SelectsAssignment_in_ruleModel108);
            	    rule__Model__SelectsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSelectsAssignment()); 

            }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSelect"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:95:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:96:1: ( ruleSelect EOF )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect138);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect145); 

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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:108:2: ( ( ( rule__Select__Group__0 ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:109:1: ( ( rule__Select__Group__0 ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:109:1: ( ( rule__Select__Group__0 ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:110:1: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:111:1: ( rule__Select__Group__0 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:111:2: rule__Select__Group__0
            {
            pushFollow(FOLLOW_rule__Select__Group__0_in_ruleSelect171);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleVariable"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:123:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:124:1: ( ruleVariable EOF )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable198);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable205); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:136:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:137:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:137:1: ( ( rule__Variable__Group__0 ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:138:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:139:1: ( rule__Variable__Group__0 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:139:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable231);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleValue"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:151:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:152:1: ( ruleValue EOF )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue258);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue265); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ruleValue : ( ( rule__Value__NameAssignment ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:164:2: ( ( ( rule__Value__NameAssignment ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:165:1: ( ( rule__Value__NameAssignment ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:165:1: ( ( rule__Value__NameAssignment ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:166:1: ( rule__Value__NameAssignment )
            {
             before(grammarAccess.getValueAccess().getNameAssignment()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:167:1: ( rule__Value__NameAssignment )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:167:2: rule__Value__NameAssignment
            {
            pushFollow(FOLLOW_rule__Value__NameAssignment_in_ruleValue291);
            rule__Value__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleOption"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:179:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:180:1: ( ruleOption EOF )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption318);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption325); 

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ruleOption : ( ( rule__Option__WhereAssignment ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:192:2: ( ( ( rule__Option__WhereAssignment ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:193:1: ( ( rule__Option__WhereAssignment ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:193:1: ( ( rule__Option__WhereAssignment ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:194:1: ( rule__Option__WhereAssignment )
            {
             before(grammarAccess.getOptionAccess().getWhereAssignment()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:195:1: ( rule__Option__WhereAssignment )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:195:2: rule__Option__WhereAssignment
            {
            pushFollow(FOLLOW_rule__Option__WhereAssignment_in_ruleOption351);
            rule__Option__WhereAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getWhereAssignment()); 

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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleWhere"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:207:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:208:1: ( ruleWhere EOF )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleWhere EOF
            {
             before(grammarAccess.getWhereRule()); 
            pushFollow(FOLLOW_ruleWhere_in_entryRuleWhere378);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getWhereRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhere385); 

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
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:220:2: ( ( ( rule__Where__Group__0 ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:221:1: ( ( rule__Where__Group__0 ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:221:1: ( ( rule__Where__Group__0 ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:222:1: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:223:1: ( rule__Where__Group__0 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:223:2: rule__Where__Group__0
            {
            pushFollow(FOLLOW_rule__Where__Group__0_in_ruleWhere411);
            rule__Where__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getGroup()); 

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
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:235:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:236:1: ( ruleExpression EOF )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression438);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression445); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:248:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:249:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:249:1: ( ( rule__Expression__Group__0 ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:250:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:251:1: ( rule__Expression__Group__0 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:251:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression471);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleCondition"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:263:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:264:1: ( ruleCondition EOF )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition498);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition505); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:276:2: ( ( ( rule__Condition__Alternatives ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:277:1: ( ( rule__Condition__Alternatives ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:277:1: ( ( rule__Condition__Alternatives ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:278:1: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:279:1: ( rule__Condition__Alternatives )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:279:2: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_rule__Condition__Alternatives_in_ruleCondition531);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAND"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:291:1: entryRuleAND : ruleAND EOF ;
    public final void entryRuleAND() throws RecognitionException {
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:292:1: ( ruleAND EOF )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleAND EOF
            {
             before(grammarAccess.getANDRule()); 
            pushFollow(FOLLOW_ruleAND_in_entryRuleAND558);
            ruleAND();

            state._fsp--;

             after(grammarAccess.getANDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAND565); 

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
    // $ANTLR end "entryRuleAND"


    // $ANTLR start "ruleAND"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ruleAND : ( ( rule__AND__Alternatives ) ) ;
    public final void ruleAND() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:304:2: ( ( ( rule__AND__Alternatives ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:305:1: ( ( rule__AND__Alternatives ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:305:1: ( ( rule__AND__Alternatives ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:306:1: ( rule__AND__Alternatives )
            {
             before(grammarAccess.getANDAccess().getAlternatives()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:307:1: ( rule__AND__Alternatives )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:307:2: rule__AND__Alternatives
            {
            pushFollow(FOLLOW_rule__AND__Alternatives_in_ruleAND591);
            rule__AND__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getANDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAND"


    // $ANTLR start "entryRuleOR"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:319:1: entryRuleOR : ruleOR EOF ;
    public final void entryRuleOR() throws RecognitionException {
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:320:1: ( ruleOR EOF )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleOR EOF
            {
             before(grammarAccess.getORRule()); 
            pushFollow(FOLLOW_ruleOR_in_entryRuleOR618);
            ruleOR();

            state._fsp--;

             after(grammarAccess.getORRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOR625); 

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
    // $ANTLR end "entryRuleOR"


    // $ANTLR start "ruleOR"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ruleOR : ( ( rule__OR__Alternatives ) ) ;
    public final void ruleOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:332:2: ( ( ( rule__OR__Alternatives ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:333:1: ( ( rule__OR__Alternatives ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:333:1: ( ( rule__OR__Alternatives ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:334:1: ( rule__OR__Alternatives )
            {
             before(grammarAccess.getORAccess().getAlternatives()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:335:1: ( rule__OR__Alternatives )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:335:2: rule__OR__Alternatives
            {
            pushFollow(FOLLOW_rule__OR__Alternatives_in_ruleOR651);
            rule__OR__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getORAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOR"


    // $ANTLR start "rule__Condition__Alternatives"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:347:1: rule__Condition__Alternatives : ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:351:1: ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:352:1: ( '=' )
                    {
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:352:1: ( '=' )
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:353:1: '='
                    {
                     before(grammarAccess.getConditionAccess().getEqualsSignKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Condition__Alternatives688); 
                     after(grammarAccess.getConditionAccess().getEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:360:6: ( '<' )
                    {
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:360:6: ( '<' )
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:361:1: '<'
                    {
                     before(grammarAccess.getConditionAccess().getLessThanSignKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Condition__Alternatives708); 
                     after(grammarAccess.getConditionAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:368:6: ( '>' )
                    {
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:368:6: ( '>' )
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: '>'
                    {
                     before(grammarAccess.getConditionAccess().getGreaterThanSignKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Condition__Alternatives728); 
                     after(grammarAccess.getConditionAccess().getGreaterThanSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:376:6: ( '<=' )
                    {
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:376:6: ( '<=' )
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: '<='
                    {
                     before(grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Condition__Alternatives748); 
                     after(grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:384:6: ( '>=' )
                    {
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:384:6: ( '>=' )
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: '>='
                    {
                     before(grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__Condition__Alternatives768); 
                     after(grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__AND__Alternatives"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: rule__AND__Alternatives : ( ( ( rule__AND__Group_0__0 ) ) | ( ( rule__AND__Group_1__0 ) ) );
    public final void rule__AND__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:401:1: ( ( ( rule__AND__Group_0__0 ) ) | ( ( rule__AND__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else if ( (LA3_1==22) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( ( rule__AND__Group_0__0 ) )
                    {
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( ( rule__AND__Group_0__0 ) )
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:403:1: ( rule__AND__Group_0__0 )
                    {
                     before(grammarAccess.getANDAccess().getGroup_0()); 
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:404:1: ( rule__AND__Group_0__0 )
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:404:2: rule__AND__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AND__Group_0__0_in_rule__AND__Alternatives802);
                    rule__AND__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getANDAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:408:6: ( ( rule__AND__Group_1__0 ) )
                    {
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:408:6: ( ( rule__AND__Group_1__0 ) )
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:409:1: ( rule__AND__Group_1__0 )
                    {
                     before(grammarAccess.getANDAccess().getGroup_1()); 
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( rule__AND__Group_1__0 )
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:410:2: rule__AND__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AND__Group_1__0_in_rule__AND__Alternatives820);
                    rule__AND__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getANDAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AND__Alternatives"


    // $ANTLR start "rule__OR__Alternatives"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:419:1: rule__OR__Alternatives : ( ( ( rule__OR__Group_0__0 ) ) | ( ( rule__OR__Group_1__0 ) ) );
    public final void rule__OR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:423:1: ( ( ( rule__OR__Group_0__0 ) ) | ( ( rule__OR__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==22) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE_ID) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:424:1: ( ( rule__OR__Group_0__0 ) )
                    {
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:424:1: ( ( rule__OR__Group_0__0 ) )
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: ( rule__OR__Group_0__0 )
                    {
                     before(grammarAccess.getORAccess().getGroup_0()); 
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ( rule__OR__Group_0__0 )
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:426:2: rule__OR__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__OR__Group_0__0_in_rule__OR__Alternatives853);
                    rule__OR__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getORAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:430:6: ( ( rule__OR__Group_1__0 ) )
                    {
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:430:6: ( ( rule__OR__Group_1__0 ) )
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:431:1: ( rule__OR__Group_1__0 )
                    {
                     before(grammarAccess.getORAccess().getGroup_1()); 
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:432:1: ( rule__OR__Group_1__0 )
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:432:2: rule__OR__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__OR__Group_1__0_in_rule__OR__Alternatives871);
                    rule__OR__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getORAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OR__Alternatives"


    // $ANTLR start "rule__Select__Group__0"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:443:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:447:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:448:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_rule__Select__Group__0__Impl_in_rule__Select__Group__0902);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group__1_in_rule__Select__Group__0905);
            rule__Select__Group__1();

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
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:455:1: rule__Select__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:459:1: ( ( 'SELECT' ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:460:1: ( 'SELECT' )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:460:1: ( 'SELECT' )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: 'SELECT'
            {
             before(grammarAccess.getSelectAccess().getSELECTKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Select__Group__0__Impl933); 
             after(grammarAccess.getSelectAccess().getSELECTKeyword_0()); 

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
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:474:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:478:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:479:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_rule__Select__Group__1__Impl_in_rule__Select__Group__1964);
            rule__Select__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group__2_in_rule__Select__Group__1967);
            rule__Select__Group__2();

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
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:486:1: rule__Select__Group__1__Impl : ( ( rule__Select__Select_valueAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:490:1: ( ( ( rule__Select__Select_valueAssignment_1 ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:491:1: ( ( rule__Select__Select_valueAssignment_1 ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:491:1: ( ( rule__Select__Select_valueAssignment_1 ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:492:1: ( rule__Select__Select_valueAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getSelect_valueAssignment_1()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:493:1: ( rule__Select__Select_valueAssignment_1 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:493:2: rule__Select__Select_valueAssignment_1
            {
            pushFollow(FOLLOW_rule__Select__Select_valueAssignment_1_in_rule__Select__Group__1__Impl994);
            rule__Select__Select_valueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getSelect_valueAssignment_1()); 

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
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__2"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:503:1: rule__Select__Group__2 : rule__Select__Group__2__Impl rule__Select__Group__3 ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:507:1: ( rule__Select__Group__2__Impl rule__Select__Group__3 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:508:2: rule__Select__Group__2__Impl rule__Select__Group__3
            {
            pushFollow(FOLLOW_rule__Select__Group__2__Impl_in_rule__Select__Group__21024);
            rule__Select__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group__3_in_rule__Select__Group__21027);
            rule__Select__Group__3();

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
    // $ANTLR end "rule__Select__Group__2"


    // $ANTLR start "rule__Select__Group__2__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:515:1: rule__Select__Group__2__Impl : ( 'FROM' ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:519:1: ( ( 'FROM' ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:520:1: ( 'FROM' )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:520:1: ( 'FROM' )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:521:1: 'FROM'
            {
             before(grammarAccess.getSelectAccess().getFROMKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Select__Group__2__Impl1055); 
             after(grammarAccess.getSelectAccess().getFROMKeyword_2()); 

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
    // $ANTLR end "rule__Select__Group__2__Impl"


    // $ANTLR start "rule__Select__Group__3"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:534:1: rule__Select__Group__3 : rule__Select__Group__3__Impl rule__Select__Group__4 ;
    public final void rule__Select__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: ( rule__Select__Group__3__Impl rule__Select__Group__4 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:539:2: rule__Select__Group__3__Impl rule__Select__Group__4
            {
            pushFollow(FOLLOW_rule__Select__Group__3__Impl_in_rule__Select__Group__31086);
            rule__Select__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group__4_in_rule__Select__Group__31089);
            rule__Select__Group__4();

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
    // $ANTLR end "rule__Select__Group__3"


    // $ANTLR start "rule__Select__Group__3__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:546:1: rule__Select__Group__3__Impl : ( ( rule__Select__Froms_valueAssignment_3 ) ) ;
    public final void rule__Select__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( ( rule__Select__Froms_valueAssignment_3 ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( ( rule__Select__Froms_valueAssignment_3 ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( ( rule__Select__Froms_valueAssignment_3 ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( rule__Select__Froms_valueAssignment_3 )
            {
             before(grammarAccess.getSelectAccess().getFroms_valueAssignment_3()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: ( rule__Select__Froms_valueAssignment_3 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:553:2: rule__Select__Froms_valueAssignment_3
            {
            pushFollow(FOLLOW_rule__Select__Froms_valueAssignment_3_in_rule__Select__Group__3__Impl1116);
            rule__Select__Froms_valueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getFroms_valueAssignment_3()); 

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
    // $ANTLR end "rule__Select__Group__3__Impl"


    // $ANTLR start "rule__Select__Group__4"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:563:1: rule__Select__Group__4 : rule__Select__Group__4__Impl ;
    public final void rule__Select__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:567:1: ( rule__Select__Group__4__Impl )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:568:2: rule__Select__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Select__Group__4__Impl_in_rule__Select__Group__41146);
            rule__Select__Group__4__Impl();

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
    // $ANTLR end "rule__Select__Group__4"


    // $ANTLR start "rule__Select__Group__4__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:574:1: rule__Select__Group__4__Impl : ( ( rule__Select__OptionsAssignment_4 )* ) ;
    public final void rule__Select__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ( ( rule__Select__OptionsAssignment_4 )* ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( ( rule__Select__OptionsAssignment_4 )* )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( ( rule__Select__OptionsAssignment_4 )* )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( rule__Select__OptionsAssignment_4 )*
            {
             before(grammarAccess.getSelectAccess().getOptionsAssignment_4()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: ( rule__Select__OptionsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:581:2: rule__Select__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Select__OptionsAssignment_4_in_rule__Select__Group__4__Impl1173);
            	    rule__Select__OptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getOptionsAssignment_4()); 

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
    // $ANTLR end "rule__Select__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:605:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:606:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__01214);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__01217);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__ValuesAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:617:1: ( ( ( rule__Variable__ValuesAssignment_0 ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:618:1: ( ( rule__Variable__ValuesAssignment_0 ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:618:1: ( ( rule__Variable__ValuesAssignment_0 ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:619:1: ( rule__Variable__ValuesAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getValuesAssignment_0()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: ( rule__Variable__ValuesAssignment_0 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:620:2: rule__Variable__ValuesAssignment_0
            {
            pushFollow(FOLLOW_rule__Variable__ValuesAssignment_0_in_rule__Variable__Group__0__Impl1244);
            rule__Variable__ValuesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getValuesAssignment_0()); 

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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:630:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: ( rule__Variable__Group__1__Impl )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:635:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__11274);
            rule__Variable__Group__1__Impl();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:641:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__Group_1__0 )* ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:645:1: ( ( ( rule__Variable__Group_1__0 )* ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: ( ( rule__Variable__Group_1__0 )* )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: ( ( rule__Variable__Group_1__0 )* )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:647:1: ( rule__Variable__Group_1__0 )*
            {
             before(grammarAccess.getVariableAccess().getGroup_1()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: ( rule__Variable__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:648:2: rule__Variable__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Variable__Group_1__0_in_rule__Variable__Group__1__Impl1301);
            	    rule__Variable__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group_1__0"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: rule__Variable__Group_1__0 : rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1 ;
    public final void rule__Variable__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: ( rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:667:2: rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1
            {
            pushFollow(FOLLOW_rule__Variable__Group_1__0__Impl_in_rule__Variable__Group_1__01336);
            rule__Variable__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_1__1_in_rule__Variable__Group_1__01339);
            rule__Variable__Group_1__1();

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
    // $ANTLR end "rule__Variable__Group_1__0"


    // $ANTLR start "rule__Variable__Group_1__0__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:674:1: rule__Variable__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Variable__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: ( ( ',' ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( ',' )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( ',' )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: ','
            {
             before(grammarAccess.getVariableAccess().getCommaKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Variable__Group_1__0__Impl1367); 
             after(grammarAccess.getVariableAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Variable__Group_1__0__Impl"


    // $ANTLR start "rule__Variable__Group_1__1"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: rule__Variable__Group_1__1 : rule__Variable__Group_1__1__Impl ;
    public final void rule__Variable__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:697:1: ( rule__Variable__Group_1__1__Impl )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:698:2: rule__Variable__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group_1__1__Impl_in_rule__Variable__Group_1__11398);
            rule__Variable__Group_1__1__Impl();

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
    // $ANTLR end "rule__Variable__Group_1__1"


    // $ANTLR start "rule__Variable__Group_1__1__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: rule__Variable__Group_1__1__Impl : ( ( rule__Variable__Values1Assignment_1_1 ) ) ;
    public final void rule__Variable__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( ( ( rule__Variable__Values1Assignment_1_1 ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:709:1: ( ( rule__Variable__Values1Assignment_1_1 ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:709:1: ( ( rule__Variable__Values1Assignment_1_1 ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:710:1: ( rule__Variable__Values1Assignment_1_1 )
            {
             before(grammarAccess.getVariableAccess().getValues1Assignment_1_1()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:711:1: ( rule__Variable__Values1Assignment_1_1 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:711:2: rule__Variable__Values1Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Variable__Values1Assignment_1_1_in_rule__Variable__Group_1__1__Impl1425);
            rule__Variable__Values1Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getValues1Assignment_1_1()); 

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
    // $ANTLR end "rule__Variable__Group_1__1__Impl"


    // $ANTLR start "rule__Where__Group__0"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:725:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:729:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:730:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_rule__Where__Group__0__Impl_in_rule__Where__Group__01459);
            rule__Where__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Where__Group__1_in_rule__Where__Group__01462);
            rule__Where__Group__1();

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
    // $ANTLR end "rule__Where__Group__0"


    // $ANTLR start "rule__Where__Group__0__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:737:1: rule__Where__Group__0__Impl : ( 'WHERE' ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: ( ( 'WHERE' ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ( 'WHERE' )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ( 'WHERE' )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: 'WHERE'
            {
             before(grammarAccess.getWhereAccess().getWHEREKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Where__Group__0__Impl1490); 
             after(grammarAccess.getWhereAccess().getWHEREKeyword_0()); 

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
    // $ANTLR end "rule__Where__Group__0__Impl"


    // $ANTLR start "rule__Where__Group__1"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:756:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:760:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:761:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FOLLOW_rule__Where__Group__1__Impl_in_rule__Where__Group__11521);
            rule__Where__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Where__Group__2_in_rule__Where__Group__11524);
            rule__Where__Group__2();

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
    // $ANTLR end "rule__Where__Group__1"


    // $ANTLR start "rule__Where__Group__1__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: rule__Where__Group__1__Impl : ( ( rule__Where__ExprsAssignment_1 ) ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: ( ( ( rule__Where__ExprsAssignment_1 ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:773:1: ( ( rule__Where__ExprsAssignment_1 ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:773:1: ( ( rule__Where__ExprsAssignment_1 ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ( rule__Where__ExprsAssignment_1 )
            {
             before(grammarAccess.getWhereAccess().getExprsAssignment_1()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: ( rule__Where__ExprsAssignment_1 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:775:2: rule__Where__ExprsAssignment_1
            {
            pushFollow(FOLLOW_rule__Where__ExprsAssignment_1_in_rule__Where__Group__1__Impl1551);
            rule__Where__ExprsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getExprsAssignment_1()); 

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
    // $ANTLR end "rule__Where__Group__1__Impl"


    // $ANTLR start "rule__Where__Group__2"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:785:1: rule__Where__Group__2 : rule__Where__Group__2__Impl rule__Where__Group__3 ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( rule__Where__Group__2__Impl rule__Where__Group__3 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:790:2: rule__Where__Group__2__Impl rule__Where__Group__3
            {
            pushFollow(FOLLOW_rule__Where__Group__2__Impl_in_rule__Where__Group__21581);
            rule__Where__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Where__Group__3_in_rule__Where__Group__21584);
            rule__Where__Group__3();

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
    // $ANTLR end "rule__Where__Group__2"


    // $ANTLR start "rule__Where__Group__2__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: rule__Where__Group__2__Impl : ( ( rule__Where__AndAssignment_2 )? ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:801:1: ( ( ( rule__Where__AndAssignment_2 )? ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: ( ( rule__Where__AndAssignment_2 )? )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: ( ( rule__Where__AndAssignment_2 )? )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: ( rule__Where__AndAssignment_2 )?
            {
             before(grammarAccess.getWhereAccess().getAndAssignment_2()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: ( rule__Where__AndAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:804:2: rule__Where__AndAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Where__AndAssignment_2_in_rule__Where__Group__2__Impl1611);
                    rule__Where__AndAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWhereAccess().getAndAssignment_2()); 

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
    // $ANTLR end "rule__Where__Group__2__Impl"


    // $ANTLR start "rule__Where__Group__3"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:814:1: rule__Where__Group__3 : rule__Where__Group__3__Impl rule__Where__Group__4 ;
    public final void rule__Where__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: ( rule__Where__Group__3__Impl rule__Where__Group__4 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:819:2: rule__Where__Group__3__Impl rule__Where__Group__4
            {
            pushFollow(FOLLOW_rule__Where__Group__3__Impl_in_rule__Where__Group__31642);
            rule__Where__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Where__Group__4_in_rule__Where__Group__31645);
            rule__Where__Group__4();

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
    // $ANTLR end "rule__Where__Group__3"


    // $ANTLR start "rule__Where__Group__3__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: rule__Where__Group__3__Impl : ( ( rule__Where__OrAssignment_3 )? ) ;
    public final void rule__Where__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( ( ( rule__Where__OrAssignment_3 )? ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( ( rule__Where__OrAssignment_3 )? )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( ( rule__Where__OrAssignment_3 )? )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( rule__Where__OrAssignment_3 )?
            {
             before(grammarAccess.getWhereAccess().getOrAssignment_3()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: ( rule__Where__OrAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:833:2: rule__Where__OrAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Where__OrAssignment_3_in_rule__Where__Group__3__Impl1672);
                    rule__Where__OrAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWhereAccess().getOrAssignment_3()); 

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
    // $ANTLR end "rule__Where__Group__3__Impl"


    // $ANTLR start "rule__Where__Group__4"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:843:1: rule__Where__Group__4 : rule__Where__Group__4__Impl ;
    public final void rule__Where__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:847:1: ( rule__Where__Group__4__Impl )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:848:2: rule__Where__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Where__Group__4__Impl_in_rule__Where__Group__41703);
            rule__Where__Group__4__Impl();

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
    // $ANTLR end "rule__Where__Group__4"


    // $ANTLR start "rule__Where__Group__4__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: rule__Where__Group__4__Impl : ( ';' ) ;
    public final void rule__Where__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( ( ';' ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( ';' )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( ';' )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: ';'
            {
             before(grammarAccess.getWhereAccess().getSemicolonKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Where__Group__4__Impl1731); 
             after(grammarAccess.getWhereAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Where__Group__4__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:888:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__01772);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__01775);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__ColumnAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: ( ( ( rule__Expression__ColumnAssignment_0 ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: ( ( rule__Expression__ColumnAssignment_0 ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: ( ( rule__Expression__ColumnAssignment_0 ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:901:1: ( rule__Expression__ColumnAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getColumnAssignment_0()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: ( rule__Expression__ColumnAssignment_0 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:902:2: rule__Expression__ColumnAssignment_0
            {
            pushFollow(FOLLOW_rule__Expression__ColumnAssignment_0_in_rule__Expression__Group__0__Impl1802);
            rule__Expression__ColumnAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getColumnAssignment_0()); 

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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:917:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__11832);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__11835);
            rule__Expression__Group__2();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:924:1: rule__Expression__Group__1__Impl : ( ruleCondition ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: ( ( ruleCondition ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:929:1: ( ruleCondition )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:929:1: ( ruleCondition )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: ruleCondition
            {
             before(grammarAccess.getExpressionAccess().getConditionParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Expression__Group__1__Impl1862);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getConditionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group__2"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:945:1: ( rule__Expression__Group__2__Impl )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:946:2: rule__Expression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__21891);
            rule__Expression__Group__2__Impl();

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
    // $ANTLR end "rule__Expression__Group__2"


    // $ANTLR start "rule__Expression__Group__2__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: rule__Expression__Group__2__Impl : ( ( rule__Expression__ResultAssignment_2 ) ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:956:1: ( ( ( rule__Expression__ResultAssignment_2 ) ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:957:1: ( ( rule__Expression__ResultAssignment_2 ) )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:957:1: ( ( rule__Expression__ResultAssignment_2 ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:958:1: ( rule__Expression__ResultAssignment_2 )
            {
             before(grammarAccess.getExpressionAccess().getResultAssignment_2()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:959:1: ( rule__Expression__ResultAssignment_2 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:959:2: rule__Expression__ResultAssignment_2
            {
            pushFollow(FOLLOW_rule__Expression__ResultAssignment_2_in_rule__Expression__Group__2__Impl1918);
            rule__Expression__ResultAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getResultAssignment_2()); 

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
    // $ANTLR end "rule__Expression__Group__2__Impl"


    // $ANTLR start "rule__AND__Group_0__0"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:975:1: rule__AND__Group_0__0 : rule__AND__Group_0__0__Impl rule__AND__Group_0__1 ;
    public final void rule__AND__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: ( rule__AND__Group_0__0__Impl rule__AND__Group_0__1 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:980:2: rule__AND__Group_0__0__Impl rule__AND__Group_0__1
            {
            pushFollow(FOLLOW_rule__AND__Group_0__0__Impl_in_rule__AND__Group_0__01954);
            rule__AND__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AND__Group_0__1_in_rule__AND__Group_0__01957);
            rule__AND__Group_0__1();

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
    // $ANTLR end "rule__AND__Group_0__0"


    // $ANTLR start "rule__AND__Group_0__0__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:987:1: rule__AND__Group_0__0__Impl : ( 'AND' ) ;
    public final void rule__AND__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:991:1: ( ( 'AND' ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:992:1: ( 'AND' )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:992:1: ( 'AND' )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:993:1: 'AND'
            {
             before(grammarAccess.getANDAccess().getANDKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__AND__Group_0__0__Impl1985); 
             after(grammarAccess.getANDAccess().getANDKeyword_0_0()); 

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
    // $ANTLR end "rule__AND__Group_0__0__Impl"


    // $ANTLR start "rule__AND__Group_0__1"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:1: rule__AND__Group_0__1 : rule__AND__Group_0__1__Impl ;
    public final void rule__AND__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:1: ( rule__AND__Group_0__1__Impl )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:2: rule__AND__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AND__Group_0__1__Impl_in_rule__AND__Group_0__12016);
            rule__AND__Group_0__1__Impl();

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
    // $ANTLR end "rule__AND__Group_0__1"


    // $ANTLR start "rule__AND__Group_0__1__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1017:1: rule__AND__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__AND__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1021:1: ( ( ruleExpression ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:1: ( ruleExpression )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:1: ( ruleExpression )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1023:1: ruleExpression
            {
             before(grammarAccess.getANDAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__AND__Group_0__1__Impl2043);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getANDAccess().getExpressionParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__AND__Group_0__1__Impl"


    // $ANTLR start "rule__AND__Group_1__0"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:1: rule__AND__Group_1__0 : rule__AND__Group_1__0__Impl rule__AND__Group_1__1 ;
    public final void rule__AND__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ( rule__AND__Group_1__0__Impl rule__AND__Group_1__1 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1043:2: rule__AND__Group_1__0__Impl rule__AND__Group_1__1
            {
            pushFollow(FOLLOW_rule__AND__Group_1__0__Impl_in_rule__AND__Group_1__02076);
            rule__AND__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AND__Group_1__1_in_rule__AND__Group_1__02079);
            rule__AND__Group_1__1();

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
    // $ANTLR end "rule__AND__Group_1__0"


    // $ANTLR start "rule__AND__Group_1__0__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1050:1: rule__AND__Group_1__0__Impl : ( 'AND' ) ;
    public final void rule__AND__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ( ( 'AND' ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ( 'AND' )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ( 'AND' )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: 'AND'
            {
             before(grammarAccess.getANDAccess().getANDKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__AND__Group_1__0__Impl2107); 
             after(grammarAccess.getANDAccess().getANDKeyword_1_0()); 

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
    // $ANTLR end "rule__AND__Group_1__0__Impl"


    // $ANTLR start "rule__AND__Group_1__1"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:1: rule__AND__Group_1__1 : rule__AND__Group_1__1__Impl rule__AND__Group_1__2 ;
    public final void rule__AND__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1073:1: ( rule__AND__Group_1__1__Impl rule__AND__Group_1__2 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:2: rule__AND__Group_1__1__Impl rule__AND__Group_1__2
            {
            pushFollow(FOLLOW_rule__AND__Group_1__1__Impl_in_rule__AND__Group_1__12138);
            rule__AND__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AND__Group_1__2_in_rule__AND__Group_1__12141);
            rule__AND__Group_1__2();

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
    // $ANTLR end "rule__AND__Group_1__1"


    // $ANTLR start "rule__AND__Group_1__1__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: rule__AND__Group_1__1__Impl : ( '(' ) ;
    public final void rule__AND__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:1: ( ( '(' ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: ( '(' )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: ( '(' )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1087:1: '('
            {
             before(grammarAccess.getANDAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,22,FOLLOW_22_in_rule__AND__Group_1__1__Impl2169); 
             after(grammarAccess.getANDAccess().getLeftParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__AND__Group_1__1__Impl"


    // $ANTLR start "rule__AND__Group_1__2"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:1: rule__AND__Group_1__2 : rule__AND__Group_1__2__Impl rule__AND__Group_1__3 ;
    public final void rule__AND__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( rule__AND__Group_1__2__Impl rule__AND__Group_1__3 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:2: rule__AND__Group_1__2__Impl rule__AND__Group_1__3
            {
            pushFollow(FOLLOW_rule__AND__Group_1__2__Impl_in_rule__AND__Group_1__22200);
            rule__AND__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AND__Group_1__3_in_rule__AND__Group_1__22203);
            rule__AND__Group_1__3();

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
    // $ANTLR end "rule__AND__Group_1__2"


    // $ANTLR start "rule__AND__Group_1__2__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: rule__AND__Group_1__2__Impl : ( ruleExpression ) ;
    public final void rule__AND__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: ( ( ruleExpression ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:1: ( ruleExpression )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:1: ( ruleExpression )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:1: ruleExpression
            {
             before(grammarAccess.getANDAccess().getExpressionParserRuleCall_1_2()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__AND__Group_1__2__Impl2230);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getANDAccess().getExpressionParserRuleCall_1_2()); 

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
    // $ANTLR end "rule__AND__Group_1__2__Impl"


    // $ANTLR start "rule__AND__Group_1__3"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:1: rule__AND__Group_1__3 : rule__AND__Group_1__3__Impl rule__AND__Group_1__4 ;
    public final void rule__AND__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: ( rule__AND__Group_1__3__Impl rule__AND__Group_1__4 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1134:2: rule__AND__Group_1__3__Impl rule__AND__Group_1__4
            {
            pushFollow(FOLLOW_rule__AND__Group_1__3__Impl_in_rule__AND__Group_1__32259);
            rule__AND__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AND__Group_1__4_in_rule__AND__Group_1__32262);
            rule__AND__Group_1__4();

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
    // $ANTLR end "rule__AND__Group_1__3"


    // $ANTLR start "rule__AND__Group_1__3__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: rule__AND__Group_1__3__Impl : ( ( rule__AND__AndAssignment_1_3 )? ) ;
    public final void rule__AND__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1145:1: ( ( ( rule__AND__AndAssignment_1_3 )? ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: ( ( rule__AND__AndAssignment_1_3 )? )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: ( ( rule__AND__AndAssignment_1_3 )? )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:1: ( rule__AND__AndAssignment_1_3 )?
            {
             before(grammarAccess.getANDAccess().getAndAssignment_1_3()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:1: ( rule__AND__AndAssignment_1_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:2: rule__AND__AndAssignment_1_3
                    {
                    pushFollow(FOLLOW_rule__AND__AndAssignment_1_3_in_rule__AND__Group_1__3__Impl2289);
                    rule__AND__AndAssignment_1_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getANDAccess().getAndAssignment_1_3()); 

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
    // $ANTLR end "rule__AND__Group_1__3__Impl"


    // $ANTLR start "rule__AND__Group_1__4"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: rule__AND__Group_1__4 : rule__AND__Group_1__4__Impl rule__AND__Group_1__5 ;
    public final void rule__AND__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:1: ( rule__AND__Group_1__4__Impl rule__AND__Group_1__5 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:2: rule__AND__Group_1__4__Impl rule__AND__Group_1__5
            {
            pushFollow(FOLLOW_rule__AND__Group_1__4__Impl_in_rule__AND__Group_1__42320);
            rule__AND__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AND__Group_1__5_in_rule__AND__Group_1__42323);
            rule__AND__Group_1__5();

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
    // $ANTLR end "rule__AND__Group_1__4"


    // $ANTLR start "rule__AND__Group_1__4__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: rule__AND__Group_1__4__Impl : ( ( rule__AND__OrAssignment_1_4 )? ) ;
    public final void rule__AND__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1174:1: ( ( ( rule__AND__OrAssignment_1_4 )? ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: ( ( rule__AND__OrAssignment_1_4 )? )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: ( ( rule__AND__OrAssignment_1_4 )? )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: ( rule__AND__OrAssignment_1_4 )?
            {
             before(grammarAccess.getANDAccess().getOrAssignment_1_4()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:1: ( rule__AND__OrAssignment_1_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:2: rule__AND__OrAssignment_1_4
                    {
                    pushFollow(FOLLOW_rule__AND__OrAssignment_1_4_in_rule__AND__Group_1__4__Impl2350);
                    rule__AND__OrAssignment_1_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getANDAccess().getOrAssignment_1_4()); 

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
    // $ANTLR end "rule__AND__Group_1__4__Impl"


    // $ANTLR start "rule__AND__Group_1__5"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:1: rule__AND__Group_1__5 : rule__AND__Group_1__5__Impl ;
    public final void rule__AND__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:1: ( rule__AND__Group_1__5__Impl )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:2: rule__AND__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__AND__Group_1__5__Impl_in_rule__AND__Group_1__52381);
            rule__AND__Group_1__5__Impl();

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
    // $ANTLR end "rule__AND__Group_1__5"


    // $ANTLR start "rule__AND__Group_1__5__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: rule__AND__Group_1__5__Impl : ( ')' ) ;
    public final void rule__AND__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: ( ( ')' ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:1: ( ')' )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:1: ( ')' )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1204:1: ')'
            {
             before(grammarAccess.getANDAccess().getRightParenthesisKeyword_1_5()); 
            match(input,23,FOLLOW_23_in_rule__AND__Group_1__5__Impl2409); 
             after(grammarAccess.getANDAccess().getRightParenthesisKeyword_1_5()); 

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
    // $ANTLR end "rule__AND__Group_1__5__Impl"


    // $ANTLR start "rule__OR__Group_0__0"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: rule__OR__Group_0__0 : rule__OR__Group_0__0__Impl rule__OR__Group_0__1 ;
    public final void rule__OR__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:1: ( rule__OR__Group_0__0__Impl rule__OR__Group_0__1 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:2: rule__OR__Group_0__0__Impl rule__OR__Group_0__1
            {
            pushFollow(FOLLOW_rule__OR__Group_0__0__Impl_in_rule__OR__Group_0__02452);
            rule__OR__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OR__Group_0__1_in_rule__OR__Group_0__02455);
            rule__OR__Group_0__1();

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
    // $ANTLR end "rule__OR__Group_0__0"


    // $ANTLR start "rule__OR__Group_0__0__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:1: rule__OR__Group_0__0__Impl : ( 'OR' ) ;
    public final void rule__OR__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: ( ( 'OR' ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: ( 'OR' )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: ( 'OR' )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1247:1: 'OR'
            {
             before(grammarAccess.getORAccess().getORKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__OR__Group_0__0__Impl2483); 
             after(grammarAccess.getORAccess().getORKeyword_0_0()); 

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
    // $ANTLR end "rule__OR__Group_0__0__Impl"


    // $ANTLR start "rule__OR__Group_0__1"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: rule__OR__Group_0__1 : rule__OR__Group_0__1__Impl ;
    public final void rule__OR__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:1: ( rule__OR__Group_0__1__Impl )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:2: rule__OR__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__OR__Group_0__1__Impl_in_rule__OR__Group_0__12514);
            rule__OR__Group_0__1__Impl();

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
    // $ANTLR end "rule__OR__Group_0__1"


    // $ANTLR start "rule__OR__Group_0__1__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: rule__OR__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__OR__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: ( ( ruleExpression ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: ( ruleExpression )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: ( ruleExpression )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:1: ruleExpression
            {
             before(grammarAccess.getORAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__OR__Group_0__1__Impl2541);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getORAccess().getExpressionParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__OR__Group_0__1__Impl"


    // $ANTLR start "rule__OR__Group_1__0"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: rule__OR__Group_1__0 : rule__OR__Group_1__0__Impl rule__OR__Group_1__1 ;
    public final void rule__OR__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1296:1: ( rule__OR__Group_1__0__Impl rule__OR__Group_1__1 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:2: rule__OR__Group_1__0__Impl rule__OR__Group_1__1
            {
            pushFollow(FOLLOW_rule__OR__Group_1__0__Impl_in_rule__OR__Group_1__02574);
            rule__OR__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OR__Group_1__1_in_rule__OR__Group_1__02577);
            rule__OR__Group_1__1();

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
    // $ANTLR end "rule__OR__Group_1__0"


    // $ANTLR start "rule__OR__Group_1__0__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:1: rule__OR__Group_1__0__Impl : ( 'OR' ) ;
    public final void rule__OR__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ( ( 'OR' ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:1: ( 'OR' )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:1: ( 'OR' )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1310:1: 'OR'
            {
             before(grammarAccess.getORAccess().getORKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__OR__Group_1__0__Impl2605); 
             after(grammarAccess.getORAccess().getORKeyword_1_0()); 

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
    // $ANTLR end "rule__OR__Group_1__0__Impl"


    // $ANTLR start "rule__OR__Group_1__1"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1323:1: rule__OR__Group_1__1 : rule__OR__Group_1__1__Impl rule__OR__Group_1__2 ;
    public final void rule__OR__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: ( rule__OR__Group_1__1__Impl rule__OR__Group_1__2 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1328:2: rule__OR__Group_1__1__Impl rule__OR__Group_1__2
            {
            pushFollow(FOLLOW_rule__OR__Group_1__1__Impl_in_rule__OR__Group_1__12636);
            rule__OR__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OR__Group_1__2_in_rule__OR__Group_1__12639);
            rule__OR__Group_1__2();

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
    // $ANTLR end "rule__OR__Group_1__1"


    // $ANTLR start "rule__OR__Group_1__1__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: rule__OR__Group_1__1__Impl : ( '(' ) ;
    public final void rule__OR__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1339:1: ( ( '(' ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:1: ( '(' )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:1: ( '(' )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:1: '('
            {
             before(grammarAccess.getORAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,22,FOLLOW_22_in_rule__OR__Group_1__1__Impl2667); 
             after(grammarAccess.getORAccess().getLeftParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__OR__Group_1__1__Impl"


    // $ANTLR start "rule__OR__Group_1__2"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1354:1: rule__OR__Group_1__2 : rule__OR__Group_1__2__Impl rule__OR__Group_1__3 ;
    public final void rule__OR__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: ( rule__OR__Group_1__2__Impl rule__OR__Group_1__3 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:2: rule__OR__Group_1__2__Impl rule__OR__Group_1__3
            {
            pushFollow(FOLLOW_rule__OR__Group_1__2__Impl_in_rule__OR__Group_1__22698);
            rule__OR__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OR__Group_1__3_in_rule__OR__Group_1__22701);
            rule__OR__Group_1__3();

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
    // $ANTLR end "rule__OR__Group_1__2"


    // $ANTLR start "rule__OR__Group_1__2__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: rule__OR__Group_1__2__Impl : ( ruleExpression ) ;
    public final void rule__OR__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:1: ( ( ruleExpression ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: ( ruleExpression )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: ( ruleExpression )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1372:1: ruleExpression
            {
             before(grammarAccess.getORAccess().getExpressionParserRuleCall_1_2()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__OR__Group_1__2__Impl2728);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getORAccess().getExpressionParserRuleCall_1_2()); 

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
    // $ANTLR end "rule__OR__Group_1__2__Impl"


    // $ANTLR start "rule__OR__Group_1__3"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:1: rule__OR__Group_1__3 : rule__OR__Group_1__3__Impl rule__OR__Group_1__4 ;
    public final void rule__OR__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1387:1: ( rule__OR__Group_1__3__Impl rule__OR__Group_1__4 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1388:2: rule__OR__Group_1__3__Impl rule__OR__Group_1__4
            {
            pushFollow(FOLLOW_rule__OR__Group_1__3__Impl_in_rule__OR__Group_1__32757);
            rule__OR__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OR__Group_1__4_in_rule__OR__Group_1__32760);
            rule__OR__Group_1__4();

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
    // $ANTLR end "rule__OR__Group_1__3"


    // $ANTLR start "rule__OR__Group_1__3__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1395:1: rule__OR__Group_1__3__Impl : ( ( rule__OR__AndAssignment_1_3 )? ) ;
    public final void rule__OR__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1399:1: ( ( ( rule__OR__AndAssignment_1_3 )? ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1400:1: ( ( rule__OR__AndAssignment_1_3 )? )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1400:1: ( ( rule__OR__AndAssignment_1_3 )? )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:1: ( rule__OR__AndAssignment_1_3 )?
            {
             before(grammarAccess.getORAccess().getAndAssignment_1_3()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:1: ( rule__OR__AndAssignment_1_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:2: rule__OR__AndAssignment_1_3
                    {
                    pushFollow(FOLLOW_rule__OR__AndAssignment_1_3_in_rule__OR__Group_1__3__Impl2787);
                    rule__OR__AndAssignment_1_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getORAccess().getAndAssignment_1_3()); 

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
    // $ANTLR end "rule__OR__Group_1__3__Impl"


    // $ANTLR start "rule__OR__Group_1__4"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:1: rule__OR__Group_1__4 : rule__OR__Group_1__4__Impl rule__OR__Group_1__5 ;
    public final void rule__OR__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1416:1: ( rule__OR__Group_1__4__Impl rule__OR__Group_1__5 )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1417:2: rule__OR__Group_1__4__Impl rule__OR__Group_1__5
            {
            pushFollow(FOLLOW_rule__OR__Group_1__4__Impl_in_rule__OR__Group_1__42818);
            rule__OR__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OR__Group_1__5_in_rule__OR__Group_1__42821);
            rule__OR__Group_1__5();

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
    // $ANTLR end "rule__OR__Group_1__4"


    // $ANTLR start "rule__OR__Group_1__4__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: rule__OR__Group_1__4__Impl : ( ( rule__OR__OrAssignment_1_4 )? ) ;
    public final void rule__OR__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: ( ( ( rule__OR__OrAssignment_1_4 )? ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( ( rule__OR__OrAssignment_1_4 )? )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( ( rule__OR__OrAssignment_1_4 )? )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:1: ( rule__OR__OrAssignment_1_4 )?
            {
             before(grammarAccess.getORAccess().getOrAssignment_1_4()); 
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:1: ( rule__OR__OrAssignment_1_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:2: rule__OR__OrAssignment_1_4
                    {
                    pushFollow(FOLLOW_rule__OR__OrAssignment_1_4_in_rule__OR__Group_1__4__Impl2848);
                    rule__OR__OrAssignment_1_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getORAccess().getOrAssignment_1_4()); 

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
    // $ANTLR end "rule__OR__Group_1__4__Impl"


    // $ANTLR start "rule__OR__Group_1__5"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1441:1: rule__OR__Group_1__5 : rule__OR__Group_1__5__Impl ;
    public final void rule__OR__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1445:1: ( rule__OR__Group_1__5__Impl )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1446:2: rule__OR__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__OR__Group_1__5__Impl_in_rule__OR__Group_1__52879);
            rule__OR__Group_1__5__Impl();

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
    // $ANTLR end "rule__OR__Group_1__5"


    // $ANTLR start "rule__OR__Group_1__5__Impl"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: rule__OR__Group_1__5__Impl : ( ')' ) ;
    public final void rule__OR__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: ( ( ')' ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( ')' )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( ')' )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: ')'
            {
             before(grammarAccess.getORAccess().getRightParenthesisKeyword_1_5()); 
            match(input,23,FOLLOW_23_in_rule__OR__Group_1__5__Impl2907); 
             after(grammarAccess.getORAccess().getRightParenthesisKeyword_1_5()); 

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
    // $ANTLR end "rule__OR__Group_1__5__Impl"


    // $ANTLR start "rule__Model__SelectsAssignment"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: rule__Model__SelectsAssignment : ( ruleSelect ) ;
    public final void rule__Model__SelectsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1488:1: ( ( ruleSelect ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1489:1: ( ruleSelect )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1489:1: ( ruleSelect )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:1: ruleSelect
            {
             before(grammarAccess.getModelAccess().getSelectsSelectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSelect_in_rule__Model__SelectsAssignment2955);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSelectsSelectParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__SelectsAssignment"


    // $ANTLR start "rule__Select__Select_valueAssignment_1"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1499:1: rule__Select__Select_valueAssignment_1 : ( ruleVariable ) ;
    public final void rule__Select__Select_valueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1503:1: ( ( ruleVariable ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( ruleVariable )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( ruleVariable )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:1: ruleVariable
            {
             before(grammarAccess.getSelectAccess().getSelect_valueVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Select__Select_valueAssignment_12986);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getSelect_valueVariableParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Select__Select_valueAssignment_1"


    // $ANTLR start "rule__Select__Froms_valueAssignment_3"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:1: rule__Select__Froms_valueAssignment_3 : ( ruleVariable ) ;
    public final void rule__Select__Froms_valueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: ( ( ruleVariable ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: ( ruleVariable )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: ( ruleVariable )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1520:1: ruleVariable
            {
             before(grammarAccess.getSelectAccess().getFroms_valueVariableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Select__Froms_valueAssignment_33017);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getFroms_valueVariableParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Select__Froms_valueAssignment_3"


    // $ANTLR start "rule__Select__OptionsAssignment_4"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1529:1: rule__Select__OptionsAssignment_4 : ( ruleOption ) ;
    public final void rule__Select__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:1: ( ( ruleOption ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1534:1: ( ruleOption )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1534:1: ( ruleOption )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:1: ruleOption
            {
             before(grammarAccess.getSelectAccess().getOptionsOptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleOption_in_rule__Select__OptionsAssignment_43048);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getOptionsOptionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Select__OptionsAssignment_4"


    // $ANTLR start "rule__Variable__ValuesAssignment_0"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: rule__Variable__ValuesAssignment_0 : ( ruleValue ) ;
    public final void rule__Variable__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: ( ( ruleValue ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: ( ruleValue )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: ( ruleValue )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1550:1: ruleValue
            {
             before(grammarAccess.getVariableAccess().getValuesValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Variable__ValuesAssignment_03079);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getValuesValueParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Variable__ValuesAssignment_0"


    // $ANTLR start "rule__Variable__Values1Assignment_1_1"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:1: rule__Variable__Values1Assignment_1_1 : ( ruleValue ) ;
    public final void rule__Variable__Values1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:1: ( ( ruleValue ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:1: ( ruleValue )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:1: ( ruleValue )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1565:1: ruleValue
            {
             before(grammarAccess.getVariableAccess().getValues1ValueParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Variable__Values1Assignment_1_13110);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getValues1ValueParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Variable__Values1Assignment_1_1"


    // $ANTLR start "rule__Value__NameAssignment"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:1: rule__Value__NameAssignment : ( RULE_ID ) ;
    public final void rule__Value__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:1: ( ( RULE_ID ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:1: ( RULE_ID )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:1: ( RULE_ID )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1580:1: RULE_ID
            {
             before(grammarAccess.getValueAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Value__NameAssignment3141); 
             after(grammarAccess.getValueAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Value__NameAssignment"


    // $ANTLR start "rule__Option__WhereAssignment"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1589:1: rule__Option__WhereAssignment : ( ruleWhere ) ;
    public final void rule__Option__WhereAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1593:1: ( ( ruleWhere ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1594:1: ( ruleWhere )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1594:1: ( ruleWhere )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1595:1: ruleWhere
            {
             before(grammarAccess.getOptionAccess().getWhereWhereParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleWhere_in_rule__Option__WhereAssignment3172);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getWhereWhereParserRuleCall_0()); 

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
    // $ANTLR end "rule__Option__WhereAssignment"


    // $ANTLR start "rule__Where__ExprsAssignment_1"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: rule__Where__ExprsAssignment_1 : ( ruleExpression ) ;
    public final void rule__Where__ExprsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1608:1: ( ( ruleExpression ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1609:1: ( ruleExpression )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1609:1: ( ruleExpression )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1610:1: ruleExpression
            {
             before(grammarAccess.getWhereAccess().getExprsExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Where__ExprsAssignment_13203);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getExprsExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Where__ExprsAssignment_1"


    // $ANTLR start "rule__Where__AndAssignment_2"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:1: rule__Where__AndAssignment_2 : ( ruleAND ) ;
    public final void rule__Where__AndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:1: ( ( ruleAND ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1624:1: ( ruleAND )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1624:1: ( ruleAND )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1625:1: ruleAND
            {
             before(grammarAccess.getWhereAccess().getAndANDParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAND_in_rule__Where__AndAssignment_23234);
            ruleAND();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getAndANDParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Where__AndAssignment_2"


    // $ANTLR start "rule__Where__OrAssignment_3"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: rule__Where__OrAssignment_3 : ( ruleOR ) ;
    public final void rule__Where__OrAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:1: ( ( ruleOR ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1639:1: ( ruleOR )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1639:1: ( ruleOR )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1640:1: ruleOR
            {
             before(grammarAccess.getWhereAccess().getOrORParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOR_in_rule__Where__OrAssignment_33265);
            ruleOR();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getOrORParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Where__OrAssignment_3"


    // $ANTLR start "rule__Expression__ColumnAssignment_0"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: rule__Expression__ColumnAssignment_0 : ( ruleValue ) ;
    public final void rule__Expression__ColumnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1653:1: ( ( ruleValue ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1654:1: ( ruleValue )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1654:1: ( ruleValue )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1655:1: ruleValue
            {
             before(grammarAccess.getExpressionAccess().getColumnValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Expression__ColumnAssignment_03296);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getColumnValueParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Expression__ColumnAssignment_0"


    // $ANTLR start "rule__Expression__ResultAssignment_2"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: rule__Expression__ResultAssignment_2 : ( ruleValue ) ;
    public final void rule__Expression__ResultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1668:1: ( ( ruleValue ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1669:1: ( ruleValue )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1669:1: ( ruleValue )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1670:1: ruleValue
            {
             before(grammarAccess.getExpressionAccess().getResultValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Expression__ResultAssignment_23327);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getResultValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Expression__ResultAssignment_2"


    // $ANTLR start "rule__AND__AndAssignment_1_3"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: rule__AND__AndAssignment_1_3 : ( ruleAND ) ;
    public final void rule__AND__AndAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1683:1: ( ( ruleAND ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: ( ruleAND )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: ( ruleAND )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:1: ruleAND
            {
             before(grammarAccess.getANDAccess().getAndANDParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleAND_in_rule__AND__AndAssignment_1_33358);
            ruleAND();

            state._fsp--;

             after(grammarAccess.getANDAccess().getAndANDParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__AND__AndAssignment_1_3"


    // $ANTLR start "rule__AND__OrAssignment_1_4"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1694:1: rule__AND__OrAssignment_1_4 : ( ruleOR ) ;
    public final void rule__AND__OrAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1698:1: ( ( ruleOR ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:1: ( ruleOR )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:1: ( ruleOR )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:1: ruleOR
            {
             before(grammarAccess.getANDAccess().getOrORParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleOR_in_rule__AND__OrAssignment_1_43389);
            ruleOR();

            state._fsp--;

             after(grammarAccess.getANDAccess().getOrORParserRuleCall_1_4_0()); 

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
    // $ANTLR end "rule__AND__OrAssignment_1_4"


    // $ANTLR start "rule__OR__AndAssignment_1_3"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:1: rule__OR__AndAssignment_1_3 : ( ruleAND ) ;
    public final void rule__OR__AndAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: ( ( ruleAND ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:1: ( ruleAND )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:1: ( ruleAND )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1715:1: ruleAND
            {
             before(grammarAccess.getORAccess().getAndANDParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleAND_in_rule__OR__AndAssignment_1_33420);
            ruleAND();

            state._fsp--;

             after(grammarAccess.getORAccess().getAndANDParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__OR__AndAssignment_1_3"


    // $ANTLR start "rule__OR__OrAssignment_1_4"
    // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: rule__OR__OrAssignment_1_4 : ( ruleOR ) ;
    public final void rule__OR__OrAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: ( ( ruleOR ) )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:1: ( ruleOR )
            {
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:1: ( ruleOR )
            // ../org.xtext.SQL.mydsl.ui/src-gen/org/xtext/SQL/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1730:1: ruleOR
            {
             before(grammarAccess.getORAccess().getOrORParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleOR_in_rule__OR__OrAssignment_1_43451);
            ruleOR();

            state._fsp--;

             after(grammarAccess.getORAccess().getOrORParserRuleCall_1_4_0()); 

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
    // $ANTLR end "rule__OR__OrAssignment_1_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SelectsAssignment_in_ruleModel96 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Model__SelectsAssignment_in_ruleModel108 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__0_in_ruleSelect171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__NameAssignment_in_ruleValue291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__WhereAssignment_in_ruleOption351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhere_in_entryRuleWhere378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhere385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Where__Group__0_in_ruleWhere411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Alternatives_in_ruleCondition531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAND_in_entryRuleAND558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAND565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AND__Alternatives_in_ruleAND591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOR_in_entryRuleOR618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOR625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OR__Alternatives_in_ruleOR651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Condition__Alternatives688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Condition__Alternatives708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Condition__Alternatives728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Condition__Alternatives748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Condition__Alternatives768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AND__Group_0__0_in_rule__AND__Alternatives802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AND__Group_1__0_in_rule__AND__Alternatives820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OR__Group_0__0_in_rule__OR__Alternatives853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OR__Group_1__0_in_rule__OR__Alternatives871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__0__Impl_in_rule__Select__Group__0902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Select__Group__1_in_rule__Select__Group__0905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Select__Group__0__Impl933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__1__Impl_in_rule__Select__Group__1964 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Select__Group__2_in_rule__Select__Group__1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Select_valueAssignment_1_in_rule__Select__Group__1__Impl994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__2__Impl_in_rule__Select__Group__21024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Select__Group__3_in_rule__Select__Group__21027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Select__Group__2__Impl1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__3__Impl_in_rule__Select__Group__31086 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Select__Group__4_in_rule__Select__Group__31089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Froms_valueAssignment_3_in_rule__Select__Group__3__Impl1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__4__Impl_in_rule__Select__Group__41146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__OptionsAssignment_4_in_rule__Select__Group__4__Impl1173 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__01214 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__01217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__ValuesAssignment_0_in_rule__Variable__Group__0__Impl1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__11274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_1__0_in_rule__Variable__Group__1__Impl1301 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Variable__Group_1__0__Impl_in_rule__Variable__Group_1__01336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable__Group_1__1_in_rule__Variable__Group_1__01339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Variable__Group_1__0__Impl1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_1__1__Impl_in_rule__Variable__Group_1__11398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Values1Assignment_1_1_in_rule__Variable__Group_1__1__Impl1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Where__Group__0__Impl_in_rule__Where__Group__01459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Where__Group__1_in_rule__Where__Group__01462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Where__Group__0__Impl1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Where__Group__1__Impl_in_rule__Where__Group__11521 = new BitSet(new long[]{0x0000000001300000L});
    public static final BitSet FOLLOW_rule__Where__Group__2_in_rule__Where__Group__11524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Where__ExprsAssignment_1_in_rule__Where__Group__1__Impl1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Where__Group__2__Impl_in_rule__Where__Group__21581 = new BitSet(new long[]{0x0000000001300000L});
    public static final BitSet FOLLOW_rule__Where__Group__3_in_rule__Where__Group__21584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Where__AndAssignment_2_in_rule__Where__Group__2__Impl1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Where__Group__3__Impl_in_rule__Where__Group__31642 = new BitSet(new long[]{0x0000000001300000L});
    public static final BitSet FOLLOW_rule__Where__Group__4_in_rule__Where__Group__31645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Where__OrAssignment_3_in_rule__Where__Group__3__Impl1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Where__Group__4__Impl_in_rule__Where__Group__41703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Where__Group__4__Impl1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__01772 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__01775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__ColumnAssignment_0_in_rule__Expression__Group__0__Impl1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__11832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__11835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Expression__Group__1__Impl1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__21891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__ResultAssignment_2_in_rule__Expression__Group__2__Impl1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AND__Group_0__0__Impl_in_rule__AND__Group_0__01954 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AND__Group_0__1_in_rule__AND__Group_0__01957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AND__Group_0__0__Impl1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AND__Group_0__1__Impl_in_rule__AND__Group_0__12016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AND__Group_0__1__Impl2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AND__Group_1__0__Impl_in_rule__AND__Group_1__02076 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__AND__Group_1__1_in_rule__AND__Group_1__02079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AND__Group_1__0__Impl2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AND__Group_1__1__Impl_in_rule__AND__Group_1__12138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AND__Group_1__2_in_rule__AND__Group_1__12141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AND__Group_1__1__Impl2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AND__Group_1__2__Impl_in_rule__AND__Group_1__22200 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_rule__AND__Group_1__3_in_rule__AND__Group_1__22203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AND__Group_1__2__Impl2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AND__Group_1__3__Impl_in_rule__AND__Group_1__32259 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_rule__AND__Group_1__4_in_rule__AND__Group_1__32262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AND__AndAssignment_1_3_in_rule__AND__Group_1__3__Impl2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AND__Group_1__4__Impl_in_rule__AND__Group_1__42320 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_rule__AND__Group_1__5_in_rule__AND__Group_1__42323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AND__OrAssignment_1_4_in_rule__AND__Group_1__4__Impl2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AND__Group_1__5__Impl_in_rule__AND__Group_1__52381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AND__Group_1__5__Impl2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OR__Group_0__0__Impl_in_rule__OR__Group_0__02452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OR__Group_0__1_in_rule__OR__Group_0__02455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__OR__Group_0__0__Impl2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OR__Group_0__1__Impl_in_rule__OR__Group_0__12514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__OR__Group_0__1__Impl2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OR__Group_1__0__Impl_in_rule__OR__Group_1__02574 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__OR__Group_1__1_in_rule__OR__Group_1__02577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__OR__Group_1__0__Impl2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OR__Group_1__1__Impl_in_rule__OR__Group_1__12636 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OR__Group_1__2_in_rule__OR__Group_1__12639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__OR__Group_1__1__Impl2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OR__Group_1__2__Impl_in_rule__OR__Group_1__22698 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_rule__OR__Group_1__3_in_rule__OR__Group_1__22701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__OR__Group_1__2__Impl2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OR__Group_1__3__Impl_in_rule__OR__Group_1__32757 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_rule__OR__Group_1__4_in_rule__OR__Group_1__32760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OR__AndAssignment_1_3_in_rule__OR__Group_1__3__Impl2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OR__Group_1__4__Impl_in_rule__OR__Group_1__42818 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_rule__OR__Group_1__5_in_rule__OR__Group_1__42821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OR__OrAssignment_1_4_in_rule__OR__Group_1__4__Impl2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OR__Group_1__5__Impl_in_rule__OR__Group_1__52879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__OR__Group_1__5__Impl2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_rule__Model__SelectsAssignment2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Select__Select_valueAssignment_12986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Select__Froms_valueAssignment_33017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Select__OptionsAssignment_43048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Variable__ValuesAssignment_03079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Variable__Values1Assignment_1_13110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Value__NameAssignment3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhere_in_rule__Option__WhereAssignment3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Where__ExprsAssignment_13203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAND_in_rule__Where__AndAssignment_23234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOR_in_rule__Where__OrAssignment_33265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Expression__ColumnAssignment_03296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Expression__ResultAssignment_23327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAND_in_rule__AND__AndAssignment_1_33358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOR_in_rule__AND__OrAssignment_1_43389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAND_in_rule__OR__AndAssignment_1_33420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOR_in_rule__OR__OrAssignment_1_43451 = new BitSet(new long[]{0x0000000000000002L});

}