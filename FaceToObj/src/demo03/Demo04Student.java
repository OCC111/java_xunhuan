package demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("迪丽热巴");
        stu.setAge(20);
        stu.setMale(false);

        System.out.println("姓名:"+stu.getName());
        System.out.println("年龄:"+stu.getAge());
        System.out.println("是不是爷们:"+stu.isMale());
    }
}
