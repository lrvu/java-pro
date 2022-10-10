package com.api.object;

// 测试equals方法
public class EqualsDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三");
        Student s2 = new Student("张三");
        Student s3 = new Student("张四");
        System.out.println(s1.getName() + (s1.equals(s2) ? "等于" : "不等于") + s2.getName());
        System.out.println(s1.getName() + (s1.equals(s3) ? "等于" : "不等于") + s3.getName());
    }
}

// 定义一个实体类重写equals方法
class Student {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 重写类的equals方法，如果类的name相同则返回true，否则返回false
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Student) {
            Student s = (Student) obj;
            if (s.name == this.name)
                return true; // 如果obj属于stuent类且name相同则返回true
        }
        return false;
    }

}