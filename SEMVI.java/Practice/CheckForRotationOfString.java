public class CheckForRotationOfString {
    public boolean check(String str1,String str2){
        if(str1.length()==str2.length()){
            String str3 = str1 + str1;
            if(str3.contains(str2)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";
        CheckForRotationOfString obj = new CheckForRotationOfString();
        System.out.println(obj.check(str1, str2));
    }
}
