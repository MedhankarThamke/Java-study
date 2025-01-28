package OOPs;

public class ConstructorBasic {
    public static void main(String[] args) {
        // int names[]=new int[3];
        Student s1 = new Student();
        s1.name = "Medhankar";
        s1.age = 21;
        s1.marks[0] = 100;
        s1.marks[1] = 98;
        s1.marks[2] = 96;

        // here we have created new object using copy constructor
        // where are using the properties of the another object
        Student s2 = new Student(s1);
        s1.marks[2] = 50;
        System.out.println(s2.age);
        System.out.println(s2.name);
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int age;
    int marks[];

    // this is copy constructor
    // thhis is shallow copy constructor
    // Student(Student stu) {
    // marks = new int[3];
    // this.name = stu.name;
    // this.age = stu.age;
    // this.marks = stu.marks;
    // }

    // this is deep constructor

    Student(Student stu) {
        marks = new int[3];
        this.name = stu.name;
        this.age = stu.age;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = stu.marks[i];
        }
    }

    // constructor
    Student() {
        this.name = "unknown";
        this.age = 0;
        this.marks = new int[3];
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }
}