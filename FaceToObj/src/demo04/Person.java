package demo04;
// 通过谁调用的方法谁就是this
public class Person {
    String name;
    public void sayHello(String name){
        System.out.println(name + "，你好。我是"+this.name);

    }
}
