package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("adv")
public class ConfigAdv {
//    @Bean
//    public People getPeople(){
//        return new People();
//    }
    @Bean
    public Calculator getCalculator(){
        return new CalculatorAdvanced();
    }
}
