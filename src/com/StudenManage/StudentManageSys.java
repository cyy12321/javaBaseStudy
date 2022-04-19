package com.StudenManage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManageSys {
    private static List<Student> studentList = new ArrayList<Student>();
    public static void main(String[] args) {
        System.out.println("1:添加学生");
        System.out.println("2:删除学生");
        System.out.println("3:修改学生");
        System.out.println("4:查找某一个学生");
        System.out.println("5:查找全部学生");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入要进行的操作：");
            String s = sc.nextLine();
            switch (s){
                case "1":
                    Student student = inputStudent(sc);
                    addStudent(student);
                    break;
                case "2":
                    String s1 = inputSid(sc);
                    removeStudent(s1);
                    break;
                case "3":
                    String s3 = inputSid(sc);
                    updateStudent(s3);
                    break;
                case "4":
                    String s2 = inputSid(sc);
                    selectStudent(s2);
                    break;
                case "5":
                    selectAllStudents();
                    break;
                default:
                    System.out.println("请重新输入：");
             if(s.equals("")){
                 System.out.println("谢谢惠顾");
                 break;
             }
            }
        }
    }
    public static Student inputStudent(Scanner sc){
        Student stu = new Student();
        System.out.println("请输入学号：");
        String sid = sc.nextLine();
        stu.setSid(sid);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        stu.setName(name);
        System.out.println("请输入年龄：");
        String ageS = sc.nextLine();
        stu.setAge(Integer.parseInt(ageS));
        System.out.println("请输入地址：");
        String address = sc.nextLine();
        stu.setAddress(address);
        return stu;
    }
    public static String inputSid(Scanner sc){
        System.out.println("请输入学号：");
        String s = sc.nextLine();
        return s;
    }
    //添加学生
    public static Student addStudent(Student student){
        studentList.add(student);
        return student;
    }
    //删除学生
    public static Student removeStudent(String sid){
        if(studentList!=null&&!"".equals(sid)&&sid!=null){
            for (Student student : studentList) {
                if(sid.equals(student.getSid())){//把一定不是空的放equals前面，就不会报空指针
                    studentList.remove(student);
                    return student;
                }
            }
        }
        return null;
    }
    //修改学生
    public static Student updateStudent(String sid){
        if(studentList!=null&&!"".equals(sid)&&sid!=null){
            for (Student student : studentList) {
                if(student.getSid().equals(sid)){
                    student.setName("zhangsan");
                    student.setAge(20);
                    student.setAddress("珠江四季悦城");
                    return  student;
                }
            }
        }
        return null;
    }
    //查询单个学生
    public static Student selectStudent(String sid){
        if(studentList!=null&&!"".equals(sid)&&sid!=null) {
            for (Student student : studentList) {
                if (student.getSid().equals(sid)) {
                    return student;
                }
            }
        }
        return null;
    }
    //查询所有学生
    public static List<Student> selectAllStudents(){
        if(studentList!=null&&studentList.size()>0){
            for(int i = 0;i<studentList.size();i++){
                Student s = studentList.get(i);
                System.out.println(s.toString());
            }
        }
        return studentList;
    }


}
