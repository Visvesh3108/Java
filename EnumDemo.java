enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY 
} 
public class EnumDemo {

 public static void main(String[] args) {
  EnumDemo ed = new EnumDemo();
  ed.lookUp("tuesday");
  
 }
 
 // method to lookup ennum constants
 public void lookUp(String str){
  Day day = Day.valueOf(str.toUpperCase());
  System.out.println("Found enum " + day );
 }
}