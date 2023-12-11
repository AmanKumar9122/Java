public class linearsearch2 {
    public static int search(String[]food , String item){
        for (int i=0;i<food.length;i++){
            if(food[i].equals(item)){
            return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String [] food= {"Dosa","Chola bhature","Samosa"};
        String item = "Samosa";
        int index = search(food,item);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("Key found at Index: "+ index);
        }
    }
}
