package com.baobao;

public class StringExaming {
    public static void main(String[] args) {
        /**
         * 给定一个字符串s1，判断s1中有几个字母a，并输出字母a的个数
         * 如 abcdefg => 1
         *    xyx => 0
         */
        String s= "dafadsdfad";
        int count = 0;
        if(s!=null){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a'){
                    count++;
                }
            }
        }
        System.out.println(count);

        /**
         * 如果数据库中有一个用户，他的用户名是jolan，他的密码是qiqi，校验给定的字符串userName和passWord是否通过校验，用户名密码都不能为空，且密码不区分大小写
         * 通过校验输出true，否则输出false
         */
        String userName = "jolan";
        String passWord = "Qiqi";
        boolean a=true;
        if(userName!=null&&passWord!=null&&userName.equals("jolan")&&passWord.equalsIgnoreCase("qiqi")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        /**
         * 给定一个字符串s2，删除s2字符串中的所有字母a，除非它出现在首位，并输出处理后的字符串结果
         * 如 uxyabac = uxybc
         *    axyabacc = axybcc
         *    xybca = xybc
         */
        String s2 = "afdadtwrtweyeryasdfa";
        if(!isEmpty(s2)){
            if(s2.startsWith("a")){
                s2=s2.replace("a","");
                s2="a"+s2;
            }else{
                s2=s2.replace("a","");
            }
        }
        System.out.println(s2);

        /**
         * 给定一个包含“_”下划线的字符串s3，以它为分隔符切割s3字符串，然后以[1,2,3]方式输出结果，每个逗号之间的字符串不能为空，如不能是[1,,3]
         * 如 1_2_3 => [1,2,3]
         *    _x_y__z_ => [x,y,z]
         *    ___ => []
         */
        String s3="_1_2_3";
        String[] s1 = s3.split("_");
        String result="[";
       for(int i=0;i<s1.length;i++){
           result=result+s1[i]+",";
       }
       result=result+"]";
        System.out.println(result);


    }

    public static boolean isEmpty(String input){
        if(input==null||"".equals(input.trim())){
            return true;
        }
        return false;

    }
}
