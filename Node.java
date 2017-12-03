package helpers;

public class Node {
  protected int data;
  protected Node link;

  public Node() {
    link = null;
    data = 0;
  }

  public Node(Node n, int d) {
    link = n;
    data = d;
  }

  /**
   * @param link the link to set
   */
  public void setLink(Node link) {
    this.link = link;
  }

  /**
   * @param data the data to set
   */
  public void setData(int data) {
    this.data = data;
  }

  /**
   * @return the data
   */
  public int getData() {
    return data;
  }

  /**
   * @return the link
   */
  public Node getLink() {
    return link;
  }
}