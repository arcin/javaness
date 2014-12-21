public class Hello {
  // When executing behavior within a class, you will always execute it in the `main` function
  // of that class.
  public static void main (String[] args) {
    String name = "Charles";
    hello(name);
  }

  public static void hello (String name) {
    System.out.println(name);
  }
}
