package algo.mergeSort;

public class Recursive
{
  public static void main(String[] args) {
    divide(new int[]{ 1,2,3,4,5,6,7,8,9,10 });
  }
  
  public static void divide (int[] arr) {
    int len = arr.length;
    int mid = len/2;
    int[] arr1 = new int[mid];
    int[] arr2 = new int[len-mid];
    int idx = 0;
    
    for (int i=0; i<mid; i++, idx++) {
      arr1[idx] = arr[i];
      System.out.println( " " + arr1[idx] );
    }
    
    idx = 0;
    
    for (int i=mid; i<len; i++, idx++) {
      arr2[idx] = arr[i];
      System.out.println( " " + arr2[idx] );
    }
    
  }
  
  public static void merge() {
    
  }
}
