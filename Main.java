public class Main {
    public static void main(String[] args) {
        Hello h=new Hello();
        System.out.println(h.sayHello());

    }
}
interface Greeting{
    String sayHello();

}
class Hello implements Greeting{
    public String sayHello(){
        return "Hello world";
    }
}