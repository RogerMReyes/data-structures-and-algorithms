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
}
