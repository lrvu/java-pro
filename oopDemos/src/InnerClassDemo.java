public class InnerClassDemo {
    public static void main(String[] args) {
        // 使用 外部类.内部类 的格式创建静态内部类
        Outter.Inner inner = new Outter.Inner();       
        System.out.println(inner.msg);

        // 创建实例内部类
        Outter2.Inner inn = new Outter2().new Inner();
        System.out.println(inn.msg);
    }
}

class Outter {
    // 静态内部类：有static修饰，属于外部类本身，只会加载一次
    public static class Inner {
       public static final String msg = "hello from static inner class";
    }
}

class Outter2{
    // 实例内部类：无static修饰，属于外部类对象
    public class Inner{
        public static final String msg = "hello from inner class";
    }
}