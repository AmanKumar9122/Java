public class finalkeyword {
    public static void main(String[] args) {
        final StringBuffer sb=new StringBuffer("Virat");
        sb.append("Kohli");
        System.out.println(sb);
        //sb=new StringBuffer("Sachin");//after using final keyword we can't assign different value to that address.
        //System.out.println(sb);
    }
}
