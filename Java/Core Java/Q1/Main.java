abstract class Name {
  public abstract void age();
  public void name() {
    System.out.println("My name is Nihal");
  }
}

class Info extends Name {
  public void age() {
    System.out.println("My age is: 22");
  }
}

class Main {
  public static void main(String[] args) {
    Info myinfo = new Info(); 
    myinfo.name();
    myinfo.age();
  }
}