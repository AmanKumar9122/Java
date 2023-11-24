public class ifelsecondition {
    public static void main(String[] args) {
        int age=18;
        if(age>=18 && age<=60){
            if (age>=18 && age<30){
                System.out.println("You're in your 20's");
            }
            else if(age>=30 && age<40){
                System.out.println("You're in your 30's");
            }
            else {
                System.out.println("You're in your 40's-50's");
            }
        }
        else if(age>60){
            System.out.println("You're Senior Citizen");
        }
        else{
            System.out.println("You are Kid");
        }
    }    
}