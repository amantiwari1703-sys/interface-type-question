public class Main {
    public static void main(String[] args){
        Calculate c=new Calculate();
        System.out.println(c.sum(5,3));
    }
}
    interface Add{
    int sum (int a,int b);
    }

    class Calculate implements Add{
 public int sum(int a,int b){
     return a+b;


 }

    }