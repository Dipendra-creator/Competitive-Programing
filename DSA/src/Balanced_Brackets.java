import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{' || ch == ')' || ch == ']' || ch == '}'){
                if (ch == ')' || ch == ']' || ch == '}'){
                    if (st.peek() == ch){
                        st.pop();
                    }
                    else{
                        System.out.println("true");
                        return;
                    }
                }
                else {
                    st.push(ch);
                }
            }
        }
        System.out.println("false");
    }
}
