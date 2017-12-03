import datastruct.ArrayStackInt;

class Main {
  public static void main(String[] args) {
    ArrayStackInt ob = new ArrayStackInt(10);
    System.out.println(ob.push(10));
    System.out.println(ob.push(13));
    System.out.println(ob.push(14));
    System.out.println(ob.push(18));
    System.out.println("_________________________");
    System.out.println(ob.pop());
    System.out.println(ob.pop());
    System.out.println(ob.pop());
    System.out.println(ob.pop());
  }
}