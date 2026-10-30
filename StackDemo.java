import java.util.Scanner;
class IntegerStack {
private static final int MAX_SIZE = 10;
private int[] stackArray;
private int top;
public IntegerStack() {
stackArray = new int[MAX_SIZE];
top = -1;
}
public void push(int value) {
if (isFull()) {

System.out.println("Stack Overflow! Cannot push" + value + "(Stack is full).");
return;
}
stackArray[++top] = value;
System.out.println("Pushed:"+ value);
}
public int pop() {
if (isEmpty()) {
System.out.println("Stack Underflow! Cannot pop from an empty stack.");
return -1;
}
int poppedValue = stackArray[top--];
System.out.println("Popped:"+ poppedValue);
return poppedValue;
} 
public int peek() {
if (isEmpty()) {
System.out.println("Stack is empty.");
return -1;
}
return stackArray[top];
}
public boolean isEmpty() {
return top == -1;
}
public boolean isFull() {
return top == MAX_SIZE -1;
}
public void display() {
if (isEmpty()) {
System.out.println("Stack is empty.");
return;
}
System.out.print("Current stack (top to bottom):");
for (int i= top; i >= 0; i--) {
System.out.print(stackArray[i] + " ");
}
System.out.println();
}
}
public class StackDemo {
public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
IntegerStack stack = new IntegerStack();
boolean running = true;
while (running) {
System.out.println("\n--- STACK MENU ---");
System.out.println("1. Push");
System.out.println("2. pop");
System.out.println("3. peek (Top element)");
System.out.println("4. Display");
System.out.println("5. exit");
System.out.print("Enter your choice (1-5):");
int choice = scanner.nextInt();
switch (choice) {
case 1:
System.out.print("Enter an integer to push:");
int value = scanner.nextInt();
stack.push(value);
break;
case 2:
stack.pop();
break;
case 3:
int topValue = stack.peek();
if (topValue != -1) {
System.out.println("Top element is: " +topValue);
}
break;
case 4:
stack.display();
break;
case 5:
running = false;
System.out.println("Exiting program...");
break;
default:
System.out.println("Invalid choice! Please enter a number between 1 and 5.");
}
}
scanner.close();
}
}



