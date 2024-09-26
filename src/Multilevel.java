//
//
//class A{
//    void showa(){
//        System.out.println("A class");
//    }
//}
//class B extends A {
//    void showb(){
//        System.out.println("B class");
//    }
//}
//class C extends B{
//    int c = 10 ;
//    void showc(){
//        System.out.println("C class");
//        System.out.println(c);
//    }
//}
//class D extends C{
//    int d = 10;
//    void showd(){
//        System.out.println("D class");
//        System.out.println(c + d);
//    }
//}
//class E extends D{
//    void sum(int c){
//
//        System.out.println(c+d);
//    }
//}
//
//public class Multilevel {
//    public static void main(String[] args) {
//        D n = new D();
//        E c = new E();
//        n.showa();
//        n.showb();
//        n.showd();
//
//        c.sum(30);
//
//    }
//}
