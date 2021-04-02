class Test{    
   Test(){
      // ********* protected ************
      // 1) This is possible if "Test extends addition"
      // protected is accessible from subclass
      // System.out.println(addTwoNumbers(11,22));
      
      // 2) This is possible without extends Addition
      // thus unrelated class can still invoke a protected method through the object.
      Addition add1 = new Addition();
      System.out.println(add1.addTwoNumbers(44, 11));

      // ********* private ************   
      // 3)private methods not callable no matter what
      // System.out.println(add1.privateMethod(33, 11));


      // ********* public ************
      // 4) public methods also only possible if "Test extends addition"
      // System.out.println(publicMethod(11,1));

      // 5) This is possible
      System.out.println(add1.publicMethod(11, 1));

      
   }
   
   public static void main(String args[]){
      Test newT = new Test();
      
   }
}