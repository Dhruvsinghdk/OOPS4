import org.w3c.dom.ls.LSOutput;

final class A{                     // uable to do an inheritance with this class
    int x,y;
    void show(int x, int y){
        System.out.println(x+y);
    }
}

class B extends A{
    int x,y;
    void show (int x, int y){
        System.out.println(x*y);
    }
}
class C extends A{
    int x,y;
    void show(int x,int y){
        System.out.println(x/y);
    }
}

public class Heriracheal {
    public static void main(String[] args) {
        C c = new C();
       c.show(20,10);

       B b = new B();
       b.show(2,3);

       A a = new A();
       a.show(2,3);
        System.out.println();


//       A r = a;
//       r.show(20,10);
//
//       r = b;
//       r.show(12,12);
//
//       r = c;
//       r.show(12,14);

        A r[] = {a,b,c} ;



        for (int i = 0; i < r.length; i++) {
           r[i].show(2,3);
        }

    }
}
