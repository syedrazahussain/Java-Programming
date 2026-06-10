//======================Day -7 (oops part -2 )=====================================

//****************constructors
//1.Default Constructors

class Bike {
    Bike() {
        System.out.println("Bike is created");
    }
}
//2. parameterized constructors
class Student1 {
    int id;
    String name;
    Student1(int i, String n) {
        id = 1;
        name = n;
    }
    void display() {
        System.out.println(id+ " " +name);
    }
}

//3 constrcutor overloading

class Student2{
    int id;
    String name;
    int age;

    Student2(int i,String n) {
        id = i;
        name = n;
    }
    Student2(int i,String n,int a) {
        id = i;
        name = n;
        age = a;
    }
    void display1() {
        System.out.println(id+ " " +name+ " "+age);
    }
}

//this keyword
class Student3 {
    int rollno;
    String name;
    float fee;
    Student3(int rollno,String name,float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;

    }
    void display2() {
        System.out.println(rollno+ " " +name+ " " +fee);
    }
}

//polymorphism
//1.method overloading 

class Adder {
    static int add(int a, int b) {
        return a+b;
    }
    static double add(double a, double b) {
        return a+b;
    }
}

//2.Method overriding 

class Animal {
    public void displayInfo() {
        System.out.println("Iam an animal.");
    }
}

class Dog extends Animal {
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Iam a dog.");
    }
}

//Encapsulation
//wrapping the data (variable) and code acting on thr data to get single unit

//access modeifier

//private
class A {
    private void display4() {
        System.out.println("This is private");
    }
}

class Day7 {
    public static void main(String[] args) {
        Bike b = new Bike();

        Student1 s1 = new Student1(111, "raza");
        Student1 s2 = new Student1(222, "Hussain");
        s1.display();
        s2.display();

        Student2 s3 = new Student2(333, "Syed");
        Student2 s4 = new Student2(444,"fida",12);
        s3.display1();
        s4.display1();

        Student3 s5 = new Student3(555, "Hussain", 8000f);
        s5.display2();
        System.out.println(Adder.add(11,34));
        System.out.println(Adder.add(12.3,12.4));

        Dog d = new Dog();
        d.displayInfo();

        A obj = new A();
        // obj.display4();

        

    }
}