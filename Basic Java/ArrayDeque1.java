import java.util.*;
public class ArrayDeque1 
{
    public static void main(String[] args) 
    {
        ArrayDeque ad1=new ArrayDeque();
        ad1.add(100);
        ad1.add(200);
        ad1.add(200);
        System.out.println(ad1);
        ad1.addFirst(10);
        ad1.addLast(20);

        System.out.println(ad1);
        ad1.add("PW");
        System.out.println(ad1);


        ad1.offer(500);
        ad1.offerLast(10);
        ad1.offerFirst(1);

        System.out.println(ad1);
        
    }
    
}
