enum Week{
MON,TUE,WED,THU,FRI,SAT,SUN;
}
public class LaunchEnum1 {
    public static void main(String[] args) {
        Week w = Week.MON;
        System.out.println(w);

        int index=Week.MON.ordinal();
        System.out.println(index);

        Week []wr=Week.values();
        for(Week w1:wr){
            System.out.println(w1+" : "+w1.ordinal());
        }
    }
}
