package com.jicheng;
//测试类
public class PhoneTest001 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("林青霞");//输出结果：给林青霞打电话

        NewPhone np = new NewPhone();
        np.call("张三");
        /*输出结果：
        开启视频通话
        给张三打电话*/
    }
}
