class Main {
  public static void main(String[] args) {
   int[ ] scores = {78, 89, 23, 88, 90, 93, 69, 100, 81,43};
  
   for(int i = 9;i >=0 ; i--){
  //only print the number if it is even
   if(scores [i] % 2 == 0){
     System.out.println("This number is even " + scores [i]);
   }
   //adding a else statement if and odd number
   else{
     System.out.println("This number is odd " + scores [1]);
   }
  }
 }
}