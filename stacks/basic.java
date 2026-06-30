package stacks;

import java.util.Stack;

class basic {
  public static void main(String[] args) {
    Stack<String> st=new Stack<>();
    st.push("Monika");
    st.push("Monik");
    st.push("Moni");
    st.push("Mon");
    st.push("Mo");
    st.push("M");
    
    
    System.out.println(st);
    System.out.println(st.peek());
    System.out.println(st.pop());
    // System.out.println(st.peek());
  }
    
}