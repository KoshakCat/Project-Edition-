package mainProject.entity;

import mainProject.enums.PaymentStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Payment {
    private LocalDate paymentDate = LocalDate.now();
    private Subscription subscriptionEditions;
    private PaymentStatus paymentStatus;

    public Payment(Subscription subscriptionEditions) {
        this.subscriptionEditions = subscriptionEditions;
        this.paymentStatus = PaymentStatus.WAITED;
    }

    public Subscription getSubscriptionEditions() {
        return subscriptionEditions;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentDate=" + paymentDate +
                ", subscriptionEditions=" + subscriptionEditions +
                '}';
    }

}
