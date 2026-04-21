public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.isEven(6));
    }
}
interface check {
    boolean isEven(int n);

}
class Demo implements check{
    public boolean isEven(int n){
        return n%2==0;
    }
}
