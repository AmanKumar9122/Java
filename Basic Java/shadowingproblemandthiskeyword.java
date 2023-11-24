class student{
    private int age;
    private String name;
    void getData(int age){
        this.age=age;
    }
    void getData2(String name){
        this.name=name;
    }
    void show(){
        System.out.println(age+" "+name);
    }
}
public class shadowingproblemandthiskeyword {
    public static void main(String[] args) {
        student obj = new student();
        student obj1= new student();
        obj.getData(18);
        obj1.getData(25);
        obj.getData2("Ravi");
        obj1.getData2("Arpit");
        obj.show();
        obj1.show();
    }
}