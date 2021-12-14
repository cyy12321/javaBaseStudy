### 1.常量

在程序运行过程中，其值不可以改变的量

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/常量分类.png)

![avatar](image\常量分类.png)

空常量不能被直接输出，其他类型的常量可以直接输出

System.out.println(null);   //错误，空常量不能被直接输出

### 2.标识符

标识符只能由字母，下划线_,美元符号（$）开头

标识符分为小驼峰和大驼峰命名

小驼峰是给方法和变量命名的,如firstName

大驼峰是给类命名的，如GoodStudent

### 3.数据类型

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/数据类型.png)

![avatar](image\数据类型.png)

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/数据类型1.png)

![avatar](image\数据类型1.png)

**整数默认是int**类型，**浮点数默认是double**类型

### 3.类型转换

(1)自动类型转换

把一个表示数据<u>范围小的数值或者变量</u>赋值给另一个表示<u>数据范围大的变量</u>；如：double d = 10;  <!--d值输出为10.0-->

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/自动类型转换.png)

![avatar](image\自动类型转换.png)

(2)强制类型转换

把一个表示数据<u>范围大的数值或者变量</u>赋值给另一个表示<u>数据范围小的变量</u>；

格式：目标数据类型 变量 = （目标数据类型）值或者变量；

如：int k = (int)88.88;    <!--k值输出为88，丢数据了-->

### 4.运算符

#### (1)算术运算符（+、-、*、/、%）

整数操作只能得到整数，要想得到小数，必须有浮点数参与运算

```java
public class OperateDemo {
    public static void main(String[] args){
        //定义两个变量
        int a = 1;
        int b = 2;
        System.out.println(a+b);//3
        System.out.println(a-b);//-1
        System.out.println(a*b);//2
        System.out.println(a/b);//0
        System.out.println(a%b);//1
        
        System.out.println(1.0/2);//0.5
    }
}
```

#### (2)字符“+”操作

拿字符在计算机底层<u>对应的的数值</u>来进行计算的

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/字符+.png)

![avator](image\字符+.png)

算术表达式中包含<u>多个基本数据类型</u>的值的时候，整个算术表达式的类型会<u>自动进行提升</u>

提升规则：

byte类型，short类型和char类型将被提升到int类型

整个表达式的类型<u>自动提升</u>到表达式中<u>最高等级</u>操作数同样的类型

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/基本数据类型等级顺序.png)

![avator](image\基本数据类型等级顺序.png)

```java
public class ConversionDemo002 {
    public static void main(String args[]){
        char a = 'A';//A的值是65
        int b = 10;
        int c=a+b; //结果提升到int类型
        System.out.println(c);//c的值是75
    }
}
```

#### (3)字符串的“+”操作

当“+”操作中出现字符串时，这个“+”是字符串连接符，而不是算术运算符；如：“itheima"+666 <!--输出结果为itheima666-->

在“+”操作中，如果出现了字符串，就是连接运算符，否则就是算术运算。当连续进行“+”操作时，从左到右逐个执行。如：1+99+"年黑马"<!--输出结果为100年黑马-->

#### (4)赋值运算符

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/赋值运算符.png)

![avator](image\赋值运算符.png)

注意：（红色标记）扩展的赋值运算符**隐含**了强制类型转换

short s = 10;

s =(short) s+20;相当于 s += 20;  

#### (5)自增自减运算符

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/自增自减.png)

![avator](image\自增自减.png)

单独使用的时候，++和--无论放在变量的前边还是后边，结果是一样的。如：i++;     ++i;【**最常用的用法**】

++或者--参与操作的时候，如果放在变量的后边，先拿变量参与操作，后拿变量做++或者--。如：int i=10；int j = **i++**;j输出值为10【先赋值后加1或者减1】

++或者--参与操作的时候，如果放在变量的前边，先拿变量做++或者--，后拿变量参与操作。如：int i=10；int j = **++i**;j输出值为11【先加1或者减1后赋值】

#### (6)关系运算符

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/关系运算符.png)

![avator](image\关系运算符.png)

关系运算符的结果都是boolean类型，要么是true,要么是false。

千万不要把“==”误写成“=”

#### (7)逻辑运算符

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/逻辑运算符.png)

![avator](image\逻辑运算符.png)

逻辑运算符，是用来**连接关系表达式**的运算符。如x>3&&x<6

逻辑运算符可以直接**连接布尔类型的常量或者变量**。

逻辑与& 两个都为true，则true

逻辑与|有一个为true，则true

逻辑异或 ^ 不同为true，相同为false

#### (8)短路逻辑运算符

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/短路逻辑运算符.png)

![avator](image\短路逻辑运算符.png)

逻辑与**&**，无论左边真假，右边都要执行。

短路与**&&**，如果左边为真，右边执行；如果**左边为假，右边不执行**。

逻辑或**|**，无论无论左边真假，右边都要执行。

短路或**||**，如果左边为假，右边执行；如果**左边为真，右边不执行**。

最常用的逻辑运算符：&&，||，！

#### (9)三元运算符

格式：关系表达式**？**表达式1**：**表达式2；

范例：**a>b?a:b**;

计算规则：

​	首先计算**关系表达式的值**

​	如果值为**true,表达式1的值**就是运算结果

​	如果值为**false,表达式2的值**就是运算结果

### 5.三元运算符运用

(1)两只老虎的体重分别是180kg和200kg,请用程序实现判断两只老虎的体重是否相同。

```java
public static void main(String[] args) {
        int trigger1 = 180;
        int trigger2 = 200;
//        boolean c= trigger1==trigger2?true:false;
//        if(c){
//            System.out.println("两只老虎体重相等");
//        }else{
//            System.out.println("两只老虎体重不相等");
//        }
        System.out.println(trigger1==trigger2?"两只老虎体重相等":"两只老虎体重不相等");
    }
```

(2)三个和尚的身高分别为150cm、210cm、165cm,请用程序实现这三个和尚的最高身高

```java
public static void main(String[] args) {
        int heshang1 = 150;
        int heshang2 = 210;
        int heshang3 = 165;
        int tempMax = heshang1 > heshang2 ? heshang1 : heshang2;
        int max=tempMax>heshang3?tempMax:heshang3;
        System.out.println(max);

    }
```

### 6.数据输入

```java
import java.util.Scanner;//1.导包

public class ScannerDemo {
    public static void main(String[] args) {
        //2.创建对象
        Scanner sc = new Scanner(System.in);
        //3.接收数据
        int x = sc.nextInt();
        //输出对象
        System.out.println("x"+x);
    }
}
```

（1）三个和尚，身高必须经过测量得出，请用程序实现这三个和尚的最高身高

```java
public static void main(String[] args) {
        //身高未知，采用键盘录入实现，首先导包，然后创建对象
        Scanner sc = new Scanner(System.in);

        //键盘录入三个身高分别赋值给三个变量
        System.out.println("请输入第一个和尚的身高：");
        int height1 = sc.nextInt();

        System.out.println("请输入第二个和尚的身高：");
        int height2 = sc.nextInt();

        System.out.println("请输入第三个和尚的身高：");
        int height3 = sc.nextInt();

        //用三元运算符获取前两个和尚的较高身高值，并用临时身高变量保存起来
        int tempHeight = height1 > height2?height1:height2;

        //用三元运算符获取身高值和第三个和尚身高较高值，并用最大身高变量保存
        int maxHeight = tempHeight > height3?tempHeight:height3;
        //输出对象
        System.out.println("最高身高："+maxHeight);
    }
```

### 7.if语句

任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，并在控制台输出该整数是奇数还是偶数

```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入该整数:");
    int number=sc.nextInt();
    if(number%2==0){
        System.out.println(number+"该整数是偶数");
    }else{
        System.out.println(number+"该整数是奇数");
    }
}
```

### 8.switch语句

switch(表达式){

​	case 值1：

​					语句体1；

​					break;

​	case 值2：

​					语句体2；

​					break;

​	...

​	default：

​					语句体n+1；

​					break;

}

执行流程：

（1）首先计算表达式的值

（2）依次和case后面的值进行比较，如果有对应的值，就会执行相应的语句，在执行的过程中，遇到break就会结束。

（3）如果所有的case后面的值和表达式的值都不匹配，就会执行default里面的语句体，然后程序结束掉。

```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入：");
    while(true) { //控制循环输入
        String week = sc.next();
        switch (week) {
            case "1":
                System.out.println("今天是星期一");
                break;
            case "2":
                System.out.println("今天是星期二");
                break;
            case "3":
                System.out.println("今天是星期三");
                break;
            case "4":
                System.out.println("今天是星期四");
                break;
            case "5":
                System.out.println("今天是星期五");
                break;
            case "6":
                System.out.println("今天是星期六");
                break;
            case "7":
                System.out.println("今天是星期日");
                break;
            case "quit":
                System.out.println("谢谢使用，程序退出");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
        if("quit".equals(week)){ //控制结束循环
            break;
        }
    }
}
```

题目练习：一年有12个月，分属于四个季节，键盘录入一个月份，请用程序实现判断该月份属于哪个季节，并输出

**注意事项**：在switch语句中，如果case控制的语句体后面不写break,将出现穿透现象，在不判断下一个case值的情况下，向下运行，直到遇到break,或者整体switch语句结束。

```java
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("请输入月份,如要退出请输入100");
    while (true){
        int month = sc.nextInt();
        //1、2、12冬季
        //3、4、5春季
        //6、7、8夏季
        //9、10、11秋季
        switch(month){
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;//跳出switch语句
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("您输入的月份有误");
                break;
        }
        if(month==100){
            System.out.println("结束此次循环，谢谢光临");
            break;
        }
    }

}
```

### 9.for循环

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/for循环格式.png)

![avatar](image\for循环格式.png)

(1)在控制台输出5次HelloWorld!

```java
public static void main(String[] args) {
    //在控制台输出5次HelloWord!
    for(int i = 0;i<5;i++){
        System.out.println("HelloWorld!");
    }
}
```

(2)在控制台输出1-5和5-1的语句

```java
//输出1-5
for(int a = 1;a<=5;a++){
    System.out.println(a);
}
System.out.println("-------------");
//输出5-1
for(int b = 5;b>=1;b--){
    System.out.println(b);
}
```

(3)求1-5之间的数据和，并把求和结果在控制台输出

```java
int sum = 0;
for(int i = 1;i<=5;i++){
    sum += i;//sum=sum+i
}
System.out.println("1-5的数据加和："+sum);
```

(4)求1-100之间的偶数和，并把求和结果在控制台输出

```java
//求1-100之间的偶数和，并把求和结果在控制台输出
int ouSum = 0;
for(int i = 1;i<=100;i++){
    if(i%2==0){//偶数
        ouSum += i;//ouSum=ouSum+i
    }
}
System.out.println("1-100之间的偶数和是："+ouSum);
```

### 10.for循环-水仙花数

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/水仙花数.png)

![avatar](image\水仙花数.png)

（1)需求：在控制台输出所有的”水仙花数“

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/水仙花数分析.png)

![avatar](image\水仙花数分析.png)

```java
for(int i = 100;i<1000;i++){
    int a = i%10;//个位数
    int b = i/10%10;//十位数
    int c = i/100;//百位数
    if(a*a*a+b*b*b+c*c*c==i){
        System.out.println(i);//153、370、371、407
    }
}
```

（2）需求：统计“水仙花数”一共有多少个，并在控制台输出个数

```java
int count = 0;
for(int i = 100;i<1000;i++){
    int a = i%10;//个位数
    int b = i/10%10;//十位数
    int c = i/100;//百位数
    if(a*a*a+b*b*b+c*c*c==i){
        count++;
    }
}
System.out.println("水仙花数的个数为："+count);
//水仙花数的个数为：4
```

### 11.while循环语句

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/while循环语句格式.png)

![avatar](image\while循环语句格式.png)

（1）在控制台输出5次HelloWorld!

```java
public static void main(String[] args) {
    //在控制台输出5次HelloWorld!
    //for循环实现
    for(int i = 0;i<5;i++){
        System.out.println("HelloWorld!");
    }
    System.out.println("--------");
    
    //while循环实现
    int j=1;//1.初始化语句
    while(j<=5){//2.条件判断语句
        System.out.println("HelloWorld!");//3.循环体语句
        j++;//4.条件控制语句
    }
}
```

### 12.while循环-珠穆朗玛峰

需求：世界上最高山峰是珠穆朗玛峰（8848.43米=8844430毫米），假如我有一张足够大的纸，它的厚度是0.1毫米。请问，我折叠多少次，可以折成珠穆朗玛峰的高度？

```java
public static void main(String[] args) {
    //世界上最高山峰是珠穆朗玛峰（8848.43米=8844430毫米），假如我有一张足够大的纸，它的厚度是0.1毫米。
    // 请问，我折叠多少次，可以折成珠穆朗玛峰的高度
    //折叠1次，0.1*2
    //折叠2次，0.1*2*2
    //折叠3次，0.1*2*2*2
    int count = 0;//定义一个计数器，初始值为0
    double paper = 0.1;//定义纸张厚度
    int zf = 8844430;//定义珠穆朗玛峰的高度
    while(paper<=zf){
        paper *= 2;//*=隐含强制类型转换
        count++;
    }
    System.out.println("需要折叠："+count+"次");
}
```

### 13.do...while循环语句

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/do...while循环语句格式.png)

![avatar](image\do...while循环语句格式.png)

（1）在控制台输出5次HelloWorld!

```java
public static void main(String[] args) {
    //需求：在控制台输出5次"HelloWorld!"
    //for循环实现
    for(int i = 0;i<5;i++){
        System.out.println("HelloWorld!");
    }
    
    System.out.println("--------");
    
    //do...while循环实现
    int j = 0;//初始化语句
    do{
        System.out.println("HelloWorld!");
        j++;
    }while(j<5);
}
```

### 14.三种循环的区别

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/三种循环的区别.png)

![avatar](image\三种循环的区别.png)

### 15.跳转控制语句

**continue**用于循环中，基于条件控制，跳过某次循环体内容的执行，继续下一次的执行

**break** 用在循环中，基于条件控制，终止循环体内容的执行，也就是说结束当前的整个循环

```java
public static void main(String[] args) {
    for(int i=1;i<=5;i++){
        if(i%2==0){//是否偶数
            continue;//跳过某次循环，继续下一次循环 
        }
        System.out.println(i);//跳过偶数，输出1、3、5
    }  
}
```

```java
for(int i=1;i<=5;i++){
    if(i%2==0){//是否偶数
        break;//终止循环
    }
    System.out.println(i);//遇到偶数，终止循环，只输出1
}
```

### 16.循环嵌套

在控制台输出一天的小时和分钟

```java
public static void main(String[] args) {
    //在控制台输出一天的小时和分钟
    //分钟：0<=minute<60
    //小时：0<=hour<24
    //外循环控制小时的范围，内循环控制分钟的范围
    for(int hour = 0;hour<24;hour++){
        for(int minter=0;minter<60;minter++){
            System.out.println(hour+"时"+minter+"分");
        }
    }
}
//输出结果：
    0时0分
    0时1分
    0时2分
    ...
    0时59分
    1时0分
    ...
    23时59分
```

### 17.Random

用于产生一个随机数 

![Image text](https://github.com/cyy12321/javaBaseStudy/blob/master/image/Random随机数.png)

![avatar](image\Random随机数.png)

```java
import java.util.Random;//1.导包
public class RandomDemo {
    public static void main(String[] args) {
       Random r = new Random();//2.创建对象
        //用循环获取10个随机数
        for(int i=0;i<10;i++){
            int number = r.nextInt(10);//获取随机数
            System.out.println("number"+number);
        }
        System.out.println("--------");
        //需求：获取一个1-100之间的随机数
        int num = r.nextInt(100)+1;//0-99,不包括100，可+1
        System.out.println("num:"+num);
    }
}
```