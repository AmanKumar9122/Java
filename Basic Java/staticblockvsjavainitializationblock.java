public class staticblockvsjavainitializationblock {
    static int age;
    static
    {
        System.out.println("Static Block");
        age=17;
    }
    static void disp()
    {
        System.out.println("Display Static Method");
        System.out.println(age);
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
        disp();
    }
}
