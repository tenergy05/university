package com.demo;

import com.demo.Kisa;
import com.demo.Koshka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KisaConfiguration {

    @Autowired
    private Kisa kisa;

    @Value("${vv.color}")
    private String vvColor;

    @Bean
    public Kisa kisa() {
        return new Kisa();
    }

    @Bean
    public Koshka koshka() {
        Koshka koshka = new Koshka();
        koshka.setColor(vvColor);
        koshka.setKisa(kisa);
        return koshka;
    }


//    <!--<bean id="kisa" class="com.demo.Kisa">-->
//    <!--</bean>-->
//
//    <!--<bean id="koshka" class="com.demo.Koshka">-->
//    <!--<property name="color" value="green" />-->
//    <!--<property name="kisa" ref="kisa" />-->
//    <!--</bean>-->
}
