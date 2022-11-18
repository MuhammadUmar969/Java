package sort;

public class Sort {

    public static void main(String[] args) {
     int []arr ={22,44,12,6,10,50,46};
     int temp = 0;
     
     //Descending Order:
     for(int i=0; i<arr.length; i++){
         for(int j=i+1; j<arr.length; j++){
            if(arr[i]<arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }           
         }
     }

    for(int element:arr){
         System.out.println(element);
    }
     //For Ascending Order:
     for(int k=0 ; k<arr.length; k++){
         for(int l=k+1; l<arr.length; l++){
             if(arr[k]>arr[l]){
                 temp =arr[k];
                 arr[k] = arr[l];
                 arr[l] = temp;
             }
         }
     }
         for(int element1: arr){
             System.out.println(element1);
         }
    }
}

