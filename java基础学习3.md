### 48、集合基础 ArrayList

集合类的特点：提供一种存储空间可变的存储模型，存储的数据容量可以发生改变

ArrayList<E>:

- 可调整大小的数组实现
- <E>:是一种特殊的数据类型，泛型

### 49、ArrayList构造方法和添加方法

```java
public ArrayList():创建一个空的集合对象
public boolean add(E e):将指定的元素追加到此集合的末尾
public void add(int index,E element)；在此集合的指定位置插入指定的元素
```

```java
package com.myList;
import java.util.ArrayList;
public class ArrayList001 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        System.out.println(array);//输出：[]

        //public boolean add(E e):将指定的元素追加到此集合的末尾
        boolean flag = array.add("hello");
        System.out.println(flag);//输出：true

        array.add("world");
        System.out.println(array);//输出：[hello, world]  ---拼接时自动有“，”和空格

        //public void add(int index,E element)；在此集合的指定位置插入指定的元素
        array.add(1,"flower");
        System.out.println(array);//输出：[hello, flower, world]  --拼接时自动有“，”和空格
        array.add(3,"last");
        System.out.println(array);//输出：[hello, flower, world, last]
        array.add(5,"111");
        System.out.println(array);//程序报错：IndexOutOfBoundsException集合的索引越界
    }
}
```

### 50、ArrayList常用方法

```java
public boolean remove(Object o):删除指定的元素，返回删除是否成功
public E remove(int index)：删除指定索引的元素，返回被删除的元素
public E set(int index,E element):修改指定索引处的元素，返回被修改的元素
public E get(int index):返回指定索引处的元素
public int size():返回集合中元素的个数；相当于数组中的length()
```

```java
public class ArrayList002 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");
        System.out.println(array);//[hello, world, java]
        System.out.println(array.set(1,"abc"));//world
        System.out.println(array);//[hello, abc, java]
        //System.out.println(array.set(3,"gb"));//IndexOutOfBoundsException
        //System.out.println(array.get(3));//IndexOutOfBoundsException
    }
}
```

### 51、ArrayList存储字符串并遍历

需求：创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合

遍历集合的通用格式：

```java
for(int i = 0;i<集合对象.size();i++){
    集合对象.get(i); 就是指定索引处的元素
}
```

```java
import java.util.ArrayList;
public class ArrayList003 {
    public static void main(String[] args) {
        //需求：创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
        //1.创建集合对象
        ArrayList<String> arrayList = new ArrayList<>();
        //2.往集合中添加字符串对象
        arrayList.add("zhangsan");
        arrayList.add("lisi");
        arrayList.add("wangwu");
        System.out.println(arrayList);//[zhangsan, lisi, wangwu]
        //遍历
        for(int i = 0;i<arrayList.size();i++){
            String s = arrayList.get(i);
            System.out.println(s);/*zhangsan
                                    lisi
                                    wangwu*/
        }
    }
}
```

### 52、ArrayList存储学生对象并遍历

需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

（1）定义学生类

（2）创建集合对象

（3）创建学生对象

（4）添加学生对象到集合中

（5）遍历集合，采用通用遍历格式实现

```java
package com.myList;
/*1.定义学生类*/
public class Student {
    /*成员变量*/
    private String name;
    private int age;
    public Student(){}//无参构造方法
    public Student(String name,int age){
        this.name=name;
        this.age= age;
    }//带参构造方法
    /*set和get方法*/
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
```

```java
package com.myList;
import java.util.ArrayList;
public class ArrayList004 {
    public static void main(String[] args) {
        /*2.创建集合对象*/
        ArrayList<Student> arrayList = new ArrayList<Student>();
        /*3.创建学生对象*/
        Student s1 = new Student("zhangsan",19);
        Student s2 = new Student("lisi",20);
        Student s3 = new Student("wangwu",21);
        /*4.添加学生对象到集合中*/
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        /*5.遍历集合，采用通用遍历格式实现*/
        for(int i = 0;i<arrayList.size();i++){
            Student s = arrayList.get(i);
            System.out.println("name:"+s.getName()+","+"age:"+s.getAge());
        }
    }

}
```

### 53、学生管理系统

### 54、继承

#### （1）继承的概述

继承是面向对象三大特征之一。可以使得子类具有父类的属性和方**法**，还可以在**子类中重新定义**，**追加属性和方法**

#### （2）继承的格式

- 格式：public class 子类名 <font color='red'><b>extends</b></font> 父类名{}

- 范例：public class Zi <font color='red'><b>extends</b></font> Fu{}

- Fu:是父类，也被称为基类、超类

- Zi:是子类，也被称为派生类

#### （3）继承中子类的特点

- 子类可以有父类的内容
- 子类还可以有自己特有的内容

```java
public class Fu {
    public void method(){
        System.out.println("父类被调用");
    }
}
```

```java
public class Zi extends Fu{
    public void show(){
        System.out.println("子类被调用");
    }
}
```

```java
public class Test001 {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.method();//父类被调用

        Zi zi = new Zi();
        zi.show();//子类被调用

        zi.method();//父类被调用
    }
}
```

#### （4）继承的好处和弊端

1. 继承的好处

   - 提高了代码的<font color='red'>复用性</font>（多个类相同的成员可以放到同一个类中）

   - 提高了代码的<font color='red'>维护性</font>（如果方法的代码需要修改，修改一处即可）

2. 继承的弊端

   继承让类与类之间产生了关系，类的耦合性增强了，当父类发生变化时子类实现也不得不跟着变化，削弱了子类的独立性

3. 什么时候使用继承？

   - 继承体现的关系：is  a  (翻译：什么是什么的一种)
   - 假设法：我有两个类A和B,如果他们满足A是B的一种，或者B是A的一种，就说明他们存在继承关系，这个时候就可以考虑使用继承来实现，否则就不能滥用继承

#### （5）继承中变量的访问特点

在子类方法中访问一个变量

- 首先，在在子类局部范围找（子类方法内）
- 子类方法内没有的话，然后在子类成员范围找（子类中找）
- 子类中没有的话，最后在父类成员范围找（父类中找）
- 如果都没有就报错（不考虑父亲的父亲。。。）

#### （6）super关键字

<font color='red'>super</font>关键字的用法和<font color='red'>this</font>关键字的用法相似

- <font color='red'>this</font>:代表本类对象的引用
- <font color='red'>super</font>:代表父类存储空间的标识（可以理解为父类对象引用）

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/super.png)

![avatar](image\super.png)

#### （7）继承中构造方法的访问特点

1. 子类中所有的构造方法默认都会访问父类中无参的构造方法

   为什么呢？

   - 因为子类会继承父类中的数据，可能还会使用父类的数据。所以，子类初始化之前，一定要先完成父类数据的初始化
   - 每一个子类构造方法的第一条语句默认都是：<font color='red'>super()</font>  --无参
   - 例如：

   ```java
   public class Fu {
       public Fu(){
           System.out.println("父类中无参构造方法被调用");
       }
       public Fu(int age){
           System.out.println("父类中有参构造方法被调用");
       }
   }
   ```

   ```java
   public class Zi extends Fu{
       public Zi(){
           //每一个子类构造方法的第一条语句默认都是：super()
           System.out.println("子类中无参构造方法被调用");
       }
       public Zi(int age){
           //每一个子类构造方法的第一条语句默认都是：super()
           System.out.println("子类中有参构造方法被调用");
       }
   }
   ```

   ```java
   //测试类
   public class Test001 {
       public static void main(String[] args) {
           //创建对象
           Zi zi = new Zi();
           /*输出结果：
           父类中无参构造方法被调用
           子类中无参构造方法被调用*/
           Zi zi2 = new Zi(20);
           /*输出结果：
           父类中无参构造方法被调用
           子类中有参构造方法被调用*/
       }
   }
   ```

2. 如果父类中没有无参构造方法，只有带参构造方法，该怎么办呢？

- 通过使用super关键字去显示的调用父类的带参构造方法(子类就不会报错了)

```java
public class Fu {
    public Fu(int age){
        System.out.println("父类中有参构造方法被调用");
    }
}
```

```java
public class Zi extends Fu{
    public Zi(){
        super(20);
        System.out.println("子类中无参构造方法被调用");
    }
    public Zi(int age){
        super(20);
        System.out.println("子类中有参构造方法被调用");
    }
}
```

- 在父类中自己提供一个无参构造方法(子类就不会报错了)

<font color='red'>推荐：自己给出无参构造方法</font>

```java
public class Fu {
    public Fu(){}//手动给出一个无参构造方法
    public Fu(int age){
        System.out.println("父类中有参构造方法被调用");
    }
}
```

```java
public class Zi extends Fu{
    public Zi(){
        System.out.println("子类中无参构造方法被调用");
    }
    public Zi(int age){
        System.out.println("子类中有参构造方法被调用");
    }
}
```

#### （8）继承中成员方法的访问特点

通过子类对象访问一个方法

- 首先，在子类成员范围找（子类中找）
- 子类没有的话，然后在父类成员范围找（父类中找）
- 如果都没有就报错（不考虑父亲的父亲。。。）

#### （9）方法重写

方法重写概述

- 子类中出现了和父类中一模一样的方法声明

方法重写的应用

- 当子类需要父类的功能，而功能主题子类有自己特有内容时，可以重写父类中的方法，这样，即沿袭了父类的功能，又定义了子类特有的内容
- 练习：手机类和新手机类

<font color='red'>@Override</font>

- 是一个注解
- 可以帮助我们检查重写方法的方法声明的正确性

```java
public class Phone {
    //类中的方法称为成员方法也叫方法
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }
}
```

```java
public class NewPhone extends Phone{
    @Override
    public void call(String name){
        System.out.println("开启视频通话");
        //System.out.println("给"+name+"打电话");
        super.call(name);
    }
}
```

```java
//测试类
public class PhoneTest001 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("林青霞");//输出结果：给林青霞打电话

        NewPhone np = new NewPhone();
        np.call("张三");//首先在子类成员范围找（子类中找）,没有的话，再去父类中找
        /*输出结果：
        开启视频通话
        给张三打电话*/
    }
}
```

#### （10）方法重写的注意事项

- 私有方法不能被重写（父类私有成员子类是不能继承的）
- 子类方法访问权限不能更低（public>默认>私有）

```java
public class Fu {
    private void show(){
        System.out.println("父类的show()方法被调用");
    }
    void method(){//默认修饰符
        System.out.println("父类的method()方法被调用");
    }
}
```

```java
public class Zi extends Fu{
    @Override//报错：不能重写
    private void show(){
        System.out.println("子类的show()方法被调用");
    }
    void method(){//可以使用默认修饰符和public修饰符重写；不能比父类修饰符级别低
        System.out.println("子类的method()方法被调用");
    }
}
```

#### （11）java中继承的注意事项

- java中类只支持单继承，不支持多继承（子类A不能既继承父类B，又继承父类C)  (父类D可以被子类E继承，也可以被子类F继承)

- java中类支持多层继承


![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/继承注意事项.png)

![avatar](image\继承注意事项.png)

#### （12）老师和学生

需求：定义老师类和学生类，然后写代码测试；最后找到老师类和学生类当中的共性内容，抽取出一个父类，用继承的方式改写代码，并进行测试

```java
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

```java
public class Teacher extends Person{
    public Teacher(){}
    public Teacher(String name,int age){
        /*this.name = name;//报错能直接访问父类的私有成员变量
        this.age =  age;//报错：不能直接访问父类的私有成员变量*/
        super(name,age);//可以访问父类的带参构造方法
    }
    public void teach(){
        System.out.println("用心教好每一位学生");
    }
}
```

```java
//测试类
public class StuTeaPubTest001 {
    public static void main(String[] args) {
        //创建老师类对象进行测试
        Teacher t1 = new Teacher();//无参构造方法
        t1.setName("林青霞");
        t1.setAge(30);
        System.out.println(t1.getName()+","+t1.getAge());//林青霞,30
        t1.teach();//用心教好每一位学生

        //带参构造方法
        Teacher t2 = new Teacher("张三",36);//带参构造方法
        t2.setName("张三");
        t2.setAge(18);
        System.out.println(t2.getName()+","+t2.getAge());//张三,18
        t2.teach();//用心教好每一位学生
    }
}
```

#### (13)重写和重载的区别

定义不同---重载是定义相同的方法名，参数不同；重写是子类重写父类的方法

范围不同---重载是在一个类中，重写是子类与父类之间的

多态不同---重载是编译时的多态性，重写是运行时的多态性

返回不同---重载对返回类型没有要求，而重写要求返回类型，有兼容的返回类型

参数不同---重载的参数个数、参数类型、参数顺序可以不同，而重写父子方法参数必须相同

修饰不同---重载对访问修饰没有特殊要求，重写访问修饰符的限制一定要大于被重写方法的访问修饰符

### 55、修饰符

#### （1）package

包其实就是文件夹，作用：对类进行分类管理

包的定义格式

- 格式：package 包名；（多级包用.分开）

- 范例：package com.itheima;

  

带包的Java类编译和执行(通过记事本创建包的方法)

- 手动建包

  按照以前的格式编译java文件   javac HelloWorld.java

  手动创建包								建立文件夹com,在com下建立文件夹itheima	

  把class文件放到包的最里面	  把HelloWorld.class文件放到com下的itheima文件夹下

  带包执行									java.com.itheima.HelloWorld

- 自动建包  javac -d . HelloWorld.java   java.com.itheima.HelloWorld

#### （2）导包

导包的格式

- 格式：import 包名；
- 范例：import cn.itcast.Teacher

#### （3）修饰符（protected/private/public、final、static)

1. **权限修饰符**

   ![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/权限修饰符.png)

   ![avatar](image\权限修饰符.png)

   同一个包中子类无关类  意思是  同一个包中的子类或者同一个包中的无关类

   默认就是非那三种修饰符，默认有一个修饰符

2. **状态修饰符**

   <font color='red'>final</font>关键字是最终的意思，可以修饰成员方法、成员变量、类

   <font color='red'>final</font>修饰的特点

   - 修饰方法：表明该方法是最终方法，<font color='red'>不能被重写</font>
   - 修饰变量：表明该变量是常量，<font color='red'>不能再次被赋值</font>
   - 修饰类：表明该类是最终类，<font color='red'>不能被继承</font>

3. **final修饰局部变量**

   - 变量是基本类型：final修饰指的是基本类型的<font color='red'>数据值</font>不能发生改变
   - 变量是引用类型：final修饰指的是引用类型的<font color='red'>地址值</font>不能发生改变，但是地址里里面的内容是可以发生改变的

4. **static关键字**

   static关键字是静态的意思，可以修饰成员方法，成员变量(例如修饰成员变量：public static String university;)

   static修饰的特点

   - 被类的所有对象共享：这也是我们判断是否使用静态关键字的条件

   - 可以通过类名调用---推荐使用（类名.变量='')

     当然，也可以通过对象名调用(Student s = new Student()   s.变量='')

5. **static访问特点**

   非静态的成员方法：

   - 能访问静态的成员变量
   - 能访问非静态的成员变量
   - 能访问静态的成员方法
   - 能访问非静态的成员方法

   静态的成员方法：

   - 能访问静态的成员变量
   - 能访问静态的成员方法

   <font color='red'>总结：静态的成员方法只能访问静态成员</font>

### 56、多态

#### （1）多态概述

同一对象，在不同时刻表现出来的不同形态

多态的前提和体现

- 有继承/实现关系
- 有方法重写
- 有父类引用指向子类对象（如:动物 animal = new 猫();)

```java
public class Animal {
    public void eat(){
        System.out.println("动物吃东西");
    }
}
```

```java
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
```

```java
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
    }
}
```

#### （2）多态中成员访问特点

​	Animal a = new Cat()

- 成员变量：编译看左边，执行看左边
- 成员方法：编译看左边，执行看右边

为什么成员变量和成员方法的访问不一样呢？

- 因为成员方法有重写，而成员变量没有

```java
public class Animal {
    public int age = 40;
    public void eat(){
        System.out.println("动物吃东西");
    }
}
```

```java
public class Cat extends Animal{
    public int age = 20;
    public int weight = 10;
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void playGame(){
        System.out.println("猫捉迷藏");
    }
}
```

```java
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        System.out.println(a.age);//输出：40
//        System.out.println(a.weight);//访问不了a.weight，报错
        a.eat();//输出：猫吃鱼
//        a.playGame();//访问不了a.playGame()方法，报错
    }
}
```

#### （3）多态的好处和弊端

- 多态的好处:提高了程序的扩展性

  具体体现：定义方法的时候，使用父类型作为参数，将来在使用的时候，使用具体的子类型参与操作

- 多态的弊端:不能使用子类的特有功能

```java
public class Animal {//父类
    public void eat(){
        System.out.println("动物吃东西");
    }
}
```

```java
public class Cat extends Animal{//子类
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
```

```java
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void lookDoor(){
        System.out.println("狗看门");
    }
}
```

```java
public class AnimalOpe {
    public void userAnimal(Animal a){
        a.eat();
        //a.lookDoor();//无法调用此方法，报错--因为不能使用子类的特有功能
    }
}
```

```java
public class AnimalDemo {
    public static void main(String[] args) {
        //创建动物操作类的对象，调用方法
        AnimalOpe ao = new AnimalOpe();
        Cat c = new Cat();
        ao.userAnimal(c);

        Dog d = new Dog();
        ao.userAnimal(d);
    }
}
```

#### （4）多态中的转型

- 向上转型

   从子到父

   父类引用指向子类对象

- 向下转型（可解决多态”不能使用子类的特有功能“的弊端）

   从父到子

   父类引用转为子类对象

  ```java
  Animal a = new Cat()//向上转型
  Cat c = (Cat)a;//向下转型
  c.playGame();//子类特有
  ```


### 57、抽象类

#### （1）抽象类概述

在java中，一个<font color='red'>没有方法体</font>的方法应该定义为<font color='red'>抽象方法</font>，而类中如果有<font color='red'>抽象方法</font>,该类必须定义为<font color='red'>抽象类</font>

```java
public abstract class Animal {//抽象类
    public abstract void eat();//抽象方法
}
```

#### （2）抽象类的特点

- 抽象类和抽象方法必须使用<font color='red'>abstract</font>关键字修饰

  ​	public <font color='red'>abstract</font> class 类名{}   --抽象类

  ​	public <font color='red'>abstract</font> void eat();   --抽象方法

- 抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类

- 抽象类不能实例化（创建对象new Animal()）

  ​	抽象类如何实例化呢？参照多态的方式，通过子类对象实例化，这叫抽象类多态

- 抽象类的子类

  ​	要么重写抽象类中的所有抽象方法

  ​	要么子类本身是抽象类

#### （3）抽象类的成员特点

- 成员变量

  ​	可以是变量

  ​	也可以是常量（例如：private final String city = "北京"）

- 构造方法

  ​	有构造方法，但是不能实例化

  ​	那么，构造方法的作用是什么呢？用于子类访问父类数据的初始化

- 成员方法

  ​	可以有抽象方法：限定子类必须完成某些动作

  ​	也可有非抽象方法：提高代码复用性(继承)

#### （4）猫和狗（抽象类版）

```java
public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
}
```

```java
public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
```

```java
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，按照多态的方式
       Animal a = new Cat();
       a.setName("加菲");
       a.setAge(5);
       System.out.println(a.getName()+","+a.getAge());
       a.eat();
       System.out.println("---------");
       a = new Cat("加菲1",6);
       System.out.println(a.getName()+","+a.getAge());
       a.eat();
       /*输出结果：
        加菲,5
        猫吃鱼
        ---------
        加菲1,6
        猫吃鱼*/
    }
}
```

### 58、接口

java中的接口更多的体现在对行为的抽象

#### （1）接口的特点：

- 接口用关键字interface修饰

  public interface 接口名{}

  ```java
  例如：public interface Jumpping{
      	public abstract void jump();
  	}
  ```

- 类实现接口用implements表示

  public class 类名 implements 接口名{}

- 接口不能实例化

  接口如何实例化呢？参照多态的方式，通过实现类 对象实例化，这叫接口多态

  ```java
  public class Cat implements Jumpping{ ...}//实现类
  ```

  ```java
  public class JumppingDemo{
  	public static void main(String[] args){
  		Jumpping j = new Jumpping();//接口多态
  	}
  }
  ```

  多态的形式：具体类多态，抽象类多态，接口多态（后两种常用）

  多态的前提：有继承或者实现关系；有方法重写；有父（类/接口）引用指向（子/实现）类对象

- 接口的实现类

  要么重写接口中的所有抽象方法

  要么是抽象类

#### （2）接口的成员特点

- 成员变量

  ​	只能是常量

  ​	默认修饰符：<font color='red'>public static final</font>

- 构造方法

  ​	接口没有构造方法，因为接口主要是对行为进行抽象的，是没有具体存在

  ​	一个类如果没有父类，默认继承自<font color='red'>Object</font>类

- 成员方法

  ​	只能是抽象方法

  ​	默认修饰符：<font color='red'>public abstract</font>

```java
public class Cat extends Animal implement Jumpping{}
public class AnimalDemo {
    public static void main(String[] args) {
    	Cat c = new Cat();//Cat继承了Animal又实现了Jumpping，所以用具体的实现类c.访问重写的Animal和Jumpping里面的方法
    }
}
```

#### （3）类和接口的关系

- 类和类的关系

  ​	继承关系，只能单继承，但是可以多层继承

- 类和接口的关系

  ​	实现关系，可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口

- 接口和接口的关系

  ​	继承关系，可以单继承，也可以多继承

#### （4）抽象类和接口的关系

- 成员区别

  ​	抽象类          变量，常量；有构造方法；有抽象方法，也有非抽象方法

  ​	接口			   常量；抽象方法

- 关系区别

  ​	类与类 	 	  继承，单继承

  ​	类与接口		实现，可以单实现，也可以多实现

  ​	接口与接口	继承，单继承，多继承

- 设计理念区别

  ​	抽象类			对类抽象，包括属性、行为

  ​	接口				对行为抽象，主要是行为

  抽象类是对事物的抽象，而接口是对行为的抽象

### 60、Math方法

方法都是被static修饰，不能实例化（不能创建对象），可以通过类名直接访问

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/Math.png)

![avatar](image\Math.png)

(int)(Math.random()*100+1);//0-100之间的随机数

### 61、System

方法都是被static修饰，不能实例化（不能创建对象），可以通过类名直接访问

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/System.png)

![avatar](image\System.png)

### 62、Object类

- Object是类层次结构的根，每个类都可以将Object作为超类。所有类都直接或间接的继承自该类

- 构造方法：public Object()

- 回想面向对象中，为什么说子类的构造方法默认访问的是父类的无参构造方法？因为它们的顶级父类只有无参构造方法

- 看方法的源码：选中方法，按下<font color='red'>Ctrl+B</font>

- toString方法：建议所有子类重写此方法，自动生成即可<font color='red'>（类中-右键-Generate-toString()-选中变量)</font>
- equals()方法：可以重写比较内容，自动生成即可<font color='red'>（类中-右键-Generate-equals() and hashcode()-生成后删除hashcode()方法）</font>

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/toString.png)

![avatar](image\toString.png)

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/Object.png)

![avatar](image\Object.png)

### 63、冒泡排序

冒泡排序：一种排序的方式，对要进行排序的数据中相邻的数据进行两两比较，将较大的数据放在后面，依次对所有的数据进行操作，直至所有数据按要求完成排序

- 如果有n个数据进行排序，总共需要比较n-1次
- 每一次比较完毕，下一次的比较就会少一个数据参与

```java
public class MaoPao {
    public static void main(String[] args) {
        int[] arr = {83,58,29,90,32};
        System.out.println("排序前："+arrayToString(arr));//排序前：[83,58,29,90,32]
        for(int i = 0;i<arr.length-1;i++){//n个元素，比较n-1次
            for(int x = 0;x<arr.length-1-i;x++){//每次比较（arr.length-1-x）个元素
                if(arr[x]>arr[x+1]){
                    int temp = arr[x];
                    arr[x]=arr[x+1];
                    arr[x+1]=temp;
                }
            }
        }
        System.out.println("排序后："+arrayToString(arr));//排序后：[29,32,58,83,90]
    }

    /*方法定义：两个明确：
    返回值类型：String;
    参数：int[] arr*/
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
```

### 64、Arrays

Arrays类包含用于操作数组的各种方法

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/Arrays类.png)

![avatar](image\Arrays类.png)

工具类的设计思想：

- 构造方法用private修饰 --为了怕外界创建对象
- 成员用public static修饰--为了外界使用类名访问该成员方法

```java
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {32,67,16,98,5};
        System.out.println("排序前："+ Arrays.toString(arr));//排序前：[32, 67, 16, 98, 5]
        Arrays.sort(arr);
        System.out.println("排序后："+ Arrays.toString(arr));//排序后：[5, 16, 32, 67, 98]
    }
}
```

### 65、基本类型包装类

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/基本类型包装类.png)

![avatar](image\基本类型包装类.png)

### 66、Integer

Integer：包装一个对象中的原始类型int的值

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/Integer.png)

![avatar](image\Integer.png)

```java
public class IntegerDemo {
    public static void main(String[] args) {
        //public Integer(int value)-----
        Integer i1 = new Integer(100);
        System.out.println(i1);//输出结果：100
        
        //public Integer(String s)-----
        Integer i2 = new Integer("100");
        System.out.println(i2);//输出结果：100
   
        /*Integer i3 = new Integer("abc");//不能写非数字
        System.out.println(i3);//输出结果：java.lang.NumberFormatException*/
        
        //public static Integer valueOf(int i)-----
        Integer i4 = Integer.valueOf(100);
        System.out.println(i4);//输出结果：100
        
        //public static Integer valueOf(String s)-----
        Integer i5 = Integer.valueOf("100");
        System.out.println(i5);//输出结果：100
        
        /*Integer i6 = Integer.valueOf("abc");//不能写非数字
        System.out.println(i6);//输出结果：java.lang.NumberFormatException*/
    }
}
```

### 67、int和String的相互转换

基本类型包装类的最常用操作就是：用于基本类型和字符串之间的相互转换

#### (1)int 转换为String

public static String valueOf(int i):返回int参数的字符串表示形式。该方法是String类中的方法

#### (2)String转换为int

public static int parseInt(String s):将字符串解析为int类型。该方法是Integer类中的方法

```java
public class IntegerDemo {
    public static void main(String[] args) {
        //int 转换成----> String
        int number = 100;
        //方式一：
        String s1 = ""+100;
        System.out.println(s1);//输出结果：100
        //方式二:
        //public static Integer valueOf(int i)
        String s2 = String.valueOf(number);
        System.out.println(s2);//输出结果：100

        //String 转换成----> int
        String s = "100";
        //方式一：
        //String ---->Integer-----> int
        Integer i = Integer.valueOf(s);//String ---->Integer
        //public int intValue()
        int x = i.intValue();//Integer-----> int
        System.out.println(x);//输出结果：100
        //方式二：
        //public static int parseInt(String s)
        int y = Integer.parseInt(s);
        System.out.println(y);//输出结果：100
    }
}
```

### 68、字符串中的数据排序

需求：有一个字符串：“91 27 46 38 50”，输出结果是：“27 38 46 50 91”

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/字符串中的数据排序.png)

![avatar](image\字符串中的数据排序.png)

```java
public class IntegerTest {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] strArray = s.split(" ");
        int[] arr = new int[strArray.length];
        for(int i = 0;i<arr.length;i++){
            arr[i]= Integer.parseInt(strArray[i]);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();
        System.out.println("result:"+result);//输出结果：result:27 38 46 50 91
    }
}
```

### 69、自动装箱和拆箱

装箱：把基本数据类型转换为对应的包装类型

拆箱：把包装类型转换为对应的基本数据类型

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/自动装箱和拆箱.png)

![avatar](image\自动装箱和拆箱.png)

### 70、IO流-File类

File:它是文件和目录路径名的抽象表示

- 文件和目录是可以通过File封装成对象的
- 对于File而言，其封装的并不是一个真正存在的文件，仅仅是一个路径而已。它可以使存在的，也可以是不存在的。将来是要通过具体的操作把这个路径的内容转换为具体存在的

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/File构造方法.png)

![avatar](image\File构造方法.png)

```java
public class FileDemo {
    public static void main(String[] args) {
        File f1 = new File("E:\\testFile\\java.txt");
        System.out.println(f1);//输出：E:\testFile\java.txt---File类重写了toString方法
        
        File f2 = new File("E:\\testFile","java.txt");
        System.out.println(f2);//输出：E:\testFile\java.txt

        File f3 = new File("E:\\testFile");
        File f4 = new File(f3,"java.txt");
        System.out.println(f4);//输出：E:\testFile\java.txt
    }
}
```

### 71、File类的创建功能

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/File类的创建功能.png)

![avatar](image\File类的创建功能.png)

createNewFile():要创建文件，必须先有目录（无目录需要创建目录）

```java
import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\testFile\\java.txt");
        System.out.println(f1.createNewFile());//输出：true  ---说明文件创建成功
        //如果文件不存在，就创建文件，并返回true
     //如果文件存在，就不创建文件，并返回false

        File f2 = new File("E:\\testFile\\javaSE");
        System.out.println(f2.mkdir());//输出：true
        //如果目录不存在，就创建目录，并返回true
     //如果目录存在，就不创建目录，并返回false

        File f3 = new File("E:\\testFile\\javaWeb\\HTML");
        //System.out.println(f3.mkdir());//输出：false --mkdir()方法不能创建多级目录（如果javaWeb文件不存在，不能直接创建HTML文件）
        System.out.println(f3.mkdirs());//输出：true --可创建多级目录
        //如果多级目录不存在，就创建多级目录，并返回true
     //如果多级目录存在，就不创建多级目录，并返回false
    }
}
```

### 72、File类判断和获取功能

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/File类的获取和判断.png)

![avatar](image\File类的获取和判断.png)

```java
import java.io.File;
public class FileDemo2 {
    public static void main(String[] args) {
        File f1 = new File("javaBaseStudy\\java.txt");
        System.out.println(f1.isDirectory());//false
        System.out.println(f1.isFile());//false
        System.out.println(f1.exists());//true
        System.out.println("--------");
        												         System.out.println(f1.getAbsoluteFile());//D:\workspace\javaBaseStudy\javaBaseStudy\java.txt
        System.out.println(f1.getPath());//javaBaseStudy\java.txt
        System.out.println(f1.getName());//java.txt
        System.out.println("--------");
        File f2 = new File("E:\\testFile");
        String[] strArray = f2.list();
        for (String s : strArray) {
            System.out.println(s);//输出具体文件和目录
            /*java.txt 
            javaSE
            javaWeb*/
        }
        System.out.println("--------");
        File[] fileArray = f2.listFiles();
        for (File file : fileArray) {
            if(file.isFile()){
                System.out.println(file);//E:\testFile\java.txt
                System.out.println(file.getName());//java.txt
            }
        }
    }
}
```

### 73、File类的删除功能

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/File类的删除功能.png)

![avatar](image\File类的删除功能.png)

绝对路径和相对路径的区别：

- 绝对路径：完整的路径名，不需要任何其他信息就可以定位它所表示的文件。例如：E:\\\testFile\\\java.txt
- 相对路径：必须使用取其他路径名的信息进行解释。例如：javaBaseStudy\\\java.txt

删除目录注意事项：

- 如果一个目录中有内容（目录、文件），不能直接删除，应该先删除目录中的内容，最后才能删除目录