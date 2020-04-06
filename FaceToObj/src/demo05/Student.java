package demo05;
/*
一个标准的类通常要拥有下面四个组成部分
每一个成员变量编写一对儿gettter setter方法
编写一个无参数的构造方法
编写一个全参数的构造方法
标准的类也叫作 java bean
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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


