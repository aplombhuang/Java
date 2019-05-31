/* This is a driver to test the Poodle class 
 * which class extends the Dog class and implements
 * Fancy and Pet
 */
 
class PoodleDriver {

 public static void main(String[] args) {
  
  Poodle Fifi = new Poodle("silver","Fifi",2,3);
  System.out.println(Fifi);
  Fifi.bark();
  Fifi.sleep();
  Fifi.groom();
  Fifi.walk();
  Fifi.feed();
 }

}
