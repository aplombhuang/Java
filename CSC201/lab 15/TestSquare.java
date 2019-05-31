public class TestSquare
{
  public static void main(String[] args)
  {
    Square sq1 = new Square();
    
    Square sq2 = new Square(3.14);
    
    Square sq3 = new Square(6.28);
    
    Square sq4 = new Square(5.0);
    
    Square sq5 = new Square(9.5);
    
    System.out.println("Area for each Square: ");
    
    System.out.println(sq1.getArea());
    
    System.out.println(sq2.getArea());
    
    System.out.println(sq3.getArea());
    
    System.out.println(sq4.getArea());
      
    System.out.println(sq5.getArea());
    
    System.out.println("Perimeter for each Square: ");
    
    System.out.println(sq1.getPerimeter());
    
    System.out.println(sq2.getPerimeter());
    
    System.out.println(sq3.getPerimeter());
    
    System.out.println(sq4.getPerimeter());
      
    System.out.println(sq5.getPerimeter());
    
    System.out.println(sq2);
    
    System.out.println(sq2.toString());
  }
}