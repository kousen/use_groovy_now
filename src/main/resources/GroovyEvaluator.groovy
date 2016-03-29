import groovy.transform.CompileStatic
import nfjs.spring.Evaluator
import nfjs.spring.MortgageApplication

class GroovyEvaluator implements Evaluator {
    boolean approve(MortgageApplication application) {
        true
	}
}
