public class Main {
    public static void main(String[] args) {
        test t = new test();
        t.show();
        t.display();
    }
}
interface A{
    void show();

}
interface B{
    void display();
}
class test implements A,B{
    public void show(){
        System.out.println("show method");
    }
    public void display(){
        System.out.println("display method");
    }
}