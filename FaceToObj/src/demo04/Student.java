package demo04;

/*
public classname (参数类型 参数名称){
    方法体
}

注意事项
1.构造方法的名称必须和所在的类名称完全一样，就连大小写也要一样
2.构造方法不要写返回值类型，连void也不用写！！！！
3.构造方法不能return一个具体的返回值
4.如果没有编写任何构造方法，那么编译器将会默认赠送一个构造方法，没有参数，方法体什么事情都不做
5.一旦编写了至少一个构造方法，编译器将不再赠送
 */
public class Student {
    private String name;
    private int age;
    // 构造方法就是用来创建对象的
    public Student(){
        System.out.println("构造方法执行啦");
    }

    public Student(String name,int age){
        System.out.println("全参构造方法执行啦");
        this.name = name;
        this.age = age;
    }

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
