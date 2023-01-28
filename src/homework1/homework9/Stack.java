package homework1.homework9;

public class Stack {
    private int stck[] = new int[10];
    private int tos;

    public Stack() {
        tos = -1;
    }

    public void push(int item) {
        if (tos == 9) {
            System.out.println(" stek zapolnen");
        } else stck[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("stek ne zagrujen ");
            return 0;
        } else return stck[tos--];
    }
}