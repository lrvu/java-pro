// 饿汉单例模式：在调用时，对象已经在类中初始化过
class SingleInstance01 {
    // 2. 定义一个静态成员变量用于存储一个对象
    public static SingleInstance01 ins = new SingleInstance01();

    // 1. 把类的构造器私有，构造器只能再本类中访问
    private SingleInstance01() {

    }

    // 3. 提供一个方法返回单例对象
    public static SingleInstance01 getInstance() {
        return ins;
    }
}
// 懒汉单例模式：在要使用对象时才初始化对象
class SingleInstance02 {
    // 2. 定义一个静态成员变量用于存储一个对象
    public static SingleInstance02 ins;

    // 1. 把类的构造器私有，构造器只能再本类中访问
    private SingleInstance02() {

    }

    // 3. 提供一个方法返回单例对象
    public static SingleInstance02 getInstance() {
        if (ins == null) {
            ins = new SingleInstance02();
        }
        return ins;
    }
}

public class SingleInstanceDemo {
    public static void main(String[] args) {
        // 测试饿汉单例模式
        SingleInstance01 a1 = SingleInstance01.getInstance();
        SingleInstance01 a2 = SingleInstance01.getInstance();
        System.out.println(a1 == a2);
        // 测试懒汉单例模式
        SingleInstance02 b1 = SingleInstance02.getInstance();
        SingleInstance02 b2 = SingleInstance02.getInstance();
        System.out.println(b1 == b2);

    }
}
