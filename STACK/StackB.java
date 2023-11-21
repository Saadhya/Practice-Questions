import java.util.ArrayList;

public class StackB {

  static class Stack {

    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty() {
      return list.size() == 0;
    }

    public static void push(int data) {
      list.add(data);
    }

    public static int pop() {
      int top = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      return top;
    }

    public static int peek() {
      return list.get(list.size() - 1);
    }
  }

  public static void main(String[] args) {
    // creating stack using array list
    Stack st = new Stack();
    st.push(4);
    st.push(11);
    st.push(5);

    while (!st.isEmpty()) {
      System.out.println(st.peek());
      st.pop();
    }
    System.out.println(st.peek());
  }
}
