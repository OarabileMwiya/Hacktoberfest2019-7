class SumOfArray{
   
   //Main meethod
   public static void main(String args[]){
      //array of integers
      int[] array = {10, 20, 30, 40, 50, 10};
      
      //Declaration and initialisation of variable sum
      int sum = 0;
      //Advanced for loop
      for( int num : array) {
          sum = sum+num;
      }
      // print out or display sum of array
      System.out.println("Sum of array elements is:"+sum);
   }
}
