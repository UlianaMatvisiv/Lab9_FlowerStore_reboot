package ucu.edu.ua.flowerstore.payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaymentTest {
    private CreditCardPaymentStrategy creditCard;
    private PayPalPaymentStrategy payPal;
    private final double price = 300;

    @BeforeEach
    public void init() {
        creditCard = new CreditCardPaymentStrategy();
        payPal = new PayPalPaymentStrategy();
    }

    @Test
    public void testCreditCard() {
        Assertions.assertEquals(price, creditCard.pay(price));
    }

    @Test
    public void testPayPal() {
        Assertions.assertEquals(price, payPal.pay(price));
    }
}