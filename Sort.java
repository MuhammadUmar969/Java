package sort;

public class Sort {

    public static void main(String[] args) {
     int arr[] ={2,5,8,10,15,20};
     int rev = arr.length;
     //int math = Math.floorDiv(rev, 2);
     
     int temp = 0;
     for(int i=0; i<3 ; i++){
         temp = arr[i];
         arr[i] = arr[rev-i-1];
         arr[rev-i-1]= temp ;
     }
     for(int element:arr){
         System.out.println(element);
     }
    }
    
}
