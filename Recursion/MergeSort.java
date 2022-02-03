package Recursion;

class MergeSort{

  static void merge(int[] arr, int left, int right, int mid){

    int[] arr1 = new int[mid];
    int[] arr2 = new int[right-mid+1];
    int i = 0;
    int j = 0;
    int k =  mid +1;
    while(i<mid){
      arr1[i] = arr[i];
      i++;
    }
    while(j<arr2.length){
      arr2[j] = arr[k];
      j++;
    }

    while(i<arr1.length && j<arr2.length){
      if(arr1[i]<arr2[j]){
        arr[k] = arr1[i];
        i++;
      }

      if(arr1[i]>arr2[j]){
        arr[k] = arr2[j];
        j++;
      }
      k++;
    }

    while(i<arr1.length){
      arr[k] = arr1[i];
      i++;
      k++;
    }
    while(j<arr2.length){
      arr[k] = arr2[j];
      j++;
      k++;
    }


  }

  static void mergeSort(int left, int right, int[] arr) {

    if(left<right) {
      int mid = left + (right-left)/2;
      mergeSort(left, mid, arr);
      mergeSort(mid+1, right, arr);
      merge(arr, left, right, mid);
    }

  }

  public static void main(String[] args) {

    int[] arr = {2,7,1,9,8};

    mergeSort(0, arr.length-1,arr);
  }
}
