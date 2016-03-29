package nfjs.spring

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportResource

@Configuration
@ComponentScan
@ImportResource("classpath*:applicationContext.xml")
class AppConfig {}
