package com.example.payment_config.payment;

public class PixPayment implements Payment{

    @Override
    public void processarPagamento(double value) {
        System.out.println("Pagamento processado no valor de : " + value);
    }
}
