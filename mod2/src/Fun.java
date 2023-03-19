package Modul2;

public class Fun {
    public static void deleteString(Stack data, String find) {
        Stack newStack = new Stack();
        while (data.getTop() != null) {
            if (find.equals(data.getTop().value)) {
                data.pop();
            }
            newStack.push(data.pop());
        }
        while (newStack.getTop() != null) {
            data.push(newStack.pop());
        }
    }
}
