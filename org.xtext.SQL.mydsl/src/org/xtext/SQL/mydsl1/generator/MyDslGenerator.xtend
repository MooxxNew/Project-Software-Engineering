/*
 * generated by Xtext
 */
package org.xtext.SQL.mydsl1.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.xtext.SQL.mydsl1.myDsl.Model
import javax.inject.Inject
import org.eclipse.emf.common.util.EList
import org.xtext.SQL.mydsl1.myDsl.Select
import org.xtext.SQL.mydsl1.myDsl.Variable
import org.xtext.SQL.mydsl1.myDsl.Value
import org.xtext.SQL.mydsl1.myDsl.Option
import org.xtext.SQL.mydsl1.myDsl.Where
import org.xtext.SQL.mydsl1.myDsl.Expression

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class MyDslGenerator implements IGenerator {
	
	@Inject extension IQualifiedNameProvider
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    for(e: resource.allContents.toIterable.filter(Model)) {
      fsa.generateFile('''TestGenerateSQL.java''',e.VisitModel)
    	}
  	}
	
	def VisitModel(Model m){
		if(m.selects != null){ 
			'''«FOR x : m.selects»«visitSelect(x)»«ENDFOR»'''
		}
	}
	
	def visitSelect(Select s) {
		'''
			«FOR f : s.froms_value»
				«FOR x : s.select_value»
					a.readFile(«visitFromValue(f)»).«IF s.options != null»«FOR o : s.options»«visitOption(o)»«ENDFOR»«ENDIF».map{
						[«visitSelectValue(x)»] 
					}
				«ENDFOR»
			«ENDFOR»
		'''
	}
	def visitVariable(){
		
	}
	
	def visitOption(Option o) {
		'''«IF o.where != null»«FOR x : o.where»«visitWhere(x)»«ENDFOR»«ENDIF»'''
	}
	
	def visitWhere(Where w) {
		'''«FOR x : w.exprs»«visitExpression(x)»«ENDFOR»'''
	}
	
	def visitExpression(Expression e) {
		'''filter({«FOR x : e.column»«visitValues(x)»« ENDFOR».equals("«FOR y : e.result»«visitValues(y)»« ENDFOR»")})'''
	}
	
	def visitFromValue(Variable v) {
		'''«FOR x : v.values»«visitValues(x)»« ENDFOR»'''
	}
	
	def visitSelectValue(Variable v) {
		'''«FOR x : v.values»«visitValues(x)»«ENDFOR»«IF v.values1!=null»«FOR y : v.values1»«visitValues1(y)»«ENDFOR»«ENDIF»'''
	}
	
	def visitValues1(Value v) {
		''',«v.name»'''
	}
	
	def visitValues(Value v) {
		'''«v.name»'''
	}
	
	
	
}