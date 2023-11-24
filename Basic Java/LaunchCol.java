import java.util.*;
public class LaunchCol {
    public static void main(String[] args) {
        ArrayList a1= new ArrayList();
        a1.add(100);
        a1.add(50);
        a1.add(150);
        a1.add(25);
        a1.add(75);
        a1.add(125);

        System.out.println(a1);
        Collections.sort(a1);
        System.out.println(a1);

        ArrayList<String>a12 =new ArrayList<String>();
        a12.add("Pw");
        a12.add("Hyder");
        a12.add("Java");
        a12.add("Rohan");
        System.out.println(a12);
        Collections.sort(a12);
        System.out.println(a12);

        ArrayList a13= new ArrayList();
        a13.add(10);
        a13.add(20);
        a13.add(20);
        a13.add(30);
        a13.add(40);
        a13.add(50);
        System.out.println(a13);

        //int index=Collections.binarySearch(a13,60);
        //System.out.println("Index is:"+index);

        Collections.rotate(a13, 3);
        System.out.println(a13);

        Collections.shuffle(a13);
        System.out.println(a13);

        System.out.println(Collections.frequency(a13, 20));
    }
    
}
