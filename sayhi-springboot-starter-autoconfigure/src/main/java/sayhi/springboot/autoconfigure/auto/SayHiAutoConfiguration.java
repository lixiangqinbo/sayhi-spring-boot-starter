package sayhi.springboot.autoconfigure.auto;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sayhi.springboot.autoconfigure.service.SayHiService;
import sayhi.springboot.autoconfigure.properies.SayHiProperies;

@Configuration
@EnableConfigurationProperties(SayHiProperies.class)
@ConditionalOnMissingBean(SayHiService.class)
public class SayHiAutoConfiguration {

    @Bean
    public SayHiService createSayHiBean(){

        return new SayHiService();
    }
}
