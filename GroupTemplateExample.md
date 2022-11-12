# Приклад: створення шаблона групи

## Ітерація 1
Функція:
- Вхід: 
    - Дані шаблону (назва, рік тощо)
- Вихід:
    - Збереження стану (ефект)
    - ID нового шаблона АБО помилка (результат)

```java
public class GroupTemplateResult {
    public boolean success;
    public String error;
    public long id;
}

public class GroupTemplateService {
    public GroupTemplateResult CreateGroupTemplate(Integer grade, String name) {
        // Side effect takes place here (DB call)
    }
}
```
Чи досягнуто межі системи? 
Ні

Звідки отримано вхідні дані?
Від клієнта

Отже, переходимо на наступну ітерацію і *опрацьовуємо наступну функцію*, з точки зору клієнта.

## Ітерація 2 ##
Функція:
- Вхід:
    - Дані кроку діалогу створення групи (ID користувача, текст повідомлення)
- Вихід:
    - Надсилання повідомлення-відповіді в чат (ефект)
    - Збереження стану діалогу (ефект)
    - Збереження стану шаблона (ефект)
```java
public class GroupTemplateResult {
    public boolean success;
    public String error;
    public long id;
}

public class GroupTemplateService {
    public GroupTemplateResult CreateGroupTemplate(Integer grade, String name) {
        // Save new group template to DB (side effect)
    }
}

public class GroupTemplateDialogService {
    private GroupTemplateService service;

    public void ProcessDialogMessage(long userId, String message) {
        // If all data fields received, create group template, otherwise ask for next field
        // Save dialog state
        // Respond to chat
    }
}
```

Чи досягнуто межі системи? 
Ні

Звідки отримано вхідні дані?
Від клієнта

Отже, переходимо знову на наступну ітерацію, з точки зору наступного клієнта.

## Ітерація 3 ##
Функція:
- Вхід:
    - Повідомлення в чаті (JSON-обʼєкт)
- Вихід:
    - Надсилання повідомлення-відповіді в чат (ефект)
    - Збереження стану діалогу (ефект)
    - Збереження стану шаблона групи (ефект)

```java
public class GroupTemplateResult {
    public boolean success;
    public String error;
    public long id;
}

public class GroupTemplateService {
    public GroupTemplateResult CreateGroupTemplate(Integer grade, String name) {
        // Save new group template to DB (side effect)
    }
}

public class GroupTemplateDialogService {
    private GroupTemplateService service;

    public void ProcessDialogMessage(long userId, String message) {
        // If all data fields received, create group template, otherwise ask for next field
        // Save dialog state
        // Respond to chat
    }
}

public class TelegramDispatcher {
    private GroupTemplateDialogService service;

    public void ProcessDialogMessage(string json) {
        // Дізнатися тип команди ("створення шаблона групи"), дістати зміст повідомлення, передати на відповідному обробнику
    }
}
```

Чи досягнуто межі системи? 
Так. Кінець.
