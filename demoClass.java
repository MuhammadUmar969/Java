
public class demoClass {
    public static void main(String[] args) {
        int iterate =0;
        

    int [][] list = {{2,5},{4,15}};
    //list [1][1]
    // for(int i=0;i<list.length;i++){

    //  for(int j=0; j<list.length;j++)   {
    //     System.out.print(list[i][j]+"   ");    
    //  }
    //  System.out.println();
    // }
    // while(iterate<list.length){
    //     int iterate1 =0;
    //     System.out.println("Loop"+iterate1);
    //     while(iterate1<list.length){
    //         System.out.println(list[iterate][iterate1]);
    //         iterate1++;
    //     }
    //     iterate++;
        
    // }
    
        // do {
        //     int iterate1=0;
        //     do {
                
        //         System.out.println(list [iterate][iterate1]);
        //         iterate1++;

        //     } while (iterate1<list.length);
        //     iterate++;

        // } while (iterate<list.length);
      
        for(int num[] :list){
            for(int n:num){
                System.out.println(n);
            }
        }
        
    }


}
class doctor{
    int name;
    String age;

    doctor(int name, String age){

}

}