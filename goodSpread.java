  public static int goodSpread(int[] arr){
    int result = 0;
    for(int i = 0; i < arr.length; i++){
      int countTimes = 1;
      for(int j = i +1; j < arr.length; j++ ){
        if(arr[i] == arr[j]){
          countTimes++;
        }
      }
      if(countTimes > 3){
            result = 0;
            break;
      } else {
            result = 1;
      }
    }
    return result;
  }
}
