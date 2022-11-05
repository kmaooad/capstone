
## Алгоритм ##

Для заданої функції (feature) <code>f<sub>i</sub></code>:
1. визначити параметри <code>f<sub>i</sub></code> (клієнт <code>c<sub>i</sub></code>, сервер <code>s<sub>i</sub></code>, вхідні параметри, результати)
2. <code>f<sub>i</sub></code> перетинає межі системи? (<code>c<sub>i</sub></code> є кінцевим користувачем системи, а <code>s<sub>i</sub></code> точкою входу системи)
    - YES — стоп
    - NO — goto 3
3. з точки зору <code>s<sub>i</sub></code>, для кожної його залежності <code>d<sub>ij</sub></code> визначити відповідну <code>f<sub>j</sub></code> (тут <code>s<sub>i</sub></code> уже є клієнтом), goto 1, повторити все для <code>f<sub>j</sub></code>
4. з точки зору <code>c<sub>i</sub></code>, звідки вхідні параметри <code>f<sub>i</sub></code>:
    - від клієнта <code>c<sub>k</sub></code>: визначити <code>f<sub>k</sub></code> (в ній <code>c<sub>i</sub></code> є сервером), goto 1, повторити все для <code>f<sub>k</sub></code>. 
    - від залежностей: виконати для <code>c<sub>i</sub></code> крок 3.

## Приклад ##

Feature: "За обраним тарифом і даними банківської карти здійснити оплату і створити для поточного користувача преміум-передплату"

1. визначити параметри <code>f<sub>i</sub></code> (клієнт <code>c<sub>i</sub></code>, сервер <code>s<sub>i</sub></code>, вхідні параметри, результати/ефекти)
- клієнт: _невідомо_ (а взагалі - CreateSubscriptionHandler, див. п.5)
- сервер: SubscriptionService
- вхід: ID користувача, тариф (назва, вартість), картка
- вихід: передплата (результат), оплата (ефект)

```java
public class SubscriptionServiceImpl implements SubscriptionService {

    private PaymentService paymentService;

    @Override
    public Subscription createSubscription(long userId, SubscriptionPlan plan, CreditCardInfo cc) {
        // Side-effect
        String paymentId = paymentService.processPayment(cc, plan.amount); 

        // Result
        Subscription subscription = new Subscription(userId, paymentId, plan.name, new Date());

        return subscription; 
    }
}
```

2. <code>f<sub>i</sub></code> перетинає межі системи?
NO

3. ... _(все аналогічно і для PaymentService)_

4. з точки зору <code>c<sub>i</sub></code>, звідки вхідні параметри <code>f<sub>i</sub></code>:
    
    Усі параметри отримано від клієнта, переходимо туди, починаємо алгоритм спочатку.

5 (1). 

- клієнт: _невідомо_ (а насправді - SubscriptionController)
- сервер: CreateSubscriptionHandler
- вхід: ID користувача, назва тарифу, банк.картка
- вихід: передплата (результат)

```java
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
```

6 (2). <code>f<sub>i</sub></code> перетинає межі системи?
NO

7 (3). ... _(для залежностей все аналогічно)_

8 (4). Звідки вхідні параметри для SubscriptionService?
- plan - від залежності SubscriptionPlanRepository _(пропускаємо, для залежностей аналогічна процедура)_
- userId, картка - від клієнта, переходимо туди, починаємо алгоритм спочатку

9 (1). 
- клієнт: _невідомо_ (а насправді - фронт-енд)
- сервер: SubscriptionController
- вхід: ID користувача, назва тарифу, банк.картка
- вихід: передплата (результат)

```java 
public class SubscriptionController {
    private CreateSubscriptionHandler handler;

    public Subscription subscribe(SubscriptionRequest req) {
        return handler.Handle(req);
    }
}
```

10 (2). <code>f<sub>i</sub></code> перетинає межі системи?
YES (наш клієнт - фронт-енд, він уже поза межами нашої відповідальності, для нас це межа системи, SubscriptionController - для нас це точка входу системи)
