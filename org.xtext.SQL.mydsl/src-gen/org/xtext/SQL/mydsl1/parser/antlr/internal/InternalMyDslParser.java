package org.xtext.SQL.mydsl1.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.SQL.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SELECT'", "'FROM'", "','", "'WHERE'", "';'", "'='", "'<'", "'>'", "'<='", "'>='", "'AND'", "'('", "')'", "'OR'"
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
    public String getGrammarFileName() { return "../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : ( (lv_selects_0_0= ruleSelect ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_selects_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( (lv_selects_0_0= ruleSelect ) )+ )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_selects_0_0= ruleSelect ) )+
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_selects_0_0= ruleSelect ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_selects_0_0= ruleSelect )
            	    {
            	    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_selects_0_0= ruleSelect )
            	    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:82:3: lv_selects_0_0= ruleSelect
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getSelectsSelectParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSelect_in_ruleModel130);
            	    lv_selects_0_0=ruleSelect();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"selects",
            	            		lv_selects_0_0, 
            	            		"Select");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSelect"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:106:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:107:2: (iv_ruleSelect= ruleSelect EOF )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:108:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect166);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect176); 

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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:115:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'SELECT' ( (lv_select_value_1_0= ruleVariable ) ) otherlv_2= 'FROM' ( (lv_froms_value_3_0= ruleVariable ) ) ( (lv_options_4_0= ruleOption ) )* ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_select_value_1_0 = null;

        EObject lv_froms_value_3_0 = null;

        EObject lv_options_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:118:28: ( (otherlv_0= 'SELECT' ( (lv_select_value_1_0= ruleVariable ) ) otherlv_2= 'FROM' ( (lv_froms_value_3_0= ruleVariable ) ) ( (lv_options_4_0= ruleOption ) )* ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:119:1: (otherlv_0= 'SELECT' ( (lv_select_value_1_0= ruleVariable ) ) otherlv_2= 'FROM' ( (lv_froms_value_3_0= ruleVariable ) ) ( (lv_options_4_0= ruleOption ) )* )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:119:1: (otherlv_0= 'SELECT' ( (lv_select_value_1_0= ruleVariable ) ) otherlv_2= 'FROM' ( (lv_froms_value_3_0= ruleVariable ) ) ( (lv_options_4_0= ruleOption ) )* )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:119:3: otherlv_0= 'SELECT' ( (lv_select_value_1_0= ruleVariable ) ) otherlv_2= 'FROM' ( (lv_froms_value_3_0= ruleVariable ) ) ( (lv_options_4_0= ruleOption ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSelect213); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSELECTKeyword_0());
                
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:123:1: ( (lv_select_value_1_0= ruleVariable ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:124:1: (lv_select_value_1_0= ruleVariable )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:124:1: (lv_select_value_1_0= ruleVariable )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:125:3: lv_select_value_1_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getSelect_valueVariableParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleSelect234);
            lv_select_value_1_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	        }
                   		add(
                   			current, 
                   			"select_value",
                    		lv_select_value_1_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSelect246); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getFROMKeyword_2());
                
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:145:1: ( (lv_froms_value_3_0= ruleVariable ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:146:1: (lv_froms_value_3_0= ruleVariable )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:146:1: (lv_froms_value_3_0= ruleVariable )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:147:3: lv_froms_value_3_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getFroms_valueVariableParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleSelect267);
            lv_froms_value_3_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	        }
                   		add(
                   			current, 
                   			"froms_value",
                    		lv_froms_value_3_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:163:2: ( (lv_options_4_0= ruleOption ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:164:1: (lv_options_4_0= ruleOption )
            	    {
            	    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:164:1: (lv_options_4_0= ruleOption )
            	    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:165:3: lv_options_4_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectAccess().getOptionsOptionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOption_in_ruleSelect288);
            	    lv_options_4_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_4_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleVariable"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:189:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:190:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:191:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable325);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable335); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:198:1: ruleVariable returns [EObject current=null] : ( ( (lv_values_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_values1_2_0= ruleValue ) ) )* ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_values1_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:201:28: ( ( ( (lv_values_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_values1_2_0= ruleValue ) ) )* ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:202:1: ( ( (lv_values_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_values1_2_0= ruleValue ) ) )* )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:202:1: ( ( (lv_values_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_values1_2_0= ruleValue ) ) )* )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:202:2: ( (lv_values_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_values1_2_0= ruleValue ) ) )*
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:202:2: ( (lv_values_0_0= ruleValue ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:203:1: (lv_values_0_0= ruleValue )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:203:1: (lv_values_0_0= ruleValue )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:204:3: lv_values_0_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getValuesValueParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleVariable381);
            lv_values_0_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_0_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:220:2: (otherlv_1= ',' ( (lv_values1_2_0= ruleValue ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:220:4: otherlv_1= ',' ( (lv_values1_2_0= ruleValue ) )
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleVariable394); 

            	        	newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:224:1: ( (lv_values1_2_0= ruleValue ) )
            	    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:225:1: (lv_values1_2_0= ruleValue )
            	    {
            	    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:225:1: (lv_values1_2_0= ruleValue )
            	    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:226:3: lv_values1_2_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariableAccess().getValues1ValueParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleVariable415);
            	    lv_values1_2_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values1",
            	            		lv_values1_2_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleValue"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:250:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:251:2: (iv_ruleValue= ruleValue EOF )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:252:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue453);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue463); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:259:1: ruleValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:262:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:263:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:263:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:264:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:264:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:265:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue504); 

            			newLeafNode(lv_name_0_0, grammarAccess.getValueAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleOption"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:289:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:290:2: (iv_ruleOption= ruleOption EOF )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:291:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption544);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption554); 

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:298:1: ruleOption returns [EObject current=null] : ( (lv_where_0_0= ruleWhere ) ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject lv_where_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:301:28: ( ( (lv_where_0_0= ruleWhere ) ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:302:1: ( (lv_where_0_0= ruleWhere ) )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:302:1: ( (lv_where_0_0= ruleWhere ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:303:1: (lv_where_0_0= ruleWhere )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:303:1: (lv_where_0_0= ruleWhere )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:304:3: lv_where_0_0= ruleWhere
            {
             
            	        newCompositeNode(grammarAccess.getOptionAccess().getWhereWhereParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleWhere_in_ruleOption599);
            lv_where_0_0=ruleWhere();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionRule());
            	        }
                   		add(
                   			current, 
                   			"where",
                    		lv_where_0_0, 
                    		"Where");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleWhere"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:328:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:329:2: (iv_ruleWhere= ruleWhere EOF )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:330:2: iv_ruleWhere= ruleWhere EOF
            {
             newCompositeNode(grammarAccess.getWhereRule()); 
            pushFollow(FOLLOW_ruleWhere_in_entryRuleWhere634);
            iv_ruleWhere=ruleWhere();

            state._fsp--;

             current =iv_ruleWhere; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhere644); 

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
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:337:1: ruleWhere returns [EObject current=null] : (otherlv_0= 'WHERE' ( (lv_exprs_1_0= ruleExpression ) ) ( (lv_and_2_0= ruleAND ) )? ( (lv_or_3_0= ruleOR ) )? otherlv_4= ';' ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_and_2_0 = null;

        EObject lv_or_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:340:28: ( (otherlv_0= 'WHERE' ( (lv_exprs_1_0= ruleExpression ) ) ( (lv_and_2_0= ruleAND ) )? ( (lv_or_3_0= ruleOR ) )? otherlv_4= ';' ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:341:1: (otherlv_0= 'WHERE' ( (lv_exprs_1_0= ruleExpression ) ) ( (lv_and_2_0= ruleAND ) )? ( (lv_or_3_0= ruleOR ) )? otherlv_4= ';' )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:341:1: (otherlv_0= 'WHERE' ( (lv_exprs_1_0= ruleExpression ) ) ( (lv_and_2_0= ruleAND ) )? ( (lv_or_3_0= ruleOR ) )? otherlv_4= ';' )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:341:3: otherlv_0= 'WHERE' ( (lv_exprs_1_0= ruleExpression ) ) ( (lv_and_2_0= ruleAND ) )? ( (lv_or_3_0= ruleOR ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleWhere681); 

                	newLeafNode(otherlv_0, grammarAccess.getWhereAccess().getWHEREKeyword_0());
                
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:345:1: ( (lv_exprs_1_0= ruleExpression ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:346:1: (lv_exprs_1_0= ruleExpression )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:346:1: (lv_exprs_1_0= ruleExpression )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:347:3: lv_exprs_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getWhereAccess().getExprsExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleWhere702);
            lv_exprs_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhereRule());
            	        }
                   		add(
                   			current, 
                   			"exprs",
                    		lv_exprs_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:363:2: ( (lv_and_2_0= ruleAND ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:364:1: (lv_and_2_0= ruleAND )
                    {
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:364:1: (lv_and_2_0= ruleAND )
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:365:3: lv_and_2_0= ruleAND
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhereAccess().getAndANDParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAND_in_ruleWhere723);
                    lv_and_2_0=ruleAND();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhereRule());
                    	        }
                           		add(
                           			current, 
                           			"and",
                            		lv_and_2_0, 
                            		"AND");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:381:3: ( (lv_or_3_0= ruleOR ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:382:1: (lv_or_3_0= ruleOR )
                    {
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:382:1: (lv_or_3_0= ruleOR )
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:383:3: lv_or_3_0= ruleOR
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhereAccess().getOrORParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOR_in_ruleWhere745);
                    lv_or_3_0=ruleOR();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhereRule());
                    	        }
                           		add(
                           			current, 
                           			"or",
                            		lv_or_3_0, 
                            		"OR");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleWhere758); 

                	newLeafNode(otherlv_4, grammarAccess.getWhereAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:411:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:412:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:413:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression794);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression804); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:420:1: ruleExpression returns [EObject current=null] : ( ( (lv_column_0_0= ruleValue ) ) ruleCondition ( (lv_result_2_0= ruleValue ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_column_0_0 = null;

        EObject lv_result_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:423:28: ( ( ( (lv_column_0_0= ruleValue ) ) ruleCondition ( (lv_result_2_0= ruleValue ) ) ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:424:1: ( ( (lv_column_0_0= ruleValue ) ) ruleCondition ( (lv_result_2_0= ruleValue ) ) )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:424:1: ( ( (lv_column_0_0= ruleValue ) ) ruleCondition ( (lv_result_2_0= ruleValue ) ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:424:2: ( (lv_column_0_0= ruleValue ) ) ruleCondition ( (lv_result_2_0= ruleValue ) )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:424:2: ( (lv_column_0_0= ruleValue ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:425:1: (lv_column_0_0= ruleValue )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:425:1: (lv_column_0_0= ruleValue )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:426:3: lv_column_0_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getColumnValueParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleExpression850);
            lv_column_0_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"column",
                    		lv_column_0_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getExpressionAccess().getConditionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleCondition_in_ruleExpression866);
            ruleCondition();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:450:1: ( (lv_result_2_0= ruleValue ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:451:1: (lv_result_2_0= ruleValue )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:451:1: (lv_result_2_0= ruleValue )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:452:3: lv_result_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getResultValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleExpression886);
            lv_result_2_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"result",
                    		lv_result_2_0, 
                    		"Value");
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleCondition"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:476:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:477:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:478:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition923);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition934); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:485:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:488:28: ( (kw= '=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:489:1: (kw= '=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:489:1: (kw= '=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:490:2: kw= '='
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleCondition972); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConditionAccess().getEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:497:2: kw= '<'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleCondition991); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConditionAccess().getLessThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:504:2: kw= '>'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleCondition1010); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConditionAccess().getGreaterThanSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:511:2: kw= '<='
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleCondition1029); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:518:2: kw= '>='
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleCondition1048); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                        

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAND"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:531:1: entryRuleAND returns [EObject current=null] : iv_ruleAND= ruleAND EOF ;
    public final EObject entryRuleAND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAND = null;


        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:532:2: (iv_ruleAND= ruleAND EOF )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:533:2: iv_ruleAND= ruleAND EOF
            {
             newCompositeNode(grammarAccess.getANDRule()); 
            pushFollow(FOLLOW_ruleAND_in_entryRuleAND1088);
            iv_ruleAND=ruleAND();

            state._fsp--;

             current =iv_ruleAND; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAND1098); 

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
    // $ANTLR end "entryRuleAND"


    // $ANTLR start "ruleAND"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:540:1: ruleAND returns [EObject current=null] : ( (otherlv_0= 'AND' this_Expression_1= ruleExpression ) | (otherlv_2= 'AND' otherlv_3= '(' this_Expression_4= ruleExpression ( (lv_and_5_0= ruleAND ) )? ( (lv_or_6_0= ruleOR ) )? otherlv_7= ')' ) ) ;
    public final EObject ruleAND() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject this_Expression_1 = null;

        EObject this_Expression_4 = null;

        EObject lv_and_5_0 = null;

        EObject lv_or_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:543:28: ( ( (otherlv_0= 'AND' this_Expression_1= ruleExpression ) | (otherlv_2= 'AND' otherlv_3= '(' this_Expression_4= ruleExpression ( (lv_and_5_0= ruleAND ) )? ( (lv_or_6_0= ruleOR ) )? otherlv_7= ')' ) ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:544:1: ( (otherlv_0= 'AND' this_Expression_1= ruleExpression ) | (otherlv_2= 'AND' otherlv_3= '(' this_Expression_4= ruleExpression ( (lv_and_5_0= ruleAND ) )? ( (lv_or_6_0= ruleOR ) )? otherlv_7= ')' ) )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:544:1: ( (otherlv_0= 'AND' this_Expression_1= ruleExpression ) | (otherlv_2= 'AND' otherlv_3= '(' this_Expression_4= ruleExpression ( (lv_and_5_0= ruleAND ) )? ( (lv_or_6_0= ruleOR ) )? otherlv_7= ')' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_ID) ) {
                    alt9=1;
                }
                else if ( (LA9_1==22) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:544:2: (otherlv_0= 'AND' this_Expression_1= ruleExpression )
                    {
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:544:2: (otherlv_0= 'AND' this_Expression_1= ruleExpression )
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:544:4: otherlv_0= 'AND' this_Expression_1= ruleExpression
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAND1136); 

                        	newLeafNode(otherlv_0, grammarAccess.getANDAccess().getANDKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getANDAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleAND1158);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:558:6: (otherlv_2= 'AND' otherlv_3= '(' this_Expression_4= ruleExpression ( (lv_and_5_0= ruleAND ) )? ( (lv_or_6_0= ruleOR ) )? otherlv_7= ')' )
                    {
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:558:6: (otherlv_2= 'AND' otherlv_3= '(' this_Expression_4= ruleExpression ( (lv_and_5_0= ruleAND ) )? ( (lv_or_6_0= ruleOR ) )? otherlv_7= ')' )
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:558:8: otherlv_2= 'AND' otherlv_3= '(' this_Expression_4= ruleExpression ( (lv_and_5_0= ruleAND ) )? ( (lv_or_6_0= ruleOR ) )? otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleAND1177); 

                        	newLeafNode(otherlv_2, grammarAccess.getANDAccess().getANDKeyword_1_0());
                        
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleAND1189); 

                        	newLeafNode(otherlv_3, grammarAccess.getANDAccess().getLeftParenthesisKeyword_1_1());
                        
                     
                            newCompositeNode(grammarAccess.getANDAccess().getExpressionParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleAND1211);
                    this_Expression_4=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_4; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:575:1: ( (lv_and_5_0= ruleAND ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==21) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:576:1: (lv_and_5_0= ruleAND )
                            {
                            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:576:1: (lv_and_5_0= ruleAND )
                            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:577:3: lv_and_5_0= ruleAND
                            {
                             
                            	        newCompositeNode(grammarAccess.getANDAccess().getAndANDParserRuleCall_1_3_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAND_in_ruleAND1231);
                            lv_and_5_0=ruleAND();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getANDRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"and",
                                    		lv_and_5_0, 
                                    		"AND");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:593:3: ( (lv_or_6_0= ruleOR ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==24) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:594:1: (lv_or_6_0= ruleOR )
                            {
                            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:594:1: (lv_or_6_0= ruleOR )
                            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:595:3: lv_or_6_0= ruleOR
                            {
                             
                            	        newCompositeNode(grammarAccess.getANDAccess().getOrORParserRuleCall_1_4_0()); 
                            	    
                            pushFollow(FOLLOW_ruleOR_in_ruleAND1253);
                            lv_or_6_0=ruleOR();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getANDRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"or",
                                    		lv_or_6_0, 
                                    		"OR");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleAND1266); 

                        	newLeafNode(otherlv_7, grammarAccess.getANDAccess().getRightParenthesisKeyword_1_5());
                        

                    }


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
    // $ANTLR end "ruleAND"


    // $ANTLR start "entryRuleOR"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:623:1: entryRuleOR returns [EObject current=null] : iv_ruleOR= ruleOR EOF ;
    public final EObject entryRuleOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOR = null;


        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:624:2: (iv_ruleOR= ruleOR EOF )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:625:2: iv_ruleOR= ruleOR EOF
            {
             newCompositeNode(grammarAccess.getORRule()); 
            pushFollow(FOLLOW_ruleOR_in_entryRuleOR1303);
            iv_ruleOR=ruleOR();

            state._fsp--;

             current =iv_ruleOR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOR1313); 

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
    // $ANTLR end "entryRuleOR"


    // $ANTLR start "ruleOR"
    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:632:1: ruleOR returns [EObject current=null] : ( (otherlv_0= 'OR' this_Expression_1= ruleExpression ) | (otherlv_2= 'OR' otherlv_3= '(' this_Expression_4= ruleExpression ( (lv_and_5_0= ruleAND ) )? ( (lv_or_6_0= ruleOR ) )? otherlv_7= ')' ) ) ;
    public final EObject ruleOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject this_Expression_1 = null;

        EObject this_Expression_4 = null;

        EObject lv_and_5_0 = null;

        EObject lv_or_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:635:28: ( ( (otherlv_0= 'OR' this_Expression_1= ruleExpression ) | (otherlv_2= 'OR' otherlv_3= '(' this_Expression_4= ruleExpression ( (lv_and_5_0= ruleAND ) )? ( (lv_or_6_0= ruleOR ) )? otherlv_7= ')' ) ) )
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:636:1: ( (otherlv_0= 'OR' this_Expression_1= ruleExpression ) | (otherlv_2= 'OR' otherlv_3= '(' this_Expression_4= ruleExpression ( (lv_and_5_0= ruleAND ) )? ( (lv_or_6_0= ruleOR ) )? otherlv_7= ')' ) )
            {
            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:636:1: ( (otherlv_0= 'OR' this_Expression_1= ruleExpression ) | (otherlv_2= 'OR' otherlv_3= '(' this_Expression_4= ruleExpression ( (lv_and_5_0= ruleAND ) )? ( (lv_or_6_0= ruleOR ) )? otherlv_7= ')' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==22) ) {
                    alt12=2;
                }
                else if ( (LA12_1==RULE_ID) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:636:2: (otherlv_0= 'OR' this_Expression_1= ruleExpression )
                    {
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:636:2: (otherlv_0= 'OR' this_Expression_1= ruleExpression )
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:636:4: otherlv_0= 'OR' this_Expression_1= ruleExpression
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleOR1351); 

                        	newLeafNode(otherlv_0, grammarAccess.getORAccess().getORKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getORAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleOR1373);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:650:6: (otherlv_2= 'OR' otherlv_3= '(' this_Expression_4= ruleExpression ( (lv_and_5_0= ruleAND ) )? ( (lv_or_6_0= ruleOR ) )? otherlv_7= ')' )
                    {
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:650:6: (otherlv_2= 'OR' otherlv_3= '(' this_Expression_4= ruleExpression ( (lv_and_5_0= ruleAND ) )? ( (lv_or_6_0= ruleOR ) )? otherlv_7= ')' )
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:650:8: otherlv_2= 'OR' otherlv_3= '(' this_Expression_4= ruleExpression ( (lv_and_5_0= ruleAND ) )? ( (lv_or_6_0= ruleOR ) )? otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleOR1392); 

                        	newLeafNode(otherlv_2, grammarAccess.getORAccess().getORKeyword_1_0());
                        
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleOR1404); 

                        	newLeafNode(otherlv_3, grammarAccess.getORAccess().getLeftParenthesisKeyword_1_1());
                        
                     
                            newCompositeNode(grammarAccess.getORAccess().getExpressionParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleOR1426);
                    this_Expression_4=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_4; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:667:1: ( (lv_and_5_0= ruleAND ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==21) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:668:1: (lv_and_5_0= ruleAND )
                            {
                            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:668:1: (lv_and_5_0= ruleAND )
                            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:669:3: lv_and_5_0= ruleAND
                            {
                             
                            	        newCompositeNode(grammarAccess.getORAccess().getAndANDParserRuleCall_1_3_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAND_in_ruleOR1446);
                            lv_and_5_0=ruleAND();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getORRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"and",
                                    		lv_and_5_0, 
                                    		"AND");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:685:3: ( (lv_or_6_0= ruleOR ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:686:1: (lv_or_6_0= ruleOR )
                            {
                            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:686:1: (lv_or_6_0= ruleOR )
                            // ../org.xtext.SQL.mydsl/src-gen/org/xtext/SQL/mydsl1/parser/antlr/internal/InternalMyDsl.g:687:3: lv_or_6_0= ruleOR
                            {
                             
                            	        newCompositeNode(grammarAccess.getORAccess().getOrORParserRuleCall_1_4_0()); 
                            	    
                            pushFollow(FOLLOW_ruleOR_in_ruleOR1468);
                            lv_or_6_0=ruleOR();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getORRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"or",
                                    		lv_or_6_0, 
                                    		"OR");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleOR1481); 

                        	newLeafNode(otherlv_7, grammarAccess.getORAccess().getRightParenthesisKeyword_1_5());
                        

                    }


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
    // $ANTLR end "ruleOR"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSelect213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleSelect234 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSelect246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleSelect267 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleOption_in_ruleSelect288 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleVariable381 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleVariable394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValue_in_ruleVariable415 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhere_in_ruleOption599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhere_in_entryRuleWhere634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhere644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleWhere681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhere702 = new BitSet(new long[]{0x0000000001208000L});
    public static final BitSet FOLLOW_ruleAND_in_ruleWhere723 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_ruleOR_in_ruleWhere745 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWhere758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleExpression850 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleExpression866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValue_in_ruleExpression886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleCondition972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleCondition991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCondition1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCondition1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCondition1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAND_in_entryRuleAND1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAND1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAND1136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAND1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAND1177 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAND1189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAND1211 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_ruleAND_in_ruleAND1231 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleOR_in_ruleAND1253 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAND1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOR_in_entryRuleOR1303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOR1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOR1351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleOR1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOR1392 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOR1404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleOR1426 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_ruleAND_in_ruleOR1446 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleOR_in_ruleOR1468 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOR1481 = new BitSet(new long[]{0x0000000000000002L});

}