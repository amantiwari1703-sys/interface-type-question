public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.add(10, 5));
        System.out.println(d.sub(10, 5));
    }
}
interface MathOp{
    int add(int a,int b);
    int sub(int a,int b) ;
}
class Demo implements MathOp{
    public int add(int a,int b){
        return a+b;

    }
    public int sub(int a,int b){
        return a-b;
    }
}