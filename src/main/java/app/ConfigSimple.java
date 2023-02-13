package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("simple")
public class ConfigSimple {
    @Bean
    public Calculator getCalculator(){
        return new CalculatorSimple();
    }
}
