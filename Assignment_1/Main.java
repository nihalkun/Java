abstract class Name {
  // Abstract method (does not have a body)
  public abstract void age();
  // Regular method
  public void name() {
    System.out.println("My name is Nihal");
  }
}

// Subclass (inherit from Name)
class Info extends Name {
  public void age() {
    // The body of age() is provided here
    System.out.println("My age is: 22");
  }
}

class Main {
  public static void main(String[] args) {
    Info myinfo = new Info(); // Create a Info object
    myinfo.name();
    myinfo.age();
  }
}