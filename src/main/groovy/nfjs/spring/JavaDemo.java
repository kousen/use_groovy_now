package nfjs.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class JavaDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Evaluator evaluator = ctx.getBean("javaEvaluator", Evaluator.class);

        boolean result = evaluator.approve(null);
        System.out.println((result ? "approved" : "denied"));
    }
}
