import groovy.transform.CompileStatic;
import mjg.spring.*
import nfjs.spring.Evaluator
import nfjs.spring.MortgageApplication

@CompileStatic
class GroovyEvaluator implements Evaluator {
    boolean approve(MortgageApplication application) {
        false
	}
}
