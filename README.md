# Практична робота: Створення, виконання та запуск Java-програм
**Виконувала студентка 34 групи Цикура Марія**

## Завдання 1 та 2: Створення класу з атрибутами та додавання в клас методів
Для виконання цих звадань було створено клас **Customer**, для якого було створено приватні статистичні атрибути (було вирішено робити їх статистичнии для роботи методу). Кожному атрибуту надані значення за завмовчуванням
Далі я створила метод **DisplayCustomerInfo()**, куди для кожного атрибута я окремо додала **System.out.println**, за допомогою яких вже здійснюватиметься вивід на екран
необхідної інформації про атрибути.

## Створення тестового класу та перевірка коду
Аби запустити створений код, необхідно створити окремий клас Java, який виконуватиме цю функцію. Для цього було створеня новий **пакет CustomerTest**, всеренині якого я і створила новий клас **CustomerTest**. Після імпорту класу **Customer** з **пакету Domain**, вже в самому класі **CustomerTest** було створено метод main, всередині якого створено об'єкт класу **Customer**, а також виклик методу **DisplayCustomerInfo()**

Перевіривши на правильність та помилки всі написані коди, я, користуючись комбінацією **Alt+Shift+F**, відредагувала всі відступи, та зробила код більш гарним та читабельним. 
### Вже готовий результат має наступний вигляд:
![exercises 1,2,test](https://github.com/ppc-ntu-khpi/java-1-mariiatsykura/blob/main/Solution/done.png)

## Завдання на вищий бал: створення конструктору за завмовчуванням та додавання методів для зміни атрибутів
Для того, аби отримати вищий бал (на що я дуже сподіваюсь), було обрано видозмінювати код наступним чином:
У класі **Customer** я створила конструктор за завмовчуванням. Я прибрала вже поставлені мною значення атрибутів, що були під час оголошення самих атрибутів, та перенесла їх у створений конструктор **Customer()**. Далі, простою комбінаціює клавіш **Alt+Insert** було створено методи зміни атрибутів. У два методи було додано **цикл if**, що перевіряє, аби значення атрибутів були додатніми.
Далі, я змінила код класу **CustomerTest** таким чином, щоб, користуючись методом **set**, було введено нові значення атрибутів класу

**Таким чином, код класу Cutomer буде наступний:**

![class Customer advanced](https://github.com/ppc-ntu-khpi/java-1-mariiatsykura/blob/main/Solution/advanced(1).png)

![class Customer advanced2](https://github.com/ppc-ntu-khpi/java-1-mariiatsykura/blob/main/Solution/advanced(2).png)



### Код тестового класу та результат, отриманий у консолі, буде наступним:
![class Customer advanced2](https://github.com/ppc-ntu-khpi/java-1-mariiatsykura/blob/main/Solution/advanced(3).png)
