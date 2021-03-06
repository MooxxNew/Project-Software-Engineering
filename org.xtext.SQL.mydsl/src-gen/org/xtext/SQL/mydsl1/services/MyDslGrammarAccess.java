/*
* generated by Xtext
*/
package org.xtext.SQL.mydsl1.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cSelectsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cSelectsSelectParserRuleCall_0 = (RuleCall)cSelectsAssignment.eContents().get(0);
		
		//Model:
		//	selects+=Select+;
		public ParserRule getRule() { return rule; }

		//selects+=Select+
		public Assignment getSelectsAssignment() { return cSelectsAssignment; }

		//Select
		public RuleCall getSelectsSelectParserRuleCall_0() { return cSelectsSelectParserRuleCall_0; }
	}

	public class SelectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Select");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSELECTKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSelect_valueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSelect_valueVariableParserRuleCall_1_0 = (RuleCall)cSelect_valueAssignment_1.eContents().get(0);
		private final Keyword cFROMKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFroms_valueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFroms_valueVariableParserRuleCall_3_0 = (RuleCall)cFroms_valueAssignment_3.eContents().get(0);
		private final Assignment cOptionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOptionsOptionParserRuleCall_4_0 = (RuleCall)cOptionsAssignment_4.eContents().get(0);
		
		//Select:
		//	"SELECT" select_value+=Variable "FROM" froms_value+=Variable options+=Option*;
		public ParserRule getRule() { return rule; }

		//"SELECT" select_value+=Variable "FROM" froms_value+=Variable options+=Option*
		public Group getGroup() { return cGroup; }

		//"SELECT"
		public Keyword getSELECTKeyword_0() { return cSELECTKeyword_0; }

		//select_value+=Variable
		public Assignment getSelect_valueAssignment_1() { return cSelect_valueAssignment_1; }

		//Variable
		public RuleCall getSelect_valueVariableParserRuleCall_1_0() { return cSelect_valueVariableParserRuleCall_1_0; }

		//"FROM"
		public Keyword getFROMKeyword_2() { return cFROMKeyword_2; }

		//froms_value+=Variable
		public Assignment getFroms_valueAssignment_3() { return cFroms_valueAssignment_3; }

		//Variable
		public RuleCall getFroms_valueVariableParserRuleCall_3_0() { return cFroms_valueVariableParserRuleCall_3_0; }

		//options+=Option*
		public Assignment getOptionsAssignment_4() { return cOptionsAssignment_4; }

		//Option
		public RuleCall getOptionsOptionParserRuleCall_4_0() { return cOptionsOptionParserRuleCall_4_0; }
	}

	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cValuesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cValuesValueParserRuleCall_0_0 = (RuleCall)cValuesAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValues1Assignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValues1ValueParserRuleCall_1_1_0 = (RuleCall)cValues1Assignment_1_1.eContents().get(0);
		
		//Variable:
		//	values+=Value ("," values1+=Value)*;
		public ParserRule getRule() { return rule; }

		//values+=Value ("," values1+=Value)*
		public Group getGroup() { return cGroup; }

		//values+=Value
		public Assignment getValuesAssignment_0() { return cValuesAssignment_0; }

		//Value
		public RuleCall getValuesValueParserRuleCall_0_0() { return cValuesValueParserRuleCall_0_0; }

		//("," values1+=Value)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//values1+=Value
		public Assignment getValues1Assignment_1_1() { return cValues1Assignment_1_1; }

		//Value
		public RuleCall getValues1ValueParserRuleCall_1_1_0() { return cValues1ValueParserRuleCall_1_1_0; }
	}

	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Value");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Value:
		//	name=ID;
		public ParserRule getRule() { return rule; }

		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}

	public class OptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Option");
		private final Assignment cWhereAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cWhereWhereParserRuleCall_0 = (RuleCall)cWhereAssignment.eContents().get(0);
		
		//Option:
		//	where+=Where;
		public ParserRule getRule() { return rule; }

		//where+=Where
		public Assignment getWhereAssignment() { return cWhereAssignment; }

		//Where
		public RuleCall getWhereWhereParserRuleCall_0() { return cWhereWhereParserRuleCall_0; }
	}

	public class WhereElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Where");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWHEREKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprsExpressionParserRuleCall_1_0 = (RuleCall)cExprsAssignment_1.eContents().get(0);
		private final Assignment cAndAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAndANDParserRuleCall_2_0 = (RuleCall)cAndAssignment_2.eContents().get(0);
		private final Assignment cOrAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOrORParserRuleCall_3_0 = (RuleCall)cOrAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Where:
		//	"WHERE" exprs+=Expression and+=AND? or+=OR? ";";
		public ParserRule getRule() { return rule; }

		//"WHERE" exprs+=Expression and+=AND? or+=OR? ";"
		public Group getGroup() { return cGroup; }

		//"WHERE"
		public Keyword getWHEREKeyword_0() { return cWHEREKeyword_0; }

		//exprs+=Expression
		public Assignment getExprsAssignment_1() { return cExprsAssignment_1; }

		//Expression
		public RuleCall getExprsExpressionParserRuleCall_1_0() { return cExprsExpressionParserRuleCall_1_0; }

		//and+=AND?
		public Assignment getAndAssignment_2() { return cAndAssignment_2; }

		//AND
		public RuleCall getAndANDParserRuleCall_2_0() { return cAndANDParserRuleCall_2_0; }

		//or+=OR?
		public Assignment getOrAssignment_3() { return cOrAssignment_3; }

		//OR
		public RuleCall getOrORParserRuleCall_3_0() { return cOrORParserRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cColumnAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cColumnValueParserRuleCall_0_0 = (RuleCall)cColumnAssignment_0.eContents().get(0);
		private final RuleCall cConditionParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cResultAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cResultValueParserRuleCall_2_0 = (RuleCall)cResultAssignment_2.eContents().get(0);
		
		//Expression:
		//	column+=Value Condition result+=Value;
		public ParserRule getRule() { return rule; }

		//column+=Value Condition result+=Value
		public Group getGroup() { return cGroup; }

		//column+=Value
		public Assignment getColumnAssignment_0() { return cColumnAssignment_0; }

		//Value
		public RuleCall getColumnValueParserRuleCall_0_0() { return cColumnValueParserRuleCall_0_0; }

		//Condition
		public RuleCall getConditionParserRuleCall_1() { return cConditionParserRuleCall_1; }

		//result+=Value
		public Assignment getResultAssignment_2() { return cResultAssignment_2; }

		//Value
		public RuleCall getResultValueParserRuleCall_2_0() { return cResultValueParserRuleCall_2_0; }
	}

	public class ConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Condition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cEqualsSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cLessThanSignKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cLessThanSignEqualsSignKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cGreaterThanSignEqualsSignKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		
		//Condition:
		//	"=" | "<" | ">" | "<=" | ">=";
		public ParserRule getRule() { return rule; }

		//"=" | "<" | ">" | "<=" | ">="
		public Alternatives getAlternatives() { return cAlternatives; }

		//"="
		public Keyword getEqualsSignKeyword_0() { return cEqualsSignKeyword_0; }

		//"<"
		public Keyword getLessThanSignKeyword_1() { return cLessThanSignKeyword_1; }

		//">"
		public Keyword getGreaterThanSignKeyword_2() { return cGreaterThanSignKeyword_2; }

		//"<="
		public Keyword getLessThanSignEqualsSignKeyword_3() { return cLessThanSignEqualsSignKeyword_3; }

		//">="
		public Keyword getGreaterThanSignEqualsSignKeyword_4() { return cGreaterThanSignEqualsSignKeyword_4; }
	}

	public class ANDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AND");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cANDKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cANDKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final RuleCall cExpressionParserRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		private final Assignment cAndAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cAndANDParserRuleCall_1_3_0 = (RuleCall)cAndAssignment_1_3.eContents().get(0);
		private final Assignment cOrAssignment_1_4 = (Assignment)cGroup_1.eContents().get(4);
		private final RuleCall cOrORParserRuleCall_1_4_0 = (RuleCall)cOrAssignment_1_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_5 = (Keyword)cGroup_1.eContents().get(5);
		
		//AND:
		//	"AND" Expression | "AND" "(" Expression and+=AND? or+=OR? ")";
		public ParserRule getRule() { return rule; }

		//"AND" Expression | "AND" "(" Expression and+=AND? or+=OR? ")"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"AND" Expression
		public Group getGroup_0() { return cGroup_0; }

		//"AND"
		public Keyword getANDKeyword_0_0() { return cANDKeyword_0_0; }

		//Expression
		public RuleCall getExpressionParserRuleCall_0_1() { return cExpressionParserRuleCall_0_1; }

		//"AND" "(" Expression and+=AND? or+=OR? ")"
		public Group getGroup_1() { return cGroup_1; }

		//"AND"
		public Keyword getANDKeyword_1_0() { return cANDKeyword_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1_1() { return cLeftParenthesisKeyword_1_1; }

		//Expression
		public RuleCall getExpressionParserRuleCall_1_2() { return cExpressionParserRuleCall_1_2; }

		//and+=AND?
		public Assignment getAndAssignment_1_3() { return cAndAssignment_1_3; }

		//AND
		public RuleCall getAndANDParserRuleCall_1_3_0() { return cAndANDParserRuleCall_1_3_0; }

		//or+=OR?
		public Assignment getOrAssignment_1_4() { return cOrAssignment_1_4; }

		//OR
		public RuleCall getOrORParserRuleCall_1_4_0() { return cOrORParserRuleCall_1_4_0; }

		//")"
		public Keyword getRightParenthesisKeyword_1_5() { return cRightParenthesisKeyword_1_5; }
	}

	public class ORElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OR");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cORKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cORKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final RuleCall cExpressionParserRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		private final Assignment cAndAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cAndANDParserRuleCall_1_3_0 = (RuleCall)cAndAssignment_1_3.eContents().get(0);
		private final Assignment cOrAssignment_1_4 = (Assignment)cGroup_1.eContents().get(4);
		private final RuleCall cOrORParserRuleCall_1_4_0 = (RuleCall)cOrAssignment_1_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_5 = (Keyword)cGroup_1.eContents().get(5);
		
		//OR:
		//	"OR" Expression | "OR" "(" Expression and+=AND? or+=OR? ")";
		public ParserRule getRule() { return rule; }

		//"OR" Expression | "OR" "(" Expression and+=AND? or+=OR? ")"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"OR" Expression
		public Group getGroup_0() { return cGroup_0; }

		//"OR"
		public Keyword getORKeyword_0_0() { return cORKeyword_0_0; }

		//Expression
		public RuleCall getExpressionParserRuleCall_0_1() { return cExpressionParserRuleCall_0_1; }

		//"OR" "(" Expression and+=AND? or+=OR? ")"
		public Group getGroup_1() { return cGroup_1; }

		//"OR"
		public Keyword getORKeyword_1_0() { return cORKeyword_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1_1() { return cLeftParenthesisKeyword_1_1; }

		//Expression
		public RuleCall getExpressionParserRuleCall_1_2() { return cExpressionParserRuleCall_1_2; }

		//and+=AND?
		public Assignment getAndAssignment_1_3() { return cAndAssignment_1_3; }

		//AND
		public RuleCall getAndANDParserRuleCall_1_3_0() { return cAndANDParserRuleCall_1_3_0; }

		//or+=OR?
		public Assignment getOrAssignment_1_4() { return cOrAssignment_1_4; }

		//OR
		public RuleCall getOrORParserRuleCall_1_4_0() { return cOrORParserRuleCall_1_4_0; }

		//")"
		public Keyword getRightParenthesisKeyword_1_5() { return cRightParenthesisKeyword_1_5; }
	}
	
	
	private ModelElements pModel;
	private SelectElements pSelect;
	private VariableElements pVariable;
	private ValueElements pValue;
	private OptionElements pOption;
	private WhereElements pWhere;
	private ExpressionElements pExpression;
	private ConditionElements pCondition;
	private ANDElements pAND;
	private ORElements pOR;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.SQL.mydsl1.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	selects+=Select+;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Select:
	//	"SELECT" select_value+=Variable "FROM" froms_value+=Variable options+=Option*;
	public SelectElements getSelectAccess() {
		return (pSelect != null) ? pSelect : (pSelect = new SelectElements());
	}
	
	public ParserRule getSelectRule() {
		return getSelectAccess().getRule();
	}

	//Variable:
	//	values+=Value ("," values1+=Value)*;
	public VariableElements getVariableAccess() {
		return (pVariable != null) ? pVariable : (pVariable = new VariableElements());
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}

	//Value:
	//	name=ID;
	public ValueElements getValueAccess() {
		return (pValue != null) ? pValue : (pValue = new ValueElements());
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}

	//Option:
	//	where+=Where;
	public OptionElements getOptionAccess() {
		return (pOption != null) ? pOption : (pOption = new OptionElements());
	}
	
	public ParserRule getOptionRule() {
		return getOptionAccess().getRule();
	}

	//Where:
	//	"WHERE" exprs+=Expression and+=AND? or+=OR? ";";
	public WhereElements getWhereAccess() {
		return (pWhere != null) ? pWhere : (pWhere = new WhereElements());
	}
	
	public ParserRule getWhereRule() {
		return getWhereAccess().getRule();
	}

	//Expression:
	//	column+=Value Condition result+=Value;
	public ExpressionElements getExpressionAccess() {
		return (pExpression != null) ? pExpression : (pExpression = new ExpressionElements());
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}

	//Condition:
	//	"=" | "<" | ">" | "<=" | ">=";
	public ConditionElements getConditionAccess() {
		return (pCondition != null) ? pCondition : (pCondition = new ConditionElements());
	}
	
	public ParserRule getConditionRule() {
		return getConditionAccess().getRule();
	}

	//AND:
	//	"AND" Expression | "AND" "(" Expression and+=AND? or+=OR? ")";
	public ANDElements getANDAccess() {
		return (pAND != null) ? pAND : (pAND = new ANDElements());
	}
	
	public ParserRule getANDRule() {
		return getANDAccess().getRule();
	}

	//OR:
	//	"OR" Expression | "OR" "(" Expression and+=AND? or+=OR? ")";
	public ORElements getORAccess() {
		return (pOR != null) ? pOR : (pOR = new ORElements());
	}
	
	public ParserRule getORRule() {
		return getORAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
