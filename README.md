# Payment Config — Spring Boot

Mini projeto desenvolvido para praticar **Configuração de Beans no Spring**, utilizando `@Configuration` e `@Bean`.

## Objetivo

Entender como o Spring pode ser responsável pela criação e gerenciamento de objetos através do **Spring Container**, evitando a criação manual de dependências em outras classes.

## Tecnologias

* Java 21
* Spring Boot
* Maven
* Spring Web

## Estrutura

```text
src/main/java/com/example/payment_config
├── config
│   └── PaymentConfig.java
│
├── payment
│   ├── Payment.java
│   ├── PixPayment.java
│   ├── CardPayment.java
│   └── BoletoPayment.java
│
└── PaymentConfigApplication.java
```

## Conceitos praticados

### `@Configuration`

Indica ao Spring que a classe possui configurações utilizadas para definir Beans da aplicação.

### `@Bean`

Indica que o retorno de um método deve ser registrado e gerenciado pelo **Spring Container**.

Exemplo:

```java
@Bean
public PixPayment pixPayment() {
    return new PixPayment();
}
```

Nesse caso, o Spring chama o método durante a inicialização da aplicação, recebe a instância de `PixPayment` e passa a gerenciá-la como um Bean.

## Formas de pagamento

O projeto possui uma interface `Payment`:

```java
public interface Payment {

    void processarPagamento(double value);
}
```

E três implementações:

* `PixPayment`
* `CardPayment`
* `BoletoPayment`

As instâncias são registradas no Spring através da classe `PaymentConfig`.

## O que estou praticando

Este projeto faz parte dos meus estudos de **Spring Framework**, com foco em:

* Inversão de Controle (IoC)
* Injeção de Dependência (DI)
* Spring Container
* Beans
* `@Configuration`
* `@Bean`

---

**Projeto desenvolvido para fins de estudo de Spring Framework e Injeção de Dependência.**
