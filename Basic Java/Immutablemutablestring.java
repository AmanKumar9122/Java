public class Immutablemutablestring {
    public static void main(String[] args) {
        String brand="pwskills";//Immulatable String - non-changeable
        System.out.println(brand);
        brand.concat("Bengaluru");
        System.out.println(brand);

        StringBuilder brand1= new StringBuilder("pwskills");//Mutable String - Changeable
        System.out.println(brand1);
        brand1.append(" Bengaluru");
        System.out.println(brand1);

    }
}
