public class AnonymousClassDemo {
    public static void main(String[] args) {
        // 使用匿名类实现接口
        Coder coder = new Coder() {
            // 实现接口（或抽象类）中的抽象方法
            @Override
            public void coding() {
                System.out.println("I am coding.");
            }
        };
        go(coder);
    }

    public static void go(Coder coder) {
        System.out.println("Begin");
        coder.coding();
        System.out.println("End");
    }
}

// 定义一个接口
interface Coder {
    void coding();
}