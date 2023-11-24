//encapsulation= data hiding + data abstraction
class student{
    private int age;//access specifier are used here
    private String name;
    void setData(){
        age=18;
        name="Navin";
    }
    void show(){
        System.out.println(age+" "+name);
    }
}
public class encapsulation {
    public static void main(String[] args) {
        student obj= new student();
        obj.setData();
        obj.show();
    }
    
}
