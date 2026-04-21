public class Main {
    public static void main(String[] args) {
        print p = new Demo();
        p.show();
    }
}
interface print{
    void show();
}
class Demo implements print{
    public void show(){
        System.out.println("interface method called");
    }
}