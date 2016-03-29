package nfjs.spring

import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

import javax.annotation.Resource

@ContextConfiguration(classes = AppConfig)
class EvaluatorSpec extends Specification {
    @Resource(name = 'javaEvaluator')
    Evaluator javaEvaluator

    @Resource(name = 'groovyEvaluator')
    Evaluator groovyEvaluator

    def 'dependency injection works'() {
        expect: "injected references should not be null"
        javaEvaluator
        groovyEvaluator
    }

    def 'all Java mortgage applications are approved'() {
        expect: javaEvaluator.approve(null)
    }

    def 'all Groovy mortgage applications are approved'() {
        expect: groovyEvaluator.approve(null)
    }
}
