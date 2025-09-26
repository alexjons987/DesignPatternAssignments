### 1. [**Singleton Pattern**](https://github.com/alexjons987/DesignPatternAssignments/tree/master/src/singleton)
**Assignment:** Implement a simple `Logger`-class that only has a single instance.
**Instructions:**
- [x] Create a new class `Logger` with a private constructor.
- [x] Implement a static method `getInstance()` to get access to the instance of `Logger`.
- [x] Add method `log(String message)` that logs messages to the console.  
**Extra:**
- [x] Make the logger log to a file instead of the console.

---

### 2. [**Factory Method Pattern**](https://github.com/alexjons987/DesignPatternAssignments/tree/master/src/factory/method)
**Assignment:** Implement a factory to create different types of geometric shapes (`Shape`).
**Instructions:**
- [x] Create an interface `Shape` with the `draw()` method.
- [x] Implement the `Circle`, `Square`, and `Rectangle` classes that `implements Shape`.
- [x] Create a `ShapeFactory` class with a `createShape(String type)` method.
- [x] Call the factory and draw different shapes in the main method.

---

### 3. [**Observer Pattern**](https://github.com/alexjons987/DesignPatternAssignments/tree/master/src/observer/pattern)
**Assignment:** Simulate a news feed where multiple users subscribe to updates.
**Instructions:**
- [x] Create an interface `Observer` with the method `update(String news)`.
- [x] Create a class `NewsAgency` that can manage a list of `Observer` objects and notify them.
- [x] Implement several classes that represent users and implement `Observer`.
- [x] Simulate the news agency sending news to the users.

---

### 4. [**Strategy Pattern**](https://github.com/alexjons987/DesignPatternAssignments/tree/master/src/strategy/pattern)
**Assignment:** Implement a system to calculate different types of discounts.
**Instructions:**
- [ ] Create an interface `DiscountStrategy` with the method `double applyDiscount(double price)`.
- [ ] Implement the classes `PercentageDiscount`, `FixedAmountDiscount`, and `NoDiscount`.
- [ ] Create a class `Cart` that uses a `DiscountStrategy` to calculate the discount.
- [ ] Test different discounts by changing the strategy.

---

### 5. [**Decorator Pattern**](https://github.com/alexjons987/DesignPatternAssignments/tree/master/src/decorator/pattern)
**Assignment:** Build a simple coffee ordering app with different options.
**Instructions:**
- [ ] Create an interface `Coffee` with the `double getCost()` and `String getDescription()` methods.
- [ ] Implement a base class `SimpleCoffee` that implements `Coffee`.
- [ ] Create decorator classes like `Milk`, `Sugar`, and `WhippedCream` that add cost and description.
- [ ] Build a coffee order with multiple options and calculate the final price.
