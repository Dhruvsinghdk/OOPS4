// inheritance
class A{
    int i;
    void show(){
        System.out.println("class A");
    }
}

class B extends A {
    int a = 10;

    void display(){
        System.out.println("class B");
    }

}

public class Main {
    public static void main(String[] args) {

        B n2 = new B();
        n2.show();
        n2.display();


    }
}