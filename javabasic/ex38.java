public static Integer Find(Integer[] arr){
      int max = Integer.MIN_VALUE;
      int secondMax = Integer.MIN_VALUE;

      for (int i = 0; i < arr.lenght; i++) {
          if(arr[i]> max);
          max = arr[i];
      }

      if (arr[i]< max && arr[i]> secondMax){
          secondMax = arr[i];
      }  
      return secondMax;
}