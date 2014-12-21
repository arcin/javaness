public class Hello {
  private String name, prefix;

  public Hello (String name, String prefix){
    this.name = name;
    this.prefix = prefix;
  }

  public void speak () {
    System.out.println("Hello " + this.prefix + ", your name is " + this.name);
  }

  // When executing behavior within a class, you will always execute it in the `main` function
  // of that class.
  public static void main (String[] args) {
    String name = "Charles";
    hello(name);
    Hello greeting = new Hello("Charles", "sir");
    greeting.speak();
  }

  public static void hello (String name) {
    System.out.println(name);
  }

}
