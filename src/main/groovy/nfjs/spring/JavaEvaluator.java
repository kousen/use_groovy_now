package nfjs.spring;

import org.springframework.stereotype.Component;

@Component
public class JavaEvaluator implements Evaluator {
    public boolean approve(MortgageApplication application) {
        return true; 
    }
}
