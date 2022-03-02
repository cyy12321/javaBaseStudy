### 31.成员变量和局部变量

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/成员变量和局部变量.png)

![avatar](image\成员变量和局部变量.png)

### 32.封装

#### （1）**private关键字**

- 是一个权限修饰符

- 可以修饰成员（成员方法和成员变量）

- 作用是保护成员不被别的类使用，被**private**修饰的成员只在本类中才能访问

针对**private**修饰的成员变量，如果需要被其他类使用，提供相应的操作

- 提供“**get变量名()**"方法，用于获取成员变量的值，方法用**public**修饰

- 提供“**set变量名(参数)**"方法，用于设置成员变量的值，方法用**public**修饰

```java
package com.myMethod;

public class Student {
    //首先定义一个学生类，然后定义一个学生测试类，在学生测试类中通过对象完成成员变量和成员方法的使用
    private String name;//成员变量(类中方法外)
    private int age;
    public void setName(String n){//局部变量(方法声明上)
        name = n;//局部变量(方法内)
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
}

```

```java
package com.myMethod;

public class StudentDemo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(18);
        stu.setName("张三");
        System.out.println(stu.getName()+","+stu.getAge());
    }
}
```

#### （2）this关键字

**this修饰的变量用于指代成员变量**

- 方法的形参如果与成员变量同名，不带this修饰的变量  指的是形参，而不是成员变量

  ```java
  private String name;//成员变量(类中方法外)
  public void setName(String name){
      name = name;//name指的都是形参的name,所以未赋值成功给成员变量
  }
  ```

- 方法的形参没有与成员变量同名，不带this修饰的变量  指的是成员变量

  ```java
  private String name;//成员变量(类中方法外)
  public void setName(String n){//局部变量(方法声明上)
      name = n;//局部变量(方法内)
  }
  ```

- 什么时候使用this呢？<u>解决局部变量隐藏成员变量</u>

  ```java
  private String name;//成员变量(类中方法外)
  public void setName(String name){
      this.name = name;//局部变量赋值给成员变量
  }
  ```

  

**this:代表所在类的对象引用**

- 记住：方法被哪个对象调用，this就代表哪个对象

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/this关键字.png)

![avatar](image\this关键字.png)

#### （3）this内存原理

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/this内存原理.png)

![avatar](image\this内存原理.png)

#### （4）封装

- [ ] **封装概述**

是面向对象三大特征之一（封装、继承、多态）

是面向对象编程语言对客观世界的模拟，客观世界里成员变量都是隐藏在对象内部的，外界是无法直接操作的

- [ ] **封装原则**

将类的某些信息隐藏在类内部，不允许外部程序直接访问，而是通过该类提供的方法来实现对隐藏信息的操作和访问

如：成员变量用private修饰,提供对应的getXxx()/setXxx()方法

- [ ] **封装好处**

通过方法来控制成员变量的操作，提高了代码安全性

把代码用方法进行封装，提高了代码的复用性

### 33.构造方法

构造方法是一种特殊的方法

作用：创建对象

格式：
public class 类名{
	修饰符 <font color="red">类名(参数){
	}</font>
}

功能：<font color="blue">主要是完成对象数据的初始化</font>

public class StudentDemo {
    public static void main(String[] args) {
        Student stu = <font color="red">new Student()</font>;
    }
}

public class Student {
    <font color="red">public Student(){        //构造方法内书写的内容
    }</font>
}

```java
/*学生类
构造方法：
    作用：创建对象
    功能：完成对象数据的初始化
格式：
    修饰符 类名(参数){
    }
    修饰符一般用public*/
public class Student {
    //首先定义一个学生类，然后定义一个学生测试类，在学生测试类中通过对象完成成员变量和成员方法的使用
    private String name;
    private int age;

    //构造方法
    public Student(){
        System.out.println("无参构造方法");
    }
    
    public void show(){
        System.out.println(name+","+age);
    }
}
```

```java
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        s.show();
    }
}
输出结果：
    无参构造方法
    null,0
```

### 34.构造方法注意事项

1. 构造方法的创建
   - 如果没有定义构造方法，系统将给出一个<font color = "red">默认的无参数构造方法</font>
   - 如果定义了构造方法，系统将不再提供默认的构造方法
2. 构造方法的重载
   - 如果自定义了带参构造方法，还要使用无参数构造方法，就必须再写一个无参数构造方法
3. 推荐的使用方式
   - <font color="red">无论是否使用，都手工书写无参数构造方法</font>

```java
public class Student {
    private String name;
    private int age;

    //构造方法
    public Student(){}
    public Student(String name){
        this.name = name;
    }
    public Student(int age){
        this.age = age;
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name+","+age);
    }
}
```

```java
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student();
        s1.show();//输出值为null,0

        //public Student(String name)
        Student s2 = new Student("张三");
        s2.show();//输出值为张三,0

        //public Student(int age)
        Student s3 = new Student(30);
        s3.show();//输出值为null,30

        //public Student(String name,int age)
        Student s4 = new Student("张三",30);
        s4.show();//输出值为张三,30
    }
}
```

### 35.构造方法-标准类制作

1. 成员变量

   - 使用<font color="red">private</font>修饰

2. 构造方法

   - 提供一个无参构造方法
   - 提供一个带多个参数的构造方法

3. 成员方法

   - 提供每一个成员变量对应的<font color="red">setXxx()/getXxx()</font>
   - 提供一个显示对象信息的<font color="red">show()</font>

   ```java
   public class Student {
       private String name;
       private int age;
   
       //构造方法
       public Student(){}
   
       public Student(String name,int age){
           this.name = name;
           this.age = age;
       }
       //成员方法
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
       public void show(){
           System.out.println(name+","+age);
       }
   }
   ```

4. 创建对象并为其成员变量赋值的两种方式

   - 无参构造方法创建对象后使用<font color="red">setXxx()</font>赋值

   - 使用带参构造方法直接创建带有属性值的对象

     ```java
     public class StudentDemo {
         public static void main(String[] args) {
             //无参构造方法创建对象后使用setXxx()赋值
             Student s1 = new Student();
             s1.setName("张三");
             s1.setAge(30);
             s1.show();//输出值为张三,30
     
             //使用带参构造方法直接创建带有属性值的对象
             Student s2 = new Student("张三",30);
             s2.show();//输出值为张三,30
         }
     }
     ```

### 36.API

调用方法的时候，如果方法有明确的返回值，我们用变量接收，可以手动，也可以使用快捷键Ctrl+Alt+V 补全左边的数据类型和变量名

### 37.String

String类在<font color="red">java.lang</font>包下，所以使用的时候不需要导包

<font color="red">String</font>类代表<font color="red">字符串</font>，Java程序中的所有字符串文字（例如“abc”）都被实现为此类的实例，也就是说，<font color="red">Java程序中所有的双引号字符串，都是String类的对象</font>

字符串的特点

- 字符串不可变，它们的值在创建后不能被更改
- 虽然String的值是不可变的，但是它们可以被共享
- 字符串效果上相当于字符数组（<font color="red">char[]</font>)，但是底层原理是字节数组（<font color="red">byte[]</font>）

### 38.String对象的特点

（1）通过new创建的字符串对象，每一次new都会申请一个内存空间，虽然内容相同，但是地址值不同

```java
char[] chs = {'a', 'b', 'c'};
String s1 = new String(chs);//输出abc
String s2 = new String(chs);//输出abc
```

上面 代码中，JVM首先会创建一个字符数组，然后每一次new的时候都会有一个新的地址，只不过s1和s2参考的字符串内容是相同的

（2）以“”方式给出的字符串，只要字符序列相同（顺序和大小写），无论在程序代码中出现几次，JVM都只会建立一个String对象，并在字符串池中维护

```java
String s3 = "abc";
String s4 = "abc";
```

在上面的代码中，针对第一行代码，JVM会建立一个String对象放在字符串池中，并给s3参考；第二行则让s4直接参考字符串池中的String对象，也就是说它们本质上是同一个对象

39.字符串的比较

使用==比较

- 基本类型：比较的是数据值是否相同
- 引用类型：比较的是地址值是否相同

字符串是对象，比较内容是否相同，使用equals()方法

### 39.用户登录

需求：已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应提示

```java
public class Login001 {
    public static void main(String[] args) {
    //需求：已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应提示
    String username =  "zhangsan";
    String password = "abc123";
    for(int i = 0;i<3;i++){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String inputUser = sc.nextLine();
        System.out.println("请输入密码：");
        String inputPass = sc.next();
        if(inputUser.equals(username)&&inputPass.equals(password)){
            System.out.println("登录成功");
            break;
        }else{
            if(2-i==0){
                System.out.println("您的账户被锁定,请与管理员联系");
            }else{
                System.out.println("登录失败"+"你还有"+(2-i)+"次机会");
            }
        }
    }
    }
}
```

### 40.遍历字符串

需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串

```java
public class StringTest001 {
    public static void main(String[] args) {
        //需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.nextLine();//Ctrl+L+V可自动补全左边
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}
```

### 41.统计字符次数

需求：键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其他字符）

```java
public class StringTest002 {
    public static void main(String[] args) {
        //需求：键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其他字符）        
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.nextLine();
        int smallCount = 0;
        int bigCount = 0;
        int digitCount = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a'&&c<='z'){
                smallCount++;
            }else if(c>='A'&&c<='Z'){
                bigCount++;
            }else {
                digitCount++;
            }
        }
        System.out.println("小写字母个数为:"+smallCount);
        System.out.println("大写字母个数为:"+bigCount);
        System.out.println("数字字符个数为:"+digitCount);
    }
}
```

### 42.拼接字符串

需求：定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。例如，数组为int[] arr={1,2,3},执行方法后的输出结果为：[1,2,3]

```java
public class StringTest003 {
    public static void main(String[] args) {
        //需求：定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
        // 例如，数组为int[] arr={1,2,3},执行方法后的输出结果为：[1,2,3]
        int[]  arr={1,2,3};
        String s = "[";
        for(int i = 0;i<arr.length;i++){
            if(i!=arr.length-1){
                s+=arr[i]+",";
            }else {
                s+=arr[i];
            }
        }
        s=s+"]";
        System.out.println("s:"+s);
    }
}
```

### 43、字符串反转

需求：定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果。例如：键盘录入abc,输出结果cba

```java
public class StringTest004 {
    public static void main(String[] args) {
        //需求：定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果。
        // 例如：键盘录入abc,输出结果cba
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.nextLine();
        String fs = fanZ(str);
        System.out.println("反转后的结果为："+fs);
    }

    public static String fanZ(String s) {
        String fz = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            fz += s.charAt(i);
        }
        return fz;
    }
}
```

### 44、StringBuilder

StringBuilder是一个可变的字符串类，我们可以把它看成是一个容器，这里的可变指的是StringBuilder对象中的内容是可变的

String和StringBuilder的区别：

- String:内容是不可变的
- StringBuilder：内容是可变的

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/StringBuilder.png)

![avatar](image\StringBuilder.png)

### 	45、StringBuilder构造方法

