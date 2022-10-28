package javaapplication2;

public class JavaApplication2{
public static void main(String[] args) {
 //int matrixA[][]={{2,5},{3,5}};
 //foreach loop
// for(int a[]: matrixA){
//     for(int b:a){
//         System.out.println(b);
//     }
// }

// to print array in array format
//for(int a[] : matrixA){
//    for(int b:a){
//        System.out.print(b);
//    }
//    System.out.println();
//}

//to add two arrays
//int matrixA[][]={{2,5},{3,5}};
//int matrixB[][]={{4,3},{1,3}};
//int i;
//int j;
//
//for(i=0;i<matrixA.length;i++){
//    for(j=0;j<matrixA.length;j++){
//        System.out.println(matrixA[i][j]+matrixB[i][j]);
//    }
//    System.out.println();
//}

//to sub two arrays
int matrixA[][]={{2,5},{3,5}};
int matrixB[][]={{4,3},{1,3}};
int i;
int j;

for(i=0;i<matrixA.length;i++){
    for(j=0;j<matrixA.length;j++){
        System.out.println(matrixA[i][j]-matrixB[i][j]);
    }
    System.out.println();
}
}