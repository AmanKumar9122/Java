// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
// Return the minimum integer k such that she can eat all the bananas within h hours.
// public class KoKoEatingBanana {
//     public int minEatingSpeed(int[] piles, int h) {
//         int low = 1;
//         int high = 0;
//         for(int i=0;i<piles.length;i++){
//             high = Math.max(high,piles[i]);
//         }
//         while(low<high){
//             int mid = low+(high-low)/2;
//             int hours = 0;
//             for(int i=0;i<piles.length;i++){
//                 hours += (piles[i]+mid-1)/mid;
//             }
//             if(hours>h){
//                 low = mid+1;
//             }else{
//                 high = mid;
//             }
//         }
//         return low;
//     }
//     public static void main(String[] args) {
//         KoKoEatingBanana obj = new KoKoEatingBanana();
//         int[] piles = {3,6,7,11};
//         int h = 8;
//         System.out.println(obj.minEatingSpeed(piles,h));
//     }
// }


// use a function true false to check if the mid is valid or not
// if true then high = mid else low = mid+1
public class KoKoEatingBanana {
    public boolean isValid(int[] piles, int h, int mid){
        int hours = 0;
        for(int i=0;i<piles.length;i++){
            hours += (piles[i]+mid-1)/mid;
        }
        return hours<=h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int i=0;i<piles.length;i++){
            high = Math.max(high,piles[i]);
        }
        while(low<high){
            int mid = low+(high-low)/2;
            if(isValid(piles,h,mid)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        KoKoEatingBanana obj = new KoKoEatingBanana();
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(obj.minEatingSpeed(piles,h));
    }
}

// time complexity: O(n*log(max(piles))) where n is the number of piles and piles is the array of piles of bananas.
// space complexity: O(1)