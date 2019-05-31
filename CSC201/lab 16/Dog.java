
public abstract class Dog {
 private String name;
 private double weight;
 private double age;
 
 
 public Dog(String aname, double wgt, double ag){
  name = aname;
  weight = wgt;
  age = ag;
 }
 
 public abstract void sleep();

 
 public void bark(){
  System.out.println(name + " says Woof!");
 }
 
 public String getName(){
  return name;
 }
 
 public String toString() {
  return "Name: " + name + "\nAge: " + age + "\nWeight: " + weight;
 }
}
