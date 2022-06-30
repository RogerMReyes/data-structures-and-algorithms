package datastructures.sort;

public class Sort {

  public Sort() {
  }

  public int[] insertionSort(int[] array){
    for(int i = 1; i < array.length; i++){
      int j = i - 1;
      int temp = array[i];

      while(j >= 0 && temp < array[j]){
        array[j+1] = array[j];
        j--;
      }
      array[j+1] = temp;
    }
    return array;
  }

  public void mergeSort(int[] arr) {
    int n = arr.length;

    if (n > 1) {
      int mid = n / 2;
      int[] left = new int[mid];
      System.arraycopy(arr, 0, left, 0, mid);
      int[] right = new int[(int) Math.ceil(n/2.0)];
      System.arraycopy(arr, mid, right, 0, (int)Math.ceil(n/2.0));
      mergeSort(left);
      mergeSort(right);
      merge(left, right, arr);
    }
  }

  public static void merge(int[] left, int[] right, int[] arr){
    int i = 0;
    int j = 0;
    int k = 0;

    while(i < left.length && j < right.length){
      if( left[ i ] <= right[ j ]){
        arr[ k ] = left[ i ];
        i++;
      }
      else {
        arr[ k ] = right[ j ];
        j++;
      }
    k++;
    }
    if( i == left.length){
      System.arraycopy(right, j, arr, k, right.length - j);
    }
    else{
     System.arraycopy(left, i, arr, k, left.length - i);
    }
  }

  public void quickSort(int[] arr, int left, int right){
    if(left < right){
      int position = partition(arr, left, right);
      quickSort(arr, left, position - 1);
      quickSort(arr, position + 1, right);
    }
  }

  public static int partition(int[] arr, int left, int right){
    int pivot = arr[right];
    int low = left - 1;

    for(int i = left; i < right; i++){
      if(arr[i] <= pivot){
        low++;
        swap(arr, i, low);
      }
    }
    swap(arr, right, low + 1);
    return low + 1;
  }

  public static void swap(int[] arr, int i, int low){
    int temp = arr[i];
    arr[i] = arr[low];
    arr[low] = temp;
  }
}
