/**
 * push algorithm
 * NewPtr = new Node
 * NewPtr.INFO = ITEM, NEWPtr.LINK = NULL
 * if TOP = NULL then 
 * TOP = NEWPTR
 * else{
 * NEWPTR.LINK = TOP
 * TOP = NEWPtr
 * }
 * 
 * pop algoritm
 * if TOP = null then 
 * Stack empty
 * else{
 * print TOP.LINK
 * TOP = TOP.LINK
 * }
 */

package datastruct;

import helpers.Node;

public class LinkedStack {
  protected Node top;
  protected int number;

  public LinkedStack() {
    top = null;
    number = 0;
  }

  public boolean isEmpty() {
    return top == null;
  }

  public int size() {
    return number;
  }

  public void push(int obj) {
    top = new Node(top, obj);
    number++;
  }

  public int pop() {
    if (isEmpty())
      return 0;
    Node tmp = top;
    top = tmp.getLink();
    number--;
    return tmp.getData();
  }

  public int peep() {
    if (isEmpty())
      return 0;
    return top.getData();
  }
}