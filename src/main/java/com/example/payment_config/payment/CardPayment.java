package com.example.payment_config.payment;

public class CardPayment implements Payment {
    @Override
    public void processarPagamento(double value) {
        System.out.println("Pagamento realizado com cartao");
    }
}
