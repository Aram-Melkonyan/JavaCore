package homework1.homework9;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            char pop;
            switch (ch) {
                case ')':
                case '}':
                case ']':
                    stack.push(ch);
                    break;
                case '(':
                    pop = (char) stack.pop();
                    if (pop != ')') {
                        System.err.println("Error at " + i + " closed " + ch + " but opened " + pop);
                        break;
                    }
                case '{':
                    pop = (char) stack.pop();
                    if (pop != '}') {
                        System.err.println("Error at " + i + " closed " + ch + " but opened " + pop);
                    }
                    break;
                case '[':
                    pop = (char) stack.pop();
                    if (pop != ']') {
                        System.err.println("Error at " + i + " closed " + ch + " but opened " + pop);
                    }
                    break;
            }
        }
    }
}

