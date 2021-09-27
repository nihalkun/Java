interface MyName {
    public void name(); 
  }
  
  interface MyAge {
    public void age(); 
  }
  
  class Information implements MyName, MyAge {
    public void name() {
      System.out.println("Ny name is : Nihal");
    }
    public void age() {
      System.out.println("and I am 22");
    }
  }
  
  class Interface {
    public static void main(String[] args) {
      Information myObj = new Information();
      myObj.name();
      myObj.age();
    }
  }