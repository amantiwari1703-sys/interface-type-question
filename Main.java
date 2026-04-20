public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
interface Data{
    int x=10;

}
class Demo implements Data{
    public void show(){
        System.out.println(x);
    }
}