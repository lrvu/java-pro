public class AbstractDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
    }
}

abstract class Animal{
    abstract void run();
}

class Cat extends Animal{

    @Override
    void run() {
        System.out.println("抽象方法实现");
    }
    
}