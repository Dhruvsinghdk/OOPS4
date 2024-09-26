// inheritance

class A{
    protected int i = 12;
    private int j = 24;

    int setj(){
        return j;
    }
    void show(){
        System.out.println("class A");
    }
}

class B extends A {
    int a = 10;

    void display(){
        System.out.println(setj());
        System.out.println(i);
    }

}
public class Main {
    public static void main(String[] args) {

        B n2 = new B();
        n2.show();
        n2.display();

    }
}