public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.getSquare(4));
    }
}
interface Square{
    int getSquare(int n);

    }
 class Demo implements Square{
    public int getSquare(int n){
        return n*n;
    }
 }

