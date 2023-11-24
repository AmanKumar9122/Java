public class typecasting {
public static void main(String[] args) {
    int a = 4;
    double b;
    b=a;
    System.out.println(b);//implicit type casting (without any external effort)
    
    double c = 45.5;
    int d;
    d = (int)c;
    System.out.println(d);//explicit type casting (forcing c to become int data type)

    int n1 = 125;
    int n2 = 54;
    float res = n1/n2; // we will not get the exact result because the value get trucated
    //Truncation in Java programming refers to removing certain float or double-type digits or characters from the right of a string.
    //We can also remove all of the decimal points that convert it to an integer. 
    //Keep in mind that the number won't be rounded to the nearest value after truncation.
    System.out.println(res);
}   
}
