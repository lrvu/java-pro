public class StaticCodeAreaDemo {
    // 声明静态资源TEXT，在静态代码块中赋值
    private static final String TEXT;
    static{
        // 静态代码块属于类，会与类一起记载，而且自动触发执行一次。
        // 为静态资源TEXT赋值
        TEXT = "hello~";
    }
    public static void main(String[] args) {
        System.out.println(TEXT);
    }
}
