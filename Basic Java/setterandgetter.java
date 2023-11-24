class student{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }   
}
public class setterandgetter {
    public static void main(String[] args) {
        student obj = new student();
        student obj1= new student();
        obj.setAge(18);
        obj1.setAge(25);
        obj.setName("Ravi");
        obj1.setName("Arpit");
        int stud1=obj.getAge();
        System.out.println(stud1);
}
}