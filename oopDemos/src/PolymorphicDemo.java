public class PolymorphicDemo {
    public static void main(String[] args) {
        // 多态应用
        Animal a1 = new Cat();
        // a1 调用的是Cat的run方法
        a1.run();
        // a1 调用的是Animal的name变量
        System.out.println(a1.name); // 多态改变的是行为，不改变变量

        // a1.catchMouse(); // 无法调用 Cat 的独有方法，编译器报错！
        // 强制类型转换
        Cat c1 = (Cat) a1;
        c1.catchMouse(); // 强制类型转换后可以调用 Cat 的方法

        Animal a2 = new Dog();
        // Cat c2 = (Cat) a2; // 直接强行转换可以编译，但是运行时会报 ClassCasterException 异常
        // c2.catchMouse();
        // 使用 instanceof 判断a2的类属于Cat或者Dog，避免强行转换异常
        if(a2 instanceof Cat){
            Cat c2 = (Cat) a2; 
            c2.catchMouse();
        }else if(a2 instanceof Dog){
            Dog d1 = (Dog) a2;
            d1.catchMouse(); 
        }
    }
}

// 子类Dog继承父类Animal
class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("子类Dog");
    }

    // 子类独有方法
    public void catchMouse() {
        System.out.println("狗拿耗子");
    }
}

// 子类Cat继承父类Animal
class Cat extends Animal {
    // 重写父类name变量
    public String name = "子类Cat.name";
    // 重写父类run方法
    @Override
    public void run() {
        System.out.println("子类Cat");
    }

    // 子类独有方法
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}

class Animal {
    public String name = "父类Animal.name";
    // 父类run方法
    public void run() {
        System.out.println("父类Animal");
    }
}
