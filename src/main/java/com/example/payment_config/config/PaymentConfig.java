package com.example.payment_config.config;

import com.example.payment_config.payment.BoletoPayment;
import com.example.payment_config.payment.CardPayment;
import com.example.payment_config.payment.PixPayment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {

    @Bean
    public PixPayment pixPayment() {
        return new PixPayment();
    }

    @Bean
    public CardPayment cardPayment() {
        return new CardPayment();
    }

    @Bean
    public BoletoPayment boletoPayment() {
        return new BoletoPayment();
    }
}