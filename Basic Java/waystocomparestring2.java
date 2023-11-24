public class waystocomparestring2 {
    public static void main(String[] args) {
        String s1="pwskills";
        String s2="pwskills";
        String s3="PWSKILLS";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));//Ignorecase ignores the upper and lower case issues...
    }
}
//uppercase and lowecase are not same in Java programming Language 