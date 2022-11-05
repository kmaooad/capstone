package edu.kmaooad;

import java.math.BigDecimal;
import java.util.Date;

public class CreditCardInfo {
    public String number;
    public String expiresOn;
    public String cvv;
}

public class SubscriptionRequest {
    public CreditCardInfo cc;
    public long userId;
    public String plan;
}

public class Subscription {
    private long userId;
    private String paymentId;
    private String plan;
    private Date activationDate;

    public Subscription(long userId, String paymentId, String plan, Date activationDate) {
        this.userId = userId;
        this.paymentId = paymentId;
        this.plan = plan;
        this.activationDate = activationDate;
    }
}

public class SubscriptionPlan {
    public String name;
    public int amount;
}

public interface PaymentService {
    String processPayment(CreditCardInfo cc, int amount);
}

public interface SubscriptionService {
    Subscription createSubscription(long userId, SubscriptionPlan plan, CreditCardInfo cc);
}

public class SubscriptionServiceImpl implements SubscriptionService {

    private PaymentService paymentService;

    @Override
    public Subscription createSubscription(long userId, SubscriptionPlan plan, CreditCardInfo cc) {
        String paymentId = paymentService.processPayment(cc, plan.amount);

        Subscription subscription = new Subscription(userId, paymentId, plan.name, new Date());

        return subscription;
    }
}

public interface SubscriptionPlanRepository {
    SubscriptionPlan FindByName(String name);
}

public interface RequestHandler<TRequest, TResult> {
    TResult Handle(TRequest req);
}

public class CreateSubscriptionHandler implements RequestHandler<SubscriptionRequest, Subscription> {

    private SubscriptionService subscriptionService;
    private SubscriptionPlanRepository subscriptionPlanRepository;

    @Override
    public Subscription Handle(SubscriptionRequest req) {

        SubscriptionPlan plan = subscriptionPlanRepository.FindByName(req.plan);

        Subscription subscription = subscriptionService.createSubscription(req.userId, plan, req.cc);

        return subscription;
    }
}

public class SubscriptionController {
    private CreateSubscriptionHandler handler;

    public Subscription subscribe(SubscriptionRequest req) {
        return handler.Handle(req);
    }
}
