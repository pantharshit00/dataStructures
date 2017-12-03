/**
 * 
 * push algorithm
 * 
 * ctr= N, top=0
 * repeat steps 3 and 4 until ctr = top
 * str[ctr] = stack[ctr - 1]
 * ctr = ctr -1
 * stack[top] =item
 * 
 * pop algorithm
 * 
 * ctr = top
 * print Stack[top]
 * repeat step 4 and 5 until ctr = N
 * stack[ctr] = stack[ctr+1]
 * ctr = ctr +1
 */

package datastruct;

/**
 * arrayStackInt
 */
public class ArrayStackInt {
  protected int Stack[];
  protected int ctr;

  public ArrayStackInt(int capacity) {
    Stack = new int[capacity];
    ctr = -1;
  }

  public boolean isEmpty() {
    return ctr == -1;
  }

  public int push(int i) {
    if (ctr + 1 < Stack.length) {
      Stack[++ctr] = i;
      return i;
    }
    System.out.println("Stackoverflow");
    return -1;
  }

  public int pop() {
    if (isEmpty())
      return -1;
    return Stack[ctr--];
  }
}