// CLASS:  Hw3_35
// AUTHOR: Sherly Hartono, sharton1, sharton1@asu.edu

public class Hw3_35 { 
    public Hw3_35() { 
    }
    String reverse(String s) {
        if(s.length()== 1){
            return s;
        }else{
            System.out.println("substring :" +s.substring(1));
            System.out.println("s charat0: "+ s.charAt(0) + "\n");
            return reverse(s.substring(1)) + s.charAt(0);
        }
    } 
}