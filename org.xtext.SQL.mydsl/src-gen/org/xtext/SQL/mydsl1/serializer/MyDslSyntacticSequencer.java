package org.xtext.SQL.mydsl1.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.SQL.mydsl1.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AND_ANDKeyword_0_0_or___ANDKeyword_1_0_LeftParenthesisKeyword_1_1__;
	protected AbstractElementAlias match_OR_ORKeyword_0_0_or___ORKeyword_1_0_LeftParenthesisKeyword_1_1__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_AND_ANDKeyword_0_0_or___ANDKeyword_1_0_LeftParenthesisKeyword_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getANDAccess().getANDKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getANDAccess().getLeftParenthesisKeyword_1_1())), new TokenAlias(false, false, grammarAccess.getANDAccess().getANDKeyword_0_0()));
		match_OR_ORKeyword_0_0_or___ORKeyword_1_0_LeftParenthesisKeyword_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getORAccess().getORKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getORAccess().getLeftParenthesisKeyword_1_1())), new TokenAlias(false, false, grammarAccess.getORAccess().getORKeyword_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getConditionRule())
			return getConditionToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Condition
	 * :
	 * 	'=' | '<' | '>' | '<=' | '>='
	 * ;
	 */
	protected String getConditionToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AND_ANDKeyword_0_0_or___ANDKeyword_1_0_LeftParenthesisKeyword_1_1__.equals(syntax))
				emit_AND_ANDKeyword_0_0_or___ANDKeyword_1_0_LeftParenthesisKeyword_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OR_ORKeyword_0_0_or___ORKeyword_1_0_LeftParenthesisKeyword_1_1__.equals(syntax))
				emit_OR_ORKeyword_0_0_or___ORKeyword_1_0_LeftParenthesisKeyword_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'AND' | ('AND' '(')
	 */
	protected void emit_AND_ANDKeyword_0_0_or___ANDKeyword_1_0_LeftParenthesisKeyword_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'OR' | ('OR' '(')
	 */
	protected void emit_OR_ORKeyword_0_0_or___ORKeyword_1_0_LeftParenthesisKeyword_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
