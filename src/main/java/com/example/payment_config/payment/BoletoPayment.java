package com.example.payment_config.payment;

public class BoletoPayment implements Payment{

    @Override
    public void processarPagamento(double value) {
        System.out.println("Pagamento realizado via boleto");
    }



}
