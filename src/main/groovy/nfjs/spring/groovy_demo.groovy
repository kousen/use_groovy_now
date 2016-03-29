package nfjs.spring

import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig)
Evaluator evaluator = ctx.getBean("groovyEvaluator", Evaluator)
10.times {
    boolean result = evaluator.approve(null)
    println result ? 'approved' : 'denied'
    sleep 1000
}
