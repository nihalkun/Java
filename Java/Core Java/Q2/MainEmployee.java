class Employee {
    private int age; 
  
    public int getAge() {
      return age;
    }
 
    public void setAge(int newAge) {
      this.age = newAge;
    }
  }
  
  public class MainEmployee {
    public static void main(String[] args) {
      Employee myAge = new Employee();
      myAge.setAge(22); 
      System.out.println(myAge.getAge());
    }
  }