class Invoke{
    static void disp1(){
        System.out.println("Static block");
    }
    void disp2(){
        System.out.println("Non static block");
    }
}
public class staticandnonstatic {
    public static void main(String[] args) {
        Invoke.disp1();
        Invoke I1= new Invoke();
        I1.disp2();
    }
}
//static block is object independent it can be called without creating an object...