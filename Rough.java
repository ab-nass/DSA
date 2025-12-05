 import java.util.*;


// public class Rough {

     
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
    
//     System.out.println("Enter the Number" );
//     int n = sc.nextInt();
//     int fib1 =0;
//     int fib2 = 1;
//     int fib3;
//     System.out.println(fib1 + " " + fib2 + " ");
//     for(int i = 1; i<=n; i++){
//         fib3 = fib1+ fib2;
//         System.out.print(  " " + fib3);
//         fib2 = fib1;
//         fib1 = fib3;
//     }

// }
// }
  // public class Rough {
  
  //   public static void main(String[] args) {
  //           int arr[][] = new int[3][4];
  //           Scanner sc = new Scanner(System.in);
  //           System.out.print("Enter array Elements");
  //           for(int i =0; i<3; i++){
  //               for(int j=0; j < 4; j++) {
                       
  //                    arr[i][j] = sc.nextInt();
  //               }
  //           }
  //           System.out.print("Matrix: \n");

  //           for(int i =0; i<3; i++){
  //               for(int j=0; j < 4; j++) {
                       
  //                   System.out.print(arr[i][j] + " ");
  //               }
  //               System.out.print("\n");
  //           }
            
  //   }
  // }

  
  public class Rough {


      public static void reverse(int nums[]) {
        int first =0; 
        int last = nums.length -1;
          
        while (first < last) {
          int temp = nums[last];
          nums[last] = nums[first];
          nums[first] = temp;

          first ++;
          last --;

        }
          
      }

  public static void main(String[] args) {
   int nums[] = {2, 4, 6, 8, 10};
   System.out.print("Array: [ ");
   for(int i =0; i < nums.length; i ++) {
         System.out.print(nums[i]);
         if (i < nums.length-1) System.out.print(",  ");
   }
   System.out.print("]");
    
   reverse(nums);
    
   for(int i =0; i < nums.length; i ++) {
    if(i < nums.length) System.out.print(", ");
    System.out.print(nums[i]);
   }
    
  }
  }