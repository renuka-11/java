import java.util.Scanner;
class LinearSearch {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter the number of elements in the array");
    int n = scanner.nextInt();
    int[] array = new int[n];
    System.out.println("enter the number of elements in the array");
    for(int i=0;i<n;i++) {
      array[i] = scanner.nextInt();
      }
    System.out.println("enter the number of elements to be searched");
    int target = scanner.nextInt();
    int result = linearsearch(array,target);
    if(result==-1) {
      System.out.println("element not found in the array.");
      }
    else {
      System.out.println("element found at index:"+result);
      }
      scanner.close();
    }
      public static int linearsearch(int[] array,int target) {
         for(int i=0;i<array.length;i++)
         {
           if(array[i]==target) {
             return i;
           }
         }
         return-1;
   }
}    
