public class switchcase {
    public static void main(String[] args) {
        int num=200;
        switch (num) {    
        case 300 : System.out.println("Case1");
        break;
        case 200 : System.out.println("Case2");
        break;
        case 100 : System.out.println("Case3");
        break;
        default: System.out.println("not a valid case");
        }
    } 
}
//if we don't use break statement after each case then all the case below the true case will get executed.