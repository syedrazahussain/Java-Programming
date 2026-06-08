//========================= Day-6 (OOPS object oriented Programming) ====================================

//********** Class*******************
class  Student {
    int id;
    String s;

}
class college {
    int rollno;
    String name;
    void insertStudent(int r,String n){
        rollno = r;
        name = n;

    }
    void displayDetails() {
        System.out.println(rollno + " " +name);
    }
}
//===========================inheritance =====================================
//single inheritance
class Parent {
    public void print_hello() {

        System.out.println("Hello");
    }

}

class Child extends Parent {
    public void print_world() {
        System.out.println("World");
    }
}

// ****************** multi level inheritance
class parent1 {
    public void print_base() {
        System.out.println("Iam Base class");
    }

}

class parent2 extends parent1 {
    public void print_intermediate() {
        System.out.println("Iam Intermediate class");
    }
}

class parent3 extends parent2 {
    public void print_child() {
        System.out.println("Iam Child class");
    }
}

// *********************** Hierarchical inheritance */
class A {
    public void print_A() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void print_B() {
        System.out.println("Class B");
    }
}

class C extends A {
    public void print_C() {
        System.out.println("Class C");
    }
}

class D extends A {
    public void print_D() {
        System.out.println("Class D");
    }
}

// Multiple inheritance : to use this inheritance is not possible if we want we
// can use interface concept
interface A1 {
    public void execute(int num1);

}

interface B1 {
    public void execute(int num2);

}
class C1 implements A1, B1 {
    public void execute(int num1) {
        System.out.println("Hello.. from implementation class!! " + num1);
    }

}

//*****************Hybrid Inheritance
class C2 {
    public void disp() {
        System.out.println("C");
    }
}
class A2 extends C2 {
    public void disp() {
        System.out.println("A");
    }
}

class B2 extends C2 {
    public void disp() {
        System.out.println("B");
    }
}

class D2 extends A2 {
    public void disp() {
        System.out.println("D");
    }

}

public class Day6 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.s);
        college c = new college();
        college c1 = new college();

        c.insertStudent(111, "Raza");
        c1.insertStudent(112, "Hussain");
        c.displayDetails();
        c1.displayDetails();

        Child g = new Child();
        g.print_hello();
        g.print_world();

        parent3 c11 = new parent3();
        c11.print_base();
        c11.print_intermediate();
        c11.print_child();

        B obj_b = new B();
        obj_b.print_A();
        obj_b.print_B();

        C obj_c = new C();
        obj_c.print_A();
        obj_c.print_C();

        D obj_D = new D();
        obj_D.print_A();
        obj_D.print_D();

        C1 obj = new C1();
        obj.execute(16);

        D2 objjj = new D2();
        objjj.disp();

    }
}