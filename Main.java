public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        Cow cw = new Cow();
        c.sound();
        cw.sound();


    }
}
interface Animal{
    void sound();
}
class Cat implements Animal{
    public void sound(){
        System.out.println("cat meows");
    }
}
class  Cow implements Animal{
    public void sound(){
        System.out.println("cow moos");
    }
}

