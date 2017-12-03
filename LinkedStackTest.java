import datastruct.LinkedStack;

public class LinkedStackTest {
  public static void main(String[] args) {
    int i = 0;
    LinkedStack S = new LinkedStack();
    System.out.println("-------Starting Test --------");
    for (int a = 0; a < 5; a++) {
      i = (int) (Math.random() * 100);
      S.push(i);
      System.out.println("PUSH " + i);
    }
    System.out.println("-------POPING Test --------");
    while (!S.isEmpty()) {
      System.out.println("Pop " + S.pop());
    }
  }
}