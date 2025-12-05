  import java.util.*;
 // 1  -- creating an array

/* 

 import java.util.*;

public class Array {

    public static void main(String[] args) {
            
        int marks[] = new int[100];

        Scanner Scan = new Scanner(System.in);

        marks[0] = Scan.nextInt();
        marks[1] = Scan.nextInt();
        marks[2] = Scan.nextInt();

        System.out.println("phy : " + marks[0]);
         System.out.println("chem : " + marks[1]);
          System.out.println("Math : " + marks[2]);

          int percentage = (marks[0] + marks[1] + marks[2]) / 3 ;
          System.out.println("percentage = " + percentage + "%");
        

    }
}

*/


// 2 -- passing arrays as argument

/* 

import java.util.*;

public class Array {

    public static void update(int marks []) {

      for (int i =0; i<marks.length; i++) {
         marks[i] = marks[i] +1;

      }

    }

    public static void main(String[] args) {

        int marks[] ={97, 98,99};
        update(marks);

        for(int i =0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");

        }
        System.out.println( );
        
    }
}

*/

// 3 -- Linear Search

/* */

// import java.util.*;

// public class Array {

//     public static int linearSearch (int numbers[], int key) {
             
//          for(int i = 0; i<numbers.length; i++) {
//              if(numbers[i] == key) {
//                 return i;
//              }
//          }
//          return -1;

//     }

//     public static void main(String[] args) {
//         int numbers [] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 10; 

//         int index = linearSearch(numbers, key);

//         if (index == -1) {
//             System.out.println("NOT found");
//         } else {

        
//         System.out.println("key is at index : " + index);

//         }  
//     }
// }



  // Fin the max of array.

// import java.util.Scanner;

// public class Array {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int arr[] = new int[5];

//         for(int i=0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int max = arr[0];
//         for(int i =0; i < arr.length; i ++) {
//             if(arr[i] > max) {
//                 max = arr[i];
//             }
//         }

//         System.out.print("Array:  [");
//         for(int i=0; i < arr.length; i ++) {
//             System.out.print(arr[i] + " ");
//             if(i < arr.length -1) System.out.print(",");
            
//         }
//          System.out.println("]");
//         System.out.println("Greatest Element is : " + max);
//     }

// }




// Smallest element 





// import java.util.Scanner;

// public class Array {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[6];

//         for(int i=0; i < arr.length; i ++) {
//             arr[i] = sc.nextInt();
//         }

//         int min = arr[0];

//         for(int i=0; i < arr.length; i ++) {
//            if( arr[i] <= min) {
//             min = arr[i];
//            }
//         }
//        System.out.println("Min of array is " + min);
//     }
    
// }


//  

// public class Array {


//         public static int binarySearch(int numbers[], int key) {
//             int start =0, end = numbers.length -1; 

//             while(start <= end) {
//                 int mid = (start + end) / 2 ;
                
//                 //comparisions 
//                 if (numbers[mid] == key) {
//                     return mid;
//                 }

//                 if(numbers[mid] < key ) { // Right
//                     start = mid +1;
//                 } else {
//                     end = mid -1;
//                 }
                
//             }
//             return -1;
//         }
       
//     public static void main(String[] args) {

//         int numbers[] = {2, 4, 6, 8 , 10 ,12, 14};
//         int key = 10;

//         System.out.println("Index for key is: " + binarySearch(numbers, key));
        
//     }
// }



//   Reverse of an array




// public class Array {

//     public static void rev(int numbers[]) {
//         int first = 0; 
//          int last = numbers.length-1;
//         while(first < last) {
//             int temp =  numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;
//             first ++;
//             last --;
//         }
//     }

//     public static void main(String[] args) {
    
//         int numbers[] = {1,2,3,4,5};

//         rev(numbers);

//         for(int i =0; i < numbers.length; i ++) {
            
//             System.out.println(numbers[i]);
//         }
        
//     }
    
// }




  




// Pairs in an array



// public class Array {

//     public static void printPairs(int numbers[]) {
//         for(int i=0; i < numbers.length; i ++) {
//             int curr = numbers[i]; // 2, 4,6,8, 10
//             for (int j=i+1; j <numbers.length; j++) {
//                    System.out.print("(" +  curr + "," + numbers[j] + ")");
        
//             }
//             System.out.println();
//         }

//     }


//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};
//         printPairs(numbers);
//     }
// }


// print sub arrays

// public class Array {
 
//     public static void subarr(int numbers[]) {
//        for (int i =0; i <numbers.length; i ++) {
//         int start = i;
//         for(int j = i ; j < numbers.length; j++) {
//             int end= j;
//             for(int k=start; k<= end ; k++) {  //print
//             System.out.print(numbers[k] + " "); // subarray 
//             }
//             System.out.println();
//         }
//         System.out.println();
//        }

//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};
//         subarr(numbers);
//     }
// }

// prining sum of sub arrays


// public class Array {
 
//     public static void subarr(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
        
//        for (int i =0; i <numbers.length; i ++) {
//         int start = i;
//         for(int j = i ; j < numbers.length; j++) {
//             int end= j;
//             currSum = 0;
//             for(int k=start; k<= end ; k++) {  //print
//             currSum += numbers[k];
//             }
//             System.out.println(currSum);
//             if(maxSum < currSum) {
//                 maxSum = currSum;
//             }
//         }
//        }

//     System.out.println("max sum = " + maxSum);

//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};
//         subarr(numbers);
//     }
// }


//

public class Array {

      public static int trappedRainwater(int height[]) {
        int n = height.length; 
        // Calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i < n ;  i++)  {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);

             
        }

        // Calculate right max boundary - array

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trappedWater = 0;
        // loop
        for(int i=0; i < n; i++) {
            //waterlevel = min(leftmax bound, rightmax bound)
           int  waterLevel = Math.min(leftMax[i], rightMax[i]);

           // trapped water = waterLevel - height[i]
           trappedWater += waterLevel - height[i]; 

        }

        return trappedWater;
      }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println(trappedRainwater(height));

    }
}

