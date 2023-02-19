## 设计模式
#### 设计模式中的类型有哪些?（共三种）
- **创建型模式---包括**
```txt
工厂模式（Factory Pattern）
抽象工厂模式（Abstract Factory Pattern）
单例模式（Singleton Pattern）
建造者模式（Builder Pattern）
原型模式（Prototype Pattern）
```
- **结构型模式---包括**
```txt
适配器模式（Adapter Pattern）
桥接模式（Bridge Pattern）
过滤器模式（Filter、Criteria Pattern）
组合模式（Composite Pattern）
装饰器模式（Decorator Pattern）
外观模式（Facade Pattern）
享元模式（Flyweight Pattern）
代理模式（Proxy Pattern）
```
- **行为型模式---包括**
```txt
责任链模式（Chain of Responsibility Pattern）
命令模式（Command Pattern）
解释器模式（Interpreter Pattern）
迭代器模式（Iterator Pattern）
中介者模式（Mediator Pattern）
备忘录模式（Memento Pattern）
观察者模式（Observer Pattern）
状态模式（State Pattern）
空对象模式（Null Object Pattern）
策略模式（Strategy Pattern）
模板模式（Template Pattern）
访问者模式（Visitor Pattern）
```
#### 设计模式需要遵循的六大原则

1. 开闭原则（对修改关闭，对扩展开放）
2. 里式替换原则 （任何基类可以出现的地方，子类均可出现）
3. 依赖倒转原则 （面向接口编程，而不是具体的事物）
4. 接口隔离原则 （使用多个隔离的接口，比使用单个接口好）
5. 迪特米原则（一个实体类尽量少于其他实体类发生关联）
6. 合成复用原则（多使用聚合，少使用继承）

---
### 一、单例模式
单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一

1、单例类只能有一个实例。

2、单例类必须自己创建自己的唯一实例。

3、单例类必须给所有其他对象提供这一实例。（对外公有 public）

##### 单例模式的几种实现方式以及优缺点
**1、懒汉式--线程不安全的**
```txt
懒加载
算不得真正意义上的单例模式（因为没有加锁 synchronized）

线程不安全，不支持多线程  （了解会写即可）
```
**2、懒汉式---线程安全的**
```txt
懒加载
线程安全，支持多线程  

因为实现是必须加锁才能保证单例。所以影响效率

该方法使用不太频繁
```
**3、饿汉式----线程安全的**
```txt
不是懒加载
这种方式比较常用，但容易产生垃圾对象

没有加锁，执行效率会提高。

类加载时就初始化，浪费内存
```
**4、双检锁模式---线程安全**
```txt
这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
```
**5、静态内部类模式----线程安全**
```txt
这种方式能达到双检锁方式一样的功效，但实现更简单

假设一种情况 : 如果实例化 instance 很消耗资源，目的是想让它延迟加载

但是另外一方面，又不希望在类加载时instance就被实例化

所以这种【静态内部类】的方式，当类被装载了，instance 不一定被初始化。

因为 【静态内部类】没有被主动使用，只有通过调用 getInstance() 方法时

才会装载 【静态内部类】 类，从而实例化 instance

所以这个时候，这种方式相比 【饿汉式】 就显得合理。
```
**6、枚举 ---线程安全**
```txt
种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。

它更简洁，自动支持序列化机制，绝对防止多次实例化。

实际工作中，很少用。
```
---
###### 总结：
【懒汉式】不建议使用。了解会写即可。

【饿汉式】建议使用。

要实现 lazy loading 效果时，使用 【静态内部类】

如果需要反序列化创建对象时，可以尝试使用【枚举方式】

除上述情况外，都使用【双检锁方式】。

---


### 二 、 工厂模式
**这种类型的设计模式属于创建型模式**

![img.png](DesignPattern-Study%2Fimage%2Fimg.png)

```txt
我们将创建一个 Shape 接口和实现 Shape 接口的实体类。下一步是定义工厂类 ShapeFactory。

FactoryPatternDemo 类使用 ShapeFactory 来获取 Shape 对象
。
它将向 ShapeFactory 传递信息（CIRCLE / RECTANGLE / SQUARE），

以便获取它所需对象的类型
```

### 抽象工厂模式
抽象工厂模式（Abstract Factory Pattern）

他是一个超级工厂，用来创建其他工厂。

这种类型的设计模式属于【创建型】模式

![afp.png](DesignPattern-Study%2Fimage%2Fafp.png)

何时使用：当系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。

如何解决：在一个产品族里面，定义多个产品。

主要解决接口选择的问题






