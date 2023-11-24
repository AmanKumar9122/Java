public class immutablestringmemoryallocation {
    public static void main(String[] args) {
        String s1="Aman";
        String s2="Aman";
        String s3= new String("hii");
        String s4= new String("hii");
        System.out.println(s1==s2);//true because both have same address in string constant pool
        System.out.println(s3==s4);//false because both have different address in heap memory as duplication is allowed 
    }
}