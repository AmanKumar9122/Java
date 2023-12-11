/**
 * q5
 */
public class q5 {

    public static void main(String[] args) {
        int sum=0;
        int count =0;
        for (int i=51;i<=100;i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                 isPrime=false;
                 break;
                }
            }
            if(isPrime){
                sum += i;
                count++;
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }
}

// public class q5 {

//     public static void main(String[] args) {
//         int count = 0;
//         int sum = 0;

//         for (int num = 51; num < 100; num++) {
//             boolean isPrime = true;
//             for (int i = 2; i <= Math.sqrt(num); i++) {
//                 if (num % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }

//             if (isPrime) {
//                 count++;
//                 sum += num;
//             }
//         }

//         System.out.println("The number of prime numbers between 50 and 100 is: " + count);
//         System.out.println("The sum of prime numbers between 50 and 100 is: " + sum);
//     }
// }
