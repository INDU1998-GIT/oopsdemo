final class FinalDemo {
  public void display() {
    System.out.println("This is a final method.");
  }


// try to extend the final class
///class FinalClassDemo extends FinalDemo{
  //public  void display() {
    //System.out.println("The final method is overridden.");
  //}


  public static void main(String[] args) {
    FinalDemo obj = new FinalDemo();
    obj.display();
  }

  }

