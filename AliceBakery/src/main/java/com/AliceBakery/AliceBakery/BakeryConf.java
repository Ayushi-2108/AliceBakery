package com.AliceBakery.AliceBakery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BakeryConf {

    @Bean
    public Frosting chocolateFrosting() {
        return new ChocolateFrosting();
    }

    @Bean
    public Syrup chocolateSyrup() {
        return new ChocolateSyrup();
    }

    @Bean
    public CakeBaker cakeBaker(Frosting frosting, Syrup syrup) {
        return new CakeBaker(frosting, syrup);
    }
}
