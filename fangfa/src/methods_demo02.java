public class methods_demo02 {
    // 方法是若干语句的功能集合
    // 参数   返回值
    /*
    定义方法的完整格式
    修饰符  返回值类型  方法名称(参数类型 参数名称, ){
        方法体
        return 返回值;
    }
    修饰符  现阶段的固定写法 public static
    返回值类型 也就是方法最终产生的数据结果是什么类型
    参数类型  进入方法的数据是什么类型
    参数名称  进入方法的数据对应的变量名称
    ps,参数如果有多个，用逗号进行分隔
    return 两个作用，第一 停止当前方法，第二将后面的结果数据返回值还给调用处
    返回值 方法执行后最终产生的数据结果

    return 后面的返回值，必须和方法名称的前面的返回值类型保持对应

    定义一个两个数相加的方法

    返回值类型； int
    方法名称    sum
    参数列表    int a ,int b

    注意： 此前学习的方法void只能进行单独调用不能进行打印调用和赋值调用
     */
    public static void main(String[] args) {
        // 单独调用
        sum(12,40);

        // 打印调用
        System.out.println(sum(12,40));

        System.out.println("==================");

        // 赋值调用
        int number = sum(15,25);
        System.out.println("变量的值:"+number);

    }

    public static int sum(int a, int b) {  // 此处不允许赋值
        int result = a + b;
        return result;
    }


}
