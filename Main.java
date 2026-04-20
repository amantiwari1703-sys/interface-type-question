public class Main{
    public static void main (String[] args){
        dog d=new dog();
        d.sound();git remote add origin https://github.com/amantiwari1703-sys/interface-type-question.git

    }
}
interface Animal{
    void sound();
}
class dog implements Animal{
    public void sound(){
        System.out.println("dog barks");
    }
}