class Solution {
  public int calPoints(String[] operations) {
    Stack<Integer> st = new Stack<>();
    int res = 0;

    for (String op : operations) {
      if (op.equals("+")) {
        int b = st.pop();
        int a = st.peek();
        st.push(b);
        st.push(a + b);
      } else if (op.equals("D")) {
        st.push(2 * st.peek());
      } else if (op.equals("C")) {
        st.pop();
      } else {
        st.push(Integer.parseInt(op));
      }
    }

    while (!st.isEmpty()) {
      res += st.pop();
    }
    return res;
  }
}