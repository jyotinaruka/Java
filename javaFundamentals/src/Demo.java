import java.util.ArrayList;

public class Demo {

  public static void main(String[] args) {
    String ninja = "Coding Dojo is Awesome!";
    int length = ninja.length();
    System.out.println(length);

    String string1 = "My name is ";
    String string2 = "Michael";
    String string3 = string1 + string2;
    System.out.println(string3);

    String sentence = "    spaces everywhere!   ";
    System.out.println(sentence.trim());

    String a = "HELLO";
    String b = "world";
    System.out.println(a.toLowerCase()); // hello
    System.out.println(b.toUpperCase()); // WORLD

    String a1 = new String("word");
    String b1 = new String("word");
    System.out.println(a1 == b1); // false. not the same exact object.
    System.out.println(a1.equals(b1)); // true. same exact characters.

    ArrayList<Object> list = new ArrayList<Object>();
    list.add(10);
    list.add("Hello");
    list.add(new ArrayList<Integer>());
    list.add(new Double(12.0)); // adding a Double of value 12.0

    System.out.println(list); // [10, "Hello", [], 12.0]
  }
}
